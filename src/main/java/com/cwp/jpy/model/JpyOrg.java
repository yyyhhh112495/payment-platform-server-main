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
public class JpyOrg implements Serializable {

    private static final long serialVersionUID = 1638780409586L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer bussinessid;

    /**
    * 
    * isNullAble:1
    */
    private String bussinessname;

    /**
    * 
    * isNullAble:1
    */
    private String addtime;

    /**
    * 商户费率
    * isNullAble:1
    */
    private String bussratio;

    /**
    * 商户状态 1-正常
    * isNullAble:1
    */
    private String bussstatus;

    /**
    * 更新时间
    * isNullAble:1
    */
    private String uptime;

    /**
    * 商户登录手机号
    * isNullAble:1
    */
    private String bussphone;


    private String prikey;


    public void setBussinessid(Integer bussinessid){this.bussinessid = bussinessid;}

    public Integer getBussinessid(){return this.bussinessid;}

    public void setBussinessname(String bussinessname){this.bussinessname = bussinessname;}

    public String getBussinessname(){return this.bussinessname;}

    public void setAddtime(String addtime){this.addtime = addtime;}

    public String getAddtime(){return this.addtime;}

    public void setBussratio(String bussratio){this.bussratio = bussratio;}

    public String getBussratio(){return this.bussratio;}

    public void setBussstatus(String bussstatus){this.bussstatus = bussstatus;}

    public String getBussstatus(){return this.bussstatus;}

    public void setUptime(String uptime){this.uptime = uptime;}

    public String getUptime(){return this.uptime;}

    public void setBussphone(String bussphone){this.bussphone = bussphone;}

