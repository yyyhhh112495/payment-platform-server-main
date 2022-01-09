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
public class JpyCount implements Serializable {

    private static final long serialVersionUID = 1640071188981L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer countid;

    /**
    * 
    * isNullAble:1
    */
    private String countname;

    /**
    * 
    * isNullAble:1
    */
    private String countnum;

    /**
    * 
    * isNullAble:1
    */
    private String alipayration;

    /**
    * 
    * isNullAble:1
    */
    private String wechatration;

    /**
    * 状态1-使用中 0-停用 只能有一个账户处于1
    * isNullAble:1
    */
    private String countsts;

    /**
    * 
    * isNullAble:1
    */
    private String countminnum;

    /**
    * 
    * isNullAble:1
    */
    private String countmaxnum;

    /**
    * 
    * isNullAble:1
    */
    private String counttime;

    /**
    * 
    * isNullAble:1
    */
    private String countuptime;

    /**
    * 
    * isNullAble:1
    */
    private String alipayprikey;

    /**
    * 
    * isNullAble:1
    */
    private String alipaypukey;

    /**
    * 
    * isNullAble:1
    */
    private String aliappid;

    /**
    * 
    * isNullAble:1
    */
    private String wechatappid;

    /**
    * 
    * isNullAble:1
    */
    private String wechatkey;

    /**
    * 
    * isNullAble:1
    */
    private String wechatmchid;

    /**
    * 
    * isNullAble:1
    */
    private String alipaycertpath;

    /**
    * 
    * isNullAble:1
    */
    private String alipaypubliccertpath;

    /**
    * 
    * isNullAble:1
    */
    private String alipayrootcertpath;

    /**
    * 
    * isNullAble:1
    */
    private String wechatmchno;

    /**
    * 
    * isNullAble:1
    */
    private String wechatprivatekey;


    public void setCountid(Integer countid){this.countid = countid;}

    public Integer getCountid(){return this.countid;}

    public void setCountname(String countname){this.countname = countname;}

    public String getCountname(){return this.countname;}

    public void setCountnum(String countnum){this.countnum = countnum;}

    public String getCountnum(){return this.countnum;}

    public void setAlipayration(String alipayration){this.alipayration = alipayration;}

    public String getAlipayration(){return this.alipayration;}

    public void setWechatration(String wechatration){this.wechatration = wechatration;}

    public String getWechatration(){return this.wechatration;}

    public void setCountsts(String countsts){this.countsts = countsts;}

    public String getCountsts(){return this.countsts;}

    public void setCountminnum(String countminnum){this.countminnum = countminnum;}

    public String getCountminnum(){return this.countminnum;}

    public void setCountmaxnum(String countmaxnum){this.countmaxnum = countmaxnum;}

    public String getCountmaxnum(){return this.countmaxnum;}

    public void setCounttime(String counttime){this.counttime = counttime;}

    public String getCounttime(){return this.counttime;}

    public void setCountuptime(String countuptime){this.countuptime = countuptime;}

    public String getCountuptime(){return this.countuptime;}

    public void setAlipayprikey(String alipayprikey){this.alipayprikey = alipayprikey;}

    public String getAlipayprikey(){return this.alipayprikey;}

    public void setAlipaypukey(String alipaypukey){this.alipaypukey = alipaypukey;}

    public String getAlipaypukey(){return this.alipaypukey;}

    public void setAliappid(String aliappid){this.aliappid = aliappid;}

    public String getAliappid(){return this.aliappid;}

    public void setWechatappid(String wechatappid){this.wechatappid = wechatappid;}

    public String getWechatappid(){return this.wechatappid;}

    public void setWechatkey(String wechatkey){this.wechatkey = wechatkey;}

    public String getWechatkey(){return this.wechatkey;}

    public void setWechatmchid(String wechatmchid){this.wechatmchid = wechatmchid;}

    public String getWechatmchid(){return this.wechatmchid;}

    public void setAlipaycertpath(String alipaycertpath){this.alipaycertpath = alipaycertpath;}

    public String getAlipaycertpath(){return this.alipaycertpath;}

    public void setAlipaypubliccertpath(String alipaypubliccertpath){this.alipaypubliccertpath = alipaypubliccertpath;}

    public String getAlipaypubliccertpath(){return this.alipaypubliccertpath;}

    public void setAlipayrootcertpath(String alipayrootcertpath){this.alipayrootcertpath = alipayrootcertpath;}

    public String getAlipayrootcertpath(){return this.alipayrootcertpath;}

    public void setWechatmchno(String wechatmchno){this.wechatmchno = wechatmchno;}

    public String getWechatmchno(){return this.wechatmchno;}

    public void setWechatprivatekey(String wechatprivatekey){this.wechatprivatekey = wechatprivatekey;}

    public String getWechatprivatekey(){return this.wechatprivatekey;}
    @Override
    public String toString() {
        return "JpyCount{" +
                "countid='" + countid + '\'' +
                "countname='" + countname + '\'' +
                "countnum='" + countnum + '\'' +
                "alipayration='" + alipayration + '\'' +
                "wechatration='" + wechatration + '\'' +
                "countsts='" + countsts + '\'' +
                "countminnum='" + countminnum + '\'' +
                "countmaxnum='" + countmaxnum + '\'' +
                "counttime='" + counttime + '\'' +
                "countuptime='" + countuptime + '\'' +
                "alipayprikey='" + alipayprikey + '\'' +
                "alipaypukey='" + alipaypukey + '\'' +
                "aliappid='" + aliappid + '\'' +
                "wechatappid='" + wechatappid + '\'' +
                "wechatkey='" + wechatkey + '\'' +
                "wechatmchid='" + wechatmchid + '\'' +
                "alipaycertpath='" + alipaycertpath + '\'' +
                "alipaypubliccertpath='" + alipaypubliccertpath + '\'' +
                "alipayrootcertpath='" + alipayrootcertpath + '\'' +
                "wechatmchno='" + wechatmchno + '\'' +
                "wechatprivatekey='" + wechatprivatekey + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyCount set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyCount set){
            this.set = set;
            return this;
        }

