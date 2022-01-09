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
public class JpyNotify implements Serializable {

    private static final long serialVersionUID = 1641436919806L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String notfiyid;

    /**
    * 
    * isNullAble:0
    */
    private String tradeno;

    /**
    * 
    * isNullAble:1
    */
    private String bussid;

    /**
    * 
    * isNullAble:1
    */
    private String reqbody;

    /**
    * 
    * isNullAble:1
    */
    private String reqtime;

    /**
    * 
    * isNullAble:1
    */
    private String reqcount;

    /**
    * 
    * isNullAble:1
    */
    private String rspret;

    /**
    * 
    * isNullAble:1
    */
    private String rsptime;

    /**
    * 
    * isNullAble:1
    */
    private String rspbody;

    /**
    * 
    * isNullAble:1
    */
    private String requrl;


    public void setNotfiyid(String notfiyid){this.notfiyid = notfiyid;}

    public String getNotfiyid(){return this.notfiyid;}

    public void setTradeno(String tradeno){this.tradeno = tradeno;}

    public String getTradeno(){return this.tradeno;}

    public void setBussid(String bussid){this.bussid = bussid;}

    public String getBussid(){return this.bussid;}

    public void setReqbody(String reqbody){this.reqbody = reqbody;}

    public String getReqbody(){return this.reqbody;}

    public void setReqtime(String reqtime){this.reqtime = reqtime;}

    public String getReqtime(){return this.reqtime;}

    public void setReqcount(String reqcount){this.reqcount = reqcount;}

    public String getReqcount(){return this.reqcount;}

    public void setRspret(String rspret){this.rspret = rspret;}

    public String getRspret(){return this.rspret;}

    public void setRsptime(String rsptime){this.rsptime = rsptime;}

    public String getRsptime(){return this.rsptime;}

    public void setRspbody(String rspbody){this.rspbody = rspbody;}

    public String getRspbody(){return this.rspbody;}

    public void setRequrl(String requrl){this.requrl = requrl;}

    public String getRequrl(){return this.requrl;}
    @Override
    public String toString() {
        return "JpyNotify{" +
                "notfiyid='" + notfiyid + '\'' +
                "tradeno='" + tradeno + '\'' +
                "bussid='" + bussid + '\'' +
                "reqbody='" + reqbody + '\'' +
                "reqtime='" + reqtime + '\'' +
                "reqcount='" + reqcount + '\'' +
                "rspret='" + rspret + '\'' +
                "rsptime='" + rsptime + '\'' +
                "rspbody='" + rspbody + '\'' +
                "requrl='" + requrl + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyNotify set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyNotify set){
            this.set = set;
            return this;
        }

