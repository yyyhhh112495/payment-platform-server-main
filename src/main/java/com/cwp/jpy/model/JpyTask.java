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
public class JpyTask implements Serializable {

    private static final long serialVersionUID = 1640076785077L;


    /**
    * 
    * isNullAble:1
    */
    private String bussinessid;

    /**
    * 
    * isNullAble:1
    */
    private String returl;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String tradeNo;

    /**
    * 
    * isNullAble:1
    */
    private String proname;

    /**
    * 
    * isNullAble:1
    */
    private String prono;

    /**
    * 
    * isNullAble:1
    */
    private String tradenum;

    /**
    * 
    * isNullAble:1
    */
    private String tradegentime;

    /**
    * 
    * isNullAble:1
    */
    private String payrettime;

    /**
    * 01-请求支付 02-支付完成
    * isNullAble:1
    */
    private String payres;

    /**
    * 
    * isNullAble:1
    */
    private String transstatus;

    /**
    * 
    * isNullAble:1
    */
    private String trantime;

    /**
    * 
    * isNullAble:1
    */
    private String transno;

    /**
    * 
    * isNullAble:1
    */
    private String busration;


    public void setBussinessid(String bussinessid){this.bussinessid = bussinessid;}

    public String getBussinessid(){return this.bussinessid;}

    public void setReturl(String returl){this.returl = returl;}

    public String getReturl(){return this.returl;}

    public void setTradeNo(String tradeNo){this.tradeNo = tradeNo;}

    public String getTradeNo(){return this.tradeNo;}

    public void setProname(String proname){this.proname = proname;}

    public String getProname(){return this.proname;}

    public void setProno(String prono){this.prono = prono;}

    public String getProno(){return this.prono;}

    public void setTradenum(String tradenum){this.tradenum = tradenum;}

    public String getTradenum(){return this.tradenum;}

    public void setTradegentime(String tradegentime){this.tradegentime = tradegentime;}

    public String getTradegentime(){return this.tradegentime;}

    public void setPayrettime(String payrettime){this.payrettime = payrettime;}

    public String getPayrettime(){return this.payrettime;}

    public void setPayres(String payres){this.payres = payres;}

    public String getPayres(){return this.payres;}

    public void setTransstatus(String transstatus){this.transstatus = transstatus;}

    public String getTransstatus(){return this.transstatus;}

    public void setTrantime(String trantime){this.trantime = trantime;}

    public String getTrantime(){return this.trantime;}

    public void setTransno(String transno){this.transno = transno;}

    public String getTransno(){return this.transno;}

    public void setBusration(String busration){this.busration = busration;}

    public String getBusration(){return this.busration;}
    @Override
    public String toString() {
        return "JpyTask{" +
                "bussinessid='" + bussinessid + '\'' +
                "returl='" + returl + '\'' +
                "tradeNo='" + tradeNo + '\'' +
                "proname='" + proname + '\'' +
                "prono='" + prono + '\'' +
                "tradenum='" + tradenum + '\'' +
                "tradegentime='" + tradegentime + '\'' +
                "payrettime='" + payrettime + '\'' +
                "payres='" + payres + '\'' +
                "transstatus='" + transstatus + '\'' +
                "trantime='" + trantime + '\'' +
                "transno='" + transno + '\'' +
                "busration='" + busration + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyTask set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyTask set){
            this.set = set;
            return this;
        }

