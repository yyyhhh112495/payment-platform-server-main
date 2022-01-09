package com.cwp.jpy.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class JpyAliRes implements Serializable {

    private static final long serialVersionUID = 1638864264397L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String notify_id;

    /**
    * 
    * isNullAble:1
    */
    private String buyer_id;

    /**
    * 
    * isNullAble:1
    */
    private String invoice_amount;

    /**
    * 
    * isNullAble:1
    */
    private String notify_type;

    /**
    * 
    * isNullAble:1
    */
    private String trade_status;

    /**
    * 
    * isNullAble:1
    */
    private String receipt_amount;

    /**
    * 
    * isNullAble:1
    */
    private String buyer_pay_amount;

    /**
    * 
    * isNullAble:1
    */
    private String app_id;

    /**
    * 
    * isNullAble:1
    */
    private String sign_type;

    /**
    * 
    * isNullAble:1
    */
    private String seller_id;

    /**
    * 
    * isNullAble:1
    */
    private String gmt_payment;

    /**
    * 
    * isNullAble:1
    */
    private String notify_time;

    /**
    * 
    * isNullAble:1
    */
    private String version;

    /**
    * 
    * isNullAble:1
    */
    private String out_trade_no;

    /**
    * 
    * isNullAble:1
    */
    private String total_amount;

    /**
    * 
    * isNullAble:1
    */
    private String trade_no;

    /**
    * 
    * isNullAble:1
    */
    private String auth_app_id;

    /**
    * 
    * isNullAble:1
    */
    private String buyer_logon_id;

    /**
    * 
    * isNullAble:1
    */
    private String point_amount;

    /**
    * 
    * isNullAble:1
    */
    private String gmt_create;

    /**
    * 
    * isNullAble:1
    */
    private String charset;

    /**
    * 
    * isNullAble:1
    */
    private String seller_email;

    /**
    * 
    * isNullAble:1
    */
    private String subject;

    /**
    * 
    * isNullAble:1
    */
    private String sign;

    /**
    * 
    * isNullAble:1
    */
    private String fund_bill_list;


    public void setNotify_id(String notify_id){this.notify_id = notify_id;}

    public String getNotify_id(){return this.notify_id;}

    public void setBuyer_id(String buyer_id){this.buyer_id = buyer_id;}

    public String getBuyer_id(){return this.buyer_id;}

    public void setInvoice_amount(String invoice_amount){this.invoice_amount = invoice_amount;}

    public String getInvoice_amount(){return this.invoice_amount;}

    public void setNotify_type(String notify_type){this.notify_type = notify_type;}

    public String getNotify_type(){return this.notify_type;}

    public void setTrade_status(String trade_status){this.trade_status = trade_status;}

    public String getTrade_status(){return this.trade_status;}

    public void setReceipt_amount(String receipt_amount){this.receipt_amount = receipt_amount;}

    public String getReceipt_amount(){return this.receipt_amount;}

    public void setBuyer_pay_amount(String buyer_pay_amount){this.buyer_pay_amount = buyer_pay_amount;}

    public String getBuyer_pay_amount(){return this.buyer_pay_amount;}

    public void setApp_id(String app_id){this.app_id = app_id;}

    public String getApp_id(){return this.app_id;}

    public void setSign_type(String sign_type){this.sign_type = sign_type;}

    public String getSign_type(){return this.sign_type;}

    public void setSeller_id(String seller_id){this.seller_id = seller_id;}

    public String getSeller_id(){return this.seller_id;}

    public void setGmt_payment(String gmt_payment){this.gmt_payment = gmt_payment;}

    public String getGmt_payment(){return this.gmt_payment;}

    public void setNotify_time(String notify_time){this.notify_time = notify_time;}

    public String getNotify_time(){return this.notify_time;}

    public void setVersion(String version){this.version = version;}

    public String getVersion(){return this.version;}

    public void setOut_trade_no(String out_trade_no){this.out_trade_no = out_trade_no;}

    public String getOut_trade_no(){return this.out_trade_no;}

    public void setTotal_amount(String total_amount){this.total_amount = total_amount;}

    public String getTotal_amount(){return this.total_amount;}

    public void setTrade_no(String trade_no){this.trade_no = trade_no;}

    public String getTrade_no(){return this.trade_no;}

    public void setAuth_app_id(String auth_app_id){this.auth_app_id = auth_app_id;}

    public String getAuth_app_id(){return this.auth_app_id;}

    public void setBuyer_logon_id(String buyer_logon_id){this.buyer_logon_id = buyer_logon_id;}

    public String getBuyer_logon_id(){return this.buyer_logon_id;}

    public void setPoint_amount(String point_amount){this.point_amount = point_amount;}

    public String getPoint_amount(){return this.point_amount;}

    public void setGmt_create(String gmt_create){this.gmt_create = gmt_create;}

    public String getGmt_create(){return this.gmt_create;}

    public void setCharset(String charset){this.charset = charset;}

    public String getCharset(){return this.charset;}

    public void setSeller_email(String seller_email){this.seller_email = seller_email;}

    public String getSeller_email(){return this.seller_email;}

    public void setSubject(String subject){this.subject = subject;}

    public String getSubject(){return this.subject;}

    public void setSign(String sign){this.sign = sign;}

    public String getSign(){return this.sign;}

    public void setFund_bill_list(String fund_bill_list){this.fund_bill_list = fund_bill_list;}

    public String getFund_bill_list(){return this.fund_bill_list;}
    @Override
    public String toString() {
        return "JpyAliRes{" +
                "notify_id='" + notify_id + '\'' +
                "buyer_id='" + buyer_id + '\'' +
                "invoice_amount='" + invoice_amount + '\'' +
                "notify_type='" + notify_type + '\'' +
                "trade_status='" + trade_status + '\'' +
                "receipt_amount='" + receipt_amount + '\'' +
                "buyer_pay_amount='" + buyer_pay_amount + '\'' +
                "app_id='" + app_id + '\'' +
                "sign_type='" + sign_type + '\'' +
                "seller_id='" + seller_id + '\'' +
                "gmt_payment='" + gmt_payment + '\'' +
                "notify_time='" + notify_time + '\'' +
                "version='" + version + '\'' +
                "out_trade_no='" + out_trade_no + '\'' +
                "total_amount='" + total_amount + '\'' +
                "trade_no='" + trade_no + '\'' +
                "auth_app_id='" + auth_app_id + '\'' +
                "buyer_logon_id='" + buyer_logon_id + '\'' +
                "point_amount='" + point_amount + '\'' +
                "gmt_create='" + gmt_create + '\'' +
                "charset='" + charset + '\'' +
                "seller_email='" + seller_email + '\'' +
                "subject='" + subject + '\'' +
                "sign='" + sign + '\'' +
                "fund_bill_list='" + fund_bill_list + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyAliRes set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyAliRes set){
            this.set = set;
            return this;
        }

        public JpyAliRes getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends JpyAliRes{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> notify_idList;

        public List<String> getNotify_idList(){return this.notify_idList;}


        private List<String> fuzzyNotify_id;

        public List<String> getFuzzyNotify_id(){return this.fuzzyNotify_id;}

        private List<String> rightFuzzyNotify_id;

        public List<String> getRightFuzzyNotify_id(){return this.rightFuzzyNotify_id;}
        private List<String> buyer_idList;

        public List<String> getBuyer_idList(){return this.buyer_idList;}


        private List<String> fuzzyBuyer_id;

        public List<String> getFuzzyBuyer_id(){return this.fuzzyBuyer_id;}

        private List<String> rightFuzzyBuyer_id;

        public List<String> getRightFuzzyBuyer_id(){return this.rightFuzzyBuyer_id;}
        private List<String> invoice_amountList;

        public List<String> getInvoice_amountList(){return this.invoice_amountList;}


        private List<String> fuzzyInvoice_amount;

        public List<String> getFuzzyInvoice_amount(){return this.fuzzyInvoice_amount;}

        private List<String> rightFuzzyInvoice_amount;

        public List<String> getRightFuzzyInvoice_amount(){return this.rightFuzzyInvoice_amount;}
        private List<String> notify_typeList;

        public List<String> getNotify_typeList(){return this.notify_typeList;}


        private List<String> fuzzyNotify_type;

        public List<String> getFuzzyNotify_type(){return this.fuzzyNotify_type;}

        private List<String> rightFuzzyNotify_type;

        public List<String> getRightFuzzyNotify_type(){return this.rightFuzzyNotify_type;}
        private List<String> trade_statusList;

        public List<String> getTrade_statusList(){return this.trade_statusList;}


        private List<String> fuzzyTrade_status;

        public List<String> getFuzzyTrade_status(){return this.fuzzyTrade_status;}

        private List<String> rightFuzzyTrade_status;

        public List<String> getRightFuzzyTrade_status(){return this.rightFuzzyTrade_status;}
        private List<String> receipt_amountList;

        public List<String> getReceipt_amountList(){return this.receipt_amountList;}


        private List<String> fuzzyReceipt_amount;

        public List<String> getFuzzyReceipt_amount(){return this.fuzzyReceipt_amount;}

        private List<String> rightFuzzyReceipt_amount;

        public List<String> getRightFuzzyReceipt_amount(){return this.rightFuzzyReceipt_amount;}
        private List<String> buyer_pay_amountList;

        public List<String> getBuyer_pay_amountList(){return this.buyer_pay_amountList;}


        private List<String> fuzzyBuyer_pay_amount;

        public List<String> getFuzzyBuyer_pay_amount(){return this.fuzzyBuyer_pay_amount;}

        private List<String> rightFuzzyBuyer_pay_amount;

        public List<String> getRightFuzzyBuyer_pay_amount(){return this.rightFuzzyBuyer_pay_amount;}
        private List<String> app_idList;

        public List<String> getApp_idList(){return this.app_idList;}


        private List<String> fuzzyApp_id;

        public List<String> getFuzzyApp_id(){return this.fuzzyApp_id;}

        private List<String> rightFuzzyApp_id;

        public List<String> getRightFuzzyApp_id(){return this.rightFuzzyApp_id;}
        private List<String> sign_typeList;

        public List<String> getSign_typeList(){return this.sign_typeList;}


        private List<String> fuzzySign_type;

        public List<String> getFuzzySign_type(){return this.fuzzySign_type;}

        private List<String> rightFuzzySign_type;

        public List<String> getRightFuzzySign_type(){return this.rightFuzzySign_type;}
        private List<String> seller_idList;

        public List<String> getSeller_idList(){return this.seller_idList;}


        private List<String> fuzzySeller_id;

        public List<String> getFuzzySeller_id(){return this.fuzzySeller_id;}

        private List<String> rightFuzzySeller_id;

        public List<String> getRightFuzzySeller_id(){return this.rightFuzzySeller_id;}
        private List<String> gmt_paymentList;

        public List<String> getGmt_paymentList(){return this.gmt_paymentList;}


        private List<String> fuzzyGmt_payment;

        public List<String> getFuzzyGmt_payment(){return this.fuzzyGmt_payment;}

        private List<String> rightFuzzyGmt_payment;

        public List<String> getRightFuzzyGmt_payment(){return this.rightFuzzyGmt_payment;}
        private List<String> notify_timeList;

        public List<String> getNotify_timeList(){return this.notify_timeList;}


        private List<String> fuzzyNotify_time;

        public List<String> getFuzzyNotify_time(){return this.fuzzyNotify_time;}

        private List<String> rightFuzzyNotify_time;

        public List<String> getRightFuzzyNotify_time(){return this.rightFuzzyNotify_time;}
        private List<String> versionList;

        public List<String> getVersionList(){return this.versionList;}


        private List<String> fuzzyVersion;

        public List<String> getFuzzyVersion(){return this.fuzzyVersion;}

        private List<String> rightFuzzyVersion;

        public List<String> getRightFuzzyVersion(){return this.rightFuzzyVersion;}
        private List<String> out_trade_noList;

        public List<String> getOut_trade_noList(){return this.out_trade_noList;}


        private List<String> fuzzyOut_trade_no;

        public List<String> getFuzzyOut_trade_no(){return this.fuzzyOut_trade_no;}

        private List<String> rightFuzzyOut_trade_no;

        public List<String> getRightFuzzyOut_trade_no(){return this.rightFuzzyOut_trade_no;}
        private List<String> total_amountList;

        public List<String> getTotal_amountList(){return this.total_amountList;}


        private List<String> fuzzyTotal_amount;

        public List<String> getFuzzyTotal_amount(){return this.fuzzyTotal_amount;}

        private List<String> rightFuzzyTotal_amount;

        public List<String> getRightFuzzyTotal_amount(){return this.rightFuzzyTotal_amount;}
        private List<String> trade_noList;

        public List<String> getTrade_noList(){return this.trade_noList;}


        private List<String> fuzzyTrade_no;

        public List<String> getFuzzyTrade_no(){return this.fuzzyTrade_no;}

        private List<String> rightFuzzyTrade_no;

        public List<String> getRightFuzzyTrade_no(){return this.rightFuzzyTrade_no;}
        private List<String> auth_app_idList;

        public List<String> getAuth_app_idList(){return this.auth_app_idList;}


        private List<String> fuzzyAuth_app_id;

        public List<String> getFuzzyAuth_app_id(){return this.fuzzyAuth_app_id;}

        private List<String> rightFuzzyAuth_app_id;

        public List<String> getRightFuzzyAuth_app_id(){return this.rightFuzzyAuth_app_id;}
        private List<String> buyer_logon_idList;

        public List<String> getBuyer_logon_idList(){return this.buyer_logon_idList;}


        private List<String> fuzzyBuyer_logon_id;

        public List<String> getFuzzyBuyer_logon_id(){return this.fuzzyBuyer_logon_id;}

        private List<String> rightFuzzyBuyer_logon_id;

        public List<String> getRightFuzzyBuyer_logon_id(){return this.rightFuzzyBuyer_logon_id;}
        private List<String> point_amountList;

        public List<String> getPoint_amountList(){return this.point_amountList;}


        private List<String> fuzzyPoint_amount;

        public List<String> getFuzzyPoint_amount(){return this.fuzzyPoint_amount;}

        private List<String> rightFuzzyPoint_amount;

        public List<String> getRightFuzzyPoint_amount(){return this.rightFuzzyPoint_amount;}
        private List<String> gmt_createList;

        public List<String> getGmt_createList(){return this.gmt_createList;}


        private List<String> fuzzyGmt_create;

        public List<String> getFuzzyGmt_create(){return this.fuzzyGmt_create;}

        private List<String> rightFuzzyGmt_create;

        public List<String> getRightFuzzyGmt_create(){return this.rightFuzzyGmt_create;}
        private List<String> charsetList;

        public List<String> getCharsetList(){return this.charsetList;}


        private List<String> fuzzyCharset;

        public List<String> getFuzzyCharset(){return this.fuzzyCharset;}

        private List<String> rightFuzzyCharset;

        public List<String> getRightFuzzyCharset(){return this.rightFuzzyCharset;}
        private List<String> seller_emailList;

        public List<String> getSeller_emailList(){return this.seller_emailList;}


        private List<String> fuzzySeller_email;

        public List<String> getFuzzySeller_email(){return this.fuzzySeller_email;}

        private List<String> rightFuzzySeller_email;

        public List<String> getRightFuzzySeller_email(){return this.rightFuzzySeller_email;}
        private List<String> subjectList;

        public List<String> getSubjectList(){return this.subjectList;}


        private List<String> fuzzySubject;

        public List<String> getFuzzySubject(){return this.fuzzySubject;}

        private List<String> rightFuzzySubject;

        public List<String> getRightFuzzySubject(){return this.rightFuzzySubject;}
        private List<String> signList;

        public List<String> getSignList(){return this.signList;}


        private List<String> fuzzySign;

        public List<String> getFuzzySign(){return this.fuzzySign;}

        private List<String> rightFuzzySign;

        public List<String> getRightFuzzySign(){return this.rightFuzzySign;}
        private List<String> fund_bill_listList;

        public List<String> getFund_bill_listList(){return this.fund_bill_listList;}


        private List<String> fuzzyFund_bill_list;

        public List<String> getFuzzyFund_bill_list(){return this.fuzzyFund_bill_list;}

        private List<String> rightFuzzyFund_bill_list;

        public List<String> getRightFuzzyFund_bill_list(){return this.rightFuzzyFund_bill_list;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyNotify_id (List<String> fuzzyNotify_id){
            this.fuzzyNotify_id = fuzzyNotify_id;
            return this;
        }

        public QueryBuilder fuzzyNotify_id (String ... fuzzyNotify_id){
            this.fuzzyNotify_id = solveNullList(fuzzyNotify_id);
            return this;
        }

        public QueryBuilder rightFuzzyNotify_id (List<String> rightFuzzyNotify_id){
            this.rightFuzzyNotify_id = rightFuzzyNotify_id;
            return this;
        }

        public QueryBuilder rightFuzzyNotify_id (String ... rightFuzzyNotify_id){
            this.rightFuzzyNotify_id = solveNullList(rightFuzzyNotify_id);
            return this;
        }

        public QueryBuilder notify_id(String notify_id){
            setNotify_id(notify_id);
            return this;
        }

        public QueryBuilder notify_idList(String ... notify_id){
            this.notify_idList = solveNullList(notify_id);
            return this;
        }

        public QueryBuilder notify_idList(List<String> notify_id){
            this.notify_idList = notify_id;
            return this;
        }

        public QueryBuilder fetchNotify_id(){
            setFetchFields("fetchFields","notify_id");
            return this;
        }

        public QueryBuilder excludeNotify_id(){
            setFetchFields("excludeFields","notify_id");
            return this;
        }

        public QueryBuilder fuzzyBuyer_id (List<String> fuzzyBuyer_id){
            this.fuzzyBuyer_id = fuzzyBuyer_id;
            return this;
        }

        public QueryBuilder fuzzyBuyer_id (String ... fuzzyBuyer_id){
            this.fuzzyBuyer_id = solveNullList(fuzzyBuyer_id);
            return this;
        }

        public QueryBuilder rightFuzzyBuyer_id (List<String> rightFuzzyBuyer_id){
            this.rightFuzzyBuyer_id = rightFuzzyBuyer_id;
            return this;
        }

        public QueryBuilder rightFuzzyBuyer_id (String ... rightFuzzyBuyer_id){
            this.rightFuzzyBuyer_id = solveNullList(rightFuzzyBuyer_id);
            return this;
        }

        public QueryBuilder buyer_id(String buyer_id){
            setBuyer_id(buyer_id);
            return this;
        }

        public QueryBuilder buyer_idList(String ... buyer_id){
            this.buyer_idList = solveNullList(buyer_id);
            return this;
        }

        public QueryBuilder buyer_idList(List<String> buyer_id){
            this.buyer_idList = buyer_id;
            return this;
        }

        public QueryBuilder fetchBuyer_id(){
            setFetchFields("fetchFields","buyer_id");
            return this;
        }

        public QueryBuilder excludeBuyer_id(){
            setFetchFields("excludeFields","buyer_id");
            return this;
        }

        public QueryBuilder fuzzyInvoice_amount (List<String> fuzzyInvoice_amount){
            this.fuzzyInvoice_amount = fuzzyInvoice_amount;
            return this;
        }

        public QueryBuilder fuzzyInvoice_amount (String ... fuzzyInvoice_amount){
            this.fuzzyInvoice_amount = solveNullList(fuzzyInvoice_amount);
            return this;
        }

        public QueryBuilder rightFuzzyInvoice_amount (List<String> rightFuzzyInvoice_amount){
            this.rightFuzzyInvoice_amount = rightFuzzyInvoice_amount;
            return this;
        }

        public QueryBuilder rightFuzzyInvoice_amount (String ... rightFuzzyInvoice_amount){
            this.rightFuzzyInvoice_amount = solveNullList(rightFuzzyInvoice_amount);
            return this;
        }

        public QueryBuilder invoice_amount(String invoice_amount){
            setInvoice_amount(invoice_amount);
            return this;
        }

        public QueryBuilder invoice_amountList(String ... invoice_amount){
            this.invoice_amountList = solveNullList(invoice_amount);
            return this;
        }

        public QueryBuilder invoice_amountList(List<String> invoice_amount){
            this.invoice_amountList = invoice_amount;
            return this;
        }

        public QueryBuilder fetchInvoice_amount(){
            setFetchFields("fetchFields","invoice_amount");
            return this;
        }

        public QueryBuilder excludeInvoice_amount(){
            setFetchFields("excludeFields","invoice_amount");
            return this;
        }

        public QueryBuilder fuzzyNotify_type (List<String> fuzzyNotify_type){
            this.fuzzyNotify_type = fuzzyNotify_type;
            return this;
        }

        public QueryBuilder fuzzyNotify_type (String ... fuzzyNotify_type){
            this.fuzzyNotify_type = solveNullList(fuzzyNotify_type);
            return this;
        }

        public QueryBuilder rightFuzzyNotify_type (List<String> rightFuzzyNotify_type){
            this.rightFuzzyNotify_type = rightFuzzyNotify_type;
            return this;
        }

        public QueryBuilder rightFuzzyNotify_type (String ... rightFuzzyNotify_type){
            this.rightFuzzyNotify_type = solveNullList(rightFuzzyNotify_type);
            return this;
        }

        public QueryBuilder notify_type(String notify_type){
            setNotify_type(notify_type);
            return this;
        }

        public QueryBuilder notify_typeList(String ... notify_type){
            this.notify_typeList = solveNullList(notify_type);
            return this;
        }

        public QueryBuilder notify_typeList(List<String> notify_type){
            this.notify_typeList = notify_type;
            return this;
        }

        public QueryBuilder fetchNotify_type(){
            setFetchFields("fetchFields","notify_type");
            return this;
        }

        public QueryBuilder excludeNotify_type(){
            setFetchFields("excludeFields","notify_type");
            return this;
        }

        public QueryBuilder fuzzyTrade_status (List<String> fuzzyTrade_status){
            this.fuzzyTrade_status = fuzzyTrade_status;
            return this;
        }

        public QueryBuilder fuzzyTrade_status (String ... fuzzyTrade_status){
            this.fuzzyTrade_status = solveNullList(fuzzyTrade_status);
            return this;
        }

        public QueryBuilder rightFuzzyTrade_status (List<String> rightFuzzyTrade_status){
            this.rightFuzzyTrade_status = rightFuzzyTrade_status;
            return this;
        }

        public QueryBuilder rightFuzzyTrade_status (String ... rightFuzzyTrade_status){
            this.rightFuzzyTrade_status = solveNullList(rightFuzzyTrade_status);
            return this;
        }

        public QueryBuilder trade_status(String trade_status){
            setTrade_status(trade_status);
            return this;
        }

        public QueryBuilder trade_statusList(String ... trade_status){
            this.trade_statusList = solveNullList(trade_status);
            return this;
        }

        public QueryBuilder trade_statusList(List<String> trade_status){
            this.trade_statusList = trade_status;
            return this;
        }

        public QueryBuilder fetchTrade_status(){
            setFetchFields("fetchFields","trade_status");
            return this;
        }

        public QueryBuilder excludeTrade_status(){
            setFetchFields("excludeFields","trade_status");
            return this;
        }

        public QueryBuilder fuzzyReceipt_amount (List<String> fuzzyReceipt_amount){
            this.fuzzyReceipt_amount = fuzzyReceipt_amount;
            return this;
        }

        public QueryBuilder fuzzyReceipt_amount (String ... fuzzyReceipt_amount){
            this.fuzzyReceipt_amount = solveNullList(fuzzyReceipt_amount);
            return this;
        }

        public QueryBuilder rightFuzzyReceipt_amount (List<String> rightFuzzyReceipt_amount){
            this.rightFuzzyReceipt_amount = rightFuzzyReceipt_amount;
            return this;
        }

        public QueryBuilder rightFuzzyReceipt_amount (String ... rightFuzzyReceipt_amount){
            this.rightFuzzyReceipt_amount = solveNullList(rightFuzzyReceipt_amount);
            return this;
        }

        public QueryBuilder receipt_amount(String receipt_amount){
            setReceipt_amount(receipt_amount);
            return this;
        }

        public QueryBuilder receipt_amountList(String ... receipt_amount){
            this.receipt_amountList = solveNullList(receipt_amount);
            return this;
        }

        public QueryBuilder receipt_amountList(List<String> receipt_amount){
            this.receipt_amountList = receipt_amount;
            return this;
        }

        public QueryBuilder fetchReceipt_amount(){
            setFetchFields("fetchFields","receipt_amount");
            return this;
        }

        public QueryBuilder excludeReceipt_amount(){
            setFetchFields("excludeFields","receipt_amount");
            return this;
        }

        public QueryBuilder fuzzyBuyer_pay_amount (List<String> fuzzyBuyer_pay_amount){
            this.fuzzyBuyer_pay_amount = fuzzyBuyer_pay_amount;
            return this;
        }

        public QueryBuilder fuzzyBuyer_pay_amount (String ... fuzzyBuyer_pay_amount){
            this.fuzzyBuyer_pay_amount = solveNullList(fuzzyBuyer_pay_amount);
            return this;
        }

        public QueryBuilder rightFuzzyBuyer_pay_amount (List<String> rightFuzzyBuyer_pay_amount){
            this.rightFuzzyBuyer_pay_amount = rightFuzzyBuyer_pay_amount;
            return this;
        }

        public QueryBuilder rightFuzzyBuyer_pay_amount (String ... rightFuzzyBuyer_pay_amount){
            this.rightFuzzyBuyer_pay_amount = solveNullList(rightFuzzyBuyer_pay_amount);
            return this;
        }

        public QueryBuilder buyer_pay_amount(String buyer_pay_amount){
            setBuyer_pay_amount(buyer_pay_amount);
            return this;
        }

        public QueryBuilder buyer_pay_amountList(String ... buyer_pay_amount){
            this.buyer_pay_amountList = solveNullList(buyer_pay_amount);
            return this;
        }

        public QueryBuilder buyer_pay_amountList(List<String> buyer_pay_amount){
            this.buyer_pay_amountList = buyer_pay_amount;
            return this;
        }

        public QueryBuilder fetchBuyer_pay_amount(){
            setFetchFields("fetchFields","buyer_pay_amount");
            return this;
        }

        public QueryBuilder excludeBuyer_pay_amount(){
            setFetchFields("excludeFields","buyer_pay_amount");
            return this;
        }

        public QueryBuilder fuzzyApp_id (List<String> fuzzyApp_id){
            this.fuzzyApp_id = fuzzyApp_id;
            return this;
        }

        public QueryBuilder fuzzyApp_id (String ... fuzzyApp_id){
            this.fuzzyApp_id = solveNullList(fuzzyApp_id);
            return this;
        }

        public QueryBuilder rightFuzzyApp_id (List<String> rightFuzzyApp_id){
            this.rightFuzzyApp_id = rightFuzzyApp_id;
            return this;
        }

        public QueryBuilder rightFuzzyApp_id (String ... rightFuzzyApp_id){
            this.rightFuzzyApp_id = solveNullList(rightFuzzyApp_id);
            return this;
        }

        public QueryBuilder app_id(String app_id){
            setApp_id(app_id);
            return this;
        }

        public QueryBuilder app_idList(String ... app_id){
            this.app_idList = solveNullList(app_id);
            return this;
        }

        public QueryBuilder app_idList(List<String> app_id){
            this.app_idList = app_id;
            return this;
        }

        public QueryBuilder fetchApp_id(){
            setFetchFields("fetchFields","app_id");
            return this;
        }

        public QueryBuilder excludeApp_id(){
            setFetchFields("excludeFields","app_id");
            return this;
        }

        public QueryBuilder fuzzySign_type (List<String> fuzzySign_type){
            this.fuzzySign_type = fuzzySign_type;
            return this;
        }

        public QueryBuilder fuzzySign_type (String ... fuzzySign_type){
            this.fuzzySign_type = solveNullList(fuzzySign_type);
            return this;
        }

        public QueryBuilder rightFuzzySign_type (List<String> rightFuzzySign_type){
            this.rightFuzzySign_type = rightFuzzySign_type;
            return this;
        }

        public QueryBuilder rightFuzzySign_type (String ... rightFuzzySign_type){
            this.rightFuzzySign_type = solveNullList(rightFuzzySign_type);
            return this;
        }

        public QueryBuilder sign_type(String sign_type){
            setSign_type(sign_type);
            return this;
        }

        public QueryBuilder sign_typeList(String ... sign_type){
            this.sign_typeList = solveNullList(sign_type);
            return this;
        }

        public QueryBuilder sign_typeList(List<String> sign_type){
            this.sign_typeList = sign_type;
            return this;
        }

        public QueryBuilder fetchSign_type(){
            setFetchFields("fetchFields","sign_type");
            return this;
        }

        public QueryBuilder excludeSign_type(){
            setFetchFields("excludeFields","sign_type");
            return this;
        }

        public QueryBuilder fuzzySeller_id (List<String> fuzzySeller_id){
            this.fuzzySeller_id = fuzzySeller_id;
            return this;
        }

        public QueryBuilder fuzzySeller_id (String ... fuzzySeller_id){
            this.fuzzySeller_id = solveNullList(fuzzySeller_id);
            return this;
        }

        public QueryBuilder rightFuzzySeller_id (List<String> rightFuzzySeller_id){
            this.rightFuzzySeller_id = rightFuzzySeller_id;
            return this;
        }

        public QueryBuilder rightFuzzySeller_id (String ... rightFuzzySeller_id){
            this.rightFuzzySeller_id = solveNullList(rightFuzzySeller_id);
            return this;
        }

        public QueryBuilder seller_id(String seller_id){
            setSeller_id(seller_id);
            return this;
        }

        public QueryBuilder seller_idList(String ... seller_id){
            this.seller_idList = solveNullList(seller_id);
            return this;
        }

        public QueryBuilder seller_idList(List<String> seller_id){
            this.seller_idList = seller_id;
            return this;
        }

        public QueryBuilder fetchSeller_id(){
            setFetchFields("fetchFields","seller_id");
            return this;
        }

        public QueryBuilder excludeSeller_id(){
            setFetchFields("excludeFields","seller_id");
            return this;
        }

        public QueryBuilder fuzzyGmt_payment (List<String> fuzzyGmt_payment){
            this.fuzzyGmt_payment = fuzzyGmt_payment;
            return this;
        }

        public QueryBuilder fuzzyGmt_payment (String ... fuzzyGmt_payment){
            this.fuzzyGmt_payment = solveNullList(fuzzyGmt_payment);
            return this;
        }

        public QueryBuilder rightFuzzyGmt_payment (List<String> rightFuzzyGmt_payment){
            this.rightFuzzyGmt_payment = rightFuzzyGmt_payment;
            return this;
        }

        public QueryBuilder rightFuzzyGmt_payment (String ... rightFuzzyGmt_payment){
            this.rightFuzzyGmt_payment = solveNullList(rightFuzzyGmt_payment);
            return this;
        }

        public QueryBuilder gmt_payment(String gmt_payment){
            setGmt_payment(gmt_payment);
            return this;
        }

        public QueryBuilder gmt_paymentList(String ... gmt_payment){
            this.gmt_paymentList = solveNullList(gmt_payment);
            return this;
        }

        public QueryBuilder gmt_paymentList(List<String> gmt_payment){
            this.gmt_paymentList = gmt_payment;
            return this;
        }

        public QueryBuilder fetchGmt_payment(){
            setFetchFields("fetchFields","gmt_payment");
            return this;
        }

        public QueryBuilder excludeGmt_payment(){
            setFetchFields("excludeFields","gmt_payment");
            return this;
        }

        public QueryBuilder fuzzyNotify_time (List<String> fuzzyNotify_time){
            this.fuzzyNotify_time = fuzzyNotify_time;
            return this;
        }

        public QueryBuilder fuzzyNotify_time (String ... fuzzyNotify_time){
            this.fuzzyNotify_time = solveNullList(fuzzyNotify_time);
            return this;
        }

        public QueryBuilder rightFuzzyNotify_time (List<String> rightFuzzyNotify_time){
            this.rightFuzzyNotify_time = rightFuzzyNotify_time;
            return this;
        }

        public QueryBuilder rightFuzzyNotify_time (String ... rightFuzzyNotify_time){
            this.rightFuzzyNotify_time = solveNullList(rightFuzzyNotify_time);
            return this;
        }

        public QueryBuilder notify_time(String notify_time){
            setNotify_time(notify_time);
            return this;
        }

        public QueryBuilder notify_timeList(String ... notify_time){
            this.notify_timeList = solveNullList(notify_time);
            return this;
        }

        public QueryBuilder notify_timeList(List<String> notify_time){
            this.notify_timeList = notify_time;
            return this;
        }

        public QueryBuilder fetchNotify_time(){
            setFetchFields("fetchFields","notify_time");
            return this;
        }

        public QueryBuilder excludeNotify_time(){
            setFetchFields("excludeFields","notify_time");
            return this;
        }

        public QueryBuilder fuzzyVersion (List<String> fuzzyVersion){
            this.fuzzyVersion = fuzzyVersion;
            return this;
        }

        public QueryBuilder fuzzyVersion (String ... fuzzyVersion){
            this.fuzzyVersion = solveNullList(fuzzyVersion);
            return this;
        }

        public QueryBuilder rightFuzzyVersion (List<String> rightFuzzyVersion){
            this.rightFuzzyVersion = rightFuzzyVersion;
            return this;
        }

        public QueryBuilder rightFuzzyVersion (String ... rightFuzzyVersion){
            this.rightFuzzyVersion = solveNullList(rightFuzzyVersion);
            return this;
        }

        public QueryBuilder version(String version){
            setVersion(version);
            return this;
        }

        public QueryBuilder versionList(String ... version){
            this.versionList = solveNullList(version);
            return this;
        }

        public QueryBuilder versionList(List<String> version){
            this.versionList = version;
            return this;
        }

        public QueryBuilder fetchVersion(){
            setFetchFields("fetchFields","version");
            return this;
        }

        public QueryBuilder excludeVersion(){
            setFetchFields("excludeFields","version");
            return this;
        }

        public QueryBuilder fuzzyOut_trade_no (List<String> fuzzyOut_trade_no){
            this.fuzzyOut_trade_no = fuzzyOut_trade_no;
            return this;
        }

        public QueryBuilder fuzzyOut_trade_no (String ... fuzzyOut_trade_no){
            this.fuzzyOut_trade_no = solveNullList(fuzzyOut_trade_no);
            return this;
        }

        public QueryBuilder rightFuzzyOut_trade_no (List<String> rightFuzzyOut_trade_no){
            this.rightFuzzyOut_trade_no = rightFuzzyOut_trade_no;
            return this;
        }

        public QueryBuilder rightFuzzyOut_trade_no (String ... rightFuzzyOut_trade_no){
            this.rightFuzzyOut_trade_no = solveNullList(rightFuzzyOut_trade_no);
            return this;
        }

        public QueryBuilder out_trade_no(String out_trade_no){
            setOut_trade_no(out_trade_no);
            return this;
        }

        public QueryBuilder out_trade_noList(String ... out_trade_no){
            this.out_trade_noList = solveNullList(out_trade_no);
            return this;
        }

        public QueryBuilder out_trade_noList(List<String> out_trade_no){
            this.out_trade_noList = out_trade_no;
            return this;
        }

        public QueryBuilder fetchOut_trade_no(){
            setFetchFields("fetchFields","out_trade_no");
            return this;
        }

        public QueryBuilder excludeOut_trade_no(){
            setFetchFields("excludeFields","out_trade_no");
            return this;
        }

        public QueryBuilder fuzzyTotal_amount (List<String> fuzzyTotal_amount){
            this.fuzzyTotal_amount = fuzzyTotal_amount;
            return this;
        }

        public QueryBuilder fuzzyTotal_amount (String ... fuzzyTotal_amount){
            this.fuzzyTotal_amount = solveNullList(fuzzyTotal_amount);
            return this;
        }

        public QueryBuilder rightFuzzyTotal_amount (List<String> rightFuzzyTotal_amount){
            this.rightFuzzyTotal_amount = rightFuzzyTotal_amount;
            return this;
        }

        public QueryBuilder rightFuzzyTotal_amount (String ... rightFuzzyTotal_amount){
            this.rightFuzzyTotal_amount = solveNullList(rightFuzzyTotal_amount);
            return this;
        }

        public QueryBuilder total_amount(String total_amount){
            setTotal_amount(total_amount);
            return this;
        }

        public QueryBuilder total_amountList(String ... total_amount){
            this.total_amountList = solveNullList(total_amount);
            return this;
        }

        public QueryBuilder total_amountList(List<String> total_amount){
            this.total_amountList = total_amount;
            return this;
        }

        public QueryBuilder fetchTotal_amount(){
            setFetchFields("fetchFields","total_amount");
            return this;
        }

        public QueryBuilder excludeTotal_amount(){
            setFetchFields("excludeFields","total_amount");
            return this;
        }

        public QueryBuilder fuzzyTrade_no (List<String> fuzzyTrade_no){
            this.fuzzyTrade_no = fuzzyTrade_no;
            return this;
        }

        public QueryBuilder fuzzyTrade_no (String ... fuzzyTrade_no){
            this.fuzzyTrade_no = solveNullList(fuzzyTrade_no);
            return this;
        }

        public QueryBuilder rightFuzzyTrade_no (List<String> rightFuzzyTrade_no){
            this.rightFuzzyTrade_no = rightFuzzyTrade_no;
            return this;
        }

        public QueryBuilder rightFuzzyTrade_no (String ... rightFuzzyTrade_no){
            this.rightFuzzyTrade_no = solveNullList(rightFuzzyTrade_no);
            return this;
        }

        public QueryBuilder trade_no(String trade_no){
            setTrade_no(trade_no);
            return this;
        }

        public QueryBuilder trade_noList(String ... trade_no){
            this.trade_noList = solveNullList(trade_no);
            return this;
        }

        public QueryBuilder trade_noList(List<String> trade_no){
            this.trade_noList = trade_no;
            return this;
        }

        public QueryBuilder fetchTrade_no(){
            setFetchFields("fetchFields","trade_no");
            return this;
        }

        public QueryBuilder excludeTrade_no(){
            setFetchFields("excludeFields","trade_no");
            return this;
        }

        public QueryBuilder fuzzyAuth_app_id (List<String> fuzzyAuth_app_id){
            this.fuzzyAuth_app_id = fuzzyAuth_app_id;
            return this;
        }

        public QueryBuilder fuzzyAuth_app_id (String ... fuzzyAuth_app_id){
            this.fuzzyAuth_app_id = solveNullList(fuzzyAuth_app_id);
            return this;
        }

        public QueryBuilder rightFuzzyAuth_app_id (List<String> rightFuzzyAuth_app_id){
            this.rightFuzzyAuth_app_id = rightFuzzyAuth_app_id;
            return this;
        }

        public QueryBuilder rightFuzzyAuth_app_id (String ... rightFuzzyAuth_app_id){
            this.rightFuzzyAuth_app_id = solveNullList(rightFuzzyAuth_app_id);
            return this;
        }

        public QueryBuilder auth_app_id(String auth_app_id){
            setAuth_app_id(auth_app_id);
            return this;
        }

        public QueryBuilder auth_app_idList(String ... auth_app_id){
            this.auth_app_idList = solveNullList(auth_app_id);
            return this;
        }

        public QueryBuilder auth_app_idList(List<String> auth_app_id){
            this.auth_app_idList = auth_app_id;
            return this;
        }

        public QueryBuilder fetchAuth_app_id(){
            setFetchFields("fetchFields","auth_app_id");
            return this;
        }

        public QueryBuilder excludeAuth_app_id(){
            setFetchFields("excludeFields","auth_app_id");
            return this;
        }

        public QueryBuilder fuzzyBuyer_logon_id (List<String> fuzzyBuyer_logon_id){
            this.fuzzyBuyer_logon_id = fuzzyBuyer_logon_id;
            return this;
        }

        public QueryBuilder fuzzyBuyer_logon_id (String ... fuzzyBuyer_logon_id){
            this.fuzzyBuyer_logon_id = solveNullList(fuzzyBuyer_logon_id);
            return this;
        }

        public QueryBuilder rightFuzzyBuyer_logon_id (List<String> rightFuzzyBuyer_logon_id){
            this.rightFuzzyBuyer_logon_id = rightFuzzyBuyer_logon_id;
            return this;
        }

        public QueryBuilder rightFuzzyBuyer_logon_id (String ... rightFuzzyBuyer_logon_id){
            this.rightFuzzyBuyer_logon_id = solveNullList(rightFuzzyBuyer_logon_id);
            return this;
        }

        public QueryBuilder buyer_logon_id(String buyer_logon_id){
            setBuyer_logon_id(buyer_logon_id);
            return this;
        }

        public QueryBuilder buyer_logon_idList(String ... buyer_logon_id){
            this.buyer_logon_idList = solveNullList(buyer_logon_id);
            return this;
        }

        public QueryBuilder buyer_logon_idList(List<String> buyer_logon_id){
            this.buyer_logon_idList = buyer_logon_id;
            return this;
        }

        public QueryBuilder fetchBuyer_logon_id(){
            setFetchFields("fetchFields","buyer_logon_id");
            return this;
        }

        public QueryBuilder excludeBuyer_logon_id(){
            setFetchFields("excludeFields","buyer_logon_id");
            return this;
        }

        public QueryBuilder fuzzyPoint_amount (List<String> fuzzyPoint_amount){
            this.fuzzyPoint_amount = fuzzyPoint_amount;
            return this;
        }

        public QueryBuilder fuzzyPoint_amount (String ... fuzzyPoint_amount){
            this.fuzzyPoint_amount = solveNullList(fuzzyPoint_amount);
            return this;
        }

        public QueryBuilder rightFuzzyPoint_amount (List<String> rightFuzzyPoint_amount){
            this.rightFuzzyPoint_amount = rightFuzzyPoint_amount;
            return this;
        }

        public QueryBuilder rightFuzzyPoint_amount (String ... rightFuzzyPoint_amount){
            this.rightFuzzyPoint_amount = solveNullList(rightFuzzyPoint_amount);
            return this;
        }

        public QueryBuilder point_amount(String point_amount){
            setPoint_amount(point_amount);
            return this;
        }

        public QueryBuilder point_amountList(String ... point_amount){
            this.point_amountList = solveNullList(point_amount);
            return this;
        }

        public QueryBuilder point_amountList(List<String> point_amount){
            this.point_amountList = point_amount;
            return this;
        }

        public QueryBuilder fetchPoint_amount(){
            setFetchFields("fetchFields","point_amount");
            return this;
        }

        public QueryBuilder excludePoint_amount(){
            setFetchFields("excludeFields","point_amount");
            return this;
        }

        public QueryBuilder fuzzyGmt_create (List<String> fuzzyGmt_create){
            this.fuzzyGmt_create = fuzzyGmt_create;
            return this;
        }

        public QueryBuilder fuzzyGmt_create (String ... fuzzyGmt_create){
            this.fuzzyGmt_create = solveNullList(fuzzyGmt_create);
            return this;
        }

        public QueryBuilder rightFuzzyGmt_create (List<String> rightFuzzyGmt_create){
            this.rightFuzzyGmt_create = rightFuzzyGmt_create;
            return this;
        }

        public QueryBuilder rightFuzzyGmt_create (String ... rightFuzzyGmt_create){
            this.rightFuzzyGmt_create = solveNullList(rightFuzzyGmt_create);
            return this;
        }

        public QueryBuilder gmt_create(String gmt_create){
            setGmt_create(gmt_create);
            return this;
        }

        public QueryBuilder gmt_createList(String ... gmt_create){
            this.gmt_createList = solveNullList(gmt_create);
            return this;
        }

        public QueryBuilder gmt_createList(List<String> gmt_create){
            this.gmt_createList = gmt_create;
            return this;
        }

        public QueryBuilder fetchGmt_create(){
            setFetchFields("fetchFields","gmt_create");
            return this;
        }

        public QueryBuilder excludeGmt_create(){
            setFetchFields("excludeFields","gmt_create");
            return this;
        }

        public QueryBuilder fuzzyCharset (List<String> fuzzyCharset){
            this.fuzzyCharset = fuzzyCharset;
            return this;
        }

        public QueryBuilder fuzzyCharset (String ... fuzzyCharset){
            this.fuzzyCharset = solveNullList(fuzzyCharset);
            return this;
        }

        public QueryBuilder rightFuzzyCharset (List<String> rightFuzzyCharset){
            this.rightFuzzyCharset = rightFuzzyCharset;
            return this;
        }

        public QueryBuilder rightFuzzyCharset (String ... rightFuzzyCharset){
            this.rightFuzzyCharset = solveNullList(rightFuzzyCharset);
            return this;
        }

        public QueryBuilder charset(String charset){
            setCharset(charset);
            return this;
        }

        public QueryBuilder charsetList(String ... charset){
            this.charsetList = solveNullList(charset);
            return this;
        }

        public QueryBuilder charsetList(List<String> charset){
            this.charsetList = charset;
            return this;
        }

        public QueryBuilder fetchCharset(){
            setFetchFields("fetchFields","charset");
            return this;
        }

        public QueryBuilder excludeCharset(){
            setFetchFields("excludeFields","charset");
            return this;
        }

        public QueryBuilder fuzzySeller_email (List<String> fuzzySeller_email){
            this.fuzzySeller_email = fuzzySeller_email;
            return this;
        }

        public QueryBuilder fuzzySeller_email (String ... fuzzySeller_email){
            this.fuzzySeller_email = solveNullList(fuzzySeller_email);
            return this;
        }

        public QueryBuilder rightFuzzySeller_email (List<String> rightFuzzySeller_email){
            this.rightFuzzySeller_email = rightFuzzySeller_email;
            return this;
        }

        public QueryBuilder rightFuzzySeller_email (String ... rightFuzzySeller_email){
            this.rightFuzzySeller_email = solveNullList(rightFuzzySeller_email);
            return this;
        }

        public QueryBuilder seller_email(String seller_email){
            setSeller_email(seller_email);
            return this;
        }

        public QueryBuilder seller_emailList(String ... seller_email){
            this.seller_emailList = solveNullList(seller_email);
            return this;
        }

        public QueryBuilder seller_emailList(List<String> seller_email){
            this.seller_emailList = seller_email;
            return this;
        }

        public QueryBuilder fetchSeller_email(){
            setFetchFields("fetchFields","seller_email");
            return this;
        }

        public QueryBuilder excludeSeller_email(){
            setFetchFields("excludeFields","seller_email");
            return this;
        }

        public QueryBuilder fuzzySubject (List<String> fuzzySubject){
            this.fuzzySubject = fuzzySubject;
            return this;
        }

        public QueryBuilder fuzzySubject (String ... fuzzySubject){
            this.fuzzySubject = solveNullList(fuzzySubject);
            return this;
        }

        public QueryBuilder rightFuzzySubject (List<String> rightFuzzySubject){
            this.rightFuzzySubject = rightFuzzySubject;
            return this;
        }

        public QueryBuilder rightFuzzySubject (String ... rightFuzzySubject){
            this.rightFuzzySubject = solveNullList(rightFuzzySubject);
            return this;
        }

        public QueryBuilder subject(String subject){
            setSubject(subject);
            return this;
        }

        public QueryBuilder subjectList(String ... subject){
            this.subjectList = solveNullList(subject);
            return this;
        }

        public QueryBuilder subjectList(List<String> subject){
            this.subjectList = subject;
            return this;
        }

        public QueryBuilder fetchSubject(){
            setFetchFields("fetchFields","subject");
            return this;
        }

        public QueryBuilder excludeSubject(){
            setFetchFields("excludeFields","subject");
            return this;
        }

        public QueryBuilder fuzzySign (List<String> fuzzySign){
            this.fuzzySign = fuzzySign;
            return this;
        }

        public QueryBuilder fuzzySign (String ... fuzzySign){
            this.fuzzySign = solveNullList(fuzzySign);
            return this;
        }

        public QueryBuilder rightFuzzySign (List<String> rightFuzzySign){
            this.rightFuzzySign = rightFuzzySign;
            return this;
        }

        public QueryBuilder rightFuzzySign (String ... rightFuzzySign){
            this.rightFuzzySign = solveNullList(rightFuzzySign);
            return this;
        }

        public QueryBuilder sign(String sign){
            setSign(sign);
            return this;
        }

        public QueryBuilder signList(String ... sign){
            this.signList = solveNullList(sign);
            return this;
        }

        public QueryBuilder signList(List<String> sign){
            this.signList = sign;
            return this;
        }

        public QueryBuilder fetchSign(){
            setFetchFields("fetchFields","sign");
            return this;
        }

        public QueryBuilder excludeSign(){
            setFetchFields("excludeFields","sign");
            return this;
        }

        public QueryBuilder fuzzyFund_bill_list (List<String> fuzzyFund_bill_list){
            this.fuzzyFund_bill_list = fuzzyFund_bill_list;
            return this;
        }

        public QueryBuilder fuzzyFund_bill_list (String ... fuzzyFund_bill_list){
            this.fuzzyFund_bill_list = solveNullList(fuzzyFund_bill_list);
            return this;
        }

        public QueryBuilder rightFuzzyFund_bill_list (List<String> rightFuzzyFund_bill_list){
            this.rightFuzzyFund_bill_list = rightFuzzyFund_bill_list;
            return this;
        }

        public QueryBuilder rightFuzzyFund_bill_list (String ... rightFuzzyFund_bill_list){
            this.rightFuzzyFund_bill_list = solveNullList(rightFuzzyFund_bill_list);
            return this;
        }

        public QueryBuilder fund_bill_list(String fund_bill_list){
            setFund_bill_list(fund_bill_list);
            return this;
        }

        public QueryBuilder fund_bill_listList(String ... fund_bill_list){
            this.fund_bill_listList = solveNullList(fund_bill_list);
            return this;
        }

        public QueryBuilder fund_bill_listList(List<String> fund_bill_list){
            this.fund_bill_listList = fund_bill_list;
            return this;
        }

        public QueryBuilder fetchFund_bill_list(){
            setFetchFields("fetchFields","fund_bill_list");
            return this;
        }

        public QueryBuilder excludeFund_bill_list(){
            setFetchFields("excludeFields","fund_bill_list");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public JpyAliRes build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> notify_idList;

        public List<String> getNotify_idList(){return this.notify_idList;}


        private List<String> fuzzyNotify_id;

        public List<String> getFuzzyNotify_id(){return this.fuzzyNotify_id;}

        private List<String> rightFuzzyNotify_id;

        public List<String> getRightFuzzyNotify_id(){return this.rightFuzzyNotify_id;}
        private List<String> buyer_idList;

        public List<String> getBuyer_idList(){return this.buyer_idList;}


        private List<String> fuzzyBuyer_id;

        public List<String> getFuzzyBuyer_id(){return this.fuzzyBuyer_id;}

        private List<String> rightFuzzyBuyer_id;

        public List<String> getRightFuzzyBuyer_id(){return this.rightFuzzyBuyer_id;}
        private List<String> invoice_amountList;

        public List<String> getInvoice_amountList(){return this.invoice_amountList;}


        private List<String> fuzzyInvoice_amount;

        public List<String> getFuzzyInvoice_amount(){return this.fuzzyInvoice_amount;}

        private List<String> rightFuzzyInvoice_amount;

        public List<String> getRightFuzzyInvoice_amount(){return this.rightFuzzyInvoice_amount;}
        private List<String> notify_typeList;

        public List<String> getNotify_typeList(){return this.notify_typeList;}


        private List<String> fuzzyNotify_type;

        public List<String> getFuzzyNotify_type(){return this.fuzzyNotify_type;}

        private List<String> rightFuzzyNotify_type;

        public List<String> getRightFuzzyNotify_type(){return this.rightFuzzyNotify_type;}
        private List<String> trade_statusList;

        public List<String> getTrade_statusList(){return this.trade_statusList;}


        private List<String> fuzzyTrade_status;

        public List<String> getFuzzyTrade_status(){return this.fuzzyTrade_status;}

        private List<String> rightFuzzyTrade_status;

        public List<String> getRightFuzzyTrade_status(){return this.rightFuzzyTrade_status;}
        private List<String> receipt_amountList;

        public List<String> getReceipt_amountList(){return this.receipt_amountList;}


        private List<String> fuzzyReceipt_amount;

        public List<String> getFuzzyReceipt_amount(){return this.fuzzyReceipt_amount;}

        private List<String> rightFuzzyReceipt_amount;

        public List<String> getRightFuzzyReceipt_amount(){return this.rightFuzzyReceipt_amount;}
        private List<String> buyer_pay_amountList;

        public List<String> getBuyer_pay_amountList(){return this.buyer_pay_amountList;}


        private List<String> fuzzyBuyer_pay_amount;

        public List<String> getFuzzyBuyer_pay_amount(){return this.fuzzyBuyer_pay_amount;}

        private List<String> rightFuzzyBuyer_pay_amount;

        public List<String> getRightFuzzyBuyer_pay_amount(){return this.rightFuzzyBuyer_pay_amount;}
        private List<String> app_idList;

        public List<String> getApp_idList(){return this.app_idList;}


        private List<String> fuzzyApp_id;

        public List<String> getFuzzyApp_id(){return this.fuzzyApp_id;}

        private List<String> rightFuzzyApp_id;

        public List<String> getRightFuzzyApp_id(){return this.rightFuzzyApp_id;}
        private List<String> sign_typeList;

        public List<String> getSign_typeList(){return this.sign_typeList;}


        private List<String> fuzzySign_type;

        public List<String> getFuzzySign_type(){return this.fuzzySign_type;}

        private List<String> rightFuzzySign_type;

        public List<String> getRightFuzzySign_type(){return this.rightFuzzySign_type;}
        private List<String> seller_idList;

        public List<String> getSeller_idList(){return this.seller_idList;}


        private List<String> fuzzySeller_id;

        public List<String> getFuzzySeller_id(){return this.fuzzySeller_id;}

        private List<String> rightFuzzySeller_id;

        public List<String> getRightFuzzySeller_id(){return this.rightFuzzySeller_id;}
        private List<String> gmt_paymentList;

        public List<String> getGmt_paymentList(){return this.gmt_paymentList;}


        private List<String> fuzzyGmt_payment;

        public List<String> getFuzzyGmt_payment(){return this.fuzzyGmt_payment;}

        private List<String> rightFuzzyGmt_payment;

        public List<String> getRightFuzzyGmt_payment(){return this.rightFuzzyGmt_payment;}
        private List<String> notify_timeList;

        public List<String> getNotify_timeList(){return this.notify_timeList;}


        private List<String> fuzzyNotify_time;

        public List<String> getFuzzyNotify_time(){return this.fuzzyNotify_time;}

        private List<String> rightFuzzyNotify_time;

        public List<String> getRightFuzzyNotify_time(){return this.rightFuzzyNotify_time;}
        private List<String> versionList;

        public List<String> getVersionList(){return this.versionList;}


        private List<String> fuzzyVersion;

        public List<String> getFuzzyVersion(){return this.fuzzyVersion;}

        private List<String> rightFuzzyVersion;

        public List<String> getRightFuzzyVersion(){return this.rightFuzzyVersion;}
        private List<String> out_trade_noList;

        public List<String> getOut_trade_noList(){return this.out_trade_noList;}


        private List<String> fuzzyOut_trade_no;

        public List<String> getFuzzyOut_trade_no(){return this.fuzzyOut_trade_no;}

        private List<String> rightFuzzyOut_trade_no;

        public List<String> getRightFuzzyOut_trade_no(){return this.rightFuzzyOut_trade_no;}
        private List<String> total_amountList;

        public List<String> getTotal_amountList(){return this.total_amountList;}


        private List<String> fuzzyTotal_amount;

        public List<String> getFuzzyTotal_amount(){return this.fuzzyTotal_amount;}

        private List<String> rightFuzzyTotal_amount;

        public List<String> getRightFuzzyTotal_amount(){return this.rightFuzzyTotal_amount;}
        private List<String> trade_noList;

        public List<String> getTrade_noList(){return this.trade_noList;}


        private List<String> fuzzyTrade_no;

        public List<String> getFuzzyTrade_no(){return this.fuzzyTrade_no;}

        private List<String> rightFuzzyTrade_no;

        public List<String> getRightFuzzyTrade_no(){return this.rightFuzzyTrade_no;}
        private List<String> auth_app_idList;

        public List<String> getAuth_app_idList(){return this.auth_app_idList;}


        private List<String> fuzzyAuth_app_id;

        public List<String> getFuzzyAuth_app_id(){return this.fuzzyAuth_app_id;}

        private List<String> rightFuzzyAuth_app_id;

        public List<String> getRightFuzzyAuth_app_id(){return this.rightFuzzyAuth_app_id;}
        private List<String> buyer_logon_idList;

        public List<String> getBuyer_logon_idList(){return this.buyer_logon_idList;}


        private List<String> fuzzyBuyer_logon_id;

        public List<String> getFuzzyBuyer_logon_id(){return this.fuzzyBuyer_logon_id;}

        private List<String> rightFuzzyBuyer_logon_id;

        public List<String> getRightFuzzyBuyer_logon_id(){return this.rightFuzzyBuyer_logon_id;}
        private List<String> point_amountList;

        public List<String> getPoint_amountList(){return this.point_amountList;}


        private List<String> fuzzyPoint_amount;

        public List<String> getFuzzyPoint_amount(){return this.fuzzyPoint_amount;}

        private List<String> rightFuzzyPoint_amount;

        public List<String> getRightFuzzyPoint_amount(){return this.rightFuzzyPoint_amount;}
        private List<String> gmt_createList;

        public List<String> getGmt_createList(){return this.gmt_createList;}


        private List<String> fuzzyGmt_create;

        public List<String> getFuzzyGmt_create(){return this.fuzzyGmt_create;}

        private List<String> rightFuzzyGmt_create;

        public List<String> getRightFuzzyGmt_create(){return this.rightFuzzyGmt_create;}
        private List<String> charsetList;

        public List<String> getCharsetList(){return this.charsetList;}


        private List<String> fuzzyCharset;

        public List<String> getFuzzyCharset(){return this.fuzzyCharset;}

        private List<String> rightFuzzyCharset;

        public List<String> getRightFuzzyCharset(){return this.rightFuzzyCharset;}
        private List<String> seller_emailList;

        public List<String> getSeller_emailList(){return this.seller_emailList;}


        private List<String> fuzzySeller_email;

        public List<String> getFuzzySeller_email(){return this.fuzzySeller_email;}

        private List<String> rightFuzzySeller_email;

        public List<String> getRightFuzzySeller_email(){return this.rightFuzzySeller_email;}
        private List<String> subjectList;

        public List<String> getSubjectList(){return this.subjectList;}


        private List<String> fuzzySubject;

        public List<String> getFuzzySubject(){return this.fuzzySubject;}

        private List<String> rightFuzzySubject;

        public List<String> getRightFuzzySubject(){return this.rightFuzzySubject;}
        private List<String> signList;

        public List<String> getSignList(){return this.signList;}


        private List<String> fuzzySign;

        public List<String> getFuzzySign(){return this.fuzzySign;}

        private List<String> rightFuzzySign;

        public List<String> getRightFuzzySign(){return this.rightFuzzySign;}
        private List<String> fund_bill_listList;

        public List<String> getFund_bill_listList(){return this.fund_bill_listList;}


        private List<String> fuzzyFund_bill_list;

        public List<String> getFuzzyFund_bill_list(){return this.fuzzyFund_bill_list;}

        private List<String> rightFuzzyFund_bill_list;

        public List<String> getRightFuzzyFund_bill_list(){return this.rightFuzzyFund_bill_list;}

        public ConditionBuilder fuzzyNotify_id (List<String> fuzzyNotify_id){
            this.fuzzyNotify_id = fuzzyNotify_id;
            return this;
        }

        public ConditionBuilder fuzzyNotify_id (String ... fuzzyNotify_id){
            this.fuzzyNotify_id = solveNullList(fuzzyNotify_id);
            return this;
        }

        public ConditionBuilder rightFuzzyNotify_id (List<String> rightFuzzyNotify_id){
            this.rightFuzzyNotify_id = rightFuzzyNotify_id;
            return this;
        }

        public ConditionBuilder rightFuzzyNotify_id (String ... rightFuzzyNotify_id){
            this.rightFuzzyNotify_id = solveNullList(rightFuzzyNotify_id);
            return this;
        }

        public ConditionBuilder notify_idList(String ... notify_id){
            this.notify_idList = solveNullList(notify_id);
            return this;
        }

        public ConditionBuilder notify_idList(List<String> notify_id){
            this.notify_idList = notify_id;
            return this;
        }

        public ConditionBuilder fuzzyBuyer_id (List<String> fuzzyBuyer_id){
            this.fuzzyBuyer_id = fuzzyBuyer_id;
            return this;
        }

        public ConditionBuilder fuzzyBuyer_id (String ... fuzzyBuyer_id){
            this.fuzzyBuyer_id = solveNullList(fuzzyBuyer_id);
            return this;
        }

        public ConditionBuilder rightFuzzyBuyer_id (List<String> rightFuzzyBuyer_id){
            this.rightFuzzyBuyer_id = rightFuzzyBuyer_id;
            return this;
        }

        public ConditionBuilder rightFuzzyBuyer_id (String ... rightFuzzyBuyer_id){
            this.rightFuzzyBuyer_id = solveNullList(rightFuzzyBuyer_id);
            return this;
        }

        public ConditionBuilder buyer_idList(String ... buyer_id){
            this.buyer_idList = solveNullList(buyer_id);
            return this;
        }

        public ConditionBuilder buyer_idList(List<String> buyer_id){
            this.buyer_idList = buyer_id;
            return this;
        }

        public ConditionBuilder fuzzyInvoice_amount (List<String> fuzzyInvoice_amount){
            this.fuzzyInvoice_amount = fuzzyInvoice_amount;
            return this;
        }

        public ConditionBuilder fuzzyInvoice_amount (String ... fuzzyInvoice_amount){
            this.fuzzyInvoice_amount = solveNullList(fuzzyInvoice_amount);
            return this;
        }

        public ConditionBuilder rightFuzzyInvoice_amount (List<String> rightFuzzyInvoice_amount){
            this.rightFuzzyInvoice_amount = rightFuzzyInvoice_amount;
            return this;
        }

        public ConditionBuilder rightFuzzyInvoice_amount (String ... rightFuzzyInvoice_amount){
            this.rightFuzzyInvoice_amount = solveNullList(rightFuzzyInvoice_amount);
            return this;
        }

        public ConditionBuilder invoice_amountList(String ... invoice_amount){
            this.invoice_amountList = solveNullList(invoice_amount);
            return this;
        }

        public ConditionBuilder invoice_amountList(List<String> invoice_amount){
            this.invoice_amountList = invoice_amount;
            return this;
        }

        public ConditionBuilder fuzzyNotify_type (List<String> fuzzyNotify_type){
            this.fuzzyNotify_type = fuzzyNotify_type;
            return this;
        }

        public ConditionBuilder fuzzyNotify_type (String ... fuzzyNotify_type){
            this.fuzzyNotify_type = solveNullList(fuzzyNotify_type);
            return this;
        }

        public ConditionBuilder rightFuzzyNotify_type (List<String> rightFuzzyNotify_type){
            this.rightFuzzyNotify_type = rightFuzzyNotify_type;
            return this;
        }

        public ConditionBuilder rightFuzzyNotify_type (String ... rightFuzzyNotify_type){
            this.rightFuzzyNotify_type = solveNullList(rightFuzzyNotify_type);
            return this;
        }

        public ConditionBuilder notify_typeList(String ... notify_type){
            this.notify_typeList = solveNullList(notify_type);
            return this;
        }

        public ConditionBuilder notify_typeList(List<String> notify_type){
            this.notify_typeList = notify_type;
            return this;
        }

        public ConditionBuilder fuzzyTrade_status (List<String> fuzzyTrade_status){
            this.fuzzyTrade_status = fuzzyTrade_status;
            return this;
        }

        public ConditionBuilder fuzzyTrade_status (String ... fuzzyTrade_status){
            this.fuzzyTrade_status = solveNullList(fuzzyTrade_status);
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_status (List<String> rightFuzzyTrade_status){
            this.rightFuzzyTrade_status = rightFuzzyTrade_status;
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_status (String ... rightFuzzyTrade_status){
            this.rightFuzzyTrade_status = solveNullList(rightFuzzyTrade_status);
            return this;
        }

        public ConditionBuilder trade_statusList(String ... trade_status){
            this.trade_statusList = solveNullList(trade_status);
            return this;
        }

        public ConditionBuilder trade_statusList(List<String> trade_status){
            this.trade_statusList = trade_status;
            return this;
        }

        public ConditionBuilder fuzzyReceipt_amount (List<String> fuzzyReceipt_amount){
            this.fuzzyReceipt_amount = fuzzyReceipt_amount;
            return this;
        }

        public ConditionBuilder fuzzyReceipt_amount (String ... fuzzyReceipt_amount){
            this.fuzzyReceipt_amount = solveNullList(fuzzyReceipt_amount);
            return this;
        }

        public ConditionBuilder rightFuzzyReceipt_amount (List<String> rightFuzzyReceipt_amount){
            this.rightFuzzyReceipt_amount = rightFuzzyReceipt_amount;
            return this;
        }

        public ConditionBuilder rightFuzzyReceipt_amount (String ... rightFuzzyReceipt_amount){
            this.rightFuzzyReceipt_amount = solveNullList(rightFuzzyReceipt_amount);
            return this;
        }

        public ConditionBuilder receipt_amountList(String ... receipt_amount){
            this.receipt_amountList = solveNullList(receipt_amount);
            return this;
        }

        public ConditionBuilder receipt_amountList(List<String> receipt_amount){
            this.receipt_amountList = receipt_amount;
            return this;
        }

        public ConditionBuilder fuzzyBuyer_pay_amount (List<String> fuzzyBuyer_pay_amount){
            this.fuzzyBuyer_pay_amount = fuzzyBuyer_pay_amount;
            return this;
        }

        public ConditionBuilder fuzzyBuyer_pay_amount (String ... fuzzyBuyer_pay_amount){
            this.fuzzyBuyer_pay_amount = solveNullList(fuzzyBuyer_pay_amount);
            return this;
        }

        public ConditionBuilder rightFuzzyBuyer_pay_amount (List<String> rightFuzzyBuyer_pay_amount){
            this.rightFuzzyBuyer_pay_amount = rightFuzzyBuyer_pay_amount;
            return this;
        }

        public ConditionBuilder rightFuzzyBuyer_pay_amount (String ... rightFuzzyBuyer_pay_amount){
            this.rightFuzzyBuyer_pay_amount = solveNullList(rightFuzzyBuyer_pay_amount);
            return this;
        }

        public ConditionBuilder buyer_pay_amountList(String ... buyer_pay_amount){
            this.buyer_pay_amountList = solveNullList(buyer_pay_amount);
            return this;
        }

        public ConditionBuilder buyer_pay_amountList(List<String> buyer_pay_amount){
            this.buyer_pay_amountList = buyer_pay_amount;
            return this;
        }

        public ConditionBuilder fuzzyApp_id (List<String> fuzzyApp_id){
            this.fuzzyApp_id = fuzzyApp_id;
            return this;
        }

        public ConditionBuilder fuzzyApp_id (String ... fuzzyApp_id){
            this.fuzzyApp_id = solveNullList(fuzzyApp_id);
            return this;
        }

        public ConditionBuilder rightFuzzyApp_id (List<String> rightFuzzyApp_id){
            this.rightFuzzyApp_id = rightFuzzyApp_id;
            return this;
        }

        public ConditionBuilder rightFuzzyApp_id (String ... rightFuzzyApp_id){
            this.rightFuzzyApp_id = solveNullList(rightFuzzyApp_id);
            return this;
        }

        public ConditionBuilder app_idList(String ... app_id){
            this.app_idList = solveNullList(app_id);
            return this;
        }

        public ConditionBuilder app_idList(List<String> app_id){
            this.app_idList = app_id;
            return this;
        }

        public ConditionBuilder fuzzySign_type (List<String> fuzzySign_type){
            this.fuzzySign_type = fuzzySign_type;
            return this;
        }

        public ConditionBuilder fuzzySign_type (String ... fuzzySign_type){
            this.fuzzySign_type = solveNullList(fuzzySign_type);
            return this;
        }

        public ConditionBuilder rightFuzzySign_type (List<String> rightFuzzySign_type){
            this.rightFuzzySign_type = rightFuzzySign_type;
            return this;
        }

        public ConditionBuilder rightFuzzySign_type (String ... rightFuzzySign_type){
            this.rightFuzzySign_type = solveNullList(rightFuzzySign_type);
            return this;
        }

        public ConditionBuilder sign_typeList(String ... sign_type){
            this.sign_typeList = solveNullList(sign_type);
            return this;
        }

        public ConditionBuilder sign_typeList(List<String> sign_type){
            this.sign_typeList = sign_type;
            return this;
        }

        public ConditionBuilder fuzzySeller_id (List<String> fuzzySeller_id){
            this.fuzzySeller_id = fuzzySeller_id;
            return this;
        }

        public ConditionBuilder fuzzySeller_id (String ... fuzzySeller_id){
            this.fuzzySeller_id = solveNullList(fuzzySeller_id);
            return this;
        }

        public ConditionBuilder rightFuzzySeller_id (List<String> rightFuzzySeller_id){
            this.rightFuzzySeller_id = rightFuzzySeller_id;
            return this;
        }

        public ConditionBuilder rightFuzzySeller_id (String ... rightFuzzySeller_id){
            this.rightFuzzySeller_id = solveNullList(rightFuzzySeller_id);
            return this;
        }

        public ConditionBuilder seller_idList(String ... seller_id){
            this.seller_idList = solveNullList(seller_id);
            return this;
        }

        public ConditionBuilder seller_idList(List<String> seller_id){
            this.seller_idList = seller_id;
            return this;
        }

        public ConditionBuilder fuzzyGmt_payment (List<String> fuzzyGmt_payment){
            this.fuzzyGmt_payment = fuzzyGmt_payment;
            return this;
        }

        public ConditionBuilder fuzzyGmt_payment (String ... fuzzyGmt_payment){
            this.fuzzyGmt_payment = solveNullList(fuzzyGmt_payment);
            return this;
        }

        public ConditionBuilder rightFuzzyGmt_payment (List<String> rightFuzzyGmt_payment){
            this.rightFuzzyGmt_payment = rightFuzzyGmt_payment;
            return this;
        }

        public ConditionBuilder rightFuzzyGmt_payment (String ... rightFuzzyGmt_payment){
            this.rightFuzzyGmt_payment = solveNullList(rightFuzzyGmt_payment);
            return this;
        }

        public ConditionBuilder gmt_paymentList(String ... gmt_payment){
            this.gmt_paymentList = solveNullList(gmt_payment);
            return this;
        }

        public ConditionBuilder gmt_paymentList(List<String> gmt_payment){
            this.gmt_paymentList = gmt_payment;
            return this;
        }

        public ConditionBuilder fuzzyNotify_time (List<String> fuzzyNotify_time){
            this.fuzzyNotify_time = fuzzyNotify_time;
            return this;
        }

        public ConditionBuilder fuzzyNotify_time (String ... fuzzyNotify_time){
            this.fuzzyNotify_time = solveNullList(fuzzyNotify_time);
            return this;
        }

        public ConditionBuilder rightFuzzyNotify_time (List<String> rightFuzzyNotify_time){
            this.rightFuzzyNotify_time = rightFuzzyNotify_time;
            return this;
        }

        public ConditionBuilder rightFuzzyNotify_time (String ... rightFuzzyNotify_time){
            this.rightFuzzyNotify_time = solveNullList(rightFuzzyNotify_time);
            return this;
        }

        public ConditionBuilder notify_timeList(String ... notify_time){
            this.notify_timeList = solveNullList(notify_time);
            return this;
        }

        public ConditionBuilder notify_timeList(List<String> notify_time){
            this.notify_timeList = notify_time;
            return this;
        }

        public ConditionBuilder fuzzyVersion (List<String> fuzzyVersion){
            this.fuzzyVersion = fuzzyVersion;
            return this;
        }

        public ConditionBuilder fuzzyVersion (String ... fuzzyVersion){
            this.fuzzyVersion = solveNullList(fuzzyVersion);
            return this;
        }

        public ConditionBuilder rightFuzzyVersion (List<String> rightFuzzyVersion){
            this.rightFuzzyVersion = rightFuzzyVersion;
            return this;
        }

        public ConditionBuilder rightFuzzyVersion (String ... rightFuzzyVersion){
            this.rightFuzzyVersion = solveNullList(rightFuzzyVersion);
            return this;
        }

        public ConditionBuilder versionList(String ... version){
            this.versionList = solveNullList(version);
            return this;
        }

        public ConditionBuilder versionList(List<String> version){
            this.versionList = version;
            return this;
        }

        public ConditionBuilder fuzzyOut_trade_no (List<String> fuzzyOut_trade_no){
            this.fuzzyOut_trade_no = fuzzyOut_trade_no;
            return this;
        }

        public ConditionBuilder fuzzyOut_trade_no (String ... fuzzyOut_trade_no){
            this.fuzzyOut_trade_no = solveNullList(fuzzyOut_trade_no);
            return this;
        }

        public ConditionBuilder rightFuzzyOut_trade_no (List<String> rightFuzzyOut_trade_no){
            this.rightFuzzyOut_trade_no = rightFuzzyOut_trade_no;
            return this;
        }

        public ConditionBuilder rightFuzzyOut_trade_no (String ... rightFuzzyOut_trade_no){
            this.rightFuzzyOut_trade_no = solveNullList(rightFuzzyOut_trade_no);
            return this;
        }

        public ConditionBuilder out_trade_noList(String ... out_trade_no){
            this.out_trade_noList = solveNullList(out_trade_no);
            return this;
        }

        public ConditionBuilder out_trade_noList(List<String> out_trade_no){
            this.out_trade_noList = out_trade_no;
            return this;
        }

        public ConditionBuilder fuzzyTotal_amount (List<String> fuzzyTotal_amount){
            this.fuzzyTotal_amount = fuzzyTotal_amount;
            return this;
        }

        public ConditionBuilder fuzzyTotal_amount (String ... fuzzyTotal_amount){
            this.fuzzyTotal_amount = solveNullList(fuzzyTotal_amount);
            return this;
        }

        public ConditionBuilder rightFuzzyTotal_amount (List<String> rightFuzzyTotal_amount){
            this.rightFuzzyTotal_amount = rightFuzzyTotal_amount;
            return this;
        }

        public ConditionBuilder rightFuzzyTotal_amount (String ... rightFuzzyTotal_amount){
            this.rightFuzzyTotal_amount = solveNullList(rightFuzzyTotal_amount);
            return this;
        }

        public ConditionBuilder total_amountList(String ... total_amount){
            this.total_amountList = solveNullList(total_amount);
            return this;
        }

        public ConditionBuilder total_amountList(List<String> total_amount){
            this.total_amountList = total_amount;
            return this;
        }

        public ConditionBuilder fuzzyTrade_no (List<String> fuzzyTrade_no){
            this.fuzzyTrade_no = fuzzyTrade_no;
            return this;
        }

        public ConditionBuilder fuzzyTrade_no (String ... fuzzyTrade_no){
            this.fuzzyTrade_no = solveNullList(fuzzyTrade_no);
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_no (List<String> rightFuzzyTrade_no){
            this.rightFuzzyTrade_no = rightFuzzyTrade_no;
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_no (String ... rightFuzzyTrade_no){
            this.rightFuzzyTrade_no = solveNullList(rightFuzzyTrade_no);
            return this;
        }

        public ConditionBuilder trade_noList(String ... trade_no){
            this.trade_noList = solveNullList(trade_no);
            return this;
        }

        public ConditionBuilder trade_noList(List<String> trade_no){
            this.trade_noList = trade_no;
            return this;
        }

        public ConditionBuilder fuzzyAuth_app_id (List<String> fuzzyAuth_app_id){
            this.fuzzyAuth_app_id = fuzzyAuth_app_id;
            return this;
        }

        public ConditionBuilder fuzzyAuth_app_id (String ... fuzzyAuth_app_id){
            this.fuzzyAuth_app_id = solveNullList(fuzzyAuth_app_id);
            return this;
        }

        public ConditionBuilder rightFuzzyAuth_app_id (List<String> rightFuzzyAuth_app_id){
            this.rightFuzzyAuth_app_id = rightFuzzyAuth_app_id;
            return this;
        }

        public ConditionBuilder rightFuzzyAuth_app_id (String ... rightFuzzyAuth_app_id){
            this.rightFuzzyAuth_app_id = solveNullList(rightFuzzyAuth_app_id);
            return this;
        }

        public ConditionBuilder auth_app_idList(String ... auth_app_id){
            this.auth_app_idList = solveNullList(auth_app_id);
            return this;
        }

        public ConditionBuilder auth_app_idList(List<String> auth_app_id){
            this.auth_app_idList = auth_app_id;
            return this;
        }

        public ConditionBuilder fuzzyBuyer_logon_id (List<String> fuzzyBuyer_logon_id){
            this.fuzzyBuyer_logon_id = fuzzyBuyer_logon_id;
            return this;
        }

        public ConditionBuilder fuzzyBuyer_logon_id (String ... fuzzyBuyer_logon_id){
            this.fuzzyBuyer_logon_id = solveNullList(fuzzyBuyer_logon_id);
            return this;
        }

        public ConditionBuilder rightFuzzyBuyer_logon_id (List<String> rightFuzzyBuyer_logon_id){
            this.rightFuzzyBuyer_logon_id = rightFuzzyBuyer_logon_id;
            return this;
        }

        public ConditionBuilder rightFuzzyBuyer_logon_id (String ... rightFuzzyBuyer_logon_id){
            this.rightFuzzyBuyer_logon_id = solveNullList(rightFuzzyBuyer_logon_id);
            return this;
        }

        public ConditionBuilder buyer_logon_idList(String ... buyer_logon_id){
            this.buyer_logon_idList = solveNullList(buyer_logon_id);
            return this;
        }

        public ConditionBuilder buyer_logon_idList(List<String> buyer_logon_id){
            this.buyer_logon_idList = buyer_logon_id;
            return this;
        }

        public ConditionBuilder fuzzyPoint_amount (List<String> fuzzyPoint_amount){
            this.fuzzyPoint_amount = fuzzyPoint_amount;
            return this;
        }

        public ConditionBuilder fuzzyPoint_amount (String ... fuzzyPoint_amount){
            this.fuzzyPoint_amount = solveNullList(fuzzyPoint_amount);
            return this;
        }

        public ConditionBuilder rightFuzzyPoint_amount (List<String> rightFuzzyPoint_amount){
            this.rightFuzzyPoint_amount = rightFuzzyPoint_amount;
            return this;
        }

        public ConditionBuilder rightFuzzyPoint_amount (String ... rightFuzzyPoint_amount){
            this.rightFuzzyPoint_amount = solveNullList(rightFuzzyPoint_amount);
            return this;
        }

        public ConditionBuilder point_amountList(String ... point_amount){
            this.point_amountList = solveNullList(point_amount);
            return this;
        }

        public ConditionBuilder point_amountList(List<String> point_amount){
            this.point_amountList = point_amount;
            return this;
        }

        public ConditionBuilder fuzzyGmt_create (List<String> fuzzyGmt_create){
            this.fuzzyGmt_create = fuzzyGmt_create;
            return this;
        }

        public ConditionBuilder fuzzyGmt_create (String ... fuzzyGmt_create){
            this.fuzzyGmt_create = solveNullList(fuzzyGmt_create);
            return this;
        }

        public ConditionBuilder rightFuzzyGmt_create (List<String> rightFuzzyGmt_create){
            this.rightFuzzyGmt_create = rightFuzzyGmt_create;
            return this;
        }

        public ConditionBuilder rightFuzzyGmt_create (String ... rightFuzzyGmt_create){
            this.rightFuzzyGmt_create = solveNullList(rightFuzzyGmt_create);
            return this;
        }

        public ConditionBuilder gmt_createList(String ... gmt_create){
            this.gmt_createList = solveNullList(gmt_create);
            return this;
        }

        public ConditionBuilder gmt_createList(List<String> gmt_create){
            this.gmt_createList = gmt_create;
            return this;
        }

        public ConditionBuilder fuzzyCharset (List<String> fuzzyCharset){
            this.fuzzyCharset = fuzzyCharset;
            return this;
        }

        public ConditionBuilder fuzzyCharset (String ... fuzzyCharset){
            this.fuzzyCharset = solveNullList(fuzzyCharset);
            return this;
        }

        public ConditionBuilder rightFuzzyCharset (List<String> rightFuzzyCharset){
            this.rightFuzzyCharset = rightFuzzyCharset;
            return this;
        }

        public ConditionBuilder rightFuzzyCharset (String ... rightFuzzyCharset){
            this.rightFuzzyCharset = solveNullList(rightFuzzyCharset);
            return this;
        }

        public ConditionBuilder charsetList(String ... charset){
            this.charsetList = solveNullList(charset);
            return this;
        }

        public ConditionBuilder charsetList(List<String> charset){
            this.charsetList = charset;
            return this;
        }

        public ConditionBuilder fuzzySeller_email (List<String> fuzzySeller_email){
            this.fuzzySeller_email = fuzzySeller_email;
            return this;
        }

        public ConditionBuilder fuzzySeller_email (String ... fuzzySeller_email){
            this.fuzzySeller_email = solveNullList(fuzzySeller_email);
            return this;
        }

        public ConditionBuilder rightFuzzySeller_email (List<String> rightFuzzySeller_email){
            this.rightFuzzySeller_email = rightFuzzySeller_email;
            return this;
        }

        public ConditionBuilder rightFuzzySeller_email (String ... rightFuzzySeller_email){
            this.rightFuzzySeller_email = solveNullList(rightFuzzySeller_email);
            return this;
        }

        public ConditionBuilder seller_emailList(String ... seller_email){
            this.seller_emailList = solveNullList(seller_email);
            return this;
        }

        public ConditionBuilder seller_emailList(List<String> seller_email){
            this.seller_emailList = seller_email;
            return this;
        }

        public ConditionBuilder fuzzySubject (List<String> fuzzySubject){
            this.fuzzySubject = fuzzySubject;
            return this;
        }

        public ConditionBuilder fuzzySubject (String ... fuzzySubject){
            this.fuzzySubject = solveNullList(fuzzySubject);
            return this;
        }

        public ConditionBuilder rightFuzzySubject (List<String> rightFuzzySubject){
            this.rightFuzzySubject = rightFuzzySubject;
            return this;
        }

        public ConditionBuilder rightFuzzySubject (String ... rightFuzzySubject){
            this.rightFuzzySubject = solveNullList(rightFuzzySubject);
            return this;
        }

        public ConditionBuilder subjectList(String ... subject){
            this.subjectList = solveNullList(subject);
            return this;
        }

        public ConditionBuilder subjectList(List<String> subject){
            this.subjectList = subject;
            return this;
        }

        public ConditionBuilder fuzzySign (List<String> fuzzySign){
            this.fuzzySign = fuzzySign;
            return this;
        }

        public ConditionBuilder fuzzySign (String ... fuzzySign){
            this.fuzzySign = solveNullList(fuzzySign);
            return this;
        }

        public ConditionBuilder rightFuzzySign (List<String> rightFuzzySign){
            this.rightFuzzySign = rightFuzzySign;
            return this;
        }

        public ConditionBuilder rightFuzzySign (String ... rightFuzzySign){
            this.rightFuzzySign = solveNullList(rightFuzzySign);
            return this;
        }

        public ConditionBuilder signList(String ... sign){
            this.signList = solveNullList(sign);
            return this;
        }

        public ConditionBuilder signList(List<String> sign){
            this.signList = sign;
            return this;
        }

        public ConditionBuilder fuzzyFund_bill_list (List<String> fuzzyFund_bill_list){
            this.fuzzyFund_bill_list = fuzzyFund_bill_list;
            return this;
        }

        public ConditionBuilder fuzzyFund_bill_list (String ... fuzzyFund_bill_list){
            this.fuzzyFund_bill_list = solveNullList(fuzzyFund_bill_list);
            return this;
        }

        public ConditionBuilder rightFuzzyFund_bill_list (List<String> rightFuzzyFund_bill_list){
            this.rightFuzzyFund_bill_list = rightFuzzyFund_bill_list;
            return this;
        }

        public ConditionBuilder rightFuzzyFund_bill_list (String ... rightFuzzyFund_bill_list){
            this.rightFuzzyFund_bill_list = solveNullList(rightFuzzyFund_bill_list);
            return this;
        }

        public ConditionBuilder fund_bill_listList(String ... fund_bill_list){
            this.fund_bill_listList = solveNullList(fund_bill_list);
            return this;
        }

        public ConditionBuilder fund_bill_listList(List<String> fund_bill_list){
            this.fund_bill_listList = fund_bill_list;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private JpyAliRes obj;

        public Builder(){
            this.obj = new JpyAliRes();
        }

        public Builder notify_id(String notify_id){
            this.obj.setNotify_id(notify_id);
            return this;
        }
        public Builder buyer_id(String buyer_id){
            this.obj.setBuyer_id(buyer_id);
            return this;
        }
        public Builder invoice_amount(String invoice_amount){
            this.obj.setInvoice_amount(invoice_amount);
            return this;
        }
        public Builder notify_type(String notify_type){
            this.obj.setNotify_type(notify_type);
            return this;
        }
        public Builder trade_status(String trade_status){
            this.obj.setTrade_status(trade_status);
            return this;
        }
        public Builder receipt_amount(String receipt_amount){
            this.obj.setReceipt_amount(receipt_amount);
            return this;
        }
        public Builder buyer_pay_amount(String buyer_pay_amount){
            this.obj.setBuyer_pay_amount(buyer_pay_amount);
            return this;
        }
        public Builder app_id(String app_id){
            this.obj.setApp_id(app_id);
            return this;
        }
        public Builder sign_type(String sign_type){
            this.obj.setSign_type(sign_type);
            return this;
        }
        public Builder seller_id(String seller_id){
            this.obj.setSeller_id(seller_id);
            return this;
        }
        public Builder gmt_payment(String gmt_payment){
            this.obj.setGmt_payment(gmt_payment);
            return this;
        }
        public Builder notify_time(String notify_time){
            this.obj.setNotify_time(notify_time);
            return this;
        }
        public Builder version(String version){
            this.obj.setVersion(version);
            return this;
        }
        public Builder out_trade_no(String out_trade_no){
            this.obj.setOut_trade_no(out_trade_no);
            return this;
        }
        public Builder total_amount(String total_amount){
            this.obj.setTotal_amount(total_amount);
            return this;
        }
        public Builder trade_no(String trade_no){
            this.obj.setTrade_no(trade_no);
            return this;
        }
        public Builder auth_app_id(String auth_app_id){
            this.obj.setAuth_app_id(auth_app_id);
            return this;
        }
        public Builder buyer_logon_id(String buyer_logon_id){
            this.obj.setBuyer_logon_id(buyer_logon_id);
            return this;
        }
        public Builder point_amount(String point_amount){
            this.obj.setPoint_amount(point_amount);
            return this;
        }
        public Builder gmt_create(String gmt_create){
            this.obj.setGmt_create(gmt_create);
            return this;
        }
        public Builder charset(String charset){
            this.obj.setCharset(charset);
            return this;
        }
        public Builder seller_email(String seller_email){
            this.obj.setSeller_email(seller_email);
            return this;
        }
        public Builder subject(String subject){
            this.obj.setSubject(subject);
            return this;
        }
        public Builder sign(String sign){
            this.obj.setSign(sign);
            return this;
        }
        public Builder fund_bill_list(String fund_bill_list){
            this.obj.setFund_bill_list(fund_bill_list);
            return this;
        }
        public JpyAliRes build(){return obj;}
    }

}
