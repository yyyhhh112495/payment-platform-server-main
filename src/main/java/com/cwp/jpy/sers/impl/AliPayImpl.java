package com.cwp.jpy.sers.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import com.cwp.jpy.beans.AppConfigs;
import com.cwp.jpy.beans.BaseConstant;
import com.cwp.jpy.mapper.*;
import com.cwp.jpy.model.*;
import com.cwp.jpy.sers.AliPay;
import com.cwp.jpy.sers.UtilServices;
import com.cwp.jpy.utils.HttpClientUtil;
import com.cwp.jpy.utils.MD5Utils;
import com.cwp.jpy.utils.MathUtil;
import com.cwp.jpy.utils.StringUtilEx;
import com.wechat.pay.contrib.apache.httpclient.WechatPayHttpClientBuilder;
import com.wechat.pay.contrib.apache.httpclient.auth.*;
import com.wechat.pay.contrib.apache.httpclient.util.AesUtil;
import com.wechat.pay.contrib.apache.httpclient.util.PemUtil;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class AliPayImpl implements AliPay {
    private final static Logger log = LoggerFactory.getLogger(AliPayImpl.class);
    @Resource
    AppConfigs appConfigs;

    @Resource
    JpyAliResMapper jpyAliResMapper;

    @Resource
    JpyOrgMapper jpyOrgMapper;
    @Resource
    JpyTaskMapper jpyTaskMapper;
    @Resource
    JpyTransMapper jpyTransMapper;
    @Resource
    JpyCountMapper jpyCountMapper;
    @Resource
    UtilServices utilServices;
    @Resource
    JpyWepayResMapper jpyWepayResMapper;
    @Resource
    JpyNotifyMapper jpyNotifyMapper;

    @Override
    public Object aliPay2(JSONObject jsonObject)  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        log.info("----aliPay2---with input: {}",jsonObject.toJSONString());
        JpyCount jpyCount = new JpyCount();
        jpyCount.setCountsts("1");
        String paychannel = jsonObject.getString("paychannel");
        if(StringUtilEx.isNullOrEmpty(paychannel)){
            paychannel = "alipay";
        }
        String remoteAddr = jsonObject.getString("host");
        log.info("---request from : {}",remoteAddr);
        JpyCount queryCount = jpyCountMapper.queryJpyCountLimit1(jpyCount);
        JSONObject ret = new JSONObject();
        if(null!=queryCount){
            log.info("-----configure count is : {}",JSONObject.toJSONString(queryCount));

            String bussinessId = jsonObject.getString("bussinessId");//商户号
            String returnUrl = jsonObject.getString("returnUrl");//成功回跳url
            String tradeNo = jsonObject.getString("tradeNo");//交易流水号
            String proName = jsonObject.getString("proName");//产品名称
            String proNo = jsonObject.getString("proNo");//产品编号
            String tranNum = jsonObject.getString("tranNum");//交易金额

            String minnum= queryCount.getCountminnum();
            String maxnum = queryCount.getCountmaxnum();
            if(!MathUtil.compareBetween(tranNum,minnum,maxnum)){
                ret.put("retCode","0");
                ret.put("retMsg","交易金额不符合账户配置要求！");
                log.info("---alipay ret -----{}",ret.toJSONString());
                return ret;
            }
            if(StringUtilEx.isNullOrEmpty(tradeNo)){
                tradeNo = utilServices.getSerialno();
                log.info("-----req tradeno is empty, gen a new tradeno:{}",tradeNo);
            }
            JpyOrg jpyOrg = new JpyOrg();
            jpyOrg.setBussinessid(Integer.valueOf(bussinessId));
            JpyOrg queryJpyOrg = jpyOrgMapper.queryJpyOrgLimit1(jpyOrg);
            JpyTrans jpyTrans = new JpyTrans();
            jpyTrans.setTranno(tradeNo);
            jpyTrans.setBussinessid(String.valueOf(queryJpyOrg.getBussinessid()));
            jpyTrans.setBussinessname(queryJpyOrg.getBussinessname());
            jpyTrans.setBussinessratio(queryJpyOrg.getBussratio());
            jpyTrans.setTrannum(tranNum);
            jpyTrans.setPaychannel(paychannel);
            jpyTrans.setCountratio(queryCount.getAlipayration());
            jpyTrans.setCollectcountid(String.valueOf(queryCount.getCountid()));
            jpyTrans.setCollectcountname(queryCount.getCountname());

            JpyTask jpyTask = new JpyTask();
            jpyTask.setTradeNo(tradeNo);
            jpyTask.setBusration(queryJpyOrg.getBussratio());
            jpyTask.setBussinessid(bussinessId);
            jpyTask.setProno(proNo);
            jpyTask.setProname(proName);
            jpyTask.setTradenum(tranNum);
            jpyTask.setTradegentime(sdf.format(new Date()));

            log.info("-----jpytask---{}",JSONObject.toJSONString(jpyTask));
            if(null!=queryJpyOrg){
                log.info("-----bussinessid checked ---- goon----");
            }else{
                ret.put("retCode","0");
                ret.put("retMsg","商户id有误，请检查！");
                log.info("---alipay ret -----{}",ret.toJSONString());
                return ret;
            }

            JpyTask jpyTask1 = jpyTaskMapper.queryJpyTaskLimit1(jpyTask);
            if(null!=jpyTask1){
                ret.put("retCode","0");
                ret.put("retMsg","交易流水号不能重复！");
                log.info("---alipay ret -----{}",ret.toJSONString());
                return ret;
            }
            String host = appConfigs.getHost();
            try {
                String urlDeco = URLDecoder.decode(returnUrl,"utf-8");
                log.info("-----urldeco---{}",urlDeco);
                jpyTask.setReturl(urlDeco);
            } catch (UnsupportedEncodingException e) {
                log.info("-----url decode exception: {}",e.toString());
                e.printStackTrace();
            }
            boolean payret = false;
            if("alipay".equals(paychannel)){
                String privatekey = queryCount.getAlipayprikey();
                String alipayPublicKey = queryCount.getAlipaypukey();
                String appid = queryCount.getAliappid();
                String serverUrl = appConfigs.getAlipayserverUrl();//"https://openapi.alipay.com/gateway.do"
                System.out.println("private key :  "+privatekey);
                log.info("----alipay-----{}-",JSONObject.toJSONString(queryCount));

                AlipayTradeWapPayResponse response = null;
                try {
//                CertAlipayRequest certAlipayRequest = new CertAlipayRequest ();
//                certAlipayRequest.setServerUrl(serverUrl);
//                certAlipayRequest.setAppId(appid);
//                certAlipayRequest.setPrivateKey(privatekey);
//                certAlipayRequest.setFormat("JSON");
//                certAlipayRequest.setCharset("UTF-8");
//                certAlipayRequest.setSignType("RSA2");
//                certAlipayRequest.setCertPath(queryCount.getAlipaycertpath());
//                certAlipayRequest.setAlipayPublicCertPath(queryCount.getAlipaypubliccertpath());
//                certAlipayRequest.setRootCertPath(queryCount.getAlipayrootcertpath());
//                DefaultAlipayClient alipayClient = new DefaultAlipayClient(certAlipayRequest);
// 提交数据至支付宝时请使用 alipayClient.certificateExecute(request);



                AlipayClient alipayClient = new DefaultAlipayClient(serverUrl,appid,
                        privatekey,"json","UTF-8",alipayPublicKey,"RSA2");
                AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
                request.setNotifyUrl(host+"/jpysers/aliPayNotify");
                request.setReturnUrl(appConfigs.getSuccess());
                JSONObject bizContent = new JSONObject();
                bizContent.put("out_trade_no", tradeNo);
                bizContent.put("total_amount", tranNum);
                bizContent.put("subject", proName);
                bizContent.put("product_code", proNo);

                request.setBizContent(bizContent.toString());

                    log.info("request---toalipay----{}",request.toString());
                    response = alipayClient.pageExecute(request);
                } catch (AlipayApiException e) {
                    e.printStackTrace();
                    log.info("---AlipayApiException---"+e.toString());
                }
                String form = response.getBody();




                if(response.isSuccess()){
                    log.info("alipay调用成功");
                    if(null!=form){
                        form = form.split("</form>")[0]+"</form>";
                        log.info("----alipay return form is {}",form);
                        ret.put("form",form);
                    }
                    payret = true;

                } else {
                    payret = false;
                }
            }else{
                log.info("----wepay-----");
                String appid = queryCount.getWechatappid();
                String merchantId = queryCount.getWechatmchid();
                String apiV3Key =  queryCount.getWechatkey();
                String merchantSerialNumber = queryCount.getWechatmchno();
                String privatekey = queryCount.getWechatprivatekey();
                log.info("apiV3Key----{}------merchantSerialNumber {}-",apiV3Key,merchantSerialNumber);
                PrivateKey merchantPrivateKey = PemUtil.loadPrivateKey(privatekey);

                ScheduledUpdateCertificatesVerifier verifier = new ScheduledUpdateCertificatesVerifier(
                        new WechatPay2Credentials(merchantId, new PrivateKeySigner(merchantSerialNumber,
                                merchantPrivateKey)),
                        apiV3Key.getBytes(StandardCharsets.UTF_8));
                AutoUpdateCertificatesVerifier verifier1 = new AutoUpdateCertificatesVerifier(
                        new WechatPay2Credentials(merchantId, new PrivateKeySigner(merchantSerialNumber,
                                merchantPrivateKey)),
                        apiV3Key.getBytes(StandardCharsets.UTF_8));
                WechatPayHttpClientBuilder builder = WechatPayHttpClientBuilder.create()
                        .withMerchant(merchantId, merchantSerialNumber, merchantPrivateKey)
                        .withValidator(new WechatPay2Validator(verifier1));
                CloseableHttpClient httpClient = builder.build();
                HttpPost httpPost = new HttpPost("https://api.mch.weixin.qq.com/v3/pay/transactions/h5");
                try {
                    JSONObject reqToWechat = new JSONObject();
                    reqToWechat.put("appid",appid);
                    reqToWechat.put("mchid",merchantId);
                    reqToWechat.put("description",proName);
                    reqToWechat.put("out_trade_no",tradeNo);
                    reqToWechat.put("notify_url",host+"/jpysers/wePayNotify");
                    JSONObject amout = new JSONObject();
                    amout.put("total", new BigDecimal(MathUtil.multiplyBigDecimal(tranNum,"100",0)));
                    amout.put("currency","CNY");
                    reqToWechat.put("amount",amout);
                     JSONObject scene_info = new JSONObject();
                    scene_info.put("payer_client_ip","171.15.18.15");
                    scene_info.put("h5_info",new JSONObject().put("type","Wap"));
                    reqToWechat.put("scene_info",scene_info);
                    log.info("----req to wechat-----{}",reqToWechat.toJSONString());
                    StringEntity entity = new StringEntity(reqToWechat.toJSONString(),"utf-8");
                    entity.setContentType("application/json");
                    httpPost.setEntity(entity);
                    httpPost.setHeader("Accept", "application/json");

                    //完成签名并执行请求
                    CloseableHttpResponse response = httpClient.execute(httpPost);
                    try {
                        int statusCode = response.getStatusLine().getStatusCode();
                        if (statusCode == 200) {
                            log.info("success,return body = " + EntityUtils.toString(response.getEntity()));
                            JSONObject retFromWechat = JSONObject.parseObject(EntityUtils.toString(response.getEntity()));
                            log.info("----res json is----{}",retFromWechat);
                            String retUrl = retFromWechat.getString("h5_url");
                            ret.put("h5_url",retUrl);
                            payret = true;
                        } else if (statusCode == 204) {
                            log.info("success----statusCode----204");
                            payret = false;
                        } else {
                            log.info("failed,resp code = " + statusCode+ ",return body = " + EntityUtils.toString(response.getEntity()));
                            payret = false;
                            throw new IOException("request failed");
                        }
                    } finally {
                        response.close();
                    }
                } catch (Exception e) {
                    log.info("-----exception-----{}", e.toString());
                    payret = false;
                    e.printStackTrace();
                    ret.put("retCode","0");
                    ret.put("retMsg","收款账户配置有误！！");
                    return ret;
                }
            }
            if(payret){
                log.info("-----调用支付接口成功-----");
                jpyTask.setPayres("0");
                jpyTask.setTransstatus("1");
                jpyTrans.setTransstatus("1");
                ret.put("retCode","1");
                ret.put("retMsg","success");
            }else{
                log.info("-----调用支付接口失败-----");
                jpyTask.setPayres("0");
                jpyTrans.setTransstatus("0");
                System.out.println("调用失败");
                ret.put("retCode","0");
                ret.put("retMsg","调用支付接口失败！");
            }
            int trans = jpyTransMapper.insertJpyTrans(jpyTrans);
            log.info("-------trans----{}",trans);
            int in = jpyTaskMapper.insertJpyTask(jpyTask);
            log.info("----update jpytask----res:{}",in);
        }else{
            ret.put("retCode","0");
            ret.put("retMsg","收款账户配置有误！！");
        }
        log.info("---alipay ret -----{}",ret.toJSONString());
        return ret;
    }

    @Override
    public Object aliNotify(Map<String,String> params) {
        String sign = params.get("sign");
        log.info("-----sign before:{}",sign);
        log.info("-----sign before:{}",sign.replaceAll(" ","+"));
        params.put("sign",sign.replaceAll(" ","+"));
        log.info("---get aliNotify by : {}",params);
        boolean signVerified = false; //调用SDK验证签名
        JpyCount jpyCount = new JpyCount();
        jpyCount.setCountsts("1");
        JpyCount queryCount = jpyCountMapper.queryJpyCountLimit1(jpyCount);
        try {
            log.info("----querycount----{}",JSONObject.toJSONString(queryCount));
            signVerified = AlipaySignature.rsaCheckV1(params,queryCount.getAlipaypukey(),"UTF-8","RSA2");
            log.info("------signVerified-----{}",signVerified);
            if(signVerified){
    // TODO 验签成功后，按照支付结果异步通知中的描述，对支付结果中的业务内容进行二次校验，
    //  校验成功后在response中返回success并继续商户自身业务处理，校验失败返回failure
                log.info("---alipay success----return----");
                String retString = JSON.toJSONString(params);
                JpyAliRes jpyAliRes = JSON.parseObject(retString, JpyAliRes.class);
                jpyAliResMapper.insertJpyAliRes(jpyAliRes);
                String trade_status = jpyAliRes.getTrade_status();
                String out_trade_no = jpyAliRes.getOut_trade_no();
                log.info("-----ttrade_status ----{}---out_trade_no:{} ",trade_status,out_trade_no);
                if("TRADE_SUCCESS".equals(trade_status)){
                    log.info("----alipay pay success----");
                    updateDataAfterAlipaySuccess(out_trade_no);
                }else{
                    log.info("-----out_trade_no ;{}--fail--",out_trade_no);
                }

            }else{
    // TODO 验签失败则记录异常日志，并在response中返回failure.
                log.info("----------alipay-----验签失败！");
            }
        } catch (AlipayApiException e) {
            e.printStackTrace();
            log.info("AlipayApiException--------"+e.toString());
        }
        return "success";
    }


    public void notifyChannel(String tradeno){
        log.info("----get into notifyChannel method with tradeno: {}",tradeno);
        JpyTask jpyTask = new JpyTask();
        jpyTask.setTradeNo(tradeno);
        JpyTask queryJpytask = jpyTaskMapper.queryJpyTaskLimit1(jpyTask);
        if(null!=queryJpytask){
            SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
            log.info("----jpytask----{}",JSON.toJSONString(queryJpytask));
            String notifyno = utilServices.getSerialno();
            JSONObject reqJson = new JSONObject();
            reqJson.put("tradeno",tradeno);
            reqJson.put("notifyid",tradeno);
            String requrl = queryJpytask.getReturl();
            JpyNotify jpyNotify = new JpyNotify();
            jpyNotify.setNotfiyid(notifyno);
            jpyNotify.setBussid(queryJpytask.getBussinessid());
            jpyNotify.setReqbody(reqJson.toJSONString());
            jpyNotify.setRequrl(requrl);
            jpyNotify.setReqtime(sdf.format(new Date()));
            jpyNotify.setReqcount("1");
            int a = jpyNotifyMapper.insertJpyNotify(jpyNotify);
            JpyOrg jpyOrg = new JpyOrg();
            jpyOrg.setBussinessid(Integer.valueOf(queryJpytask.getBussinessid()));
            JpyOrg queryJpyOrg = jpyOrgMapper.queryJpyOrgLimit1(jpyOrg);
            String privateKey = queryJpyOrg.getPrikey();
            log.info("-----a:{]-----notfiyid: {}",a,notifyno);
            String reqbody = reqJson.toJSONString();
            String reqbase64 = new String(Base64.getEncoder().encode(reqbody.getBytes(StandardCharsets.UTF_8)));
            Map<String, String> headers = new HashMap<>();
            try {
                String sginature = MD5Utils.digestMD5((reqbase64+privateKey).getBytes(StandardCharsets.UTF_8));
                headers.put("signature",sginature);
                String rsp = HttpClientUtil.postJson(requrl,reqbase64,new HashMap<>());
                jpyNotify.setRspbody(rsp);
                jpyNotify.setRsptime(sdf.format(new Date()));
                log.info("---rsp---{}",rsp);
            } catch (Exception e) {
                e.printStackTrace();
            }
            a = jpyNotifyMapper.updateJpyNotify(jpyNotify);
            log.info("----udpate notfiy {}",a);
        }else{
            log.info("-----has not get the task with tradeno: {}",tradeno);
        }

    }
    public Object wxNotify(HttpServletRequest request ){
        String WechatpayTimestamp = request.getHeader("Wechatpay-Timestamp");
        String WechatpayNonce = request.getHeader("Wechatpay-Nonce");
        String WechatpaySignature = request.getHeader("Wechatpay-Signature");
        String WechatpaySerial = request.getHeader("Wechatpay-Serial");

        log.info("----WechatpaySerial----{}",WechatpaySerial);
        log.info("---WechatpaySignature----- {}",WechatpaySignature);
        String signatureDecode = new String(
                Base64.getDecoder().decode(WechatpaySignature.getBytes(StandardCharsets.UTF_8)));
        log.info("--signatureDecode--{}",signatureDecode);
        String contenttype = request.getContentType();
        log.info("------contenttype---{}",contenttype);
        String req = "";
        try {
            ServletInputStream inputStream = request.getInputStream();
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String reqstr = "";
            while ((reqstr = bufferedReader.readLine())!=null){
                stringBuffer.append(reqstr);
            }
            req = stringBuffer.toString();
            log.info("----req string is : {}",req);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject = JSONObject.parseObject(req);
        String message = WechatpayTimestamp+"\n"+WechatpayNonce+"\n"+req+"\n";
        String id = jsonObject.getString("id");
        String createtime  = jsonObject.getString("create_time");
        String event_type = jsonObject.getString("event_type");
        String resource_type = jsonObject.getString("resource_type");
        log.info("------wecht---notfiymsg----{}",message);
        JSONObject retJson = new JSONObject();

        JpyCount jpyCount = new JpyCount();
        jpyCount.setCountsts("1");
        JpyCount queryCount = jpyCountMapper.queryJpyCountLimit1(jpyCount);
        String merchantId = queryCount.getWechatmchid();
        log.info("----------getcount:{}",JSONObject.toJSONString(queryCount));
        String apiV3Key =  queryCount.getWechatkey();
        String merchantSerialNumber = queryCount.getWechatmchno();
        String privatekey = queryCount.getWechatprivatekey();
        log.info("apiV3Key----{}------merchantSerialNumber {}-",apiV3Key,merchantSerialNumber);
        PrivateKey merchantPrivateKey = PemUtil.loadPrivateKey(privatekey);

        ScheduledUpdateCertificatesVerifier verifier = new ScheduledUpdateCertificatesVerifier(
                new WechatPay2Credentials(merchantId, new PrivateKeySigner(merchantSerialNumber,
                        merchantPrivateKey)),
                apiV3Key.getBytes(StandardCharsets.UTF_8));
        AutoUpdateCertificatesVerifier verifier1 = new AutoUpdateCertificatesVerifier(
                new WechatPay2Credentials(merchantId, new PrivateKeySigner(merchantSerialNumber,
                        merchantPrivateKey)),
                apiV3Key.getBytes(StandardCharsets.UTF_8));
        log.info("-----get latestCertificate success----");
        boolean ver = false;
        ver = verifier1.verify(WechatpaySerial,message.getBytes(StandardCharsets.UTF_8),WechatpaySignature);

        log.info("--------ver-----{}",ver);
        if(ver){
            log.info("-----wechatpay verify signature pass----");
            JSONObject resource = jsonObject.getJSONObject("resource");
            String nonce = resource.getString("nonce");
            String associated_data = resource.getString("associated_data");
            String ciphertext = resource.getString("ciphertext");

            AesUtil aesUtil = new AesUtil(apiV3Key.getBytes(StandardCharsets.UTF_8));
            try {
                String afterresource = aesUtil.decryptToString(associated_data.getBytes(StandardCharsets.UTF_8),
                        nonce.getBytes(StandardCharsets.UTF_8),ciphertext);

                JSONObject resourceJson = JSONObject.parseObject(afterresource);
                resourceJson.put("id",id);
                log.info("-----resourceJson:{}",resourceJson);
                JpyWepayRes jpyWepayRes = JSON.parseObject(resourceJson.toString(),JpyWepayRes.class);
                int intret = jpyWepayResMapper.insertJpyWepayRes(jpyWepayRes);
                log.info("--intret------{}",intret);
                String trade_state = jpyWepayRes.getTrade_state();
                if("SUCCESS".equals(trade_state)){
                    log.info("-----wechatpay success----{}",jpyWepayRes.getOut_trade_no());
                    updateDataAfterAlipaySuccess(jpyWepayRes.getOut_trade_no());
                }else{
                    log.info("-----wechatpay fail whith code {}",trade_state);
                }
            } catch (GeneralSecurityException e) {
                log.info("-----decrepty fail exception---{}",e.toString());
                e.printStackTrace();
            }
            retJson.put("code","SUCCESS");
            retJson.put("message","成功");
        }else {
            log.info("----------not pass---------wechatpay---");
        }

        return retJson;
    }

    public void updateDataAfterAlipaySuccess(String out_trade_no ){
        SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
        JpyTask jpyTask = new JpyTask();
        jpyTask.setTradeNo(out_trade_no);
        JpyTrans jpytrans = new JpyTrans();
        jpytrans.setTranno(out_trade_no);
        notifyChannel(out_trade_no);//通知下游渠道 支付成功
        JpyTask queryTask = jpyTaskMapper.queryJpyTaskLimit1(jpyTask);
        JpyTrans jpyTrans = jpyTransMapper.queryJpyTransLimit1(jpytrans);
        if(null!=jpyTrans){
            jpytrans.setTransstatus("2");//支付成功
            String profit = MathUtil.multiplyBigDecimal(jpyTrans.getTrannum(),
                    MathUtil.subtractBigDecimal(jpyTrans.getBussinessratio(),jpyTrans.getCountratio()));
            profit = MathUtil.divideBigDecimal(profit,"100");
            log.info("----task-----{}---profit---{}",out_trade_no,profit);
            log.info("---trans--{}",JSONObject.toJSONString(jpyTrans));
            log.info("-----{}",jpyTrans.getTrannum());
            String transnum = MathUtil.subtractBigDecimal(jpyTrans.getTrannum(),profit);
            log.info("------task transnum--{}",transnum);
            jpyTrans.setTransnum(transnum);
            jpyTrans.setTransprofit(profit);
            int jpytran = jpyTransMapper.updateJpyTrans(jpyTrans);
            log.info("---------jpytran---{}",jpytran);

        }
        if(null !=queryTask){
            queryTask.setPayres("1");
            queryTask.setPayrettime(sdf.format(new Date()));
            int a = jpyTaskMapper.updateJpyTask(queryTask);
            log.info("---update jpy task----{}",a);

        }else{
            log.info("----has not this task : {}",JSONObject.toJSONString(jpyTask));
        }
    }

}
