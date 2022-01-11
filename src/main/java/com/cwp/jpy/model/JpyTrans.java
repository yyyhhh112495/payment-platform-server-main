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
public class JpyTrans implements Serializable {

    private static final long serialVersionUID = 1638926377000L;


    /**
    * 主键
    * 交易流水号
    * isNullAble:0
    */
    private String tranno;

    /**
    * 商户id
    * isNullAble:1
    */
    private String bussinessid;

    /**
    * 商户名称
    * isNullAble:1
    */
    private String bussinessname;

    /**
    * 支付时费率
    * isNullAble:1
    */
    private String bussinessratio;

    /**
    * 交易金额
    * isNullAble:1
    */
    private String trannum;

    /**
    * 账户渠道费率
    * isNullAble:1
    */
    private String countratio;

    /**
    * 支付渠道  wechat alipay
    * isNullAble:1
    */
    private String paychannel;

    /**
    * 收款账户
    * isNullAble:1
    */
    private String collectcountid;

    /**
    * 收款账户名称
    * isNullAble:1
    */
    private String collectcountname;

    /**
    * 0-未结算 1-已结算 2-结算中
    * isNullAble:1
    */
    private String transstatus;

    /**
    * 应结算金额
    * isNullAble:1
    */
    private String transnum;

    /**
    * 结算流水号
    * isNullAble:1
    */
    private String transno;

    /**
    * 结算时间
    * isNullAble:1
    */
    private String transtimer;

    /**
    * 交易成功时间
    * isNullAble:1
    */
    private String transcomtimer;

    /**
    * 交易利润
    * isNullAble:1
    */
    private String transprofit;


    private String countid;
    public String getCountid() {
        return countid;
    }
    public void setCountid(String countid) {
        this.countid = countid;
    }
    public void setTranno(String tranno){this.tranno = tranno;}

    public String getTranno(){return this.tranno;}

    public void setBussinessid(String bussinessid){this.bussinessid = bussinessid;}

    public String getBussinessid(){return this.bussinessid;}

    public void setBussinessname(String bussinessname){this.bussinessname = bussinessname;}

    public String getBussinessname(){return this.bussinessname;}

    public void setBussinessratio(String bussinessratio){this.bussinessratio = bussinessratio;}

    public String getBussinessratio(){return this.bussinessratio;}

    public void setTrannum(String trannum){this.trannum = trannum;}

    public String getTrannum(){return this.trannum;}

    public void setCountratio(String countratio){this.countratio = countratio;}

    public String getCountratio(){return this.countratio;}

    public void setPaychannel(String paychannel){this.paychannel = paychannel;}

    public String getPaychannel(){return this.paychannel;}

    public void setCollectcountid(String collectcountid){this.collectcountid = collectcountid;}

    public String getCollectcountid(){return this.collectcountid;}

    public void setCollectcountname(String collectcountname){this.collectcountname = collectcountname;}

    public String getCollectcountname(){return this.collectcountname;}

    public void setTransstatus(String transstatus){this.transstatus = transstatus;}

    public String getTransstatus(){return this.transstatus;}

    public void setTransnum(String transnum){this.transnum = transnum;}

    public String getTransnum(){return this.transnum;}

    public void setTransno(String transno){this.transno = transno;}

    public String getTransno(){return this.transno;}

    public void setTranstimer(String transtimer){this.transtimer = transtimer;}

    public String getTranstimer(){return this.transtimer;}

    public void setTranscomtimer(String transcomtimer){this.transcomtimer = transcomtimer;}

    public String getTranscomtimer(){return this.transcomtimer;}

    public void setTransprofit(String transprofit){this.transprofit = transprofit;}

    public String getTransprofit(){return this.transprofit;}
    @Override
    public String toString() {
        return "JpyTrans{" +
                "tranno='" + tranno + '\'' +
                "bussinessid='" + bussinessid + '\'' +
                "bussinessname='" + bussinessname + '\'' +
                "bussinessratio='" + bussinessratio + '\'' +
                "trannum='" + trannum + '\'' +
                "countratio='" + countratio + '\'' +
                "paychannel='" + paychannel + '\'' +
                "collectcountid='" + collectcountid + '\'' +
                "collectcountname='" + collectcountname + '\'' +
                "transstatus='" + transstatus + '\'' +
                "transnum='" + transnum + '\'' +
                "transno='" + transno + '\'' +
                "transtimer='" + transtimer + '\'' +
                "transcomtimer='" + transcomtimer + '\'' +
                "transprofit='" + transprofit + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyTrans set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyTrans set){
            this.set = set;
            return this;
        }