        public JpyNotify getSet(){
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

    public static class QueryBuilder extends JpyNotify{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> notfiyidList;

        public List<String> getNotfiyidList(){return this.notfiyidList;}


        private List<String> fuzzyNotfiyid;

        public List<String> getFuzzyNotfiyid(){return this.fuzzyNotfiyid;}

        private List<String> rightFuzzyNotfiyid;

        public List<String> getRightFuzzyNotfiyid(){return this.rightFuzzyNotfiyid;}
        private List<String> tradenoList;

        public List<String> getTradenoList(){return this.tradenoList;}


        private List<String> fuzzyTradeno;

        public List<String> getFuzzyTradeno(){return this.fuzzyTradeno;}

        private List<String> rightFuzzyTradeno;

        public List<String> getRightFuzzyTradeno(){return this.rightFuzzyTradeno;}
        private List<String> bussidList;

        public List<String> getBussidList(){return this.bussidList;}


        private List<String> fuzzyBussid;

        public List<String> getFuzzyBussid(){return this.fuzzyBussid;}

        private List<String> rightFuzzyBussid;

        public List<String> getRightFuzzyBussid(){return this.rightFuzzyBussid;}
        private List<String> reqbodyList;

        public List<String> getReqbodyList(){return this.reqbodyList;}


        private List<String> fuzzyReqbody;

        public List<String> getFuzzyReqbody(){return this.fuzzyReqbody;}

        private List<String> rightFuzzyReqbody;

        public List<String> getRightFuzzyReqbody(){return this.rightFuzzyReqbody;}
        private List<String> reqtimeList;

        public List<String> getReqtimeList(){return this.reqtimeList;}


        private List<String> fuzzyReqtime;

        public List<String> getFuzzyReqtime(){return this.fuzzyReqtime;}

        private List<String> rightFuzzyReqtime;

        public List<String> getRightFuzzyReqtime(){return this.rightFuzzyReqtime;}
        private List<String> reqcountList;

        public List<String> getReqcountList(){return this.reqcountList;}


        private List<String> fuzzyReqcount;

        public List<String> getFuzzyReqcount(){return this.fuzzyReqcount;}

        private List<String> rightFuzzyReqcount;

        public List<String> getRightFuzzyReqcount(){return this.rightFuzzyReqcount;}
        private List<String> rspretList;

        public List<String> getRspretList(){return this.rspretList;}


        private List<String> fuzzyRspret;

        public List<String> getFuzzyRspret(){return this.fuzzyRspret;}

        private List<String> rightFuzzyRspret;

        public List<String> getRightFuzzyRspret(){return this.rightFuzzyRspret;}
        private List<String> rsptimeList;

        public List<String> getRsptimeList(){return this.rsptimeList;}


        private List<String> fuzzyRsptime;

        public List<String> getFuzzyRsptime(){return this.fuzzyRsptime;}

        private List<String> rightFuzzyRsptime;

        public List<String> getRightFuzzyRsptime(){return this.rightFuzzyRsptime;}
        private List<String> rspbodyList;

        public List<String> getRspbodyList(){return this.rspbodyList;}


        private List<String> fuzzyRspbody;

        public List<String> getFuzzyRspbody(){return this.fuzzyRspbody;}

        private List<String> rightFuzzyRspbody;

        public List<String> getRightFuzzyRspbody(){return this.rightFuzzyRspbody;}
        private List<String> requrlList;

        public List<String> getRequrlList(){return this.requrlList;}


        private List<String> fuzzyRequrl;

        public List<String> getFuzzyRequrl(){return this.fuzzyRequrl;}

        private List<String> rightFuzzyRequrl;

        public List<String> getRightFuzzyRequrl(){return this.rightFuzzyRequrl;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyNotfiyid (List<String> fuzzyNotfiyid){
            this.fuzzyNotfiyid = fuzzyNotfiyid;
            return this;
        }

        public QueryBuilder fuzzyNotfiyid (String ... fuzzyNotfiyid){
            this.fuzzyNotfiyid = solveNullList(fuzzyNotfiyid);
            return this;
        }

        public QueryBuilder rightFuzzyNotfiyid (List<String> rightFuzzyNotfiyid){
            this.rightFuzzyNotfiyid = rightFuzzyNotfiyid;
            return this;
        }

        public QueryBuilder rightFuzzyNotfiyid (String ... rightFuzzyNotfiyid){
            this.rightFuzzyNotfiyid = solveNullList(rightFuzzyNotfiyid);
            return this;
        }

        public QueryBuilder notfiyid(String notfiyid){
            setNotfiyid(notfiyid);
            return this;
        }

        public QueryBuilder notfiyidList(String ... notfiyid){
            this.notfiyidList = solveNullList(notfiyid);
            return this;
        }

        public QueryBuilder notfiyidList(List<String> notfiyid){
            this.notfiyidList = notfiyid;
            return this;
        }

        public QueryBuilder fetchNotfiyid(){
            setFetchFields("fetchFields","notfiyid");
            return this;
        }

        public QueryBuilder excludeNotfiyid(){
            setFetchFields("excludeFields","notfiyid");
            return this;
        }

        public QueryBuilder fuzzyTradeno (List<String> fuzzyTradeno){
            this.fuzzyTradeno = fuzzyTradeno;
            return this;
        }

        public QueryBuilder fuzzyTradeno (String ... fuzzyTradeno){
            this.fuzzyTradeno = solveNullList(fuzzyTradeno);
            return this;
        }

        public QueryBuilder rightFuzzyTradeno (List<String> rightFuzzyTradeno){
            this.rightFuzzyTradeno = rightFuzzyTradeno;
            return this;
        }

        public QueryBuilder rightFuzzyTradeno (String ... rightFuzzyTradeno){
            this.rightFuzzyTradeno = solveNullList(rightFuzzyTradeno);
            return this;
        }

        public QueryBuilder tradeno(String tradeno){
            setTradeno(tradeno);
            return this;
        }

        public QueryBuilder tradenoList(String ... tradeno){
            this.tradenoList = solveNullList(tradeno);
            return this;
        }

        public QueryBuilder tradenoList(List<String> tradeno){
            this.tradenoList = tradeno;
            return this;
        }

        public QueryBuilder fetchTradeno(){
            setFetchFields("fetchFields","tradeno");
            return this;
        }

        public QueryBuilder excludeTradeno(){
            setFetchFields("excludeFields","tradeno");
            return this;
        }

        public QueryBuilder fuzzyBussid (List<String> fuzzyBussid){
            this.fuzzyBussid = fuzzyBussid;
            return this;
        }

        public QueryBuilder fuzzyBussid (String ... fuzzyBussid){
            this.fuzzyBussid = solveNullList(fuzzyBussid);
            return this;
        }

        public QueryBuilder rightFuzzyBussid (List<String> rightFuzzyBussid){
            this.rightFuzzyBussid = rightFuzzyBussid;
            return this;
        }

        public QueryBuilder rightFuzzyBussid (String ... rightFuzzyBussid){
            this.rightFuzzyBussid = solveNullList(rightFuzzyBussid);
            return this;
        }

        public QueryBuilder bussid(String bussid){
            setBussid(bussid);
            return this;
        }

        public QueryBuilder bussidList(String ... bussid){
            this.bussidList = solveNullList(bussid);
            return this;
        }

        public QueryBuilder bussidList(List<String> bussid){
            this.bussidList = bussid;
            return this;
        }

        public QueryBuilder fetchBussid(){
            setFetchFields("fetchFields","bussid");
            return this;
        }

        public QueryBuilder excludeBussid(){
            setFetchFields("excludeFields","bussid");
            return this;
        }

        public QueryBuilder fuzzyReqbody (List<String> fuzzyReqbody){
            this.fuzzyReqbody = fuzzyReqbody;
            return this;
        }

        public QueryBuilder fuzzyReqbody (String ... fuzzyReqbody){
            this.fuzzyReqbody = solveNullList(fuzzyReqbody);
            return this;
        }

        public QueryBuilder rightFuzzyReqbody (List<String> rightFuzzyReqbody){
            this.rightFuzzyReqbody = rightFuzzyReqbody;
            return this;
        }

        public QueryBuilder rightFuzzyReqbody (String ... rightFuzzyReqbody){
            this.rightFuzzyReqbody = solveNullList(rightFuzzyReqbody);
            return this;
        }

        public QueryBuilder reqbody(String reqbody){
            setReqbody(reqbody);
            return this;
        }

        public QueryBuilder reqbodyList(String ... reqbody){
            this.reqbodyList = solveNullList(reqbody);
            return this;
        }

        public QueryBuilder reqbodyList(List<String> reqbody){
            this.reqbodyList = reqbody;
            return this;
        }

        public QueryBuilder fetchReqbody(){
            setFetchFields("fetchFields","reqbody");
            return this;
        }

        public QueryBuilder excludeReqbody(){
            setFetchFields("excludeFields","reqbody");
            return this;
        }

        public QueryBuilder fuzzyReqtime (List<String> fuzzyReqtime){
            this.fuzzyReqtime = fuzzyReqtime;
            return this;
        }

        public QueryBuilder fuzzyReqtime (String ... fuzzyReqtime){
            this.fuzzyReqtime = solveNullList(fuzzyReqtime);
            return this;
        }

        public QueryBuilder rightFuzzyReqtime (List<String> rightFuzzyReqtime){
            this.rightFuzzyReqtime = rightFuzzyReqtime;
            return this;
        }

        public QueryBuilder rightFuzzyReqtime (String ... rightFuzzyReqtime){
            this.rightFuzzyReqtime = solveNullList(rightFuzzyReqtime);
            return this;
        }

        public QueryBuilder reqtime(String reqtime){
            setReqtime(reqtime);
            return this;
        }

        public QueryBuilder reqtimeList(String ... reqtime){
            this.reqtimeList = solveNullList(reqtime);
            return this;
        }

        public QueryBuilder reqtimeList(List<String> reqtime){
            this.reqtimeList = reqtime;
            return this;
        }

        public QueryBuilder fetchReqtime(){
            setFetchFields("fetchFields","reqtime");
            return this;
        }

        public QueryBuilder excludeReqtime(){
            setFetchFields("excludeFields","reqtime");
            return this;
        }

        public QueryBuilder fuzzyReqcount (List<String> fuzzyReqcount){
            this.fuzzyReqcount = fuzzyReqcount;
            return this;
        }

        public QueryBuilder fuzzyReqcount (String ... fuzzyReqcount){
            this.fuzzyReqcount = solveNullList(fuzzyReqcount);
            return this;
        }

        public QueryBuilder rightFuzzyReqcount (List<String> rightFuzzyReqcount){
            this.rightFuzzyReqcount = rightFuzzyReqcount;
            return this;
        }

        public QueryBuilder rightFuzzyReqcount (String ... rightFuzzyReqcount){
            this.rightFuzzyReqcount = solveNullList(rightFuzzyReqcount);
            return this;
        }

        public QueryBuilder reqcount(String reqcount){
            setReqcount(reqcount);
            return this;
        }

        public QueryBuilder reqcountList(String ... reqcount){
            this.reqcountList = solveNullList(reqcount);
            return this;
        }

        public QueryBuilder reqcountList(List<String> reqcount){
            this.reqcountList = reqcount;
            return this;
        }

        public QueryBuilder fetchReqcount(){
            setFetchFields("fetchFields","reqcount");
            return this;
        }

        public QueryBuilder excludeReqcount(){
            setFetchFields("excludeFields","reqcount");
            return this;
        }

        public QueryBuilder fuzzyRspret (List<String> fuzzyRspret){
            this.fuzzyRspret = fuzzyRspret;
            return this;
        }

        public QueryBuilder fuzzyRspret (String ... fuzzyRspret){
            this.fuzzyRspret = solveNullList(fuzzyRspret);
            return this;
        }

        public QueryBuilder rightFuzzyRspret (List<String> rightFuzzyRspret){
            this.rightFuzzyRspret = rightFuzzyRspret;
            return this;
        }

        public QueryBuilder rightFuzzyRspret (String ... rightFuzzyRspret){
            this.rightFuzzyRspret = solveNullList(rightFuzzyRspret);
            return this;
        }

        public QueryBuilder rspret(String rspret){
            setRspret(rspret);
            return this;
        }

        public QueryBuilder rspretList(String ... rspret){
            this.rspretList = solveNullList(rspret);
            return this;
        }

        public QueryBuilder rspretList(List<String> rspret){
            this.rspretList = rspret;
            return this;
        }

        public QueryBuilder fetchRspret(){
            setFetchFields("fetchFields","rspret");
            return this;
        }

        public QueryBuilder excludeRspret(){
            setFetchFields("excludeFields","rspret");
            return this;
        }

        public QueryBuilder fuzzyRsptime (List<String> fuzzyRsptime){
            this.fuzzyRsptime = fuzzyRsptime;
            return this;
        }

        public QueryBuilder fuzzyRsptime (String ... fuzzyRsptime){
            this.fuzzyRsptime = solveNullList(fuzzyRsptime);
            return this;
        }

        public QueryBuilder rightFuzzyRsptime (List<String> rightFuzzyRsptime){
            this.rightFuzzyRsptime = rightFuzzyRsptime;
            return this;
        }

        public QueryBuilder rightFuzzyRsptime (String ... rightFuzzyRsptime){
            this.rightFuzzyRsptime = solveNullList(rightFuzzyRsptime);
            return this;
        }

        public QueryBuilder rsptime(String rsptime){
            setRsptime(rsptime);
            return this;
        }

        public QueryBuilder rsptimeList(String ... rsptime){
            this.rsptimeList = solveNullList(rsptime);
            return this;
        }

        public QueryBuilder rsptimeList(List<String> rsptime){
            this.rsptimeList = rsptime;
            return this;
        }

        public QueryBuilder fetchRsptime(){
            setFetchFields("fetchFields","rsptime");
            return this;
        }

        public QueryBuilder excludeRsptime(){
            setFetchFields("excludeFields","rsptime");
            return this;
        }

        public QueryBuilder fuzzyRspbody (List<String> fuzzyRspbody){
            this.fuzzyRspbody = fuzzyRspbody;
            return this;
        }

        public QueryBuilder fuzzyRspbody (String ... fuzzyRspbody){
            this.fuzzyRspbody = solveNullList(fuzzyRspbody);
            return this;
        }

        public QueryBuilder rightFuzzyRspbody (List<String> rightFuzzyRspbody){
            this.rightFuzzyRspbody = rightFuzzyRspbody;
            return this;
        }

        public QueryBuilder rightFuzzyRspbody (String ... rightFuzzyRspbody){
            this.rightFuzzyRspbody = solveNullList(rightFuzzyRspbody);
            return this;
        }

        public QueryBuilder rspbody(String rspbody){
            setRspbody(rspbody);
            return this;
        }

        public QueryBuilder rspbodyList(String ... rspbody){
            this.rspbodyList = solveNullList(rspbody);
            return this;
        }

        public QueryBuilder rspbodyList(List<String> rspbody){
            this.rspbodyList = rspbody;
            return this;
        }

        public QueryBuilder fetchRspbody(){
            setFetchFields("fetchFields","rspbody");
            return this;
        }

        public QueryBuilder excludeRspbody(){
            setFetchFields("excludeFields","rspbody");
            return this;
        }

        public QueryBuilder fuzzyRequrl (List<String> fuzzyRequrl){
            this.fuzzyRequrl = fuzzyRequrl;
            return this;
        }

        public QueryBuilder fuzzyRequrl (String ... fuzzyRequrl){
            this.fuzzyRequrl = solveNullList(fuzzyRequrl);
            return this;
        }

        public QueryBuilder rightFuzzyRequrl (List<String> rightFuzzyRequrl){
            this.rightFuzzyRequrl = rightFuzzyRequrl;
            return this;
        }

        public QueryBuilder rightFuzzyRequrl (String ... rightFuzzyRequrl){
            this.rightFuzzyRequrl = solveNullList(rightFuzzyRequrl);
            return this;
        }

        public QueryBuilder requrl(String requrl){
            setRequrl(requrl);
            return this;
        }

        public QueryBuilder requrlList(String ... requrl){
            this.requrlList = solveNullList(requrl);
            return this;
        }

        public QueryBuilder requrlList(List<String> requrl){
            this.requrlList = requrl;
            return this;
        }

        public QueryBuilder fetchRequrl(){
            setFetchFields("fetchFields","requrl");
            return this;
        }

        public QueryBuilder excludeRequrl(){
            setFetchFields("excludeFields","requrl");
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

        public JpyNotify build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> notfiyidList;

        public List<String> getNotfiyidList(){return this.notfiyidList;}


        private List<String> fuzzyNotfiyid;

        public List<String> getFuzzyNotfiyid(){return this.fuzzyNotfiyid;}

        private List<String> rightFuzzyNotfiyid;

        public List<String> getRightFuzzyNotfiyid(){return this.rightFuzzyNotfiyid;}
        private List<String> tradenoList;

        public List<String> getTradenoList(){return this.tradenoList;}


        private List<String> fuzzyTradeno;

        public List<String> getFuzzyTradeno(){return this.fuzzyTradeno;}

        private List<String> rightFuzzyTradeno;

        public List<String> getRightFuzzyTradeno(){return this.rightFuzzyTradeno;}
        private List<String> bussidList;

        public List<String> getBussidList(){return this.bussidList;}


        private List<String> fuzzyBussid;

        public List<String> getFuzzyBussid(){return this.fuzzyBussid;}

        private List<String> rightFuzzyBussid;

        public List<String> getRightFuzzyBussid(){return this.rightFuzzyBussid;}
        private List<String> reqbodyList;

        public List<String> getReqbodyList(){return this.reqbodyList;}


        private List<String> fuzzyReqbody;

        public List<String> getFuzzyReqbody(){return this.fuzzyReqbody;}

        private List<String> rightFuzzyReqbody;

        public List<String> getRightFuzzyReqbody(){return this.rightFuzzyReqbody;}
        private List<String> reqtimeList;

        public List<String> getReqtimeList(){return this.reqtimeList;}


        private List<String> fuzzyReqtime;

        public List<String> getFuzzyReqtime(){return this.fuzzyReqtime;}

        private List<String> rightFuzzyReqtime;

        public List<String> getRightFuzzyReqtime(){return this.rightFuzzyReqtime;}
        private List<String> reqcountList;

        public List<String> getReqcountList(){return this.reqcountList;}


        private List<String> fuzzyReqcount;

        public List<String> getFuzzyReqcount(){return this.fuzzyReqcount;}

        private List<String> rightFuzzyReqcount;

        public List<String> getRightFuzzyReqcount(){return this.rightFuzzyReqcount;}
        private List<String> rspretList;

        public List<String> getRspretList(){return this.rspretList;}


        private List<String> fuzzyRspret;

        public List<String> getFuzzyRspret(){return this.fuzzyRspret;}

        private List<String> rightFuzzyRspret;

        public List<String> getRightFuzzyRspret(){return this.rightFuzzyRspret;}
        private List<String> rsptimeList;

        public List<String> getRsptimeList(){return this.rsptimeList;}


        private List<String> fuzzyRsptime;

        public List<String> getFuzzyRsptime(){return this.fuzzyRsptime;}

        private List<String> rightFuzzyRsptime;

        public List<String> getRightFuzzyRsptime(){return this.rightFuzzyRsptime;}
        private List<String> rspbodyList;

        public List<String> getRspbodyList(){return this.rspbodyList;}


        private List<String> fuzzyRspbody;

        public List<String> getFuzzyRspbody(){return this.fuzzyRspbody;}

        private List<String> rightFuzzyRspbody;

        public List<String> getRightFuzzyRspbody(){return this.rightFuzzyRspbody;}
        private List<String> requrlList;

        public List<String> getRequrlList(){return this.requrlList;}


        private List<String> fuzzyRequrl;

        public List<String> getFuzzyRequrl(){return this.fuzzyRequrl;}

        private List<String> rightFuzzyRequrl;

        public List<String> getRightFuzzyRequrl(){return this.rightFuzzyRequrl;}

        public ConditionBuilder fuzzyNotfiyid (List<String> fuzzyNotfiyid){
            this.fuzzyNotfiyid = fuzzyNotfiyid;
            return this;
        }

        public ConditionBuilder fuzzyNotfiyid (String ... fuzzyNotfiyid){
            this.fuzzyNotfiyid = solveNullList(fuzzyNotfiyid);
            return this;
        }

        public ConditionBuilder rightFuzzyNotfiyid (List<String> rightFuzzyNotfiyid){
            this.rightFuzzyNotfiyid = rightFuzzyNotfiyid;
            return this;
        }

        public ConditionBuilder rightFuzzyNotfiyid (String ... rightFuzzyNotfiyid){
            this.rightFuzzyNotfiyid = solveNullList(rightFuzzyNotfiyid);
            return this;
        }

        public ConditionBuilder notfiyidList(String ... notfiyid){
            this.notfiyidList = solveNullList(notfiyid);
            return this;
        }

        public ConditionBuilder notfiyidList(List<String> notfiyid){
            this.notfiyidList = notfiyid;
            return this;
        }

        public ConditionBuilder fuzzyTradeno (List<String> fuzzyTradeno){
            this.fuzzyTradeno = fuzzyTradeno;
            return this;
        }

        public ConditionBuilder fuzzyTradeno (String ... fuzzyTradeno){
            this.fuzzyTradeno = solveNullList(fuzzyTradeno);
            return this;
        }

        public ConditionBuilder rightFuzzyTradeno (List<String> rightFuzzyTradeno){
            this.rightFuzzyTradeno = rightFuzzyTradeno;
            return this;
        }

        public ConditionBuilder rightFuzzyTradeno (String ... rightFuzzyTradeno){
            this.rightFuzzyTradeno = solveNullList(rightFuzzyTradeno);
            return this;
        }

        public ConditionBuilder tradenoList(String ... tradeno){
            this.tradenoList = solveNullList(tradeno);
            return this;
        }

        public ConditionBuilder tradenoList(List<String> tradeno){
            this.tradenoList = tradeno;
            return this;
        }

        public ConditionBuilder fuzzyBussid (List<String> fuzzyBussid){
            this.fuzzyBussid = fuzzyBussid;
            return this;
        }

        public ConditionBuilder fuzzyBussid (String ... fuzzyBussid){
            this.fuzzyBussid = solveNullList(fuzzyBussid);
            return this;
        }

        public ConditionBuilder rightFuzzyBussid (List<String> rightFuzzyBussid){
            this.rightFuzzyBussid = rightFuzzyBussid;
            return this;
        }

        public ConditionBuilder rightFuzzyBussid (String ... rightFuzzyBussid){
            this.rightFuzzyBussid = solveNullList(rightFuzzyBussid);
            return this;
        }

        public ConditionBuilder bussidList(String ... bussid){
            this.bussidList = solveNullList(bussid);
            return this;
        }

        public ConditionBuilder bussidList(List<String> bussid){
            this.bussidList = bussid;
            return this;
        }

        public ConditionBuilder fuzzyReqbody (List<String> fuzzyReqbody){
            this.fuzzyReqbody = fuzzyReqbody;
            return this;
        }

        public ConditionBuilder fuzzyReqbody (String ... fuzzyReqbody){
            this.fuzzyReqbody = solveNullList(fuzzyReqbody);
            return this;
        }

        public ConditionBuilder rightFuzzyReqbody (List<String> rightFuzzyReqbody){
            this.rightFuzzyReqbody = rightFuzzyReqbody;
            return this;
        }

        public ConditionBuilder rightFuzzyReqbody (String ... rightFuzzyReqbody){
            this.rightFuzzyReqbody = solveNullList(rightFuzzyReqbody);
            return this;
        }

        public ConditionBuilder reqbodyList(String ... reqbody){
            this.reqbodyList = solveNullList(reqbody);
            return this;
        }

        public ConditionBuilder reqbodyList(List<String> reqbody){
            this.reqbodyList = reqbody;
            return this;
        }

        public ConditionBuilder fuzzyReqtime (List<String> fuzzyReqtime){
            this.fuzzyReqtime = fuzzyReqtime;
            return this;
        }

        public ConditionBuilder fuzzyReqtime (String ... fuzzyReqtime){
            this.fuzzyReqtime = solveNullList(fuzzyReqtime);
            return this;
        }

        public ConditionBuilder rightFuzzyReqtime (List<String> rightFuzzyReqtime){
            this.rightFuzzyReqtime = rightFuzzyReqtime;
            return this;
        }

        public ConditionBuilder rightFuzzyReqtime (String ... rightFuzzyReqtime){
            this.rightFuzzyReqtime = solveNullList(rightFuzzyReqtime);
            return this;
        }

        public ConditionBuilder reqtimeList(String ... reqtime){
            this.reqtimeList = solveNullList(reqtime);
            return this;
        }

        public ConditionBuilder reqtimeList(List<String> reqtime){
            this.reqtimeList = reqtime;
            return this;
        }

        public ConditionBuilder fuzzyReqcount (List<String> fuzzyReqcount){
            this.fuzzyReqcount = fuzzyReqcount;
            return this;
        }

        public ConditionBuilder fuzzyReqcount (String ... fuzzyReqcount){
            this.fuzzyReqcount = solveNullList(fuzzyReqcount);
            return this;
        }

        public ConditionBuilder rightFuzzyReqcount (List<String> rightFuzzyReqcount){
            this.rightFuzzyReqcount = rightFuzzyReqcount;
            return this;
        }

        public ConditionBuilder rightFuzzyReqcount (String ... rightFuzzyReqcount){
            this.rightFuzzyReqcount = solveNullList(rightFuzzyReqcount);
            return this;
        }

        public ConditionBuilder reqcountList(String ... reqcount){
            this.reqcountList = solveNullList(reqcount);
            return this;
        }

        public ConditionBuilder reqcountList(List<String> reqcount){
            this.reqcountList = reqcount;
            return this;
        }

        public ConditionBuilder fuzzyRspret (List<String> fuzzyRspret){
            this.fuzzyRspret = fuzzyRspret;
            return this;
        }

        public ConditionBuilder fuzzyRspret (String ... fuzzyRspret){
            this.fuzzyRspret = solveNullList(fuzzyRspret);
            return this;
        }

        public ConditionBuilder rightFuzzyRspret (List<String> rightFuzzyRspret){
            this.rightFuzzyRspret = rightFuzzyRspret;
            return this;
        }

        public ConditionBuilder rightFuzzyRspret (String ... rightFuzzyRspret){
            this.rightFuzzyRspret = solveNullList(rightFuzzyRspret);
            return this;
        }

        public ConditionBuilder rspretList(String ... rspret){
            this.rspretList = solveNullList(rspret);
            return this;
        }

        public ConditionBuilder rspretList(List<String> rspret){
            this.rspretList = rspret;
            return this;
        }

        public ConditionBuilder fuzzyRsptime (List<String> fuzzyRsptime){
            this.fuzzyRsptime = fuzzyRsptime;
            return this;
        }

        public ConditionBuilder fuzzyRsptime (String ... fuzzyRsptime){
            this.fuzzyRsptime = solveNullList(fuzzyRsptime);
            return this;
        }

        public ConditionBuilder rightFuzzyRsptime (List<String> rightFuzzyRsptime){
            this.rightFuzzyRsptime = rightFuzzyRsptime;
            return this;
        }

        public ConditionBuilder rightFuzzyRsptime (String ... rightFuzzyRsptime){
            this.rightFuzzyRsptime = solveNullList(rightFuzzyRsptime);
            return this;
        }

        public ConditionBuilder rsptimeList(String ... rsptime){
            this.rsptimeList = solveNullList(rsptime);
            return this;
        }

        public ConditionBuilder rsptimeList(List<String> rsptime){
            this.rsptimeList = rsptime;
            return this;
        }

        public ConditionBuilder fuzzyRspbody (List<String> fuzzyRspbody){
            this.fuzzyRspbody = fuzzyRspbody;
            return this;
        }

        public ConditionBuilder fuzzyRspbody (String ... fuzzyRspbody){
            this.fuzzyRspbody = solveNullList(fuzzyRspbody);
            return this;
        }

        public ConditionBuilder rightFuzzyRspbody (List<String> rightFuzzyRspbody){
            this.rightFuzzyRspbody = rightFuzzyRspbody;
            return this;
        }

        public ConditionBuilder rightFuzzyRspbody (String ... rightFuzzyRspbody){
            this.rightFuzzyRspbody = solveNullList(rightFuzzyRspbody);
            return this;
        }

        public ConditionBuilder rspbodyList(String ... rspbody){
            this.rspbodyList = solveNullList(rspbody);
            return this;
        }

        public ConditionBuilder rspbodyList(List<String> rspbody){
            this.rspbodyList = rspbody;
            return this;
        }

        public ConditionBuilder fuzzyRequrl (List<String> fuzzyRequrl){
            this.fuzzyRequrl = fuzzyRequrl;
            return this;
        }

        public ConditionBuilder fuzzyRequrl (String ... fuzzyRequrl){
            this.fuzzyRequrl = solveNullList(fuzzyRequrl);
            return this;
        }

        public ConditionBuilder rightFuzzyRequrl (List<String> rightFuzzyRequrl){
            this.rightFuzzyRequrl = rightFuzzyRequrl;
            return this;
        }

        public ConditionBuilder rightFuzzyRequrl (String ... rightFuzzyRequrl){
            this.rightFuzzyRequrl = solveNullList(rightFuzzyRequrl);
            return this;
        }

        public ConditionBuilder requrlList(String ... requrl){
            this.requrlList = solveNullList(requrl);
            return this;
        }

        public ConditionBuilder requrlList(List<String> requrl){
            this.requrlList = requrl;
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

        private JpyNotify obj;

        public Builder(){
            this.obj = new JpyNotify();
        }

        public Builder notfiyid(String notfiyid){
            this.obj.setNotfiyid(notfiyid);
            return this;
        }
        public Builder tradeno(String tradeno){
            this.obj.setTradeno(tradeno);
            return this;
        }
        public Builder bussid(String bussid){
            this.obj.setBussid(bussid);
            return this;
        }
        public Builder reqbody(String reqbody){
            this.obj.setReqbody(reqbody);
            return this;
        }
        public Builder reqtime(String reqtime){
            this.obj.setReqtime(reqtime);
            return this;
        }
        public Builder reqcount(String reqcount){
            this.obj.setReqcount(reqcount);
            return this;
        }
        public Builder rspret(String rspret){
            this.obj.setRspret(rspret);
            return this;
        }
        public Builder rsptime(String rsptime){
            this.obj.setRsptime(rsptime);
            return this;
        }
        public Builder rspbody(String rspbody){
            this.obj.setRspbody(rspbody);
            return this;
        }
        public Builder requrl(String requrl){
            this.obj.setRequrl(requrl);
            return this;
        }
        public JpyNotify build(){return obj;}
    }

}