    public String getBussphone(){return this.bussphone;}
    @Override
    public String toString() {
        return "JpyOrg{" +
                "bussinessid='" + bussinessid + '\'' +
                "bussinessname='" + bussinessname + '\'' +
                "addtime='" + addtime + '\'' +
                "bussratio='" + bussratio + '\'' +
                "bussstatus='" + bussstatus + '\'' +
                "uptime='" + uptime + '\'' +
                "bussphone='" + bussphone + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public String getPrikey() {
        return prikey;
    }

    public void setPrikey(String prikey) {
        this.prikey = prikey;
    }

    public static class UpdateBuilder {

        private JpyOrg set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyOrg set){
            this.set = set;
            return this;
        }

        public JpyOrg getSet(){
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

    public static class QueryBuilder extends JpyOrg{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> bussinessidList;

        public List<Integer> getBussinessidList(){return this.bussinessidList;}

        private Integer bussinessidSt;

        private Integer bussinessidEd;

        public Integer getBussinessidSt(){return this.bussinessidSt;}

        public Integer getBussinessidEd(){return this.bussinessidEd;}

        private List<String> bussinessnameList;

        public List<String> getBussinessnameList(){return this.bussinessnameList;}


        private List<String> fuzzyBussinessname;

        public List<String> getFuzzyBussinessname(){return this.fuzzyBussinessname;}

        private List<String> rightFuzzyBussinessname;

        public List<String> getRightFuzzyBussinessname(){return this.rightFuzzyBussinessname;}
        private List<String> addtimeList;

        public List<String> getAddtimeList(){return this.addtimeList;}


        private List<String> fuzzyAddtime;

        public List<String> getFuzzyAddtime(){return this.fuzzyAddtime;}

        private List<String> rightFuzzyAddtime;

        public List<String> getRightFuzzyAddtime(){return this.rightFuzzyAddtime;}
        private List<String> bussratioList;

        public List<String> getBussratioList(){return this.bussratioList;}


        private List<String> fuzzyBussratio;

        public List<String> getFuzzyBussratio(){return this.fuzzyBussratio;}

        private List<String> rightFuzzyBussratio;

        public List<String> getRightFuzzyBussratio(){return this.rightFuzzyBussratio;}
        private List<String> bussstatusList;

        public List<String> getBussstatusList(){return this.bussstatusList;}


        private List<String> fuzzyBussstatus;

        public List<String> getFuzzyBussstatus(){return this.fuzzyBussstatus;}

        private List<String> rightFuzzyBussstatus;

        public List<String> getRightFuzzyBussstatus(){return this.rightFuzzyBussstatus;}
        private List<String> uptimeList;

        public List<String> getUptimeList(){return this.uptimeList;}


        private List<String> fuzzyUptime;

        public List<String> getFuzzyUptime(){return this.fuzzyUptime;}

        private List<String> rightFuzzyUptime;

        public List<String> getRightFuzzyUptime(){return this.rightFuzzyUptime;}
        private List<String> bussphoneList;

        public List<String> getBussphoneList(){return this.bussphoneList;}


        private List<String> fuzzyBussphone;

        public List<String> getFuzzyBussphone(){return this.fuzzyBussphone;}

        private List<String> rightFuzzyBussphone;

        public List<String> getRightFuzzyBussphone(){return this.rightFuzzyBussphone;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder bussinessidBetWeen(Integer bussinessidSt,Integer bussinessidEd){
            this.bussinessidSt = bussinessidSt;
            this.bussinessidEd = bussinessidEd;
            return this;
        }

        public QueryBuilder bussinessidGreaterEqThan(Integer bussinessidSt){
            this.bussinessidSt = bussinessidSt;
            return this;
        }
        public QueryBuilder bussinessidLessEqThan(Integer bussinessidEd){
            this.bussinessidEd = bussinessidEd;
            return this;
        }


        public QueryBuilder bussinessid(Integer bussinessid){
            setBussinessid(bussinessid);
            return this;
        }

        public QueryBuilder bussinessidList(Integer ... bussinessid){
            this.bussinessidList = solveNullList(bussinessid);
            return this;
        }

        public QueryBuilder bussinessidList(List<Integer> bussinessid){
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

        public QueryBuilder fuzzyAddtime (List<String> fuzzyAddtime){
            this.fuzzyAddtime = fuzzyAddtime;
            return this;
        }

        public QueryBuilder fuzzyAddtime (String ... fuzzyAddtime){
            this.fuzzyAddtime = solveNullList(fuzzyAddtime);
            return this;
        }

        public QueryBuilder rightFuzzyAddtime (List<String> rightFuzzyAddtime){
            this.rightFuzzyAddtime = rightFuzzyAddtime;
            return this;
        }

        public QueryBuilder rightFuzzyAddtime (String ... rightFuzzyAddtime){
            this.rightFuzzyAddtime = solveNullList(rightFuzzyAddtime);
            return this;
        }

        public QueryBuilder addtime(String addtime){
            setAddtime(addtime);
            return this;
        }

        public QueryBuilder addtimeList(String ... addtime){
            this.addtimeList = solveNullList(addtime);
            return this;
        }

        public QueryBuilder addtimeList(List<String> addtime){
            this.addtimeList = addtime;
            return this;
        }

        public QueryBuilder fetchAddtime(){
            setFetchFields("fetchFields","addtime");
            return this;
        }

        public QueryBuilder excludeAddtime(){
            setFetchFields("excludeFields","addtime");
            return this;
        }

        public QueryBuilder fuzzyBussratio (List<String> fuzzyBussratio){
            this.fuzzyBussratio = fuzzyBussratio;
            return this;
        }

        public QueryBuilder fuzzyBussratio (String ... fuzzyBussratio){
            this.fuzzyBussratio = solveNullList(fuzzyBussratio);
            return this;
        }

        public QueryBuilder rightFuzzyBussratio (List<String> rightFuzzyBussratio){
            this.rightFuzzyBussratio = rightFuzzyBussratio;
            return this;
        }

        public QueryBuilder rightFuzzyBussratio (String ... rightFuzzyBussratio){
            this.rightFuzzyBussratio = solveNullList(rightFuzzyBussratio);
            return this;
        }

        public QueryBuilder bussratio(String bussratio){
            setBussratio(bussratio);
            return this;
        }

        public QueryBuilder bussratioList(String ... bussratio){
            this.bussratioList = solveNullList(bussratio);
            return this;
        }

        public QueryBuilder bussratioList(List<String> bussratio){
            this.bussratioList = bussratio;
            return this;
        }

        public QueryBuilder fetchBussratio(){
            setFetchFields("fetchFields","bussratio");
            return this;
        }

        public QueryBuilder excludeBussratio(){
            setFetchFields("excludeFields","bussratio");
            return this;
        }

        public QueryBuilder fuzzyBussstatus (List<String> fuzzyBussstatus){
            this.fuzzyBussstatus = fuzzyBussstatus;
            return this;
        }

        public QueryBuilder fuzzyBussstatus (String ... fuzzyBussstatus){
            this.fuzzyBussstatus = solveNullList(fuzzyBussstatus);
            return this;
        }

        public QueryBuilder rightFuzzyBussstatus (List<String> rightFuzzyBussstatus){
            this.rightFuzzyBussstatus = rightFuzzyBussstatus;
            return this;
        }

        public QueryBuilder rightFuzzyBussstatus (String ... rightFuzzyBussstatus){
            this.rightFuzzyBussstatus = solveNullList(rightFuzzyBussstatus);
            return this;
        }

        public QueryBuilder bussstatus(String bussstatus){
            setBussstatus(bussstatus);
            return this;
        }

        public QueryBuilder bussstatusList(String ... bussstatus){
            this.bussstatusList = solveNullList(bussstatus);
            return this;
        }

        public QueryBuilder bussstatusList(List<String> bussstatus){
            this.bussstatusList = bussstatus;
            return this;
        }

        public QueryBuilder fetchBussstatus(){
            setFetchFields("fetchFields","bussstatus");
            return this;
        }

        public QueryBuilder excludeBussstatus(){
            setFetchFields("excludeFields","bussstatus");
            return this;
        }

        public QueryBuilder fuzzyUptime (List<String> fuzzyUptime){
            this.fuzzyUptime = fuzzyUptime;
            return this;
        }

        public QueryBuilder fuzzyUptime (String ... fuzzyUptime){
            this.fuzzyUptime = solveNullList(fuzzyUptime);
            return this;
        }

        public QueryBuilder rightFuzzyUptime (List<String> rightFuzzyUptime){
            this.rightFuzzyUptime = rightFuzzyUptime;
            return this;
        }

        public QueryBuilder rightFuzzyUptime (String ... rightFuzzyUptime){
            this.rightFuzzyUptime = solveNullList(rightFuzzyUptime);
            return this;
        }

        public QueryBuilder uptime(String uptime){
            setUptime(uptime);
            return this;
        }

        public QueryBuilder uptimeList(String ... uptime){
            this.uptimeList = solveNullList(uptime);
            return this;
        }

        public QueryBuilder uptimeList(List<String> uptime){
            this.uptimeList = uptime;
            return this;
        }

        public QueryBuilder fetchUptime(){
            setFetchFields("fetchFields","uptime");
            return this;
        }

        public QueryBuilder excludeUptime(){
            setFetchFields("excludeFields","uptime");
            return this;
        }

        public QueryBuilder fuzzyBussphone (List<String> fuzzyBussphone){
            this.fuzzyBussphone = fuzzyBussphone;
            return this;
        }

        public QueryBuilder fuzzyBussphone (String ... fuzzyBussphone){
            this.fuzzyBussphone = solveNullList(fuzzyBussphone);
            return this;
        }

        public QueryBuilder rightFuzzyBussphone (List<String> rightFuzzyBussphone){
            this.rightFuzzyBussphone = rightFuzzyBussphone;
            return this;
        }

        public QueryBuilder rightFuzzyBussphone (String ... rightFuzzyBussphone){
            this.rightFuzzyBussphone = solveNullList(rightFuzzyBussphone);
            return this;
        }

        public QueryBuilder bussphone(String bussphone){
            setBussphone(bussphone);
            return this;
        }

        public QueryBuilder bussphoneList(String ... bussphone){
            this.bussphoneList = solveNullList(bussphone);
            return this;
        }

        public QueryBuilder bussphoneList(List<String> bussphone){
            this.bussphoneList = bussphone;
            return this;
        }

        public QueryBuilder fetchBussphone(){
            setFetchFields("fetchFields","bussphone");
            return this;
        }

        public QueryBuilder excludeBussphone(){
            setFetchFields("excludeFields","bussphone");
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

        public JpyOrg build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> bussinessidList;

        public List<Integer> getBussinessidList(){return this.bussinessidList;}

        private Integer bussinessidSt;

        private Integer bussinessidEd;

        public Integer getBussinessidSt(){return this.bussinessidSt;}

        public Integer getBussinessidEd(){return this.bussinessidEd;}

        private List<String> bussinessnameList;

        public List<String> getBussinessnameList(){return this.bussinessnameList;}


        private List<String> fuzzyBussinessname;

        public List<String> getFuzzyBussinessname(){return this.fuzzyBussinessname;}

        private List<String> rightFuzzyBussinessname;

        public List<String> getRightFuzzyBussinessname(){return this.rightFuzzyBussinessname;}
        private List<String> addtimeList;

        public List<String> getAddtimeList(){return this.addtimeList;}


        private List<String> fuzzyAddtime;

        public List<String> getFuzzyAddtime(){return this.fuzzyAddtime;}

        private List<String> rightFuzzyAddtime;

        public List<String> getRightFuzzyAddtime(){return this.rightFuzzyAddtime;}
        private List<String> bussratioList;

        public List<String> getBussratioList(){return this.bussratioList;}


        private List<String> fuzzyBussratio;

        public List<String> getFuzzyBussratio(){return this.fuzzyBussratio;}

        private List<String> rightFuzzyBussratio;

        public List<String> getRightFuzzyBussratio(){return this.rightFuzzyBussratio;}
        private List<String> bussstatusList;

        public List<String> getBussstatusList(){return this.bussstatusList;}


        private List<String> fuzzyBussstatus;

        public List<String> getFuzzyBussstatus(){return this.fuzzyBussstatus;}

        private List<String> rightFuzzyBussstatus;

        public List<String> getRightFuzzyBussstatus(){return this.rightFuzzyBussstatus;}
        private List<String> uptimeList;

        public List<String> getUptimeList(){return this.uptimeList;}


        private List<String> fuzzyUptime;

        public List<String> getFuzzyUptime(){return this.fuzzyUptime;}

        private List<String> rightFuzzyUptime;

        public List<String> getRightFuzzyUptime(){return this.rightFuzzyUptime;}
        private List<String> bussphoneList;

        public List<String> getBussphoneList(){return this.bussphoneList;}


        private List<String> fuzzyBussphone;

        public List<String> getFuzzyBussphone(){return this.fuzzyBussphone;}

        private List<String> rightFuzzyBussphone;

        public List<String> getRightFuzzyBussphone(){return this.rightFuzzyBussphone;}

        public ConditionBuilder bussinessidBetWeen(Integer bussinessidSt,Integer bussinessidEd){
            this.bussinessidSt = bussinessidSt;
            this.bussinessidEd = bussinessidEd;
            return this;
        }

        public ConditionBuilder bussinessidGreaterEqThan(Integer bussinessidSt){
            this.bussinessidSt = bussinessidSt;
            return this;
        }
        public ConditionBuilder bussinessidLessEqThan(Integer bussinessidEd){
            this.bussinessidEd = bussinessidEd;
            return this;
        }


        public ConditionBuilder bussinessidList(Integer ... bussinessid){
            this.bussinessidList = solveNullList(bussinessid);
            return this;
        }

        public ConditionBuilder bussinessidList(List<Integer> bussinessid){
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

        public ConditionBuilder fuzzyAddtime (List<String> fuzzyAddtime){
            this.fuzzyAddtime = fuzzyAddtime;
            return this;
        }

        public ConditionBuilder fuzzyAddtime (String ... fuzzyAddtime){
            this.fuzzyAddtime = solveNullList(fuzzyAddtime);
            return this;
        }

        public ConditionBuilder rightFuzzyAddtime (List<String> rightFuzzyAddtime){
            this.rightFuzzyAddtime = rightFuzzyAddtime;
            return this;
        }

        public ConditionBuilder rightFuzzyAddtime (String ... rightFuzzyAddtime){
            this.rightFuzzyAddtime = solveNullList(rightFuzzyAddtime);
            return this;
        }

        public ConditionBuilder addtimeList(String ... addtime){
            this.addtimeList = solveNullList(addtime);
            return this;
        }

        public ConditionBuilder addtimeList(List<String> addtime){
            this.addtimeList = addtime;
            return this;
        }

        public ConditionBuilder fuzzyBussratio (List<String> fuzzyBussratio){
            this.fuzzyBussratio = fuzzyBussratio;
            return this;
        }

        public ConditionBuilder fuzzyBussratio (String ... fuzzyBussratio){
            this.fuzzyBussratio = solveNullList(fuzzyBussratio);
            return this;
        }

        public ConditionBuilder rightFuzzyBussratio (List<String> rightFuzzyBussratio){
            this.rightFuzzyBussratio = rightFuzzyBussratio;
            return this;
        }

        public ConditionBuilder rightFuzzyBussratio (String ... rightFuzzyBussratio){
            this.rightFuzzyBussratio = solveNullList(rightFuzzyBussratio);
            return this;
        }

        public ConditionBuilder bussratioList(String ... bussratio){
            this.bussratioList = solveNullList(bussratio);
            return this;
        }

        public ConditionBuilder bussratioList(List<String> bussratio){
            this.bussratioList = bussratio;
            return this;
        }

        public ConditionBuilder fuzzyBussstatus (List<String> fuzzyBussstatus){
            this.fuzzyBussstatus = fuzzyBussstatus;
            return this;
        }

        public ConditionBuilder fuzzyBussstatus (String ... fuzzyBussstatus){
            this.fuzzyBussstatus = solveNullList(fuzzyBussstatus);
            return this;
        }

        public ConditionBuilder rightFuzzyBussstatus (List<String> rightFuzzyBussstatus){
            this.rightFuzzyBussstatus = rightFuzzyBussstatus;
            return this;
        }

        public ConditionBuilder rightFuzzyBussstatus (String ... rightFuzzyBussstatus){
            this.rightFuzzyBussstatus = solveNullList(rightFuzzyBussstatus);
            return this;
        }

        public ConditionBuilder bussstatusList(String ... bussstatus){
            this.bussstatusList = solveNullList(bussstatus);
            return this;
        }

        public ConditionBuilder bussstatusList(List<String> bussstatus){
            this.bussstatusList = bussstatus;
            return this;
        }

        public ConditionBuilder fuzzyUptime (List<String> fuzzyUptime){
            this.fuzzyUptime = fuzzyUptime;
            return this;
        }

        public ConditionBuilder fuzzyUptime (String ... fuzzyUptime){
            this.fuzzyUptime = solveNullList(fuzzyUptime);
            return this;
        }

        public ConditionBuilder rightFuzzyUptime (List<String> rightFuzzyUptime){
            this.rightFuzzyUptime = rightFuzzyUptime;
            return this;
        }

        public ConditionBuilder rightFuzzyUptime (String ... rightFuzzyUptime){
            this.rightFuzzyUptime = solveNullList(rightFuzzyUptime);
            return this;
        }

        public ConditionBuilder uptimeList(String ... uptime){
            this.uptimeList = solveNullList(uptime);
            return this;
        }

        public ConditionBuilder uptimeList(List<String> uptime){
            this.uptimeList = uptime;
            return this;
        }

        public ConditionBuilder fuzzyBussphone (List<String> fuzzyBussphone){
            this.fuzzyBussphone = fuzzyBussphone;
            return this;
        }

        public ConditionBuilder fuzzyBussphone (String ... fuzzyBussphone){
            this.fuzzyBussphone = solveNullList(fuzzyBussphone);
            return this;
        }

        public ConditionBuilder rightFuzzyBussphone (List<String> rightFuzzyBussphone){
            this.rightFuzzyBussphone = rightFuzzyBussphone;
            return this;
        }

        public ConditionBuilder rightFuzzyBussphone (String ... rightFuzzyBussphone){
            this.rightFuzzyBussphone = solveNullList(rightFuzzyBussphone);
            return this;
        }

        public ConditionBuilder bussphoneList(String ... bussphone){
            this.bussphoneList = solveNullList(bussphone);
            return this;
        }

        public ConditionBuilder bussphoneList(List<String> bussphone){
            this.bussphoneList = bussphone;
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

        private JpyOrg obj;

        public Builder(){
            this.obj = new JpyOrg();
        }

        public Builder bussinessid(Integer bussinessid){
            this.obj.setBussinessid(bussinessid);
            return this;
        }
        public Builder bussinessname(String bussinessname){
            this.obj.setBussinessname(bussinessname);
            return this;
        }
        public Builder addtime(String addtime){
            this.obj.setAddtime(addtime);
            return this;
        }
        public Builder bussratio(String bussratio){
            this.obj.setBussratio(bussratio);
            return this;
        }
        public Builder bussstatus(String bussstatus){
            this.obj.setBussstatus(bussstatus);
            return this;
        }
        public Builder uptime(String uptime){
            this.obj.setUptime(uptime);
            return this;
        }
        public Builder bussphone(String bussphone){
            this.obj.setBussphone(bussphone);
            return this;
        }
        public JpyOrg build(){return obj;}
    }

}