        public JpyTrans getSet(){
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

    public static class QueryBuilder extends JpyTrans{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> trannoList;

        public List<String> getTrannoList(){return this.trannoList;}


        private List<String> fuzzyTranno;

        public List<String> getFuzzyTranno(){return this.fuzzyTranno;}

        private List<String> rightFuzzyTranno;

        public List<String> getRightFuzzyTranno(){return this.rightFuzzyTranno;}
        private List<String> bussinessidList;

        public List<String> getBussinessidList(){return this.bussinessidList;}


        private List<String> fuzzyBussinessid;

        public List<String> getFuzzyBussinessid(){return this.fuzzyBussinessid;}

        private List<String> rightFuzzyBussinessid;

        public List<String> getRightFuzzyBussinessid(){return this.rightFuzzyBussinessid;}
        private List<String> bussinessnameList;

        public List<String> getBussinessnameList(){return this.bussinessnameList;}


        private List<String> fuzzyBussinessname;

        public List<String> getFuzzyBussinessname(){return this.fuzzyBussinessname;}

        private List<String> rightFuzzyBussinessname;

        public List<String> getRightFuzzyBussinessname(){return this.rightFuzzyBussinessname;}
        private List<String> bussinessratioList;

        public List<String> getBussinessratioList(){return this.bussinessratioList;}


        private List<String> fuzzyBussinessratio;

        public List<String> getFuzzyBussinessratio(){return this.fuzzyBussinessratio;}

        private List<String> rightFuzzyBussinessratio;

        public List<String> getRightFuzzyBussinessratio(){return this.rightFuzzyBussinessratio;}
        private List<String> trannumList;

        public List<String> getTrannumList(){return this.trannumList;}


        private List<String> fuzzyTrannum;

        public List<String> getFuzzyTrannum(){return this.fuzzyTrannum;}

        private List<String> rightFuzzyTrannum;

        public List<String> getRightFuzzyTrannum(){return this.rightFuzzyTrannum;}
        private List<String> countratioList;

        public List<String> getCountratioList(){return this.countratioList;}


        private List<String> fuzzyCountratio;

        public List<String> getFuzzyCountratio(){return this.fuzzyCountratio;}

        private List<String> rightFuzzyCountratio;

        public List<String> getRightFuzzyCountratio(){return this.rightFuzzyCountratio;}
        private List<String> paychannelList;

        public List<String> getPaychannelList(){return this.paychannelList;}


        private List<String> fuzzyPaychannel;

        public List<String> getFuzzyPaychannel(){return this.fuzzyPaychannel;}

        private List<String> rightFuzzyPaychannel;

        public List<String> getRightFuzzyPaychannel(){return this.rightFuzzyPaychannel;}
        private List<String> collectcountidList;

        public List<String> getCollectcountidList(){return this.collectcountidList;}


        private List<String> fuzzyCollectcountid;

        public List<String> getFuzzyCollectcountid(){return this.fuzzyCollectcountid;}

        private List<String> rightFuzzyCollectcountid;

        public List<String> getRightFuzzyCollectcountid(){return this.rightFuzzyCollectcountid;}
        private List<String> collectcountnameList;

        public List<String> getCollectcountnameList(){return this.collectcountnameList;}


        private List<String> fuzzyCollectcountname;

        public List<String> getFuzzyCollectcountname(){return this.fuzzyCollectcountname;}

        private List<String> rightFuzzyCollectcountname;

        public List<String> getRightFuzzyCollectcountname(){return this.rightFuzzyCollectcountname;}
        private List<String> transstatusList;

        public List<String> getTransstatusList(){return this.transstatusList;}


        private List<String> fuzzyTransstatus;

        public List<String> getFuzzyTransstatus(){return this.fuzzyTransstatus;}

        private List<String> rightFuzzyTransstatus;

        public List<String> getRightFuzzyTransstatus(){return this.rightFuzzyTransstatus;}
        private List<String> transnumList;

        public List<String> getTransnumList(){return this.transnumList;}


        private List<String> fuzzyTransnum;

        public List<String> getFuzzyTransnum(){return this.fuzzyTransnum;}

        private List<String> rightFuzzyTransnum;

        public List<String> getRightFuzzyTransnum(){return this.rightFuzzyTransnum;}
        private List<String> transnoList;

        public List<String> getTransnoList(){return this.transnoList;}


        private List<String> fuzzyTransno;

        public List<String> getFuzzyTransno(){return this.fuzzyTransno;}

        private List<String> rightFuzzyTransno;

        public List<String> getRightFuzzyTransno(){return this.rightFuzzyTransno;}
        private List<String> transtimerList;

        public List<String> getTranstimerList(){return this.transtimerList;}


        private List<String> fuzzyTranstimer;

        public List<String> getFuzzyTranstimer(){return this.fuzzyTranstimer;}

        private List<String> rightFuzzyTranstimer;

        public List<String> getRightFuzzyTranstimer(){return this.rightFuzzyTranstimer;}
        private List<String> transcomtimerList;

        public List<String> getTranscomtimerList(){return this.transcomtimerList;}


        private List<String> fuzzyTranscomtimer;

        public List<String> getFuzzyTranscomtimer(){return this.fuzzyTranscomtimer;}

        private List<String> rightFuzzyTranscomtimer;

        public List<String> getRightFuzzyTranscomtimer(){return this.rightFuzzyTranscomtimer;}
        private List<String> transprofitList;

        public List<String> getTransprofitList(){return this.transprofitList;}


        private List<String> fuzzyTransprofit;

        public List<String> getFuzzyTransprofit(){return this.fuzzyTransprofit;}

        private List<String> rightFuzzyTransprofit;

        public List<String> getRightFuzzyTransprofit(){return this.rightFuzzyTransprofit;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyTranno (List<String> fuzzyTranno){
            this.fuzzyTranno = fuzzyTranno;
            return this;
        }

        public QueryBuilder fuzzyTranno (String ... fuzzyTranno){
            this.fuzzyTranno = solveNullList(fuzzyTranno);
            return this;
        }

        public QueryBuilder rightFuzzyTranno (List<String> rightFuzzyTranno){
            this.rightFuzzyTranno = rightFuzzyTranno;
            return this;
        }

        public QueryBuilder rightFuzzyTranno (String ... rightFuzzyTranno){
            this.rightFuzzyTranno = solveNullList(rightFuzzyTranno);
            return this;
        }

        public QueryBuilder tranno(String tranno){
            setTranno(tranno);
            return this;
        }

        public QueryBuilder trannoList(String ... tranno){
            this.trannoList = solveNullList(tranno);
            return this;
        }

        public QueryBuilder trannoList(List<String> tranno){
            this.trannoList = tranno;
            return this;
        }

        public QueryBuilder fetchTranno(){
            setFetchFields("fetchFields","tranno");
            return this;
        }

        public QueryBuilder excludeTranno(){
            setFetchFields("excludeFields","tranno");
            return this;
        }

        public QueryBuilder fuzzyBussinessid (List<String> fuzzyBussinessid){
            this.fuzzyBussinessid = fuzzyBussinessid;
            return this;
        }

        public QueryBuilder fuzzyBussinessid (String ... fuzzyBussinessid){
            this.fuzzyBussinessid = solveNullList(fuzzyBussinessid);
            return this;
        }

        public QueryBuilder rightFuzzyBussinessid (List<String> rightFuzzyBussinessid){
            this.rightFuzzyBussinessid = rightFuzzyBussinessid;
            return this;
        }

        public QueryBuilder rightFuzzyBussinessid (String ... rightFuzzyBussinessid){
            this.rightFuzzyBussinessid = solveNullList(rightFuzzyBussinessid);
            return this;
        }

        public QueryBuilder bussinessid(String bussinessid){
            setBussinessid(bussinessid);
            return this;
        }

        public QueryBuilder bussinessidList(String ... bussinessid){
            this.bussinessidList = solveNullList(bussinessid);
            return this;
        }

        public QueryBuilder bussinessidList(List<String> bussinessid){
            this.bussinessidList = bussinessid;
            return this;
        }

        public QueryBuilder fetchBussinessid(){
            setFetchFields("fetchFields","bussinessid");
            return this;
        }

        public QueryBuilder excludeBussinessid(){
            setFetchFields("excludeFields","bussinessid");
            return this;
        }

        public QueryBuilder fuzzyBussinessname (List<String> fuzzyBussinessname){
            this.fuzzyBussinessname = fuzzyBussinessname;
            return this;
        }

        public QueryBuilder fuzzyBussinessname (String ... fuzzyBussinessname){
            this.fuzzyBussinessname = solveNullList(fuzzyBussinessname);
            return this;
        }

        public QueryBuilder rightFuzzyBussinessname (List<String> rightFuzzyBussinessname){
            this.rightFuzzyBussinessname = rightFuzzyBussinessname;
            return this;
        }

        public QueryBuilder rightFuzzyBussinessname (String ... rightFuzzyBussinessname){
            this.rightFuzzyBussinessname = solveNullList(rightFuzzyBussinessname);
            return this;
        }

        public QueryBuilder bussinessname(String bussinessname){
            setBussinessname(bussinessname);
            return this;
        }

        public QueryBuilder bussinessnameList(String ... bussinessname){
            this.bussinessnameList = solveNullList(bussinessname);
            return this;
        }

        public QueryBuilder bussinessnameList(List<String> bussinessname){
            this.bussinessnameList = bussinessname;
            return this;
        }

        public QueryBuilder fetchBussinessname(){
            setFetchFields("fetchFields","bussinessname");
            return this;
        }

        public QueryBuilder excludeBussinessname(){
            setFetchFields("excludeFields","bussinessname");
            return this;
        }

        public QueryBuilder fuzzyBussinessratio (List<String> fuzzyBussinessratio){
            this.fuzzyBussinessratio = fuzzyBussinessratio;
            return this;
        }

        public QueryBuilder fuzzyBussinessratio (String ... fuzzyBussinessratio){
            this.fuzzyBussinessratio = solveNullList(fuzzyBussinessratio);
            return this;
        }

        public QueryBuilder rightFuzzyBussinessratio (List<String> rightFuzzyBussinessratio){
            this.rightFuzzyBussinessratio = rightFuzzyBussinessratio;
            return this;
        }

        public QueryBuilder rightFuzzyBussinessratio (String ... rightFuzzyBussinessratio){
            this.rightFuzzyBussinessratio = solveNullList(rightFuzzyBussinessratio);
            return this;
        }

        public QueryBuilder bussinessratio(String bussinessratio){
            setBussinessratio(bussinessratio);
            return this;
        }

        public QueryBuilder bussinessratioList(String ... bussinessratio){
            this.bussinessratioList = solveNullList(bussinessratio);
            return this;
        }

        public QueryBuilder bussinessratioList(List<String> bussinessratio){
            this.bussinessratioList = bussinessratio;
            return this;
        }

        public QueryBuilder fetchBussinessratio(){
            setFetchFields("fetchFields","bussinessratio");
            return this;
        }

        public QueryBuilder excludeBussinessratio(){
            setFetchFields("excludeFields","bussinessratio");
            return this;
        }

        public QueryBuilder fuzzyTrannum (List<String> fuzzyTrannum){
            this.fuzzyTrannum = fuzzyTrannum;
            return this;
        }

        public QueryBuilder fuzzyTrannum (String ... fuzzyTrannum){
            this.fuzzyTrannum = solveNullList(fuzzyTrannum);
            return this;
        }

        public QueryBuilder rightFuzzyTrannum (List<String> rightFuzzyTrannum){
            this.rightFuzzyTrannum = rightFuzzyTrannum;
            return this;
        }

        public QueryBuilder rightFuzzyTrannum (String ... rightFuzzyTrannum){
            this.rightFuzzyTrannum = solveNullList(rightFuzzyTrannum);
            return this;
        }

        public QueryBuilder trannum(String trannum){
            setTrannum(trannum);
            return this;
        }

        public QueryBuilder trannumList(String ... trannum){
            this.trannumList = solveNullList(trannum);
            return this;
        }

        public QueryBuilder trannumList(List<String> trannum){
            this.trannumList = trannum;
            return this;
        }

        public QueryBuilder fetchTrannum(){
            setFetchFields("fetchFields","trannum");
            return this;
        }

        public QueryBuilder excludeTrannum(){
            setFetchFields("excludeFields","trannum");
            return this;
        }

        public QueryBuilder fuzzyCountratio (List<String> fuzzyCountratio){
            this.fuzzyCountratio = fuzzyCountratio;
            return this;
        }

        public QueryBuilder fuzzyCountratio (String ... fuzzyCountratio){
            this.fuzzyCountratio = solveNullList(fuzzyCountratio);
            return this;
        }

        public QueryBuilder rightFuzzyCountratio (List<String> rightFuzzyCountratio){
            this.rightFuzzyCountratio = rightFuzzyCountratio;
            return this;
        }

        public QueryBuilder rightFuzzyCountratio (String ... rightFuzzyCountratio){
            this.rightFuzzyCountratio = solveNullList(rightFuzzyCountratio);
            return this;
        }

        public QueryBuilder countratio(String countratio){
            setCountratio(countratio);
            return this;
        }

        public QueryBuilder countratioList(String ... countratio){
            this.countratioList = solveNullList(countratio);
            return this;
        }

        public QueryBuilder countratioList(List<String> countratio){
            this.countratioList = countratio;
            return this;
        }

        public QueryBuilder fetchCountratio(){
            setFetchFields("fetchFields","countratio");
            return this;
        }

        public QueryBuilder excludeCountratio(){
            setFetchFields("excludeFields","countratio");
            return this;
        }

        public QueryBuilder fuzzyPaychannel (List<String> fuzzyPaychannel){
            this.fuzzyPaychannel = fuzzyPaychannel;
            return this;
        }

        public QueryBuilder fuzzyPaychannel (String ... fuzzyPaychannel){
            this.fuzzyPaychannel = solveNullList(fuzzyPaychannel);
            return this;
        }

        public QueryBuilder rightFuzzyPaychannel (List<String> rightFuzzyPaychannel){
            this.rightFuzzyPaychannel = rightFuzzyPaychannel;
            return this;
        }

        public QueryBuilder rightFuzzyPaychannel (String ... rightFuzzyPaychannel){
            this.rightFuzzyPaychannel = solveNullList(rightFuzzyPaychannel);
            return this;
        }

        public QueryBuilder paychannel(String paychannel){
            setPaychannel(paychannel);
            return this;
        }

        public QueryBuilder paychannelList(String ... paychannel){
            this.paychannelList = solveNullList(paychannel);
            return this;
        }

        public QueryBuilder paychannelList(List<String> paychannel){
            this.paychannelList = paychannel;
            return this;
        }

        public QueryBuilder fetchPaychannel(){
            setFetchFields("fetchFields","paychannel");
            return this;
        }

        public QueryBuilder excludePaychannel(){
            setFetchFields("excludeFields","paychannel");
            return this;
        }

        public QueryBuilder fuzzyCollectcountid (List<String> fuzzyCollectcountid){
            this.fuzzyCollectcountid = fuzzyCollectcountid;
            return this;
        }

        public QueryBuilder fuzzyCollectcountid (String ... fuzzyCollectcountid){
            this.fuzzyCollectcountid = solveNullList(fuzzyCollectcountid);
            return this;
        }

        public QueryBuilder rightFuzzyCollectcountid (List<String> rightFuzzyCollectcountid){
            this.rightFuzzyCollectcountid = rightFuzzyCollectcountid;
            return this;
        }

        public QueryBuilder rightFuzzyCollectcountid (String ... rightFuzzyCollectcountid){
            this.rightFuzzyCollectcountid = solveNullList(rightFuzzyCollectcountid);
            return this;
        }

        public QueryBuilder collectcountid(String collectcountid){
            setCollectcountid(collectcountid);
            return this;
        }

        public QueryBuilder collectcountidList(String ... collectcountid){
            this.collectcountidList = solveNullList(collectcountid);
            return this;
        }

        public QueryBuilder collectcountidList(List<String> collectcountid){
            this.collectcountidList = collectcountid;
            return this;
        }

        public QueryBuilder fetchCollectcountid(){
            setFetchFields("fetchFields","collectcountid");
            return this;
        }

        public QueryBuilder excludeCollectcountid(){
            setFetchFields("excludeFields","collectcountid");
            return this;
        }

        public QueryBuilder fuzzyCollectcountname (List<String> fuzzyCollectcountname){
            this.fuzzyCollectcountname = fuzzyCollectcountname;
            return this;
        }

        public QueryBuilder fuzzyCollectcountname (String ... fuzzyCollectcountname){
            this.fuzzyCollectcountname = solveNullList(fuzzyCollectcountname);
            return this;
        }

        public QueryBuilder rightFuzzyCollectcountname (List<String> rightFuzzyCollectcountname){
            this.rightFuzzyCollectcountname = rightFuzzyCollectcountname;
            return this;
        }

        public QueryBuilder rightFuzzyCollectcountname (String ... rightFuzzyCollectcountname){
            this.rightFuzzyCollectcountname = solveNullList(rightFuzzyCollectcountname);
            return this;
        }

        public QueryBuilder collectcountname(String collectcountname){
            setCollectcountname(collectcountname);
            return this;
        }

        public QueryBuilder collectcountnameList(String ... collectcountname){
            this.collectcountnameList = solveNullList(collectcountname);
            return this;
        }

        public QueryBuilder collectcountnameList(List<String> collectcountname){
            this.collectcountnameList = collectcountname;
            return this;
        }

        public QueryBuilder fetchCollectcountname(){
            setFetchFields("fetchFields","collectcountname");
            return this;
        }

        public QueryBuilder excludeCollectcountname(){
            setFetchFields("excludeFields","collectcountname");
            return this;
        }

        public QueryBuilder fuzzyTransstatus (List<String> fuzzyTransstatus){
            this.fuzzyTransstatus = fuzzyTransstatus;
            return this;
        }

        public QueryBuilder fuzzyTransstatus (String ... fuzzyTransstatus){
            this.fuzzyTransstatus = solveNullList(fuzzyTransstatus);
            return this;
        }

        public QueryBuilder rightFuzzyTransstatus (List<String> rightFuzzyTransstatus){
            this.rightFuzzyTransstatus = rightFuzzyTransstatus;
            return this;
        }

        public QueryBuilder rightFuzzyTransstatus (String ... rightFuzzyTransstatus){
            this.rightFuzzyTransstatus = solveNullList(rightFuzzyTransstatus);
            return this;
        }

        public QueryBuilder transstatus(String transstatus){
            setTransstatus(transstatus);
            return this;
        }

        public QueryBuilder transstatusList(String ... transstatus){
            this.transstatusList = solveNullList(transstatus);
            return this;
        }

        public QueryBuilder transstatusList(List<String> transstatus){
            this.transstatusList = transstatus;
            return this;
        }

        public QueryBuilder fetchTransstatus(){
            setFetchFields("fetchFields","transstatus");
            return this;
        }

        public QueryBuilder excludeTransstatus(){
            setFetchFields("excludeFields","transstatus");
            return this;
        }

        public QueryBuilder fuzzyTransnum (List<String> fuzzyTransnum){
            this.fuzzyTransnum = fuzzyTransnum;
            return this;
        }

        public QueryBuilder fuzzyTransnum (String ... fuzzyTransnum){
            this.fuzzyTransnum = solveNullList(fuzzyTransnum);
            return this;
        }

        public QueryBuilder rightFuzzyTransnum (List<String> rightFuzzyTransnum){
            this.rightFuzzyTransnum = rightFuzzyTransnum;
            return this;
        }

        public QueryBuilder rightFuzzyTransnum (String ... rightFuzzyTransnum){
            this.rightFuzzyTransnum = solveNullList(rightFuzzyTransnum);
            return this;
        }

        public QueryBuilder transnum(String transnum){
            setTransnum(transnum);
            return this;
        }

        public QueryBuilder transnumList(String ... transnum){
            this.transnumList = solveNullList(transnum);
            return this;
        }

        public QueryBuilder transnumList(List<String> transnum){
            this.transnumList = transnum;
            return this;
        }

        public QueryBuilder fetchTransnum(){
            setFetchFields("fetchFields","transnum");
            return this;
        }

        public QueryBuilder excludeTransnum(){
            setFetchFields("excludeFields","transnum");
            return this;
        }

        public QueryBuilder fuzzyTransno (List<String> fuzzyTransno){
            this.fuzzyTransno = fuzzyTransno;
            return this;
        }

        public QueryBuilder fuzzyTransno (String ... fuzzyTransno){
            this.fuzzyTransno = solveNullList(fuzzyTransno);
            return this;
        }

        public QueryBuilder rightFuzzyTransno (List<String> rightFuzzyTransno){
            this.rightFuzzyTransno = rightFuzzyTransno;
            return this;
        }

        public QueryBuilder rightFuzzyTransno (String ... rightFuzzyTransno){
            this.rightFuzzyTransno = solveNullList(rightFuzzyTransno);
            return this;
        }

        public QueryBuilder transno(String transno){
            setTransno(transno);
            return this;
        }

        public QueryBuilder transnoList(String ... transno){
            this.transnoList = solveNullList(transno);
            return this;
        }

        public QueryBuilder transnoList(List<String> transno){
            this.transnoList = transno;
            return this;
        }

        public QueryBuilder fetchTransno(){
            setFetchFields("fetchFields","transno");
            return this;
        }

        public QueryBuilder excludeTransno(){
            setFetchFields("excludeFields","transno");
            return this;
        }

        public QueryBuilder fuzzyTranstimer (List<String> fuzzyTranstimer){
            this.fuzzyTranstimer = fuzzyTranstimer;
            return this;
        }

        public QueryBuilder fuzzyTranstimer (String ... fuzzyTranstimer){
            this.fuzzyTranstimer = solveNullList(fuzzyTranstimer);
            return this;
        }

        public QueryBuilder rightFuzzyTranstimer (List<String> rightFuzzyTranstimer){
            this.rightFuzzyTranstimer = rightFuzzyTranstimer;
            return this;
        }

        public QueryBuilder rightFuzzyTranstimer (String ... rightFuzzyTranstimer){
            this.rightFuzzyTranstimer = solveNullList(rightFuzzyTranstimer);
            return this;
        }

        public QueryBuilder transtimer(String transtimer){
            setTranstimer(transtimer);
            return this;
        }

        public QueryBuilder transtimerList(String ... transtimer){
            this.transtimerList = solveNullList(transtimer);
            return this;
        }

        public QueryBuilder transtimerList(List<String> transtimer){
            this.transtimerList = transtimer;
            return this;
        }

        public QueryBuilder fetchTranstimer(){
            setFetchFields("fetchFields","transtimer");
            return this;
        }

        public QueryBuilder excludeTranstimer(){
            setFetchFields("excludeFields","transtimer");
            return this;
        }

        public QueryBuilder fuzzyTranscomtimer (List<String> fuzzyTranscomtimer){
            this.fuzzyTranscomtimer = fuzzyTranscomtimer;
            return this;
        }

        public QueryBuilder fuzzyTranscomtimer (String ... fuzzyTranscomtimer){
            this.fuzzyTranscomtimer = solveNullList(fuzzyTranscomtimer);
            return this;
        }

        public QueryBuilder rightFuzzyTranscomtimer (List<String> rightFuzzyTranscomtimer){
            this.rightFuzzyTranscomtimer = rightFuzzyTranscomtimer;
            return this;
        }

        public QueryBuilder rightFuzzyTranscomtimer (String ... rightFuzzyTranscomtimer){
            this.rightFuzzyTranscomtimer = solveNullList(rightFuzzyTranscomtimer);
            return this;
        }

        public QueryBuilder transcomtimer(String transcomtimer){
            setTranscomtimer(transcomtimer);
            return this;
        }

        public QueryBuilder transcomtimerList(String ... transcomtimer){
            this.transcomtimerList = solveNullList(transcomtimer);
            return this;
        }

        public QueryBuilder transcomtimerList(List<String> transcomtimer){
            this.transcomtimerList = transcomtimer;
            return this;
        }

        public QueryBuilder fetchTranscomtimer(){
            setFetchFields("fetchFields","transcomtimer");
            return this;
        }

        public QueryBuilder excludeTranscomtimer(){
            setFetchFields("excludeFields","transcomtimer");
            return this;
        }

        public QueryBuilder fuzzyTransprofit (List<String> fuzzyTransprofit){
            this.fuzzyTransprofit = fuzzyTransprofit;
            return this;
        }

        public QueryBuilder fuzzyTransprofit (String ... fuzzyTransprofit){
            this.fuzzyTransprofit = solveNullList(fuzzyTransprofit);
            return this;
        }

        public QueryBuilder rightFuzzyTransprofit (List<String> rightFuzzyTransprofit){
            this.rightFuzzyTransprofit = rightFuzzyTransprofit;
            return this;
        }

        public QueryBuilder rightFuzzyTransprofit (String ... rightFuzzyTransprofit){
            this.rightFuzzyTransprofit = solveNullList(rightFuzzyTransprofit);
            return this;
        }

        public QueryBuilder transprofit(String transprofit){
            setTransprofit(transprofit);
            return this;
        }

        public QueryBuilder transprofitList(String ... transprofit){
            this.transprofitList = solveNullList(transprofit);
            return this;
        }

        public QueryBuilder transprofitList(List<String> transprofit){
            this.transprofitList = transprofit;
            return this;
        }

        public QueryBuilder fetchTransprofit(){
            setFetchFields("fetchFields","transprofit");
            return this;
        }

        public QueryBuilder excludeTransprofit(){
            setFetchFields("excludeFields","transprofit");
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

        public JpyTrans build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> trannoList;

        public List<String> getTrannoList(){return this.trannoList;}


        private List<String> fuzzyTranno;

        public List<String> getFuzzyTranno(){return this.fuzzyTranno;}

        private List<String> rightFuzzyTranno;

        public List<String> getRightFuzzyTranno(){return this.rightFuzzyTranno;}
        private List<String> bussinessidList;

        public List<String> getBussinessidList(){return this.bussinessidList;}


        private List<String> fuzzyBussinessid;

        public List<String> getFuzzyBussinessid(){return this.fuzzyBussinessid;}

        private List<String> rightFuzzyBussinessid;

        public List<String> getRightFuzzyBussinessid(){return this.rightFuzzyBussinessid;}
        private List<String> bussinessnameList;

        public List<String> getBussinessnameList(){return this.bussinessnameList;}


        private List<String> fuzzyBussinessname;

        public List<String> getFuzzyBussinessname(){return this.fuzzyBussinessname;}

        private List<String> rightFuzzyBussinessname;

        public List<String> getRightFuzzyBussinessname(){return this.rightFuzzyBussinessname;}
        private List<String> bussinessratioList;

        public List<String> getBussinessratioList(){return this.bussinessratioList;}


        private List<String> fuzzyBussinessratio;

        public List<String> getFuzzyBussinessratio(){return this.fuzzyBussinessratio;}

        private List<String> rightFuzzyBussinessratio;

        public List<String> getRightFuzzyBussinessratio(){return this.rightFuzzyBussinessratio;}
        private List<String> trannumList;

        public List<String> getTrannumList(){return this.trannumList;}


        private List<String> fuzzyTrannum;

        public List<String> getFuzzyTrannum(){return this.fuzzyTrannum;}

        private List<String> rightFuzzyTrannum;

        public List<String> getRightFuzzyTrannum(){return this.rightFuzzyTrannum;}
        private List<String> countratioList;

        public List<String> getCountratioList(){return this.countratioList;}


        private List<String> fuzzyCountratio;

        public List<String> getFuzzyCountratio(){return this.fuzzyCountratio;}

        private List<String> rightFuzzyCountratio;

        public List<String> getRightFuzzyCountratio(){return this.rightFuzzyCountratio;}
        private List<String> paychannelList;

        public List<String> getPaychannelList(){return this.paychannelList;}


        private List<String> fuzzyPaychannel;

        public List<String> getFuzzyPaychannel(){return this.fuzzyPaychannel;}

        private List<String> rightFuzzyPaychannel;

        public List<String> getRightFuzzyPaychannel(){return this.rightFuzzyPaychannel;}
        private List<String> collectcountidList;

        public List<String> getCollectcountidList(){return this.collectcountidList;}


        private List<String> fuzzyCollectcountid;

        public List<String> getFuzzyCollectcountid(){return this.fuzzyCollectcountid;}

        private List<String> rightFuzzyCollectcountid;

        public List<String> getRightFuzzyCollectcountid(){return this.rightFuzzyCollectcountid;}
        private List<String> collectcountnameList;

        public List<String> getCollectcountnameList(){return this.collectcountnameList;}


        private List<String> fuzzyCollectcountname;

        public List<String> getFuzzyCollectcountname(){return this.fuzzyCollectcountname;}

        private List<String> rightFuzzyCollectcountname;

        public List<String> getRightFuzzyCollectcountname(){return this.rightFuzzyCollectcountname;}
        private List<String> transstatusList;

        public List<String> getTransstatusList(){return this.transstatusList;}


        private List<String> fuzzyTransstatus;

        public List<String> getFuzzyTransstatus(){return this.fuzzyTransstatus;}

        private List<String> rightFuzzyTransstatus;

        public List<String> getRightFuzzyTransstatus(){return this.rightFuzzyTransstatus;}
        private List<String> transnumList;

        public List<String> getTransnumList(){return this.transnumList;}


        private List<String> fuzzyTransnum;

        public List<String> getFuzzyTransnum(){return this.fuzzyTransnum;}

        private List<String> rightFuzzyTransnum;

        public List<String> getRightFuzzyTransnum(){return this.rightFuzzyTransnum;}
        private List<String> transnoList;

        public List<String> getTransnoList(){return this.transnoList;}


        private List<String> fuzzyTransno;

        public List<String> getFuzzyTransno(){return this.fuzzyTransno;}

        private List<String> rightFuzzyTransno;

        public List<String> getRightFuzzyTransno(){return this.rightFuzzyTransno;}
        private List<String> transtimerList;

        public List<String> getTranstimerList(){return this.transtimerList;}


        private List<String> fuzzyTranstimer;

        public List<String> getFuzzyTranstimer(){return this.fuzzyTranstimer;}

        private List<String> rightFuzzyTranstimer;

        public List<String> getRightFuzzyTranstimer(){return this.rightFuzzyTranstimer;}
        private List<String> transcomtimerList;

        public List<String> getTranscomtimerList(){return this.transcomtimerList;}


        private List<String> fuzzyTranscomtimer;

        public List<String> getFuzzyTranscomtimer(){return this.fuzzyTranscomtimer;}

        private List<String> rightFuzzyTranscomtimer;

        public List<String> getRightFuzzyTranscomtimer(){return this.rightFuzzyTranscomtimer;}
        private List<String> transprofitList;

        public List<String> getTransprofitList(){return this.transprofitList;}


        private List<String> fuzzyTransprofit;

        public List<String> getFuzzyTransprofit(){return this.fuzzyTransprofit;}

        private List<String> rightFuzzyTransprofit;

        public List<String> getRightFuzzyTransprofit(){return this.rightFuzzyTransprofit;}

        public ConditionBuilder fuzzyTranno (List<String> fuzzyTranno){
            this.fuzzyTranno = fuzzyTranno;
            return this;
        }

        public ConditionBuilder fuzzyTranno (String ... fuzzyTranno){
            this.fuzzyTranno = solveNullList(fuzzyTranno);
            return this;
        }

        public ConditionBuilder rightFuzzyTranno (List<String> rightFuzzyTranno){
            this.rightFuzzyTranno = rightFuzzyTranno;
            return this;
        }

        public ConditionBuilder rightFuzzyTranno (String ... rightFuzzyTranno){
            this.rightFuzzyTranno = solveNullList(rightFuzzyTranno);
            return this;
        }

        public ConditionBuilder trannoList(String ... tranno){
            this.trannoList = solveNullList(tranno);
            return this;
        }

        public ConditionBuilder trannoList(List<String> tranno){
            this.trannoList = tranno;
            return this;
        }

        public ConditionBuilder fuzzyBussinessid (List<String> fuzzyBussinessid){
            this.fuzzyBussinessid = fuzzyBussinessid;
            return this;
        }

        public ConditionBuilder fuzzyBussinessid (String ... fuzzyBussinessid){
            this.fuzzyBussinessid = solveNullList(fuzzyBussinessid);
            return this;
        }

        public ConditionBuilder rightFuzzyBussinessid (List<String> rightFuzzyBussinessid){
            this.rightFuzzyBussinessid = rightFuzzyBussinessid;
            return this;
        }

        public ConditionBuilder rightFuzzyBussinessid (String ... rightFuzzyBussinessid){
            this.rightFuzzyBussinessid = solveNullList(rightFuzzyBussinessid);
            return this;
        }

        public ConditionBuilder bussinessidList(String ... bussinessid){
            this.bussinessidList = solveNullList(bussinessid);
            return this;
        }

        public ConditionBuilder bussinessidList(List<String> bussinessid){
            this.bussinessidList = bussinessid;
            return this;
        }

        public ConditionBuilder fuzzyBussinessname (List<String> fuzzyBussinessname){
            this.fuzzyBussinessname = fuzzyBussinessname;
            return this;
        }

        public ConditionBuilder fuzzyBussinessname (String ... fuzzyBussinessname){
            this.fuzzyBussinessname = solveNullList(fuzzyBussinessname);
            return this;
        }

        public ConditionBuilder rightFuzzyBussinessname (List<String> rightFuzzyBussinessname){
            this.rightFuzzyBussinessname = rightFuzzyBussinessname;
            return this;
        }

        public ConditionBuilder rightFuzzyBussinessname (String ... rightFuzzyBussinessname){
            this.rightFuzzyBussinessname = solveNullList(rightFuzzyBussinessname);
            return this;
        }

        public ConditionBuilder bussinessnameList(String ... bussinessname){
            this.bussinessnameList = solveNullList(bussinessname);
            return this;
        }

        public ConditionBuilder bussinessnameList(List<String> bussinessname){
            this.bussinessnameList = bussinessname;
            return this;
        }

        public ConditionBuilder fuzzyBussinessratio (List<String> fuzzyBussinessratio){
            this.fuzzyBussinessratio = fuzzyBussinessratio;
            return this;
        }

        public ConditionBuilder fuzzyBussinessratio (String ... fuzzyBussinessratio){
            this.fuzzyBussinessratio = solveNullList(fuzzyBussinessratio);
            return this;
        }

        public ConditionBuilder rightFuzzyBussinessratio (List<String> rightFuzzyBussinessratio){
            this.rightFuzzyBussinessratio = rightFuzzyBussinessratio;
            return this;
        }

        public ConditionBuilder rightFuzzyBussinessratio (String ... rightFuzzyBussinessratio){
            this.rightFuzzyBussinessratio = solveNullList(rightFuzzyBussinessratio);
            return this;
        }

        public ConditionBuilder bussinessratioList(String ... bussinessratio){
            this.bussinessratioList = solveNullList(bussinessratio);
            return this;
        }

        public ConditionBuilder bussinessratioList(List<String> bussinessratio){
            this.bussinessratioList = bussinessratio;
            return this;
        }

        public ConditionBuilder fuzzyTrannum (List<String> fuzzyTrannum){
            this.fuzzyTrannum = fuzzyTrannum;
            return this;
        }

        public ConditionBuilder fuzzyTrannum (String ... fuzzyTrannum){
            this.fuzzyTrannum = solveNullList(fuzzyTrannum);
            return this;
        }

        public ConditionBuilder rightFuzzyTrannum (List<String> rightFuzzyTrannum){
            this.rightFuzzyTrannum = rightFuzzyTrannum;
            return this;
        }

        public ConditionBuilder rightFuzzyTrannum (String ... rightFuzzyTrannum){
            this.rightFuzzyTrannum = solveNullList(rightFuzzyTrannum);
            return this;
        }

        public ConditionBuilder trannumList(String ... trannum){
            this.trannumList = solveNullList(trannum);
            return this;
        }

        public ConditionBuilder trannumList(List<String> trannum){
            this.trannumList = trannum;
            return this;
        }

        public ConditionBuilder fuzzyCountratio (List<String> fuzzyCountratio){
            this.fuzzyCountratio = fuzzyCountratio;
            return this;
        }

        public ConditionBuilder fuzzyCountratio (String ... fuzzyCountratio){
            this.fuzzyCountratio = solveNullList(fuzzyCountratio);
            return this;
        }

        public ConditionBuilder rightFuzzyCountratio (List<String> rightFuzzyCountratio){
            this.rightFuzzyCountratio = rightFuzzyCountratio;
            return this;
        }

        public ConditionBuilder rightFuzzyCountratio (String ... rightFuzzyCountratio){
            this.rightFuzzyCountratio = solveNullList(rightFuzzyCountratio);
            return this;
        }

        public ConditionBuilder countratioList(String ... countratio){
            this.countratioList = solveNullList(countratio);
            return this;
        }

        public ConditionBuilder countratioList(List<String> countratio){
            this.countratioList = countratio;
            return this;
        }

        public ConditionBuilder fuzzyPaychannel (List<String> fuzzyPaychannel){
            this.fuzzyPaychannel = fuzzyPaychannel;
            return this;
        }

        public ConditionBuilder fuzzyPaychannel (String ... fuzzyPaychannel){
            this.fuzzyPaychannel = solveNullList(fuzzyPaychannel);
            return this;
        }

        public ConditionBuilder rightFuzzyPaychannel (List<String> rightFuzzyPaychannel){
            this.rightFuzzyPaychannel = rightFuzzyPaychannel;
            return this;
        }

        public ConditionBuilder rightFuzzyPaychannel (String ... rightFuzzyPaychannel){
            this.rightFuzzyPaychannel = solveNullList(rightFuzzyPaychannel);
            return this;
        }

        public ConditionBuilder paychannelList(String ... paychannel){
            this.paychannelList = solveNullList(paychannel);
            return this;
        }

        public ConditionBuilder paychannelList(List<String> paychannel){
            this.paychannelList = paychannel;
            return this;
        }

        public ConditionBuilder fuzzyCollectcountid (List<String> fuzzyCollectcountid){
            this.fuzzyCollectcountid = fuzzyCollectcountid;
            return this;
        }

        public ConditionBuilder fuzzyCollectcountid (String ... fuzzyCollectcountid){
            this.fuzzyCollectcountid = solveNullList(fuzzyCollectcountid);
            return this;
        }

        public ConditionBuilder rightFuzzyCollectcountid (List<String> rightFuzzyCollectcountid){
            this.rightFuzzyCollectcountid = rightFuzzyCollectcountid;
            return this;
        }

        public ConditionBuilder rightFuzzyCollectcountid (String ... rightFuzzyCollectcountid){
            this.rightFuzzyCollectcountid = solveNullList(rightFuzzyCollectcountid);
            return this;
        }

        public ConditionBuilder collectcountidList(String ... collectcountid){
            this.collectcountidList = solveNullList(collectcountid);
            return this;
        }

        public ConditionBuilder collectcountidList(List<String> collectcountid){
            this.collectcountidList = collectcountid;
            return this;
        }

        public ConditionBuilder fuzzyCollectcountname (List<String> fuzzyCollectcountname){
            this.fuzzyCollectcountname = fuzzyCollectcountname;
            return this;
        }

        public ConditionBuilder fuzzyCollectcountname (String ... fuzzyCollectcountname){
            this.fuzzyCollectcountname = solveNullList(fuzzyCollectcountname);
            return this;
        }

        public ConditionBuilder rightFuzzyCollectcountname (List<String> rightFuzzyCollectcountname){
            this.rightFuzzyCollectcountname = rightFuzzyCollectcountname;
            return this;
        }

        public ConditionBuilder rightFuzzyCollectcountname (String ... rightFuzzyCollectcountname){
            this.rightFuzzyCollectcountname = solveNullList(rightFuzzyCollectcountname);
            return this;
        }

        public ConditionBuilder collectcountnameList(String ... collectcountname){
            this.collectcountnameList = solveNullList(collectcountname);
            return this;
        }

        public ConditionBuilder collectcountnameList(List<String> collectcountname){
            this.collectcountnameList = collectcountname;
            return this;
        }

        public ConditionBuilder fuzzyTransstatus (List<String> fuzzyTransstatus){
            this.fuzzyTransstatus = fuzzyTransstatus;
            return this;
        }

        public ConditionBuilder fuzzyTransstatus (String ... fuzzyTransstatus){
            this.fuzzyTransstatus = solveNullList(fuzzyTransstatus);
            return this;
        }

        public ConditionBuilder rightFuzzyTransstatus (List<String> rightFuzzyTransstatus){
            this.rightFuzzyTransstatus = rightFuzzyTransstatus;
            return this;
        }

        public ConditionBuilder rightFuzzyTransstatus (String ... rightFuzzyTransstatus){
            this.rightFuzzyTransstatus = solveNullList(rightFuzzyTransstatus);
            return this;
        }

        public ConditionBuilder transstatusList(String ... transstatus){
            this.transstatusList = solveNullList(transstatus);
            return this;
        }

        public ConditionBuilder transstatusList(List<String> transstatus){
            this.transstatusList = transstatus;
            return this;
        }

        public ConditionBuilder fuzzyTransnum (List<String> fuzzyTransnum){
            this.fuzzyTransnum = fuzzyTransnum;
            return this;
        }

        public ConditionBuilder fuzzyTransnum (String ... fuzzyTransnum){
            this.fuzzyTransnum = solveNullList(fuzzyTransnum);
            return this;
        }

        public ConditionBuilder rightFuzzyTransnum (List<String> rightFuzzyTransnum){
            this.rightFuzzyTransnum = rightFuzzyTransnum;
            return this;
        }

        public ConditionBuilder rightFuzzyTransnum (String ... rightFuzzyTransnum){
            this.rightFuzzyTransnum = solveNullList(rightFuzzyTransnum);
            return this;
        }

        public ConditionBuilder transnumList(String ... transnum){
            this.transnumList = solveNullList(transnum);
            return this;
        }

        public ConditionBuilder transnumList(List<String> transnum){
            this.transnumList = transnum;
            return this;
        }

        public ConditionBuilder fuzzyTransno (List<String> fuzzyTransno){
            this.fuzzyTransno = fuzzyTransno;
            return this;
        }

        public ConditionBuilder fuzzyTransno (String ... fuzzyTransno){
            this.fuzzyTransno = solveNullList(fuzzyTransno);
            return this;
        }

        public ConditionBuilder rightFuzzyTransno (List<String> rightFuzzyTransno){
            this.rightFuzzyTransno = rightFuzzyTransno;
            return this;
        }

        public ConditionBuilder rightFuzzyTransno (String ... rightFuzzyTransno){
            this.rightFuzzyTransno = solveNullList(rightFuzzyTransno);
            return this;
        }

        public ConditionBuilder transnoList(String ... transno){
            this.transnoList = solveNullList(transno);
            return this;
        }

        public ConditionBuilder transnoList(List<String> transno){
            this.transnoList = transno;
            return this;
        }

        public ConditionBuilder fuzzyTranstimer (List<String> fuzzyTranstimer){
            this.fuzzyTranstimer = fuzzyTranstimer;
            return this;
        }

        public ConditionBuilder fuzzyTranstimer (String ... fuzzyTranstimer){
            this.fuzzyTranstimer = solveNullList(fuzzyTranstimer);
            return this;
        }

        public ConditionBuilder rightFuzzyTranstimer (List<String> rightFuzzyTranstimer){
            this.rightFuzzyTranstimer = rightFuzzyTranstimer;
            return this;
        }

        public ConditionBuilder rightFuzzyTranstimer (String ... rightFuzzyTranstimer){
            this.rightFuzzyTranstimer = solveNullList(rightFuzzyTranstimer);
            return this;
        }

        public ConditionBuilder transtimerList(String ... transtimer){
            this.transtimerList = solveNullList(transtimer);
            return this;
        }

        public ConditionBuilder transtimerList(List<String> transtimer){
            this.transtimerList = transtimer;
            return this;
        }

        public ConditionBuilder fuzzyTranscomtimer (List<String> fuzzyTranscomtimer){
            this.fuzzyTranscomtimer = fuzzyTranscomtimer;
            return this;
        }

        public ConditionBuilder fuzzyTranscomtimer (String ... fuzzyTranscomtimer){
            this.fuzzyTranscomtimer = solveNullList(fuzzyTranscomtimer);
            return this;
        }

        public ConditionBuilder rightFuzzyTranscomtimer (List<String> rightFuzzyTranscomtimer){
            this.rightFuzzyTranscomtimer = rightFuzzyTranscomtimer;
            return this;
        }

        public ConditionBuilder rightFuzzyTranscomtimer (String ... rightFuzzyTranscomtimer){
            this.rightFuzzyTranscomtimer = solveNullList(rightFuzzyTranscomtimer);
            return this;
        }

        public ConditionBuilder transcomtimerList(String ... transcomtimer){
            this.transcomtimerList = solveNullList(transcomtimer);
            return this;
        }

        public ConditionBuilder transcomtimerList(List<String> transcomtimer){
            this.transcomtimerList = transcomtimer;
            return this;
        }

        public ConditionBuilder fuzzyTransprofit (List<String> fuzzyTransprofit){
            this.fuzzyTransprofit = fuzzyTransprofit;
            return this;
        }

        public ConditionBuilder fuzzyTransprofit (String ... fuzzyTransprofit){
            this.fuzzyTransprofit = solveNullList(fuzzyTransprofit);
            return this;
        }

        public ConditionBuilder rightFuzzyTransprofit (List<String> rightFuzzyTransprofit){
            this.rightFuzzyTransprofit = rightFuzzyTransprofit;
            return this;
        }

        public ConditionBuilder rightFuzzyTransprofit (String ... rightFuzzyTransprofit){
            this.rightFuzzyTransprofit = solveNullList(rightFuzzyTransprofit);
            return this;
        }

        public ConditionBuilder transprofitList(String ... transprofit){
            this.transprofitList = solveNullList(transprofit);
            return this;
        }

        public ConditionBuilder transprofitList(List<String> transprofit){
            this.transprofitList = transprofit;
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

        private JpyTrans obj;

        public Builder(){
            this.obj = new JpyTrans();
        }

        public Builder tranno(String tranno){
            this.obj.setTranno(tranno);
            return this;
        }
        public Builder bussinessid(String bussinessid){
            this.obj.setBussinessid(bussinessid);
            return this;
        }
        public Builder bussinessname(String bussinessname){
            this.obj.setBussinessname(bussinessname);
            return this;
        }
        public Builder bussinessratio(String bussinessratio){
            this.obj.setBussinessratio(bussinessratio);
            return this;
        }
        public Builder trannum(String trannum){
            this.obj.setTrannum(trannum);
            return this;
        }
        public Builder countratio(String countratio){
            this.obj.setCountratio(countratio);
            return this;
        }
        public Builder paychannel(String paychannel){
            this.obj.setPaychannel(paychannel);
            return this;
        }
        public Builder collectcountid(String collectcountid){
            this.obj.setCollectcountid(collectcountid);
            return this;
        }
        public Builder collectcountname(String collectcountname){
            this.obj.setCollectcountname(collectcountname);
            return this;
        }
        public Builder transstatus(String transstatus){
            this.obj.setTransstatus(transstatus);
            return this;
        }
        public Builder transnum(String transnum){
            this.obj.setTransnum(transnum);
            return this;
        }
        public Builder transno(String transno){
            this.obj.setTransno(transno);
            return this;
        }
        public Builder transtimer(String transtimer){
            this.obj.setTranstimer(transtimer);
            return this;
        }
        public Builder transcomtimer(String transcomtimer){
            this.obj.setTranscomtimer(transcomtimer);
            return this;
        }
        public Builder transprofit(String transprofit){
            this.obj.setTransprofit(transprofit);
            return this;
        }
        public JpyTrans build(){return obj;}
    }

}