        public JpyTask getSet(){
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

    public static class QueryBuilder extends JpyTask{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> bussinessidList;

        public List<String> getBussinessidList(){return this.bussinessidList;}


        private List<String> fuzzyBussinessid;

        public List<String> getFuzzyBussinessid(){return this.fuzzyBussinessid;}

        private List<String> rightFuzzyBussinessid;

        public List<String> getRightFuzzyBussinessid(){return this.rightFuzzyBussinessid;}
        private List<String> returlList;

        public List<String> getReturlList(){return this.returlList;}


        private List<String> fuzzyReturl;

        public List<String> getFuzzyReturl(){return this.fuzzyReturl;}

        private List<String> rightFuzzyReturl;

        public List<String> getRightFuzzyReturl(){return this.rightFuzzyReturl;}
        private List<String> tradeNoList;

        public List<String> getTradeNoList(){return this.tradeNoList;}


        private List<String> fuzzyTradeNo;

        public List<String> getFuzzyTradeNo(){return this.fuzzyTradeNo;}

        private List<String> rightFuzzyTradeNo;

        public List<String> getRightFuzzyTradeNo(){return this.rightFuzzyTradeNo;}
        private List<String> pronameList;

        public List<String> getPronameList(){return this.pronameList;}


        private List<String> fuzzyProname;

        public List<String> getFuzzyProname(){return this.fuzzyProname;}

        private List<String> rightFuzzyProname;

        public List<String> getRightFuzzyProname(){return this.rightFuzzyProname;}
        private List<String> pronoList;

        public List<String> getPronoList(){return this.pronoList;}


        private List<String> fuzzyProno;

        public List<String> getFuzzyProno(){return this.fuzzyProno;}

        private List<String> rightFuzzyProno;

        public List<String> getRightFuzzyProno(){return this.rightFuzzyProno;}
        private List<String> tradenumList;

        public List<String> getTradenumList(){return this.tradenumList;}


        private List<String> fuzzyTradenum;

        public List<String> getFuzzyTradenum(){return this.fuzzyTradenum;}

        private List<String> rightFuzzyTradenum;

        public List<String> getRightFuzzyTradenum(){return this.rightFuzzyTradenum;}
        private List<String> tradegentimeList;

        public List<String> getTradegentimeList(){return this.tradegentimeList;}


        private List<String> fuzzyTradegentime;

        public List<String> getFuzzyTradegentime(){return this.fuzzyTradegentime;}

        private List<String> rightFuzzyTradegentime;

        public List<String> getRightFuzzyTradegentime(){return this.rightFuzzyTradegentime;}
        private List<String> payrettimeList;

        public List<String> getPayrettimeList(){return this.payrettimeList;}


        private List<String> fuzzyPayrettime;

        public List<String> getFuzzyPayrettime(){return this.fuzzyPayrettime;}

        private List<String> rightFuzzyPayrettime;

        public List<String> getRightFuzzyPayrettime(){return this.rightFuzzyPayrettime;}
        private List<String> payresList;

        public List<String> getPayresList(){return this.payresList;}


        private List<String> fuzzyPayres;

        public List<String> getFuzzyPayres(){return this.fuzzyPayres;}

        private List<String> rightFuzzyPayres;

        public List<String> getRightFuzzyPayres(){return this.rightFuzzyPayres;}
        private List<String> transstatusList;

        public List<String> getTransstatusList(){return this.transstatusList;}


        private List<String> fuzzyTransstatus;

        public List<String> getFuzzyTransstatus(){return this.fuzzyTransstatus;}

        private List<String> rightFuzzyTransstatus;

        public List<String> getRightFuzzyTransstatus(){return this.rightFuzzyTransstatus;}
        private List<String> trantimeList;

        public List<String> getTrantimeList(){return this.trantimeList;}


        private List<String> fuzzyTrantime;

        public List<String> getFuzzyTrantime(){return this.fuzzyTrantime;}

        private List<String> rightFuzzyTrantime;

        public List<String> getRightFuzzyTrantime(){return this.rightFuzzyTrantime;}
        private List<String> transnoList;

        public List<String> getTransnoList(){return this.transnoList;}


        private List<String> fuzzyTransno;

        public List<String> getFuzzyTransno(){return this.fuzzyTransno;}

        private List<String> rightFuzzyTransno;

        public List<String> getRightFuzzyTransno(){return this.rightFuzzyTransno;}
        private List<String> busrationList;

        public List<String> getBusrationList(){return this.busrationList;}


        private List<String> fuzzyBusration;

        public List<String> getFuzzyBusration(){return this.fuzzyBusration;}

        private List<String> rightFuzzyBusration;

        public List<String> getRightFuzzyBusration(){return this.rightFuzzyBusration;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyReturl (List<String> fuzzyReturl){
            this.fuzzyReturl = fuzzyReturl;
            return this;
        }

        public QueryBuilder fuzzyReturl (String ... fuzzyReturl){
            this.fuzzyReturl = solveNullList(fuzzyReturl);
            return this;
        }

        public QueryBuilder rightFuzzyReturl (List<String> rightFuzzyReturl){
            this.rightFuzzyReturl = rightFuzzyReturl;
            return this;
        }

        public QueryBuilder rightFuzzyReturl (String ... rightFuzzyReturl){
            this.rightFuzzyReturl = solveNullList(rightFuzzyReturl);
            return this;
        }

        public QueryBuilder returl(String returl){
            setReturl(returl);
            return this;
        }

        public QueryBuilder returlList(String ... returl){
            this.returlList = solveNullList(returl);
            return this;
        }

        public QueryBuilder returlList(List<String> returl){
            this.returlList = returl;
            return this;
        }

        public QueryBuilder fetchReturl(){
            setFetchFields("fetchFields","returl");
            return this;
        }

        public QueryBuilder excludeReturl(){
            setFetchFields("excludeFields","returl");
            return this;
        }

        public QueryBuilder fuzzyTradeNo (List<String> fuzzyTradeNo){
            this.fuzzyTradeNo = fuzzyTradeNo;
            return this;
        }

        public QueryBuilder fuzzyTradeNo (String ... fuzzyTradeNo){
            this.fuzzyTradeNo = solveNullList(fuzzyTradeNo);
            return this;
        }

        public QueryBuilder rightFuzzyTradeNo (List<String> rightFuzzyTradeNo){
            this.rightFuzzyTradeNo = rightFuzzyTradeNo;
            return this;
        }

        public QueryBuilder rightFuzzyTradeNo (String ... rightFuzzyTradeNo){
            this.rightFuzzyTradeNo = solveNullList(rightFuzzyTradeNo);
            return this;
        }

        public QueryBuilder tradeNo(String tradeNo){
            setTradeNo(tradeNo);
            return this;
        }

        public QueryBuilder tradeNoList(String ... tradeNo){
            this.tradeNoList = solveNullList(tradeNo);
            return this;
        }

        public QueryBuilder tradeNoList(List<String> tradeNo){
            this.tradeNoList = tradeNo;
            return this;
        }

        public QueryBuilder fetchTradeNo(){
            setFetchFields("fetchFields","tradeNo");
            return this;
        }

        public QueryBuilder excludeTradeNo(){
            setFetchFields("excludeFields","tradeNo");
            return this;
        }

        public QueryBuilder fuzzyProname (List<String> fuzzyProname){
            this.fuzzyProname = fuzzyProname;
            return this;
        }

        public QueryBuilder fuzzyProname (String ... fuzzyProname){
            this.fuzzyProname = solveNullList(fuzzyProname);
            return this;
        }

        public QueryBuilder rightFuzzyProname (List<String> rightFuzzyProname){
            this.rightFuzzyProname = rightFuzzyProname;
            return this;
        }

        public QueryBuilder rightFuzzyProname (String ... rightFuzzyProname){
            this.rightFuzzyProname = solveNullList(rightFuzzyProname);
            return this;
        }

        public QueryBuilder proname(String proname){
            setProname(proname);
            return this;
        }

        public QueryBuilder pronameList(String ... proname){
            this.pronameList = solveNullList(proname);
            return this;
        }

        public QueryBuilder pronameList(List<String> proname){
            this.pronameList = proname;
            return this;
        }

        public QueryBuilder fetchProname(){
            setFetchFields("fetchFields","proname");
            return this;
        }

        public QueryBuilder excludeProname(){
            setFetchFields("excludeFields","proname");
            return this;
        }

        public QueryBuilder fuzzyProno (List<String> fuzzyProno){
            this.fuzzyProno = fuzzyProno;
            return this;
        }

        public QueryBuilder fuzzyProno (String ... fuzzyProno){
            this.fuzzyProno = solveNullList(fuzzyProno);
            return this;
        }

        public QueryBuilder rightFuzzyProno (List<String> rightFuzzyProno){
            this.rightFuzzyProno = rightFuzzyProno;
            return this;
        }

        public QueryBuilder rightFuzzyProno (String ... rightFuzzyProno){
            this.rightFuzzyProno = solveNullList(rightFuzzyProno);
            return this;
        }

        public QueryBuilder prono(String prono){
            setProno(prono);
            return this;
        }

        public QueryBuilder pronoList(String ... prono){
            this.pronoList = solveNullList(prono);
            return this;
        }

        public QueryBuilder pronoList(List<String> prono){
            this.pronoList = prono;
            return this;
        }

        public QueryBuilder fetchProno(){
            setFetchFields("fetchFields","prono");
            return this;
        }

        public QueryBuilder excludeProno(){
            setFetchFields("excludeFields","prono");
            return this;
        }

        public QueryBuilder fuzzyTradenum (List<String> fuzzyTradenum){
            this.fuzzyTradenum = fuzzyTradenum;
            return this;
        }

        public QueryBuilder fuzzyTradenum (String ... fuzzyTradenum){
            this.fuzzyTradenum = solveNullList(fuzzyTradenum);
            return this;
        }

        public QueryBuilder rightFuzzyTradenum (List<String> rightFuzzyTradenum){
            this.rightFuzzyTradenum = rightFuzzyTradenum;
            return this;
        }

        public QueryBuilder rightFuzzyTradenum (String ... rightFuzzyTradenum){
            this.rightFuzzyTradenum = solveNullList(rightFuzzyTradenum);
            return this;
        }

        public QueryBuilder tradenum(String tradenum){
            setTradenum(tradenum);
            return this;
        }

        public QueryBuilder tradenumList(String ... tradenum){
            this.tradenumList = solveNullList(tradenum);
            return this;
        }

        public QueryBuilder tradenumList(List<String> tradenum){
            this.tradenumList = tradenum;
            return this;
        }

        public QueryBuilder fetchTradenum(){
            setFetchFields("fetchFields","tradenum");
            return this;
        }

        public QueryBuilder excludeTradenum(){
            setFetchFields("excludeFields","tradenum");
            return this;
        }

        public QueryBuilder fuzzyTradegentime (List<String> fuzzyTradegentime){
            this.fuzzyTradegentime = fuzzyTradegentime;
            return this;
        }

        public QueryBuilder fuzzyTradegentime (String ... fuzzyTradegentime){
            this.fuzzyTradegentime = solveNullList(fuzzyTradegentime);
            return this;
        }

        public QueryBuilder rightFuzzyTradegentime (List<String> rightFuzzyTradegentime){
            this.rightFuzzyTradegentime = rightFuzzyTradegentime;
            return this;
        }

        public QueryBuilder rightFuzzyTradegentime (String ... rightFuzzyTradegentime){
            this.rightFuzzyTradegentime = solveNullList(rightFuzzyTradegentime);
            return this;
        }

        public QueryBuilder tradegentime(String tradegentime){
            setTradegentime(tradegentime);
            return this;
        }

        public QueryBuilder tradegentimeList(String ... tradegentime){
            this.tradegentimeList = solveNullList(tradegentime);
            return this;
        }

        public QueryBuilder tradegentimeList(List<String> tradegentime){
            this.tradegentimeList = tradegentime;
            return this;
        }

        public QueryBuilder fetchTradegentime(){
            setFetchFields("fetchFields","tradegentime");
            return this;
        }

        public QueryBuilder excludeTradegentime(){
            setFetchFields("excludeFields","tradegentime");
            return this;
        }

        public QueryBuilder fuzzyPayrettime (List<String> fuzzyPayrettime){
            this.fuzzyPayrettime = fuzzyPayrettime;
            return this;
        }

        public QueryBuilder fuzzyPayrettime (String ... fuzzyPayrettime){
            this.fuzzyPayrettime = solveNullList(fuzzyPayrettime);
            return this;
        }

        public QueryBuilder rightFuzzyPayrettime (List<String> rightFuzzyPayrettime){
            this.rightFuzzyPayrettime = rightFuzzyPayrettime;
            return this;
        }

        public QueryBuilder rightFuzzyPayrettime (String ... rightFuzzyPayrettime){
            this.rightFuzzyPayrettime = solveNullList(rightFuzzyPayrettime);
            return this;
        }

        public QueryBuilder payrettime(String payrettime){
            setPayrettime(payrettime);
            return this;
        }

        public QueryBuilder payrettimeList(String ... payrettime){
            this.payrettimeList = solveNullList(payrettime);
            return this;
        }

        public QueryBuilder payrettimeList(List<String> payrettime){
            this.payrettimeList = payrettime;
            return this;
        }

        public QueryBuilder fetchPayrettime(){
            setFetchFields("fetchFields","payrettime");
            return this;
        }

        public QueryBuilder excludePayrettime(){
            setFetchFields("excludeFields","payrettime");
            return this;
        }

        public QueryBuilder fuzzyPayres (List<String> fuzzyPayres){
            this.fuzzyPayres = fuzzyPayres;
            return this;
        }

        public QueryBuilder fuzzyPayres (String ... fuzzyPayres){
            this.fuzzyPayres = solveNullList(fuzzyPayres);
            return this;
        }

        public QueryBuilder rightFuzzyPayres (List<String> rightFuzzyPayres){
            this.rightFuzzyPayres = rightFuzzyPayres;
            return this;
        }

        public QueryBuilder rightFuzzyPayres (String ... rightFuzzyPayres){
            this.rightFuzzyPayres = solveNullList(rightFuzzyPayres);
            return this;
        }

        public QueryBuilder payres(String payres){
            setPayres(payres);
            return this;
        }

        public QueryBuilder payresList(String ... payres){
            this.payresList = solveNullList(payres);
            return this;
        }

        public QueryBuilder payresList(List<String> payres){
            this.payresList = payres;
            return this;
        }

        public QueryBuilder fetchPayres(){
            setFetchFields("fetchFields","payres");
            return this;
        }

        public QueryBuilder excludePayres(){
            setFetchFields("excludeFields","payres");
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

        public QueryBuilder fuzzyTrantime (List<String> fuzzyTrantime){
            this.fuzzyTrantime = fuzzyTrantime;
            return this;
        }

        public QueryBuilder fuzzyTrantime (String ... fuzzyTrantime){
            this.fuzzyTrantime = solveNullList(fuzzyTrantime);
            return this;
        }

        public QueryBuilder rightFuzzyTrantime (List<String> rightFuzzyTrantime){
            this.rightFuzzyTrantime = rightFuzzyTrantime;
            return this;
        }

        public QueryBuilder rightFuzzyTrantime (String ... rightFuzzyTrantime){
            this.rightFuzzyTrantime = solveNullList(rightFuzzyTrantime);
            return this;
        }

        public QueryBuilder trantime(String trantime){
            setTrantime(trantime);
            return this;
        }

        public QueryBuilder trantimeList(String ... trantime){
            this.trantimeList = solveNullList(trantime);
            return this;
        }

        public QueryBuilder trantimeList(List<String> trantime){
            this.trantimeList = trantime;
            return this;
        }

        public QueryBuilder fetchTrantime(){
            setFetchFields("fetchFields","trantime");
            return this;
        }

        public QueryBuilder excludeTrantime(){
            setFetchFields("excludeFields","trantime");
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

        public QueryBuilder fuzzyBusration (List<String> fuzzyBusration){
            this.fuzzyBusration = fuzzyBusration;
            return this;
        }

        public QueryBuilder fuzzyBusration (String ... fuzzyBusration){
            this.fuzzyBusration = solveNullList(fuzzyBusration);
            return this;
        }

        public QueryBuilder rightFuzzyBusration (List<String> rightFuzzyBusration){
            this.rightFuzzyBusration = rightFuzzyBusration;
            return this;
        }

        public QueryBuilder rightFuzzyBusration (String ... rightFuzzyBusration){
            this.rightFuzzyBusration = solveNullList(rightFuzzyBusration);
            return this;
        }

        public QueryBuilder busration(String busration){
            setBusration(busration);
            return this;
        }

        public QueryBuilder busrationList(String ... busration){
            this.busrationList = solveNullList(busration);
            return this;
        }

        public QueryBuilder busrationList(List<String> busration){
            this.busrationList = busration;
            return this;
        }

        public QueryBuilder fetchBusration(){
            setFetchFields("fetchFields","busration");
            return this;
        }

        public QueryBuilder excludeBusration(){
            setFetchFields("excludeFields","busration");
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

        public JpyTask build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> bussinessidList;

        public List<String> getBussinessidList(){return this.bussinessidList;}


        private List<String> fuzzyBussinessid;

        public List<String> getFuzzyBussinessid(){return this.fuzzyBussinessid;}

        private List<String> rightFuzzyBussinessid;

        public List<String> getRightFuzzyBussinessid(){return this.rightFuzzyBussinessid;}
        private List<String> returlList;

        public List<String> getReturlList(){return this.returlList;}


        private List<String> fuzzyReturl;

        public List<String> getFuzzyReturl(){return this.fuzzyReturl;}

        private List<String> rightFuzzyReturl;

        public List<String> getRightFuzzyReturl(){return this.rightFuzzyReturl;}
        private List<String> tradeNoList;

        public List<String> getTradeNoList(){return this.tradeNoList;}


        private List<String> fuzzyTradeNo;

        public List<String> getFuzzyTradeNo(){return this.fuzzyTradeNo;}

        private List<String> rightFuzzyTradeNo;

        public List<String> getRightFuzzyTradeNo(){return this.rightFuzzyTradeNo;}
        private List<String> pronameList;

        public List<String> getPronameList(){return this.pronameList;}


        private List<String> fuzzyProname;

        public List<String> getFuzzyProname(){return this.fuzzyProname;}

        private List<String> rightFuzzyProname;

        public List<String> getRightFuzzyProname(){return this.rightFuzzyProname;}
        private List<String> pronoList;

        public List<String> getPronoList(){return this.pronoList;}


        private List<String> fuzzyProno;

        public List<String> getFuzzyProno(){return this.fuzzyProno;}

        private List<String> rightFuzzyProno;

        public List<String> getRightFuzzyProno(){return this.rightFuzzyProno;}
        private List<String> tradenumList;

        public List<String> getTradenumList(){return this.tradenumList;}


        private List<String> fuzzyTradenum;

        public List<String> getFuzzyTradenum(){return this.fuzzyTradenum;}

        private List<String> rightFuzzyTradenum;

        public List<String> getRightFuzzyTradenum(){return this.rightFuzzyTradenum;}
        private List<String> tradegentimeList;

        public List<String> getTradegentimeList(){return this.tradegentimeList;}


        private List<String> fuzzyTradegentime;

        public List<String> getFuzzyTradegentime(){return this.fuzzyTradegentime;}

        private List<String> rightFuzzyTradegentime;

        public List<String> getRightFuzzyTradegentime(){return this.rightFuzzyTradegentime;}
        private List<String> payrettimeList;

        public List<String> getPayrettimeList(){return this.payrettimeList;}


        private List<String> fuzzyPayrettime;

        public List<String> getFuzzyPayrettime(){return this.fuzzyPayrettime;}

        private List<String> rightFuzzyPayrettime;

        public List<String> getRightFuzzyPayrettime(){return this.rightFuzzyPayrettime;}
        private List<String> payresList;

        public List<String> getPayresList(){return this.payresList;}


        private List<String> fuzzyPayres;

        public List<String> getFuzzyPayres(){return this.fuzzyPayres;}

        private List<String> rightFuzzyPayres;

        public List<String> getRightFuzzyPayres(){return this.rightFuzzyPayres;}
        private List<String> transstatusList;

        public List<String> getTransstatusList(){return this.transstatusList;}


        private List<String> fuzzyTransstatus;

        public List<String> getFuzzyTransstatus(){return this.fuzzyTransstatus;}

        private List<String> rightFuzzyTransstatus;

        public List<String> getRightFuzzyTransstatus(){return this.rightFuzzyTransstatus;}
        private List<String> trantimeList;

        public List<String> getTrantimeList(){return this.trantimeList;}


        private List<String> fuzzyTrantime;

        public List<String> getFuzzyTrantime(){return this.fuzzyTrantime;}

        private List<String> rightFuzzyTrantime;

        public List<String> getRightFuzzyTrantime(){return this.rightFuzzyTrantime;}
        private List<String> transnoList;

        public List<String> getTransnoList(){return this.transnoList;}


        private List<String> fuzzyTransno;

        public List<String> getFuzzyTransno(){return this.fuzzyTransno;}

        private List<String> rightFuzzyTransno;

        public List<String> getRightFuzzyTransno(){return this.rightFuzzyTransno;}
        private List<String> busrationList;

        public List<String> getBusrationList(){return this.busrationList;}


        private List<String> fuzzyBusration;

        public List<String> getFuzzyBusration(){return this.fuzzyBusration;}

        private List<String> rightFuzzyBusration;

        public List<String> getRightFuzzyBusration(){return this.rightFuzzyBusration;}

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

        public ConditionBuilder fuzzyReturl (List<String> fuzzyReturl){
            this.fuzzyReturl = fuzzyReturl;
            return this;
        }

        public ConditionBuilder fuzzyReturl (String ... fuzzyReturl){
            this.fuzzyReturl = solveNullList(fuzzyReturl);
            return this;
        }

        public ConditionBuilder rightFuzzyReturl (List<String> rightFuzzyReturl){
            this.rightFuzzyReturl = rightFuzzyReturl;
            return this;
        }

        public ConditionBuilder rightFuzzyReturl (String ... rightFuzzyReturl){
            this.rightFuzzyReturl = solveNullList(rightFuzzyReturl);
            return this;
        }

        public ConditionBuilder returlList(String ... returl){
            this.returlList = solveNullList(returl);
            return this;
        }

        public ConditionBuilder returlList(List<String> returl){
            this.returlList = returl;
            return this;
        }

        public ConditionBuilder fuzzyTradeNo (List<String> fuzzyTradeNo){
            this.fuzzyTradeNo = fuzzyTradeNo;
            return this;
        }

        public ConditionBuilder fuzzyTradeNo (String ... fuzzyTradeNo){
            this.fuzzyTradeNo = solveNullList(fuzzyTradeNo);
            return this;
        }

        public ConditionBuilder rightFuzzyTradeNo (List<String> rightFuzzyTradeNo){
            this.rightFuzzyTradeNo = rightFuzzyTradeNo;
            return this;
        }

        public ConditionBuilder rightFuzzyTradeNo (String ... rightFuzzyTradeNo){
            this.rightFuzzyTradeNo = solveNullList(rightFuzzyTradeNo);
            return this;
        }

        public ConditionBuilder tradeNoList(String ... tradeNo){
            this.tradeNoList = solveNullList(tradeNo);
            return this;
        }

        public ConditionBuilder tradeNoList(List<String> tradeNo){
            this.tradeNoList = tradeNo;
            return this;
        }

        public ConditionBuilder fuzzyProname (List<String> fuzzyProname){
            this.fuzzyProname = fuzzyProname;
            return this;
        }

        public ConditionBuilder fuzzyProname (String ... fuzzyProname){
            this.fuzzyProname = solveNullList(fuzzyProname);
            return this;
        }

        public ConditionBuilder rightFuzzyProname (List<String> rightFuzzyProname){
            this.rightFuzzyProname = rightFuzzyProname;
            return this;
        }

        public ConditionBuilder rightFuzzyProname (String ... rightFuzzyProname){
            this.rightFuzzyProname = solveNullList(rightFuzzyProname);
            return this;
        }

        public ConditionBuilder pronameList(String ... proname){
            this.pronameList = solveNullList(proname);
            return this;
        }

        public ConditionBuilder pronameList(List<String> proname){
            this.pronameList = proname;
            return this;
        }

        public ConditionBuilder fuzzyProno (List<String> fuzzyProno){
            this.fuzzyProno = fuzzyProno;
            return this;
        }

        public ConditionBuilder fuzzyProno (String ... fuzzyProno){
            this.fuzzyProno = solveNullList(fuzzyProno);
            return this;
        }

        public ConditionBuilder rightFuzzyProno (List<String> rightFuzzyProno){
            this.rightFuzzyProno = rightFuzzyProno;
            return this;
        }

        public ConditionBuilder rightFuzzyProno (String ... rightFuzzyProno){
            this.rightFuzzyProno = solveNullList(rightFuzzyProno);
            return this;
        }

        public ConditionBuilder pronoList(String ... prono){
            this.pronoList = solveNullList(prono);
            return this;
        }

        public ConditionBuilder pronoList(List<String> prono){
            this.pronoList = prono;
            return this;
        }

        public ConditionBuilder fuzzyTradenum (List<String> fuzzyTradenum){
            this.fuzzyTradenum = fuzzyTradenum;
            return this;
        }

        public ConditionBuilder fuzzyTradenum (String ... fuzzyTradenum){
            this.fuzzyTradenum = solveNullList(fuzzyTradenum);
            return this;
        }

        public ConditionBuilder rightFuzzyTradenum (List<String> rightFuzzyTradenum){
            this.rightFuzzyTradenum = rightFuzzyTradenum;
            return this;
        }

        public ConditionBuilder rightFuzzyTradenum (String ... rightFuzzyTradenum){
            this.rightFuzzyTradenum = solveNullList(rightFuzzyTradenum);
            return this;
        }

        public ConditionBuilder tradenumList(String ... tradenum){
            this.tradenumList = solveNullList(tradenum);
            return this;
        }

        public ConditionBuilder tradenumList(List<String> tradenum){
            this.tradenumList = tradenum;
            return this;
        }

        public ConditionBuilder fuzzyTradegentime (List<String> fuzzyTradegentime){
            this.fuzzyTradegentime = fuzzyTradegentime;
            return this;
        }

        public ConditionBuilder fuzzyTradegentime (String ... fuzzyTradegentime){
            this.fuzzyTradegentime = solveNullList(fuzzyTradegentime);
            return this;
        }

        public ConditionBuilder rightFuzzyTradegentime (List<String> rightFuzzyTradegentime){
            this.rightFuzzyTradegentime = rightFuzzyTradegentime;
            return this;
        }

        public ConditionBuilder rightFuzzyTradegentime (String ... rightFuzzyTradegentime){
            this.rightFuzzyTradegentime = solveNullList(rightFuzzyTradegentime);
            return this;
        }

        public ConditionBuilder tradegentimeList(String ... tradegentime){
            this.tradegentimeList = solveNullList(tradegentime);
            return this;
        }

        public ConditionBuilder tradegentimeList(List<String> tradegentime){
            this.tradegentimeList = tradegentime;
            return this;
        }

        public ConditionBuilder fuzzyPayrettime (List<String> fuzzyPayrettime){
            this.fuzzyPayrettime = fuzzyPayrettime;
            return this;
        }

        public ConditionBuilder fuzzyPayrettime (String ... fuzzyPayrettime){
            this.fuzzyPayrettime = solveNullList(fuzzyPayrettime);
            return this;
        }

        public ConditionBuilder rightFuzzyPayrettime (List<String> rightFuzzyPayrettime){
            this.rightFuzzyPayrettime = rightFuzzyPayrettime;
            return this;
        }

        public ConditionBuilder rightFuzzyPayrettime (String ... rightFuzzyPayrettime){
            this.rightFuzzyPayrettime = solveNullList(rightFuzzyPayrettime);
            return this;
        }

        public ConditionBuilder payrettimeList(String ... payrettime){
            this.payrettimeList = solveNullList(payrettime);
            return this;
        }

        public ConditionBuilder payrettimeList(List<String> payrettime){
            this.payrettimeList = payrettime;
            return this;
        }

        public ConditionBuilder fuzzyPayres (List<String> fuzzyPayres){
            this.fuzzyPayres = fuzzyPayres;
            return this;
        }

        public ConditionBuilder fuzzyPayres (String ... fuzzyPayres){
            this.fuzzyPayres = solveNullList(fuzzyPayres);
            return this;
        }

        public ConditionBuilder rightFuzzyPayres (List<String> rightFuzzyPayres){
            this.rightFuzzyPayres = rightFuzzyPayres;
            return this;
        }

        public ConditionBuilder rightFuzzyPayres (String ... rightFuzzyPayres){
            this.rightFuzzyPayres = solveNullList(rightFuzzyPayres);
            return this;
        }

        public ConditionBuilder payresList(String ... payres){
            this.payresList = solveNullList(payres);
            return this;
        }

        public ConditionBuilder payresList(List<String> payres){
            this.payresList = payres;
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

        public ConditionBuilder fuzzyTrantime (List<String> fuzzyTrantime){
            this.fuzzyTrantime = fuzzyTrantime;
            return this;
        }

        public ConditionBuilder fuzzyTrantime (String ... fuzzyTrantime){
            this.fuzzyTrantime = solveNullList(fuzzyTrantime);
            return this;
        }

        public ConditionBuilder rightFuzzyTrantime (List<String> rightFuzzyTrantime){
            this.rightFuzzyTrantime = rightFuzzyTrantime;
            return this;
        }

        public ConditionBuilder rightFuzzyTrantime (String ... rightFuzzyTrantime){
            this.rightFuzzyTrantime = solveNullList(rightFuzzyTrantime);
            return this;
        }

        public ConditionBuilder trantimeList(String ... trantime){
            this.trantimeList = solveNullList(trantime);
            return this;
        }

        public ConditionBuilder trantimeList(List<String> trantime){
            this.trantimeList = trantime;
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

        public ConditionBuilder fuzzyBusration (List<String> fuzzyBusration){
            this.fuzzyBusration = fuzzyBusration;
            return this;
        }

        public ConditionBuilder fuzzyBusration (String ... fuzzyBusration){
            this.fuzzyBusration = solveNullList(fuzzyBusration);
            return this;
        }

        public ConditionBuilder rightFuzzyBusration (List<String> rightFuzzyBusration){
            this.rightFuzzyBusration = rightFuzzyBusration;
            return this;
        }

        public ConditionBuilder rightFuzzyBusration (String ... rightFuzzyBusration){
            this.rightFuzzyBusration = solveNullList(rightFuzzyBusration);
            return this;
        }

        public ConditionBuilder busrationList(String ... busration){
            this.busrationList = solveNullList(busration);
            return this;
        }

        public ConditionBuilder busrationList(List<String> busration){
            this.busrationList = busration;
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

        private JpyTask obj;

        public Builder(){
            this.obj = new JpyTask();
        }

        public Builder bussinessid(String bussinessid){
            this.obj.setBussinessid(bussinessid);
            return this;
        }
        public Builder returl(String returl){
            this.obj.setReturl(returl);
            return this;
        }
        public Builder tradeNo(String tradeNo){
            this.obj.setTradeNo(tradeNo);
            return this;
        }
        public Builder proname(String proname){
            this.obj.setProname(proname);
            return this;
        }
        public Builder prono(String prono){
            this.obj.setProno(prono);
            return this;
        }
        public Builder tradenum(String tradenum){
            this.obj.setTradenum(tradenum);
            return this;
        }
        public Builder tradegentime(String tradegentime){
            this.obj.setTradegentime(tradegentime);
            return this;
        }
        public Builder payrettime(String payrettime){
            this.obj.setPayrettime(payrettime);
            return this;
        }
        public Builder payres(String payres){
            this.obj.setPayres(payres);
            return this;
        }
        public Builder transstatus(String transstatus){
            this.obj.setTransstatus(transstatus);
            return this;
        }
        public Builder trantime(String trantime){
            this.obj.setTrantime(trantime);
            return this;
        }
        public Builder transno(String transno){
            this.obj.setTransno(transno);
            return this;
        }
        public Builder busration(String busration){
            this.obj.setBusration(busration);
            return this;
        }
        public JpyTask build(){return obj;}
    }

}