        public JpyCount getSet(){
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

    public static class QueryBuilder extends JpyCount{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> countidList;

        public List<Integer> getCountidList(){return this.countidList;}

        private Integer countidSt;

        private Integer countidEd;

        public Integer getCountidSt(){return this.countidSt;}

        public Integer getCountidEd(){return this.countidEd;}

        private List<String> countnameList;

        public List<String> getCountnameList(){return this.countnameList;}


        private List<String> fuzzyCountname;

        public List<String> getFuzzyCountname(){return this.fuzzyCountname;}

        private List<String> rightFuzzyCountname;

        public List<String> getRightFuzzyCountname(){return this.rightFuzzyCountname;}
        private List<String> countnumList;

        public List<String> getCountnumList(){return this.countnumList;}


        private List<String> fuzzyCountnum;

        public List<String> getFuzzyCountnum(){return this.fuzzyCountnum;}

        private List<String> rightFuzzyCountnum;

        public List<String> getRightFuzzyCountnum(){return this.rightFuzzyCountnum;}
        private List<String> alipayrationList;

        public List<String> getAlipayrationList(){return this.alipayrationList;}


        private List<String> fuzzyAlipayration;

        public List<String> getFuzzyAlipayration(){return this.fuzzyAlipayration;}

        private List<String> rightFuzzyAlipayration;

        public List<String> getRightFuzzyAlipayration(){return this.rightFuzzyAlipayration;}
        private List<String> wechatrationList;

        public List<String> getWechatrationList(){return this.wechatrationList;}


        private List<String> fuzzyWechatration;

        public List<String> getFuzzyWechatration(){return this.fuzzyWechatration;}

        private List<String> rightFuzzyWechatration;

        public List<String> getRightFuzzyWechatration(){return this.rightFuzzyWechatration;}
        private List<String> countstsList;

        public List<String> getCountstsList(){return this.countstsList;}


        private List<String> fuzzyCountsts;

        public List<String> getFuzzyCountsts(){return this.fuzzyCountsts;}

        private List<String> rightFuzzyCountsts;

        public List<String> getRightFuzzyCountsts(){return this.rightFuzzyCountsts;}
        private List<String> countminnumList;

        public List<String> getCountminnumList(){return this.countminnumList;}


        private List<String> fuzzyCountminnum;

        public List<String> getFuzzyCountminnum(){return this.fuzzyCountminnum;}

        private List<String> rightFuzzyCountminnum;

        public List<String> getRightFuzzyCountminnum(){return this.rightFuzzyCountminnum;}
        private List<String> countmaxnumList;

        public List<String> getCountmaxnumList(){return this.countmaxnumList;}


        private List<String> fuzzyCountmaxnum;

        public List<String> getFuzzyCountmaxnum(){return this.fuzzyCountmaxnum;}

        private List<String> rightFuzzyCountmaxnum;

        public List<String> getRightFuzzyCountmaxnum(){return this.rightFuzzyCountmaxnum;}
        private List<String> counttimeList;

        public List<String> getCounttimeList(){return this.counttimeList;}


        private List<String> fuzzyCounttime;

        public List<String> getFuzzyCounttime(){return this.fuzzyCounttime;}

        private List<String> rightFuzzyCounttime;

        public List<String> getRightFuzzyCounttime(){return this.rightFuzzyCounttime;}
        private List<String> countuptimeList;

        public List<String> getCountuptimeList(){return this.countuptimeList;}


        private List<String> fuzzyCountuptime;

        public List<String> getFuzzyCountuptime(){return this.fuzzyCountuptime;}

        private List<String> rightFuzzyCountuptime;

        public List<String> getRightFuzzyCountuptime(){return this.rightFuzzyCountuptime;}
        private List<String> alipayprikeyList;

        public List<String> getAlipayprikeyList(){return this.alipayprikeyList;}


        private List<String> fuzzyAlipayprikey;

        public List<String> getFuzzyAlipayprikey(){return this.fuzzyAlipayprikey;}

        private List<String> rightFuzzyAlipayprikey;

        public List<String> getRightFuzzyAlipayprikey(){return this.rightFuzzyAlipayprikey;}
        private List<String> alipaypukeyList;

        public List<String> getAlipaypukeyList(){return this.alipaypukeyList;}


        private List<String> fuzzyAlipaypukey;

        public List<String> getFuzzyAlipaypukey(){return this.fuzzyAlipaypukey;}

        private List<String> rightFuzzyAlipaypukey;

        public List<String> getRightFuzzyAlipaypukey(){return this.rightFuzzyAlipaypukey;}
        private List<String> aliappidList;

        public List<String> getAliappidList(){return this.aliappidList;}


        private List<String> fuzzyAliappid;

        public List<String> getFuzzyAliappid(){return this.fuzzyAliappid;}

        private List<String> rightFuzzyAliappid;

        public List<String> getRightFuzzyAliappid(){return this.rightFuzzyAliappid;}
        private List<String> wechatappidList;

        public List<String> getWechatappidList(){return this.wechatappidList;}


        private List<String> fuzzyWechatappid;

        public List<String> getFuzzyWechatappid(){return this.fuzzyWechatappid;}

        private List<String> rightFuzzyWechatappid;

        public List<String> getRightFuzzyWechatappid(){return this.rightFuzzyWechatappid;}
        private List<String> wechatkeyList;

        public List<String> getWechatkeyList(){return this.wechatkeyList;}


        private List<String> fuzzyWechatkey;

        public List<String> getFuzzyWechatkey(){return this.fuzzyWechatkey;}

        private List<String> rightFuzzyWechatkey;

        public List<String> getRightFuzzyWechatkey(){return this.rightFuzzyWechatkey;}
        private List<String> wechatmchidList;

        public List<String> getWechatmchidList(){return this.wechatmchidList;}


        private List<String> fuzzyWechatmchid;

        public List<String> getFuzzyWechatmchid(){return this.fuzzyWechatmchid;}

        private List<String> rightFuzzyWechatmchid;

        public List<String> getRightFuzzyWechatmchid(){return this.rightFuzzyWechatmchid;}
        private List<String> alipaycertpathList;

        public List<String> getAlipaycertpathList(){return this.alipaycertpathList;}


        private List<String> fuzzyAlipaycertpath;

        public List<String> getFuzzyAlipaycertpath(){return this.fuzzyAlipaycertpath;}

        private List<String> rightFuzzyAlipaycertpath;

        public List<String> getRightFuzzyAlipaycertpath(){return this.rightFuzzyAlipaycertpath;}
        private List<String> alipaypubliccertpathList;

        public List<String> getAlipaypubliccertpathList(){return this.alipaypubliccertpathList;}


        private List<String> fuzzyAlipaypubliccertpath;

        public List<String> getFuzzyAlipaypubliccertpath(){return this.fuzzyAlipaypubliccertpath;}

        private List<String> rightFuzzyAlipaypubliccertpath;

        public List<String> getRightFuzzyAlipaypubliccertpath(){return this.rightFuzzyAlipaypubliccertpath;}
        private List<String> alipayrootcertpathList;

        public List<String> getAlipayrootcertpathList(){return this.alipayrootcertpathList;}


        private List<String> fuzzyAlipayrootcertpath;

        public List<String> getFuzzyAlipayrootcertpath(){return this.fuzzyAlipayrootcertpath;}

        private List<String> rightFuzzyAlipayrootcertpath;

        public List<String> getRightFuzzyAlipayrootcertpath(){return this.rightFuzzyAlipayrootcertpath;}
        private List<String> wechatmchnoList;

        public List<String> getWechatmchnoList(){return this.wechatmchnoList;}


        private List<String> fuzzyWechatmchno;

        public List<String> getFuzzyWechatmchno(){return this.fuzzyWechatmchno;}

        private List<String> rightFuzzyWechatmchno;

        public List<String> getRightFuzzyWechatmchno(){return this.rightFuzzyWechatmchno;}
        private List<String> wechatprivatekeyList;

        public List<String> getWechatprivatekeyList(){return this.wechatprivatekeyList;}


        private List<String> fuzzyWechatprivatekey;

        public List<String> getFuzzyWechatprivatekey(){return this.fuzzyWechatprivatekey;}

        private List<String> rightFuzzyWechatprivatekey;

        public List<String> getRightFuzzyWechatprivatekey(){return this.rightFuzzyWechatprivatekey;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder countidBetWeen(Integer countidSt,Integer countidEd){
            this.countidSt = countidSt;
            this.countidEd = countidEd;
            return this;
        }

        public QueryBuilder countidGreaterEqThan(Integer countidSt){
            this.countidSt = countidSt;
            return this;
        }
        public QueryBuilder countidLessEqThan(Integer countidEd){
            this.countidEd = countidEd;
            return this;
        }


        public QueryBuilder countid(Integer countid){
            setCountid(countid);
            return this;
        }

        public QueryBuilder countidList(Integer ... countid){
            this.countidList = solveNullList(countid);
            return this;
        }

        public QueryBuilder countidList(List<Integer> countid){
            this.countidList = countid;
            return this;
        }

        public QueryBuilder fetchCountid(){
            setFetchFields("fetchFields","countid");
            return this;
        }

        public QueryBuilder excludeCountid(){
            setFetchFields("excludeFields","countid");
            return this;
        }

        public QueryBuilder fuzzyCountname (List<String> fuzzyCountname){
            this.fuzzyCountname = fuzzyCountname;
            return this;
        }

        public QueryBuilder fuzzyCountname (String ... fuzzyCountname){
            this.fuzzyCountname = solveNullList(fuzzyCountname);
            return this;
        }

        public QueryBuilder rightFuzzyCountname (List<String> rightFuzzyCountname){
            this.rightFuzzyCountname = rightFuzzyCountname;
            return this;
        }

        public QueryBuilder rightFuzzyCountname (String ... rightFuzzyCountname){
            this.rightFuzzyCountname = solveNullList(rightFuzzyCountname);
            return this;
        }

        public QueryBuilder countname(String countname){
            setCountname(countname);
            return this;
        }

        public QueryBuilder countnameList(String ... countname){
            this.countnameList = solveNullList(countname);
            return this;
        }

        public QueryBuilder countnameList(List<String> countname){
            this.countnameList = countname;
            return this;
        }

        public QueryBuilder fetchCountname(){
            setFetchFields("fetchFields","countname");
            return this;
        }

        public QueryBuilder excludeCountname(){
            setFetchFields("excludeFields","countname");
            return this;
        }

        public QueryBuilder fuzzyCountnum (List<String> fuzzyCountnum){
            this.fuzzyCountnum = fuzzyCountnum;
            return this;
        }

        public QueryBuilder fuzzyCountnum (String ... fuzzyCountnum){
            this.fuzzyCountnum = solveNullList(fuzzyCountnum);
            return this;
        }

        public QueryBuilder rightFuzzyCountnum (List<String> rightFuzzyCountnum){
            this.rightFuzzyCountnum = rightFuzzyCountnum;
            return this;
        }

        public QueryBuilder rightFuzzyCountnum (String ... rightFuzzyCountnum){
            this.rightFuzzyCountnum = solveNullList(rightFuzzyCountnum);
            return this;
        }

        public QueryBuilder countnum(String countnum){
            setCountnum(countnum);
            return this;
        }

        public QueryBuilder countnumList(String ... countnum){
            this.countnumList = solveNullList(countnum);
            return this;
        }

        public QueryBuilder countnumList(List<String> countnum){
            this.countnumList = countnum;
            return this;
        }

        public QueryBuilder fetchCountnum(){
            setFetchFields("fetchFields","countnum");
            return this;
        }

        public QueryBuilder excludeCountnum(){
            setFetchFields("excludeFields","countnum");
            return this;
        }

        public QueryBuilder fuzzyAlipayration (List<String> fuzzyAlipayration){
            this.fuzzyAlipayration = fuzzyAlipayration;
            return this;
        }

        public QueryBuilder fuzzyAlipayration (String ... fuzzyAlipayration){
            this.fuzzyAlipayration = solveNullList(fuzzyAlipayration);
            return this;
        }

        public QueryBuilder rightFuzzyAlipayration (List<String> rightFuzzyAlipayration){
            this.rightFuzzyAlipayration = rightFuzzyAlipayration;
            return this;
        }

        public QueryBuilder rightFuzzyAlipayration (String ... rightFuzzyAlipayration){
            this.rightFuzzyAlipayration = solveNullList(rightFuzzyAlipayration);
            return this;
        }

        public QueryBuilder alipayration(String alipayration){
            setAlipayration(alipayration);
            return this;
        }

        public QueryBuilder alipayrationList(String ... alipayration){
            this.alipayrationList = solveNullList(alipayration);
            return this;
        }

        public QueryBuilder alipayrationList(List<String> alipayration){
            this.alipayrationList = alipayration;
            return this;
        }

        public QueryBuilder fetchAlipayration(){
            setFetchFields("fetchFields","alipayration");
            return this;
        }

        public QueryBuilder excludeAlipayration(){
            setFetchFields("excludeFields","alipayration");
            return this;
        }

        public QueryBuilder fuzzyWechatration (List<String> fuzzyWechatration){
            this.fuzzyWechatration = fuzzyWechatration;
            return this;
        }

        public QueryBuilder fuzzyWechatration (String ... fuzzyWechatration){
            this.fuzzyWechatration = solveNullList(fuzzyWechatration);
            return this;
        }

        public QueryBuilder rightFuzzyWechatration (List<String> rightFuzzyWechatration){
            this.rightFuzzyWechatration = rightFuzzyWechatration;
            return this;
        }

        public QueryBuilder rightFuzzyWechatration (String ... rightFuzzyWechatration){
            this.rightFuzzyWechatration = solveNullList(rightFuzzyWechatration);
            return this;
        }

        public QueryBuilder wechatration(String wechatration){
            setWechatration(wechatration);
            return this;
        }

        public QueryBuilder wechatrationList(String ... wechatration){
            this.wechatrationList = solveNullList(wechatration);
            return this;
        }

        public QueryBuilder wechatrationList(List<String> wechatration){
            this.wechatrationList = wechatration;
            return this;
        }

        public QueryBuilder fetchWechatration(){
            setFetchFields("fetchFields","wechatration");
            return this;
        }

        public QueryBuilder excludeWechatration(){
            setFetchFields("excludeFields","wechatration");
            return this;
        }

        public QueryBuilder fuzzyCountsts (List<String> fuzzyCountsts){
            this.fuzzyCountsts = fuzzyCountsts;
            return this;
        }

        public QueryBuilder fuzzyCountsts (String ... fuzzyCountsts){
            this.fuzzyCountsts = solveNullList(fuzzyCountsts);
            return this;
        }

        public QueryBuilder rightFuzzyCountsts (List<String> rightFuzzyCountsts){
            this.rightFuzzyCountsts = rightFuzzyCountsts;
            return this;
        }

        public QueryBuilder rightFuzzyCountsts (String ... rightFuzzyCountsts){
            this.rightFuzzyCountsts = solveNullList(rightFuzzyCountsts);
            return this;
        }

        public QueryBuilder countsts(String countsts){
            setCountsts(countsts);
            return this;
        }

        public QueryBuilder countstsList(String ... countsts){
            this.countstsList = solveNullList(countsts);
            return this;
        }

        public QueryBuilder countstsList(List<String> countsts){
            this.countstsList = countsts;
            return this;
        }

        public QueryBuilder fetchCountsts(){
            setFetchFields("fetchFields","countsts");
            return this;
        }

        public QueryBuilder excludeCountsts(){
            setFetchFields("excludeFields","countsts");
            return this;
        }

        public QueryBuilder fuzzyCountminnum (List<String> fuzzyCountminnum){
            this.fuzzyCountminnum = fuzzyCountminnum;
            return this;
        }

        public QueryBuilder fuzzyCountminnum (String ... fuzzyCountminnum){
            this.fuzzyCountminnum = solveNullList(fuzzyCountminnum);
            return this;
        }

        public QueryBuilder rightFuzzyCountminnum (List<String> rightFuzzyCountminnum){
            this.rightFuzzyCountminnum = rightFuzzyCountminnum;
            return this;
        }

        public QueryBuilder rightFuzzyCountminnum (String ... rightFuzzyCountminnum){
            this.rightFuzzyCountminnum = solveNullList(rightFuzzyCountminnum);
            return this;
        }

        public QueryBuilder countminnum(String countminnum){
            setCountminnum(countminnum);
            return this;
        }

        public QueryBuilder countminnumList(String ... countminnum){
            this.countminnumList = solveNullList(countminnum);
            return this;
        }

        public QueryBuilder countminnumList(List<String> countminnum){
            this.countminnumList = countminnum;
            return this;
        }

        public QueryBuilder fetchCountminnum(){
            setFetchFields("fetchFields","countminnum");
            return this;
        }

        public QueryBuilder excludeCountminnum(){
            setFetchFields("excludeFields","countminnum");
            return this;
        }

        public QueryBuilder fuzzyCountmaxnum (List<String> fuzzyCountmaxnum){
            this.fuzzyCountmaxnum = fuzzyCountmaxnum;
            return this;
        }

        public QueryBuilder fuzzyCountmaxnum (String ... fuzzyCountmaxnum){
            this.fuzzyCountmaxnum = solveNullList(fuzzyCountmaxnum);
            return this;
        }

        public QueryBuilder rightFuzzyCountmaxnum (List<String> rightFuzzyCountmaxnum){
            this.rightFuzzyCountmaxnum = rightFuzzyCountmaxnum;
            return this;
        }

        public QueryBuilder rightFuzzyCountmaxnum (String ... rightFuzzyCountmaxnum){
            this.rightFuzzyCountmaxnum = solveNullList(rightFuzzyCountmaxnum);
            return this;
        }

        public QueryBuilder countmaxnum(String countmaxnum){
            setCountmaxnum(countmaxnum);
            return this;
        }

        public QueryBuilder countmaxnumList(String ... countmaxnum){
            this.countmaxnumList = solveNullList(countmaxnum);
            return this;
        }

        public QueryBuilder countmaxnumList(List<String> countmaxnum){
            this.countmaxnumList = countmaxnum;
            return this;
        }

        public QueryBuilder fetchCountmaxnum(){
            setFetchFields("fetchFields","countmaxnum");
            return this;
        }

        public QueryBuilder excludeCountmaxnum(){
            setFetchFields("excludeFields","countmaxnum");
            return this;
        }

        public QueryBuilder fuzzyCounttime (List<String> fuzzyCounttime){
            this.fuzzyCounttime = fuzzyCounttime;
            return this;
        }

        public QueryBuilder fuzzyCounttime (String ... fuzzyCounttime){
            this.fuzzyCounttime = solveNullList(fuzzyCounttime);
            return this;
        }

        public QueryBuilder rightFuzzyCounttime (List<String> rightFuzzyCounttime){
            this.rightFuzzyCounttime = rightFuzzyCounttime;
            return this;
        }

        public QueryBuilder rightFuzzyCounttime (String ... rightFuzzyCounttime){
            this.rightFuzzyCounttime = solveNullList(rightFuzzyCounttime);
            return this;
        }

        public QueryBuilder counttime(String counttime){
            setCounttime(counttime);
            return this;
        }

        public QueryBuilder counttimeList(String ... counttime){
            this.counttimeList = solveNullList(counttime);
            return this;
        }

        public QueryBuilder counttimeList(List<String> counttime){
            this.counttimeList = counttime;
            return this;
        }

        public QueryBuilder fetchCounttime(){
            setFetchFields("fetchFields","counttime");
            return this;
        }

        public QueryBuilder excludeCounttime(){
            setFetchFields("excludeFields","counttime");
            return this;
        }

        public QueryBuilder fuzzyCountuptime (List<String> fuzzyCountuptime){
            this.fuzzyCountuptime = fuzzyCountuptime;
            return this;
        }

        public QueryBuilder fuzzyCountuptime (String ... fuzzyCountuptime){
            this.fuzzyCountuptime = solveNullList(fuzzyCountuptime);
            return this;
        }

        public QueryBuilder rightFuzzyCountuptime (List<String> rightFuzzyCountuptime){
            this.rightFuzzyCountuptime = rightFuzzyCountuptime;
            return this;
        }

        public QueryBuilder rightFuzzyCountuptime (String ... rightFuzzyCountuptime){
            this.rightFuzzyCountuptime = solveNullList(rightFuzzyCountuptime);
            return this;
        }

        public QueryBuilder countuptime(String countuptime){
            setCountuptime(countuptime);
            return this;
        }

        public QueryBuilder countuptimeList(String ... countuptime){
            this.countuptimeList = solveNullList(countuptime);
            return this;
        }

        public QueryBuilder countuptimeList(List<String> countuptime){
            this.countuptimeList = countuptime;
            return this;
        }

        public QueryBuilder fetchCountuptime(){
            setFetchFields("fetchFields","countuptime");
            return this;
        }

        public QueryBuilder excludeCountuptime(){
            setFetchFields("excludeFields","countuptime");
            return this;
        }

        public QueryBuilder fuzzyAlipayprikey (List<String> fuzzyAlipayprikey){
            this.fuzzyAlipayprikey = fuzzyAlipayprikey;
            return this;
        }

        public QueryBuilder fuzzyAlipayprikey (String ... fuzzyAlipayprikey){
            this.fuzzyAlipayprikey = solveNullList(fuzzyAlipayprikey);
            return this;
        }

        public QueryBuilder rightFuzzyAlipayprikey (List<String> rightFuzzyAlipayprikey){
            this.rightFuzzyAlipayprikey = rightFuzzyAlipayprikey;
            return this;
        }

        public QueryBuilder rightFuzzyAlipayprikey (String ... rightFuzzyAlipayprikey){
            this.rightFuzzyAlipayprikey = solveNullList(rightFuzzyAlipayprikey);
            return this;
        }

        public QueryBuilder alipayprikey(String alipayprikey){
            setAlipayprikey(alipayprikey);
            return this;
        }

        public QueryBuilder alipayprikeyList(String ... alipayprikey){
            this.alipayprikeyList = solveNullList(alipayprikey);
            return this;
        }

        public QueryBuilder alipayprikeyList(List<String> alipayprikey){
            this.alipayprikeyList = alipayprikey;
            return this;
        }

        public QueryBuilder fetchAlipayprikey(){
            setFetchFields("fetchFields","alipayprikey");
            return this;
        }

        public QueryBuilder excludeAlipayprikey(){
            setFetchFields("excludeFields","alipayprikey");
            return this;
        }

        public QueryBuilder fuzzyAlipaypukey (List<String> fuzzyAlipaypukey){
            this.fuzzyAlipaypukey = fuzzyAlipaypukey;
            return this;
        }

        public QueryBuilder fuzzyAlipaypukey (String ... fuzzyAlipaypukey){
            this.fuzzyAlipaypukey = solveNullList(fuzzyAlipaypukey);
            return this;
        }

        public QueryBuilder rightFuzzyAlipaypukey (List<String> rightFuzzyAlipaypukey){
            this.rightFuzzyAlipaypukey = rightFuzzyAlipaypukey;
            return this;
        }

        public QueryBuilder rightFuzzyAlipaypukey (String ... rightFuzzyAlipaypukey){
            this.rightFuzzyAlipaypukey = solveNullList(rightFuzzyAlipaypukey);
            return this;
        }

        public QueryBuilder alipaypukey(String alipaypukey){
            setAlipaypukey(alipaypukey);
            return this;
        }

        public QueryBuilder alipaypukeyList(String ... alipaypukey){
            this.alipaypukeyList = solveNullList(alipaypukey);
            return this;
        }

        public QueryBuilder alipaypukeyList(List<String> alipaypukey){
            this.alipaypukeyList = alipaypukey;
            return this;
        }

        public QueryBuilder fetchAlipaypukey(){
            setFetchFields("fetchFields","alipaypukey");
            return this;
        }

        public QueryBuilder excludeAlipaypukey(){
            setFetchFields("excludeFields","alipaypukey");
            return this;
        }

        public QueryBuilder fuzzyAliappid (List<String> fuzzyAliappid){
            this.fuzzyAliappid = fuzzyAliappid;
            return this;
        }

        public QueryBuilder fuzzyAliappid (String ... fuzzyAliappid){
            this.fuzzyAliappid = solveNullList(fuzzyAliappid);
            return this;
        }

        public QueryBuilder rightFuzzyAliappid (List<String> rightFuzzyAliappid){
            this.rightFuzzyAliappid = rightFuzzyAliappid;
            return this;
        }

        public QueryBuilder rightFuzzyAliappid (String ... rightFuzzyAliappid){
            this.rightFuzzyAliappid = solveNullList(rightFuzzyAliappid);
            return this;
        }

        public QueryBuilder aliappid(String aliappid){
            setAliappid(aliappid);
            return this;
        }

        public QueryBuilder aliappidList(String ... aliappid){
            this.aliappidList = solveNullList(aliappid);
            return this;
        }

        public QueryBuilder aliappidList(List<String> aliappid){
            this.aliappidList = aliappid;
            return this;
        }

        public QueryBuilder fetchAliappid(){
            setFetchFields("fetchFields","aliappid");
            return this;
        }

        public QueryBuilder excludeAliappid(){
            setFetchFields("excludeFields","aliappid");
            return this;
        }

        public QueryBuilder fuzzyWechatappid (List<String> fuzzyWechatappid){
            this.fuzzyWechatappid = fuzzyWechatappid;
            return this;
        }

        public QueryBuilder fuzzyWechatappid (String ... fuzzyWechatappid){
            this.fuzzyWechatappid = solveNullList(fuzzyWechatappid);
            return this;
        }

        public QueryBuilder rightFuzzyWechatappid (List<String> rightFuzzyWechatappid){
            this.rightFuzzyWechatappid = rightFuzzyWechatappid;
            return this;
        }

        public QueryBuilder rightFuzzyWechatappid (String ... rightFuzzyWechatappid){
            this.rightFuzzyWechatappid = solveNullList(rightFuzzyWechatappid);
            return this;
        }

        public QueryBuilder wechatappid(String wechatappid){
            setWechatappid(wechatappid);
            return this;
        }

        public QueryBuilder wechatappidList(String ... wechatappid){
            this.wechatappidList = solveNullList(wechatappid);
            return this;
        }

        public QueryBuilder wechatappidList(List<String> wechatappid){
            this.wechatappidList = wechatappid;
            return this;
        }

        public QueryBuilder fetchWechatappid(){
            setFetchFields("fetchFields","wechatappid");
            return this;
        }

        public QueryBuilder excludeWechatappid(){
            setFetchFields("excludeFields","wechatappid");
            return this;
        }

        public QueryBuilder fuzzyWechatkey (List<String> fuzzyWechatkey){
            this.fuzzyWechatkey = fuzzyWechatkey;
            return this;
        }

        public QueryBuilder fuzzyWechatkey (String ... fuzzyWechatkey){
            this.fuzzyWechatkey = solveNullList(fuzzyWechatkey);
            return this;
        }

        public QueryBuilder rightFuzzyWechatkey (List<String> rightFuzzyWechatkey){
            this.rightFuzzyWechatkey = rightFuzzyWechatkey;
            return this;
        }

        public QueryBuilder rightFuzzyWechatkey (String ... rightFuzzyWechatkey){
            this.rightFuzzyWechatkey = solveNullList(rightFuzzyWechatkey);
            return this;
        }

        public QueryBuilder wechatkey(String wechatkey){
            setWechatkey(wechatkey);
            return this;
        }

        public QueryBuilder wechatkeyList(String ... wechatkey){
            this.wechatkeyList = solveNullList(wechatkey);
            return this;
        }

        public QueryBuilder wechatkeyList(List<String> wechatkey){
            this.wechatkeyList = wechatkey;
            return this;
        }

        public QueryBuilder fetchWechatkey(){
            setFetchFields("fetchFields","wechatkey");
            return this;
        }

        public QueryBuilder excludeWechatkey(){
            setFetchFields("excludeFields","wechatkey");
            return this;
        }

        public QueryBuilder fuzzyWechatmchid (List<String> fuzzyWechatmchid){
            this.fuzzyWechatmchid = fuzzyWechatmchid;
            return this;
        }

        public QueryBuilder fuzzyWechatmchid (String ... fuzzyWechatmchid){
            this.fuzzyWechatmchid = solveNullList(fuzzyWechatmchid);
            return this;
        }

        public QueryBuilder rightFuzzyWechatmchid (List<String> rightFuzzyWechatmchid){
            this.rightFuzzyWechatmchid = rightFuzzyWechatmchid;
            return this;
        }

        public QueryBuilder rightFuzzyWechatmchid (String ... rightFuzzyWechatmchid){
            this.rightFuzzyWechatmchid = solveNullList(rightFuzzyWechatmchid);
            return this;
        }

        public QueryBuilder wechatmchid(String wechatmchid){
            setWechatmchid(wechatmchid);
            return this;
        }

        public QueryBuilder wechatmchidList(String ... wechatmchid){
            this.wechatmchidList = solveNullList(wechatmchid);
            return this;
        }

        public QueryBuilder wechatmchidList(List<String> wechatmchid){
            this.wechatmchidList = wechatmchid;
            return this;
        }

        public QueryBuilder fetchWechatmchid(){
            setFetchFields("fetchFields","wechatmchid");
            return this;
        }

        public QueryBuilder excludeWechatmchid(){
            setFetchFields("excludeFields","wechatmchid");
            return this;
        }

        public QueryBuilder fuzzyAlipaycertpath (List<String> fuzzyAlipaycertpath){
            this.fuzzyAlipaycertpath = fuzzyAlipaycertpath;
            return this;
        }

        public QueryBuilder fuzzyAlipaycertpath (String ... fuzzyAlipaycertpath){
            this.fuzzyAlipaycertpath = solveNullList(fuzzyAlipaycertpath);
            return this;
        }

        public QueryBuilder rightFuzzyAlipaycertpath (List<String> rightFuzzyAlipaycertpath){
            this.rightFuzzyAlipaycertpath = rightFuzzyAlipaycertpath;
            return this;
        }

        public QueryBuilder rightFuzzyAlipaycertpath (String ... rightFuzzyAlipaycertpath){
            this.rightFuzzyAlipaycertpath = solveNullList(rightFuzzyAlipaycertpath);
            return this;
        }

        public QueryBuilder alipaycertpath(String alipaycertpath){
            setAlipaycertpath(alipaycertpath);
            return this;
        }

        public QueryBuilder alipaycertpathList(String ... alipaycertpath){
            this.alipaycertpathList = solveNullList(alipaycertpath);
            return this;
        }

        public QueryBuilder alipaycertpathList(List<String> alipaycertpath){
            this.alipaycertpathList = alipaycertpath;
            return this;
        }

        public QueryBuilder fetchAlipaycertpath(){
            setFetchFields("fetchFields","alipaycertpath");
            return this;
        }

        public QueryBuilder excludeAlipaycertpath(){
            setFetchFields("excludeFields","alipaycertpath");
            return this;
        }

        public QueryBuilder fuzzyAlipaypubliccertpath (List<String> fuzzyAlipaypubliccertpath){
            this.fuzzyAlipaypubliccertpath = fuzzyAlipaypubliccertpath;
            return this;
        }

        public QueryBuilder fuzzyAlipaypubliccertpath (String ... fuzzyAlipaypubliccertpath){
            this.fuzzyAlipaypubliccertpath = solveNullList(fuzzyAlipaypubliccertpath);
            return this;
        }

        public QueryBuilder rightFuzzyAlipaypubliccertpath (List<String> rightFuzzyAlipaypubliccertpath){
            this.rightFuzzyAlipaypubliccertpath = rightFuzzyAlipaypubliccertpath;
            return this;
        }

        public QueryBuilder rightFuzzyAlipaypubliccertpath (String ... rightFuzzyAlipaypubliccertpath){
            this.rightFuzzyAlipaypubliccertpath = solveNullList(rightFuzzyAlipaypubliccertpath);
            return this;
        }

        public QueryBuilder alipaypubliccertpath(String alipaypubliccertpath){
            setAlipaypubliccertpath(alipaypubliccertpath);
            return this;
        }

        public QueryBuilder alipaypubliccertpathList(String ... alipaypubliccertpath){
            this.alipaypubliccertpathList = solveNullList(alipaypubliccertpath);
            return this;
        }

        public QueryBuilder alipaypubliccertpathList(List<String> alipaypubliccertpath){
            this.alipaypubliccertpathList = alipaypubliccertpath;
            return this;
        }

        public QueryBuilder fetchAlipaypubliccertpath(){
            setFetchFields("fetchFields","alipaypubliccertpath");
            return this;
        }

        public QueryBuilder excludeAlipaypubliccertpath(){
            setFetchFields("excludeFields","alipaypubliccertpath");
            return this;
        }

        public QueryBuilder fuzzyAlipayrootcertpath (List<String> fuzzyAlipayrootcertpath){
            this.fuzzyAlipayrootcertpath = fuzzyAlipayrootcertpath;
            return this;
        }

        public QueryBuilder fuzzyAlipayrootcertpath (String ... fuzzyAlipayrootcertpath){
            this.fuzzyAlipayrootcertpath = solveNullList(fuzzyAlipayrootcertpath);
            return this;
        }

        public QueryBuilder rightFuzzyAlipayrootcertpath (List<String> rightFuzzyAlipayrootcertpath){
            this.rightFuzzyAlipayrootcertpath = rightFuzzyAlipayrootcertpath;
            return this;
        }

        public QueryBuilder rightFuzzyAlipayrootcertpath (String ... rightFuzzyAlipayrootcertpath){
            this.rightFuzzyAlipayrootcertpath = solveNullList(rightFuzzyAlipayrootcertpath);
            return this;
        }

        public QueryBuilder alipayrootcertpath(String alipayrootcertpath){
            setAlipayrootcertpath(alipayrootcertpath);
            return this;
        }

        public QueryBuilder alipayrootcertpathList(String ... alipayrootcertpath){
            this.alipayrootcertpathList = solveNullList(alipayrootcertpath);
            return this;
        }

        public QueryBuilder alipayrootcertpathList(List<String> alipayrootcertpath){
            this.alipayrootcertpathList = alipayrootcertpath;
            return this;
        }

        public QueryBuilder fetchAlipayrootcertpath(){
            setFetchFields("fetchFields","alipayrootcertpath");
            return this;
        }

        public QueryBuilder excludeAlipayrootcertpath(){
            setFetchFields("excludeFields","alipayrootcertpath");
            return this;
        }

        public QueryBuilder fuzzyWechatmchno (List<String> fuzzyWechatmchno){
            this.fuzzyWechatmchno = fuzzyWechatmchno;
            return this;
        }

        public QueryBuilder fuzzyWechatmchno (String ... fuzzyWechatmchno){
            this.fuzzyWechatmchno = solveNullList(fuzzyWechatmchno);
            return this;
        }

        public QueryBuilder rightFuzzyWechatmchno (List<String> rightFuzzyWechatmchno){
            this.rightFuzzyWechatmchno = rightFuzzyWechatmchno;
            return this;
        }

        public QueryBuilder rightFuzzyWechatmchno (String ... rightFuzzyWechatmchno){
            this.rightFuzzyWechatmchno = solveNullList(rightFuzzyWechatmchno);
            return this;
        }

        public QueryBuilder wechatmchno(String wechatmchno){
            setWechatmchno(wechatmchno);
            return this;
        }

        public QueryBuilder wechatmchnoList(String ... wechatmchno){
            this.wechatmchnoList = solveNullList(wechatmchno);
            return this;
        }

        public QueryBuilder wechatmchnoList(List<String> wechatmchno){
            this.wechatmchnoList = wechatmchno;
            return this;
        }

        public QueryBuilder fetchWechatmchno(){
            setFetchFields("fetchFields","wechatmchno");
            return this;
        }

        public QueryBuilder excludeWechatmchno(){
            setFetchFields("excludeFields","wechatmchno");
            return this;
        }

        public QueryBuilder fuzzyWechatprivatekey (List<String> fuzzyWechatprivatekey){
            this.fuzzyWechatprivatekey = fuzzyWechatprivatekey;
            return this;
        }

        public QueryBuilder fuzzyWechatprivatekey (String ... fuzzyWechatprivatekey){
            this.fuzzyWechatprivatekey = solveNullList(fuzzyWechatprivatekey);
            return this;
        }

        public QueryBuilder rightFuzzyWechatprivatekey (List<String> rightFuzzyWechatprivatekey){
            this.rightFuzzyWechatprivatekey = rightFuzzyWechatprivatekey;
            return this;
        }

        public QueryBuilder rightFuzzyWechatprivatekey (String ... rightFuzzyWechatprivatekey){
            this.rightFuzzyWechatprivatekey = solveNullList(rightFuzzyWechatprivatekey);
            return this;
        }

        public QueryBuilder wechatprivatekey(String wechatprivatekey){
            setWechatprivatekey(wechatprivatekey);
            return this;
        }

        public QueryBuilder wechatprivatekeyList(String ... wechatprivatekey){
            this.wechatprivatekeyList = solveNullList(wechatprivatekey);
            return this;
        }

        public QueryBuilder wechatprivatekeyList(List<String> wechatprivatekey){
            this.wechatprivatekeyList = wechatprivatekey;
            return this;
        }

        public QueryBuilder fetchWechatprivatekey(){
            setFetchFields("fetchFields","wechatprivatekey");
            return this;
        }

        public QueryBuilder excludeWechatprivatekey(){
            setFetchFields("excludeFields","wechatprivatekey");
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

        public JpyCount build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> countidList;

        public List<Integer> getCountidList(){return this.countidList;}

        private Integer countidSt;

        private Integer countidEd;

        public Integer getCountidSt(){return this.countidSt;}

        public Integer getCountidEd(){return this.countidEd;}

        private List<String> countnameList;

        public List<String> getCountnameList(){return this.countnameList;}


        private List<String> fuzzyCountname;

        public List<String> getFuzzyCountname(){return this.fuzzyCountname;}

        private List<String> rightFuzzyCountname;

        public List<String> getRightFuzzyCountname(){return this.rightFuzzyCountname;}
        private List<String> countnumList;

        public List<String> getCountnumList(){return this.countnumList;}


        private List<String> fuzzyCountnum;

        public List<String> getFuzzyCountnum(){return this.fuzzyCountnum;}

        private List<String> rightFuzzyCountnum;

        public List<String> getRightFuzzyCountnum(){return this.rightFuzzyCountnum;}
        private List<String> alipayrationList;

        public List<String> getAlipayrationList(){return this.alipayrationList;}


        private List<String> fuzzyAlipayration;

        public List<String> getFuzzyAlipayration(){return this.fuzzyAlipayration;}

        private List<String> rightFuzzyAlipayration;

        public List<String> getRightFuzzyAlipayration(){return this.rightFuzzyAlipayration;}
        private List<String> wechatrationList;

        public List<String> getWechatrationList(){return this.wechatrationList;}


        private List<String> fuzzyWechatration;

        public List<String> getFuzzyWechatration(){return this.fuzzyWechatration;}

        private List<String> rightFuzzyWechatration;

        public List<String> getRightFuzzyWechatration(){return this.rightFuzzyWechatration;}
        private List<String> countstsList;

        public List<String> getCountstsList(){return this.countstsList;}


        private List<String> fuzzyCountsts;

        public List<String> getFuzzyCountsts(){return this.fuzzyCountsts;}

        private List<String> rightFuzzyCountsts;

        public List<String> getRightFuzzyCountsts(){return this.rightFuzzyCountsts;}
        private List<String> countminnumList;

        public List<String> getCountminnumList(){return this.countminnumList;}


        private List<String> fuzzyCountminnum;

        public List<String> getFuzzyCountminnum(){return this.fuzzyCountminnum;}

        private List<String> rightFuzzyCountminnum;

        public List<String> getRightFuzzyCountminnum(){return this.rightFuzzyCountminnum;}
        private List<String> countmaxnumList;

        public List<String> getCountmaxnumList(){return this.countmaxnumList;}


        private List<String> fuzzyCountmaxnum;

        public List<String> getFuzzyCountmaxnum(){return this.fuzzyCountmaxnum;}

        private List<String> rightFuzzyCountmaxnum;

        public List<String> getRightFuzzyCountmaxnum(){return this.rightFuzzyCountmaxnum;}
        private List<String> counttimeList;

        public List<String> getCounttimeList(){return this.counttimeList;}


        private List<String> fuzzyCounttime;

        public List<String> getFuzzyCounttime(){return this.fuzzyCounttime;}

        private List<String> rightFuzzyCounttime;

        public List<String> getRightFuzzyCounttime(){return this.rightFuzzyCounttime;}
        private List<String> countuptimeList;

        public List<String> getCountuptimeList(){return this.countuptimeList;}


        private List<String> fuzzyCountuptime;

        public List<String> getFuzzyCountuptime(){return this.fuzzyCountuptime;}

        private List<String> rightFuzzyCountuptime;

        public List<String> getRightFuzzyCountuptime(){return this.rightFuzzyCountuptime;}
        private List<String> alipayprikeyList;

        public List<String> getAlipayprikeyList(){return this.alipayprikeyList;}


        private List<String> fuzzyAlipayprikey;

        public List<String> getFuzzyAlipayprikey(){return this.fuzzyAlipayprikey;}

        private List<String> rightFuzzyAlipayprikey;

        public List<String> getRightFuzzyAlipayprikey(){return this.rightFuzzyAlipayprikey;}
        private List<String> alipaypukeyList;

        public List<String> getAlipaypukeyList(){return this.alipaypukeyList;}


        private List<String> fuzzyAlipaypukey;

        public List<String> getFuzzyAlipaypukey(){return this.fuzzyAlipaypukey;}

        private List<String> rightFuzzyAlipaypukey;

        public List<String> getRightFuzzyAlipaypukey(){return this.rightFuzzyAlipaypukey;}
        private List<String> aliappidList;

        public List<String> getAliappidList(){return this.aliappidList;}


        private List<String> fuzzyAliappid;

        public List<String> getFuzzyAliappid(){return this.fuzzyAliappid;}

        private List<String> rightFuzzyAliappid;

        public List<String> getRightFuzzyAliappid(){return this.rightFuzzyAliappid;}
        private List<String> wechatappidList;

        public List<String> getWechatappidList(){return this.wechatappidList;}


        private List<String> fuzzyWechatappid;

        public List<String> getFuzzyWechatappid(){return this.fuzzyWechatappid;}

        private List<String> rightFuzzyWechatappid;

        public List<String> getRightFuzzyWechatappid(){return this.rightFuzzyWechatappid;}
        private List<String> wechatkeyList;

        public List<String> getWechatkeyList(){return this.wechatkeyList;}


        private List<String> fuzzyWechatkey;

        public List<String> getFuzzyWechatkey(){return this.fuzzyWechatkey;}

        private List<String> rightFuzzyWechatkey;

        public List<String> getRightFuzzyWechatkey(){return this.rightFuzzyWechatkey;}
        private List<String> wechatmchidList;

        public List<String> getWechatmchidList(){return this.wechatmchidList;}


        private List<String> fuzzyWechatmchid;

        public List<String> getFuzzyWechatmchid(){return this.fuzzyWechatmchid;}

        private List<String> rightFuzzyWechatmchid;

        public List<String> getRightFuzzyWechatmchid(){return this.rightFuzzyWechatmchid;}
        private List<String> alipaycertpathList;

        public List<String> getAlipaycertpathList(){return this.alipaycertpathList;}


        private List<String> fuzzyAlipaycertpath;

        public List<String> getFuzzyAlipaycertpath(){return this.fuzzyAlipaycertpath;}

        private List<String> rightFuzzyAlipaycertpath;

        public List<String> getRightFuzzyAlipaycertpath(){return this.rightFuzzyAlipaycertpath;}
        private List<String> alipaypubliccertpathList;

        public List<String> getAlipaypubliccertpathList(){return this.alipaypubliccertpathList;}


        private List<String> fuzzyAlipaypubliccertpath;

        public List<String> getFuzzyAlipaypubliccertpath(){return this.fuzzyAlipaypubliccertpath;}

        private List<String> rightFuzzyAlipaypubliccertpath;

        public List<String> getRightFuzzyAlipaypubliccertpath(){return this.rightFuzzyAlipaypubliccertpath;}
        private List<String> alipayrootcertpathList;

        public List<String> getAlipayrootcertpathList(){return this.alipayrootcertpathList;}


        private List<String> fuzzyAlipayrootcertpath;

        public List<String> getFuzzyAlipayrootcertpath(){return this.fuzzyAlipayrootcertpath;}

        private List<String> rightFuzzyAlipayrootcertpath;

        public List<String> getRightFuzzyAlipayrootcertpath(){return this.rightFuzzyAlipayrootcertpath;}
        private List<String> wechatmchnoList;

        public List<String> getWechatmchnoList(){return this.wechatmchnoList;}


        private List<String> fuzzyWechatmchno;

        public List<String> getFuzzyWechatmchno(){return this.fuzzyWechatmchno;}

        private List<String> rightFuzzyWechatmchno;

        public List<String> getRightFuzzyWechatmchno(){return this.rightFuzzyWechatmchno;}
        private List<String> wechatprivatekeyList;

        public List<String> getWechatprivatekeyList(){return this.wechatprivatekeyList;}


        private List<String> fuzzyWechatprivatekey;

        public List<String> getFuzzyWechatprivatekey(){return this.fuzzyWechatprivatekey;}

        private List<String> rightFuzzyWechatprivatekey;

        public List<String> getRightFuzzyWechatprivatekey(){return this.rightFuzzyWechatprivatekey;}

        public ConditionBuilder countidBetWeen(Integer countidSt,Integer countidEd){
            this.countidSt = countidSt;
            this.countidEd = countidEd;
            return this;
        }

        public ConditionBuilder countidGreaterEqThan(Integer countidSt){
            this.countidSt = countidSt;
            return this;
        }
        public ConditionBuilder countidLessEqThan(Integer countidEd){
            this.countidEd = countidEd;
            return this;
        }


        public ConditionBuilder countidList(Integer ... countid){
            this.countidList = solveNullList(countid);
            return this;
        }

        public ConditionBuilder countidList(List<Integer> countid){
            this.countidList = countid;
            return this;
        }

        public ConditionBuilder fuzzyCountname (List<String> fuzzyCountname){
            this.fuzzyCountname = fuzzyCountname;
            return this;
        }

        public ConditionBuilder fuzzyCountname (String ... fuzzyCountname){
            this.fuzzyCountname = solveNullList(fuzzyCountname);
            return this;
        }

        public ConditionBuilder rightFuzzyCountname (List<String> rightFuzzyCountname){
            this.rightFuzzyCountname = rightFuzzyCountname;
            return this;
        }

        public ConditionBuilder rightFuzzyCountname (String ... rightFuzzyCountname){
            this.rightFuzzyCountname = solveNullList(rightFuzzyCountname);
            return this;
        }

        public ConditionBuilder countnameList(String ... countname){
            this.countnameList = solveNullList(countname);
            return this;
        }

        public ConditionBuilder countnameList(List<String> countname){
            this.countnameList = countname;
            return this;
        }

        public ConditionBuilder fuzzyCountnum (List<String> fuzzyCountnum){
            this.fuzzyCountnum = fuzzyCountnum;
            return this;
        }

        public ConditionBuilder fuzzyCountnum (String ... fuzzyCountnum){
            this.fuzzyCountnum = solveNullList(fuzzyCountnum);
            return this;
        }

        public ConditionBuilder rightFuzzyCountnum (List<String> rightFuzzyCountnum){
            this.rightFuzzyCountnum = rightFuzzyCountnum;
            return this;
        }

        public ConditionBuilder rightFuzzyCountnum (String ... rightFuzzyCountnum){
            this.rightFuzzyCountnum = solveNullList(rightFuzzyCountnum);
            return this;
        }

        public ConditionBuilder countnumList(String ... countnum){
            this.countnumList = solveNullList(countnum);
            return this;
        }

        public ConditionBuilder countnumList(List<String> countnum){
            this.countnumList = countnum;
            return this;
        }

        public ConditionBuilder fuzzyAlipayration (List<String> fuzzyAlipayration){
            this.fuzzyAlipayration = fuzzyAlipayration;
            return this;
        }

        public ConditionBuilder fuzzyAlipayration (String ... fuzzyAlipayration){
            this.fuzzyAlipayration = solveNullList(fuzzyAlipayration);
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayration (List<String> rightFuzzyAlipayration){
            this.rightFuzzyAlipayration = rightFuzzyAlipayration;
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayration (String ... rightFuzzyAlipayration){
            this.rightFuzzyAlipayration = solveNullList(rightFuzzyAlipayration);
            return this;
        }

        public ConditionBuilder alipayrationList(String ... alipayration){
            this.alipayrationList = solveNullList(alipayration);
            return this;
        }

        public ConditionBuilder alipayrationList(List<String> alipayration){
            this.alipayrationList = alipayration;
            return this;
        }

        public ConditionBuilder fuzzyWechatration (List<String> fuzzyWechatration){
            this.fuzzyWechatration = fuzzyWechatration;
            return this;
        }

        public ConditionBuilder fuzzyWechatration (String ... fuzzyWechatration){
            this.fuzzyWechatration = solveNullList(fuzzyWechatration);
            return this;
        }

        public ConditionBuilder rightFuzzyWechatration (List<String> rightFuzzyWechatration){
            this.rightFuzzyWechatration = rightFuzzyWechatration;
            return this;
        }

        public ConditionBuilder rightFuzzyWechatration (String ... rightFuzzyWechatration){
            this.rightFuzzyWechatration = solveNullList(rightFuzzyWechatration);
            return this;
        }

        public ConditionBuilder wechatrationList(String ... wechatration){
            this.wechatrationList = solveNullList(wechatration);
            return this;
        }

        public ConditionBuilder wechatrationList(List<String> wechatration){
            this.wechatrationList = wechatration;
            return this;
        }

        public ConditionBuilder fuzzyCountsts (List<String> fuzzyCountsts){
            this.fuzzyCountsts = fuzzyCountsts;
            return this;
        }

        public ConditionBuilder fuzzyCountsts (String ... fuzzyCountsts){
            this.fuzzyCountsts = solveNullList(fuzzyCountsts);
            return this;
        }

        public ConditionBuilder rightFuzzyCountsts (List<String> rightFuzzyCountsts){
            this.rightFuzzyCountsts = rightFuzzyCountsts;
            return this;
        }

        public ConditionBuilder rightFuzzyCountsts (String ... rightFuzzyCountsts){
            this.rightFuzzyCountsts = solveNullList(rightFuzzyCountsts);
            return this;
        }

        public ConditionBuilder countstsList(String ... countsts){
            this.countstsList = solveNullList(countsts);
            return this;
        }

        public ConditionBuilder countstsList(List<String> countsts){
            this.countstsList = countsts;
            return this;
        }

        public ConditionBuilder fuzzyCountminnum (List<String> fuzzyCountminnum){
            this.fuzzyCountminnum = fuzzyCountminnum;
            return this;
        }

        public ConditionBuilder fuzzyCountminnum (String ... fuzzyCountminnum){
            this.fuzzyCountminnum = solveNullList(fuzzyCountminnum);
            return this;
        }

        public ConditionBuilder rightFuzzyCountminnum (List<String> rightFuzzyCountminnum){
            this.rightFuzzyCountminnum = rightFuzzyCountminnum;
            return this;
        }

        public ConditionBuilder rightFuzzyCountminnum (String ... rightFuzzyCountminnum){
            this.rightFuzzyCountminnum = solveNullList(rightFuzzyCountminnum);
            return this;
        }

        public ConditionBuilder countminnumList(String ... countminnum){
            this.countminnumList = solveNullList(countminnum);
            return this;
        }

        public ConditionBuilder countminnumList(List<String> countminnum){
            this.countminnumList = countminnum;
            return this;
        }

        public ConditionBuilder fuzzyCountmaxnum (List<String> fuzzyCountmaxnum){
            this.fuzzyCountmaxnum = fuzzyCountmaxnum;
            return this;
        }

        public ConditionBuilder fuzzyCountmaxnum (String ... fuzzyCountmaxnum){
            this.fuzzyCountmaxnum = solveNullList(fuzzyCountmaxnum);
            return this;
        }

        public ConditionBuilder rightFuzzyCountmaxnum (List<String> rightFuzzyCountmaxnum){
            this.rightFuzzyCountmaxnum = rightFuzzyCountmaxnum;
            return this;
        }

        public ConditionBuilder rightFuzzyCountmaxnum (String ... rightFuzzyCountmaxnum){
            this.rightFuzzyCountmaxnum = solveNullList(rightFuzzyCountmaxnum);
            return this;
        }

        public ConditionBuilder countmaxnumList(String ... countmaxnum){
            this.countmaxnumList = solveNullList(countmaxnum);
            return this;
        }

        public ConditionBuilder countmaxnumList(List<String> countmaxnum){
            this.countmaxnumList = countmaxnum;
            return this;
        }

        public ConditionBuilder fuzzyCounttime (List<String> fuzzyCounttime){
            this.fuzzyCounttime = fuzzyCounttime;
            return this;
        }

        public ConditionBuilder fuzzyCounttime (String ... fuzzyCounttime){
            this.fuzzyCounttime = solveNullList(fuzzyCounttime);
            return this;
        }

        public ConditionBuilder rightFuzzyCounttime (List<String> rightFuzzyCounttime){
            this.rightFuzzyCounttime = rightFuzzyCounttime;
            return this;
        }

        public ConditionBuilder rightFuzzyCounttime (String ... rightFuzzyCounttime){
            this.rightFuzzyCounttime = solveNullList(rightFuzzyCounttime);
            return this;
        }

        public ConditionBuilder counttimeList(String ... counttime){
            this.counttimeList = solveNullList(counttime);
            return this;
        }

        public ConditionBuilder counttimeList(List<String> counttime){
            this.counttimeList = counttime;
            return this;
        }

        public ConditionBuilder fuzzyCountuptime (List<String> fuzzyCountuptime){
            this.fuzzyCountuptime = fuzzyCountuptime;
            return this;
        }

        public ConditionBuilder fuzzyCountuptime (String ... fuzzyCountuptime){
            this.fuzzyCountuptime = solveNullList(fuzzyCountuptime);
            return this;
        }

        public ConditionBuilder rightFuzzyCountuptime (List<String> rightFuzzyCountuptime){
            this.rightFuzzyCountuptime = rightFuzzyCountuptime;
            return this;
        }

        public ConditionBuilder rightFuzzyCountuptime (String ... rightFuzzyCountuptime){
            this.rightFuzzyCountuptime = solveNullList(rightFuzzyCountuptime);
            return this;
        }

        public ConditionBuilder countuptimeList(String ... countuptime){
            this.countuptimeList = solveNullList(countuptime);
            return this;
        }

        public ConditionBuilder countuptimeList(List<String> countuptime){
            this.countuptimeList = countuptime;
            return this;
        }

        public ConditionBuilder fuzzyAlipayprikey (List<String> fuzzyAlipayprikey){
            this.fuzzyAlipayprikey = fuzzyAlipayprikey;
            return this;
        }

        public ConditionBuilder fuzzyAlipayprikey (String ... fuzzyAlipayprikey){
            this.fuzzyAlipayprikey = solveNullList(fuzzyAlipayprikey);
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayprikey (List<String> rightFuzzyAlipayprikey){
            this.rightFuzzyAlipayprikey = rightFuzzyAlipayprikey;
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayprikey (String ... rightFuzzyAlipayprikey){
            this.rightFuzzyAlipayprikey = solveNullList(rightFuzzyAlipayprikey);
            return this;
        }

        public ConditionBuilder alipayprikeyList(String ... alipayprikey){
            this.alipayprikeyList = solveNullList(alipayprikey);
            return this;
        }

        public ConditionBuilder alipayprikeyList(List<String> alipayprikey){
            this.alipayprikeyList = alipayprikey;
            return this;
        }

        public ConditionBuilder fuzzyAlipaypukey (List<String> fuzzyAlipaypukey){
            this.fuzzyAlipaypukey = fuzzyAlipaypukey;
            return this;
        }

        public ConditionBuilder fuzzyAlipaypukey (String ... fuzzyAlipaypukey){
            this.fuzzyAlipaypukey = solveNullList(fuzzyAlipaypukey);
            return this;
        }

        public ConditionBuilder rightFuzzyAlipaypukey (List<String> rightFuzzyAlipaypukey){
            this.rightFuzzyAlipaypukey = rightFuzzyAlipaypukey;
            return this;
        }

        public ConditionBuilder rightFuzzyAlipaypukey (String ... rightFuzzyAlipaypukey){
            this.rightFuzzyAlipaypukey = solveNullList(rightFuzzyAlipaypukey);
            return this;
        }

        public ConditionBuilder alipaypukeyList(String ... alipaypukey){
            this.alipaypukeyList = solveNullList(alipaypukey);
            return this;
        }

        public ConditionBuilder alipaypukeyList(List<String> alipaypukey){
            this.alipaypukeyList = alipaypukey;
            return this;
        }

        public ConditionBuilder fuzzyAliappid (List<String> fuzzyAliappid){
            this.fuzzyAliappid = fuzzyAliappid;
            return this;
        }

        public ConditionBuilder fuzzyAliappid (String ... fuzzyAliappid){
            this.fuzzyAliappid = solveNullList(fuzzyAliappid);
            return this;
        }

        public ConditionBuilder rightFuzzyAliappid (List<String> rightFuzzyAliappid){
            this.rightFuzzyAliappid = rightFuzzyAliappid;
            return this;
        }

        public ConditionBuilder rightFuzzyAliappid (String ... rightFuzzyAliappid){
            this.rightFuzzyAliappid = solveNullList(rightFuzzyAliappid);
            return this;
        }

        public ConditionBuilder aliappidList(String ... aliappid){
            this.aliappidList = solveNullList(aliappid);
            return this;
        }

        public ConditionBuilder aliappidList(List<String> aliappid){
            this.aliappidList = aliappid;
            return this;
        }

        public ConditionBuilder fuzzyWechatappid (List<String> fuzzyWechatappid){
            this.fuzzyWechatappid = fuzzyWechatappid;
            return this;
        }

        public ConditionBuilder fuzzyWechatappid (String ... fuzzyWechatappid){
            this.fuzzyWechatappid = solveNullList(fuzzyWechatappid);
            return this;
        }

        public ConditionBuilder rightFuzzyWechatappid (List<String> rightFuzzyWechatappid){
            this.rightFuzzyWechatappid = rightFuzzyWechatappid;
            return this;
        }

        public ConditionBuilder rightFuzzyWechatappid (String ... rightFuzzyWechatappid){
            this.rightFuzzyWechatappid = solveNullList(rightFuzzyWechatappid);
            return this;
        }

        public ConditionBuilder wechatappidList(String ... wechatappid){
            this.wechatappidList = solveNullList(wechatappid);
            return this;
        }

        public ConditionBuilder wechatappidList(List<String> wechatappid){
            this.wechatappidList = wechatappid;
            return this;
        }

        public ConditionBuilder fuzzyWechatkey (List<String> fuzzyWechatkey){
            this.fuzzyWechatkey = fuzzyWechatkey;
            return this;
        }

        public ConditionBuilder fuzzyWechatkey (String ... fuzzyWechatkey){
            this.fuzzyWechatkey = solveNullList(fuzzyWechatkey);
            return this;
        }

        public ConditionBuilder rightFuzzyWechatkey (List<String> rightFuzzyWechatkey){
            this.rightFuzzyWechatkey = rightFuzzyWechatkey;
            return this;
        }

        public ConditionBuilder rightFuzzyWechatkey (String ... rightFuzzyWechatkey){
            this.rightFuzzyWechatkey = solveNullList(rightFuzzyWechatkey);
            return this;
        }

        public ConditionBuilder wechatkeyList(String ... wechatkey){
            this.wechatkeyList = solveNullList(wechatkey);
            return this;
        }

        public ConditionBuilder wechatkeyList(List<String> wechatkey){
            this.wechatkeyList = wechatkey;
            return this;
        }

        public ConditionBuilder fuzzyWechatmchid (List<String> fuzzyWechatmchid){
            this.fuzzyWechatmchid = fuzzyWechatmchid;
            return this;
        }

        public ConditionBuilder fuzzyWechatmchid (String ... fuzzyWechatmchid){
            this.fuzzyWechatmchid = solveNullList(fuzzyWechatmchid);
            return this;
        }

        public ConditionBuilder rightFuzzyWechatmchid (List<String> rightFuzzyWechatmchid){
            this.rightFuzzyWechatmchid = rightFuzzyWechatmchid;
            return this;
        }

        public ConditionBuilder rightFuzzyWechatmchid (String ... rightFuzzyWechatmchid){
            this.rightFuzzyWechatmchid = solveNullList(rightFuzzyWechatmchid);
            return this;
        }

        public ConditionBuilder wechatmchidList(String ... wechatmchid){
            this.wechatmchidList = solveNullList(wechatmchid);
            return this;
        }

        public ConditionBuilder wechatmchidList(List<String> wechatmchid){
            this.wechatmchidList = wechatmchid;
            return this;
        }

        public ConditionBuilder fuzzyAlipaycertpath (List<String> fuzzyAlipaycertpath){
            this.fuzzyAlipaycertpath = fuzzyAlipaycertpath;
            return this;
        }

        public ConditionBuilder fuzzyAlipaycertpath (String ... fuzzyAlipaycertpath){
            this.fuzzyAlipaycertpath = solveNullList(fuzzyAlipaycertpath);
            return this;
        }

        public ConditionBuilder rightFuzzyAlipaycertpath (List<String> rightFuzzyAlipaycertpath){
            this.rightFuzzyAlipaycertpath = rightFuzzyAlipaycertpath;
            return this;
        }

        public ConditionBuilder rightFuzzyAlipaycertpath (String ... rightFuzzyAlipaycertpath){
            this.rightFuzzyAlipaycertpath = solveNullList(rightFuzzyAlipaycertpath);
            return this;
        }

        public ConditionBuilder alipaycertpathList(String ... alipaycertpath){
            this.alipaycertpathList = solveNullList(alipaycertpath);
            return this;
        }

        public ConditionBuilder alipaycertpathList(List<String> alipaycertpath){
            this.alipaycertpathList = alipaycertpath;
            return this;
        }

        public ConditionBuilder fuzzyAlipaypubliccertpath (List<String> fuzzyAlipaypubliccertpath){
            this.fuzzyAlipaypubliccertpath = fuzzyAlipaypubliccertpath;
            return this;
        }

        public ConditionBuilder fuzzyAlipaypubliccertpath (String ... fuzzyAlipaypubliccertpath){
            this.fuzzyAlipaypubliccertpath = solveNullList(fuzzyAlipaypubliccertpath);
            return this;
        }

        public ConditionBuilder rightFuzzyAlipaypubliccertpath (List<String> rightFuzzyAlipaypubliccertpath){
            this.rightFuzzyAlipaypubliccertpath = rightFuzzyAlipaypubliccertpath;
            return this;
        }

        public ConditionBuilder rightFuzzyAlipaypubliccertpath (String ... rightFuzzyAlipaypubliccertpath){
            this.rightFuzzyAlipaypubliccertpath = solveNullList(rightFuzzyAlipaypubliccertpath);
            return this;
        }

        public ConditionBuilder alipaypubliccertpathList(String ... alipaypubliccertpath){
            this.alipaypubliccertpathList = solveNullList(alipaypubliccertpath);
            return this;
        }

        public ConditionBuilder alipaypubliccertpathList(List<String> alipaypubliccertpath){
            this.alipaypubliccertpathList = alipaypubliccertpath;
            return this;
        }

        public ConditionBuilder fuzzyAlipayrootcertpath (List<String> fuzzyAlipayrootcertpath){
            this.fuzzyAlipayrootcertpath = fuzzyAlipayrootcertpath;
            return this;
        }

        public ConditionBuilder fuzzyAlipayrootcertpath (String ... fuzzyAlipayrootcertpath){
            this.fuzzyAlipayrootcertpath = solveNullList(fuzzyAlipayrootcertpath);
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayrootcertpath (List<String> rightFuzzyAlipayrootcertpath){
            this.rightFuzzyAlipayrootcertpath = rightFuzzyAlipayrootcertpath;
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayrootcertpath (String ... rightFuzzyAlipayrootcertpath){
            this.rightFuzzyAlipayrootcertpath = solveNullList(rightFuzzyAlipayrootcertpath);
            return this;
        }

        public ConditionBuilder alipayrootcertpathList(String ... alipayrootcertpath){
            this.alipayrootcertpathList = solveNullList(alipayrootcertpath);
            return this;
        }

        public ConditionBuilder alipayrootcertpathList(List<String> alipayrootcertpath){
            this.alipayrootcertpathList = alipayrootcertpath;
            return this;
        }

        public ConditionBuilder fuzzyWechatmchno (List<String> fuzzyWechatmchno){
            this.fuzzyWechatmchno = fuzzyWechatmchno;
            return this;
        }

        public ConditionBuilder fuzzyWechatmchno (String ... fuzzyWechatmchno){
            this.fuzzyWechatmchno = solveNullList(fuzzyWechatmchno);
            return this;
        }

        public ConditionBuilder rightFuzzyWechatmchno (List<String> rightFuzzyWechatmchno){
            this.rightFuzzyWechatmchno = rightFuzzyWechatmchno;
            return this;
        }

        public ConditionBuilder rightFuzzyWechatmchno (String ... rightFuzzyWechatmchno){
            this.rightFuzzyWechatmchno = solveNullList(rightFuzzyWechatmchno);
            return this;
        }

        public ConditionBuilder wechatmchnoList(String ... wechatmchno){
            this.wechatmchnoList = solveNullList(wechatmchno);
            return this;
        }

        public ConditionBuilder wechatmchnoList(List<String> wechatmchno){
            this.wechatmchnoList = wechatmchno;
            return this;
        }

        public ConditionBuilder fuzzyWechatprivatekey (List<String> fuzzyWechatprivatekey){
            this.fuzzyWechatprivatekey = fuzzyWechatprivatekey;
            return this;
        }

        public ConditionBuilder fuzzyWechatprivatekey (String ... fuzzyWechatprivatekey){
            this.fuzzyWechatprivatekey = solveNullList(fuzzyWechatprivatekey);
            return this;
        }

        public ConditionBuilder rightFuzzyWechatprivatekey (List<String> rightFuzzyWechatprivatekey){
            this.rightFuzzyWechatprivatekey = rightFuzzyWechatprivatekey;
            return this;
        }

        public ConditionBuilder rightFuzzyWechatprivatekey (String ... rightFuzzyWechatprivatekey){
            this.rightFuzzyWechatprivatekey = solveNullList(rightFuzzyWechatprivatekey);
            return this;
        }

        public ConditionBuilder wechatprivatekeyList(String ... wechatprivatekey){
            this.wechatprivatekeyList = solveNullList(wechatprivatekey);
            return this;
        }

        public ConditionBuilder wechatprivatekeyList(List<String> wechatprivatekey){
            this.wechatprivatekeyList = wechatprivatekey;
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

        private JpyCount obj;

        public Builder(){
            this.obj = new JpyCount();
        }

        public Builder countid(Integer countid){
            this.obj.setCountid(countid);
            return this;
        }
        public Builder countname(String countname){
            this.obj.setCountname(countname);
            return this;
        }
        public Builder countnum(String countnum){
            this.obj.setCountnum(countnum);
            return this;
        }
        public Builder alipayration(String alipayration){
            this.obj.setAlipayration(alipayration);
            return this;
        }
        public Builder wechatration(String wechatration){
            this.obj.setWechatration(wechatration);
            return this;
        }
        public Builder countsts(String countsts){
            this.obj.setCountsts(countsts);
            return this;
        }
        public Builder countminnum(String countminnum){
            this.obj.setCountminnum(countminnum);
            return this;
        }
        public Builder countmaxnum(String countmaxnum){
            this.obj.setCountmaxnum(countmaxnum);
            return this;
        }
        public Builder counttime(String counttime){
            this.obj.setCounttime(counttime);
            return this;
        }
        public Builder countuptime(String countuptime){
            this.obj.setCountuptime(countuptime);
            return this;
        }
        public Builder alipayprikey(String alipayprikey){
            this.obj.setAlipayprikey(alipayprikey);
            return this;
        }
        public Builder alipaypukey(String alipaypukey){
            this.obj.setAlipaypukey(alipaypukey);
            return this;
        }
        public Builder aliappid(String aliappid){
            this.obj.setAliappid(aliappid);
            return this;
        }
        public Builder wechatappid(String wechatappid){
            this.obj.setWechatappid(wechatappid);
            return this;
        }
        public Builder wechatkey(String wechatkey){
            this.obj.setWechatkey(wechatkey);
            return this;
        }
        public Builder wechatmchid(String wechatmchid){
            this.obj.setWechatmchid(wechatmchid);
            return this;
        }
        public Builder alipaycertpath(String alipaycertpath){
            this.obj.setAlipaycertpath(alipaycertpath);
            return this;
        }
        public Builder alipaypubliccertpath(String alipaypubliccertpath){
            this.obj.setAlipaypubliccertpath(alipaypubliccertpath);
            return this;
        }
        public Builder alipayrootcertpath(String alipayrootcertpath){
            this.obj.setAlipayrootcertpath(alipayrootcertpath);
            return this;
        }
        public Builder wechatmchno(String wechatmchno){
            this.obj.setWechatmchno(wechatmchno);
            return this;
        }
        public Builder wechatprivatekey(String wechatprivatekey){
            this.obj.setWechatprivatekey(wechatprivatekey);
            return this;
        }
        public JpyCount build(){return obj;}
    }

}
