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
public class JpyUser implements Serializable {

    private static final long serialVersionUID = 1638499520060L;


    /**
    * 主键
    * 人员id
    * isNullAble:0
    */
    private Integer userid;

    /**
    * 人员名称
    * isNullAble:1
    */
    private String username;

    /**
    * 人员手机号
    * isNullAble:1
    */
    private String userphone;

    /**
    * 所属商户id
    * isNullAble:1
    */
    private String bussinessid;

    /**
    * 增加人员时间
    * isNullAble:1
    */
    private String addtime;

    /**
    * 登录密码
    * isNullAble:1
    */
    private String userpasswd;

    /**
    * 人员状态 1-正常 2-锁定
    * isNullAble:1
    */
    private String userstatus;

    /**
    * 错误密码输入次数
    * isNullAble:1
    */
    private String wrongnum;

    /**
    * z最近一次登录ip
    * isNullAble:1
    */
    private String latestlogip;

    /**
    * 最近一次登录时间
    * isNullAble:1
    */
    private String latesttime;


    public void setUserid(Integer userid){this.userid = userid;}

    public Integer getUserid(){return this.userid;}

    public void setUsername(String username){this.username = username;}

    public String getUsername(){return this.username;}

    public void setUserphone(String userphone){this.userphone = userphone;}

    public String getUserphone(){return this.userphone;}

    public void setBussinessid(String bussinessid){this.bussinessid = bussinessid;}

    public String getBussinessid(){return this.bussinessid;}

    public void setAddtime(String addtime){this.addtime = addtime;}

    public String getAddtime(){return this.addtime;}

    public void setUserpasswd(String userpasswd){this.userpasswd = userpasswd;}

    public String getUserpasswd(){return this.userpasswd;}

    public void setUserstatus(String userstatus){this.userstatus = userstatus;}

    public String getUserstatus(){return this.userstatus;}

    public void setWrongnum(String wrongnum){this.wrongnum = wrongnum;}

    public String getWrongnum(){return this.wrongnum;}

    public void setLatestlogip(String latestlogip){this.latestlogip = latestlogip;}

    public String getLatestlogip(){return this.latestlogip;}

    public void setLatesttime(String latesttime){this.latesttime = latesttime;}

    public String getLatesttime(){return this.latesttime;}
    @Override
    public String toString() {
        return "JpyUser{" +
                "userid='" + userid + '\'' +
                "username='" + username + '\'' +
                "userphone='" + userphone + '\'' +
                "bussinessid='" + bussinessid + '\'' +
                "addtime='" + addtime + '\'' +
                "userpasswd='" + userpasswd + '\'' +
                "userstatus='" + userstatus + '\'' +
                "wrongnum='" + wrongnum + '\'' +
                "latestlogip='" + latestlogip + '\'' +
                "latesttime='" + latesttime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyUser set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyUser set){
            this.set = set;
            return this;
        }

        public JpyUser getSet(){
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

    public static class QueryBuilder extends JpyUser{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> useridList;

        public List<Integer> getUseridList(){return this.useridList;}

        private Integer useridSt;

        private Integer useridEd;

        public Integer getUseridSt(){return this.useridSt;}

        public Integer getUseridEd(){return this.useridEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> userphoneList;

        public List<String> getUserphoneList(){return this.userphoneList;}


        private List<String> fuzzyUserphone;

        public List<String> getFuzzyUserphone(){return this.fuzzyUserphone;}

        private List<String> rightFuzzyUserphone;

        public List<String> getRightFuzzyUserphone(){return this.rightFuzzyUserphone;}
        private List<String> bussinessidList;

        public List<String> getBussinessidList(){return this.bussinessidList;}


        private List<String> fuzzyBussinessid;

        public List<String> getFuzzyBussinessid(){return this.fuzzyBussinessid;}

        private List<String> rightFuzzyBussinessid;

        public List<String> getRightFuzzyBussinessid(){return this.rightFuzzyBussinessid;}
        private List<String> addtimeList;

        public List<String> getAddtimeList(){return this.addtimeList;}


        private List<String> fuzzyAddtime;

        public List<String> getFuzzyAddtime(){return this.fuzzyAddtime;}

        private List<String> rightFuzzyAddtime;

        public List<String> getRightFuzzyAddtime(){return this.rightFuzzyAddtime;}
        private List<String> userpasswdList;

        public List<String> getUserpasswdList(){return this.userpasswdList;}


        private List<String> fuzzyUserpasswd;

        public List<String> getFuzzyUserpasswd(){return this.fuzzyUserpasswd;}

        private List<String> rightFuzzyUserpasswd;

        public List<String> getRightFuzzyUserpasswd(){return this.rightFuzzyUserpasswd;}
        private List<String> userstatusList;

        public List<String> getUserstatusList(){return this.userstatusList;}


        private List<String> fuzzyUserstatus;

        public List<String> getFuzzyUserstatus(){return this.fuzzyUserstatus;}

        private List<String> rightFuzzyUserstatus;

        public List<String> getRightFuzzyUserstatus(){return this.rightFuzzyUserstatus;}
        private List<String> wrongnumList;

        public List<String> getWrongnumList(){return this.wrongnumList;}


        private List<String> fuzzyWrongnum;

        public List<String> getFuzzyWrongnum(){return this.fuzzyWrongnum;}

        private List<String> rightFuzzyWrongnum;

        public List<String> getRightFuzzyWrongnum(){return this.rightFuzzyWrongnum;}
        private List<String> latestlogipList;

        public List<String> getLatestlogipList(){return this.latestlogipList;}


        private List<String> fuzzyLatestlogip;

        public List<String> getFuzzyLatestlogip(){return this.fuzzyLatestlogip;}

        private List<String> rightFuzzyLatestlogip;

        public List<String> getRightFuzzyLatestlogip(){return this.rightFuzzyLatestlogip;}
        private List<String> latesttimeList;

        public List<String> getLatesttimeList(){return this.latesttimeList;}


        private List<String> fuzzyLatesttime;

        public List<String> getFuzzyLatesttime(){return this.fuzzyLatesttime;}

        private List<String> rightFuzzyLatesttime;

        public List<String> getRightFuzzyLatesttime(){return this.rightFuzzyLatesttime;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder useridBetWeen(Integer useridSt,Integer useridEd){
            this.useridSt = useridSt;
            this.useridEd = useridEd;
            return this;
        }

        public QueryBuilder useridGreaterEqThan(Integer useridSt){
            this.useridSt = useridSt;
            return this;
        }
        public QueryBuilder useridLessEqThan(Integer useridEd){
            this.useridEd = useridEd;
            return this;
        }


        public QueryBuilder userid(Integer userid){
            setUserid(userid);
            return this;
        }

        public QueryBuilder useridList(Integer ... userid){
            this.useridList = solveNullList(userid);
            return this;
        }

        public QueryBuilder useridList(List<Integer> userid){
            this.useridList = userid;
            return this;
        }

        public QueryBuilder fetchUserid(){
            setFetchFields("fetchFields","userid");
            return this;
        }

        public QueryBuilder excludeUserid(){
            setFetchFields("excludeFields","userid");
            return this;
        }

        public QueryBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public QueryBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public QueryBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public QueryBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public QueryBuilder username(String username){
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public QueryBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername(){
            setFetchFields("fetchFields","username");
            return this;
        }

        public QueryBuilder excludeUsername(){
            setFetchFields("excludeFields","username");
            return this;
        }

        public QueryBuilder fuzzyUserphone (List<String> fuzzyUserphone){
            this.fuzzyUserphone = fuzzyUserphone;
            return this;
        }

        public QueryBuilder fuzzyUserphone (String ... fuzzyUserphone){
            this.fuzzyUserphone = solveNullList(fuzzyUserphone);
            return this;
        }

        public QueryBuilder rightFuzzyUserphone (List<String> rightFuzzyUserphone){
            this.rightFuzzyUserphone = rightFuzzyUserphone;
            return this;
        }

        public QueryBuilder rightFuzzyUserphone (String ... rightFuzzyUserphone){
            this.rightFuzzyUserphone = solveNullList(rightFuzzyUserphone);
            return this;
        }

        public QueryBuilder userphone(String userphone){
            setUserphone(userphone);
            return this;
        }

        public QueryBuilder userphoneList(String ... userphone){
            this.userphoneList = solveNullList(userphone);
            return this;
        }

        public QueryBuilder userphoneList(List<String> userphone){
            this.userphoneList = userphone;
            return this;
        }

        public QueryBuilder fetchUserphone(){
            setFetchFields("fetchFields","userphone");
            return this;
        }

        public QueryBuilder excludeUserphone(){
            setFetchFields("excludeFields","userphone");
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

        public QueryBuilder fuzzyUserpasswd (List<String> fuzzyUserpasswd){
            this.fuzzyUserpasswd = fuzzyUserpasswd;
            return this;
        }

        public QueryBuilder fuzzyUserpasswd (String ... fuzzyUserpasswd){
            this.fuzzyUserpasswd = solveNullList(fuzzyUserpasswd);
            return this;
        }

        public QueryBuilder rightFuzzyUserpasswd (List<String> rightFuzzyUserpasswd){
            this.rightFuzzyUserpasswd = rightFuzzyUserpasswd;
            return this;
        }

        public QueryBuilder rightFuzzyUserpasswd (String ... rightFuzzyUserpasswd){
            this.rightFuzzyUserpasswd = solveNullList(rightFuzzyUserpasswd);
            return this;
        }

        public QueryBuilder userpasswd(String userpasswd){
            setUserpasswd(userpasswd);
            return this;
        }

        public QueryBuilder userpasswdList(String ... userpasswd){
            this.userpasswdList = solveNullList(userpasswd);
            return this;
        }

        public QueryBuilder userpasswdList(List<String> userpasswd){
            this.userpasswdList = userpasswd;
            return this;
        }

        public QueryBuilder fetchUserpasswd(){
            setFetchFields("fetchFields","userpasswd");
            return this;
        }

        public QueryBuilder excludeUserpasswd(){
            setFetchFields("excludeFields","userpasswd");
            return this;
        }

        public QueryBuilder fuzzyUserstatus (List<String> fuzzyUserstatus){
            this.fuzzyUserstatus = fuzzyUserstatus;
            return this;
        }

        public QueryBuilder fuzzyUserstatus (String ... fuzzyUserstatus){
            this.fuzzyUserstatus = solveNullList(fuzzyUserstatus);
            return this;
        }

        public QueryBuilder rightFuzzyUserstatus (List<String> rightFuzzyUserstatus){
            this.rightFuzzyUserstatus = rightFuzzyUserstatus;
            return this;
        }

        public QueryBuilder rightFuzzyUserstatus (String ... rightFuzzyUserstatus){
            this.rightFuzzyUserstatus = solveNullList(rightFuzzyUserstatus);
            return this;
        }

        public QueryBuilder userstatus(String userstatus){
            setUserstatus(userstatus);
            return this;
        }

        public QueryBuilder userstatusList(String ... userstatus){
            this.userstatusList = solveNullList(userstatus);
            return this;
        }

        public QueryBuilder userstatusList(List<String> userstatus){
            this.userstatusList = userstatus;
            return this;
        }

        public QueryBuilder fetchUserstatus(){
            setFetchFields("fetchFields","userstatus");
            return this;
        }

        public QueryBuilder excludeUserstatus(){
            setFetchFields("excludeFields","userstatus");
            return this;
        }

        public QueryBuilder fuzzyWrongnum (List<String> fuzzyWrongnum){
            this.fuzzyWrongnum = fuzzyWrongnum;
            return this;
        }

        public QueryBuilder fuzzyWrongnum (String ... fuzzyWrongnum){
            this.fuzzyWrongnum = solveNullList(fuzzyWrongnum);
            return this;
        }

        public QueryBuilder rightFuzzyWrongnum (List<String> rightFuzzyWrongnum){
            this.rightFuzzyWrongnum = rightFuzzyWrongnum;
            return this;
        }

        public QueryBuilder rightFuzzyWrongnum (String ... rightFuzzyWrongnum){
            this.rightFuzzyWrongnum = solveNullList(rightFuzzyWrongnum);
            return this;
        }

        public QueryBuilder wrongnum(String wrongnum){
            setWrongnum(wrongnum);
            return this;
        }

        public QueryBuilder wrongnumList(String ... wrongnum){
            this.wrongnumList = solveNullList(wrongnum);
            return this;
        }

        public QueryBuilder wrongnumList(List<String> wrongnum){
            this.wrongnumList = wrongnum;
            return this;
        }

        public QueryBuilder fetchWrongnum(){
            setFetchFields("fetchFields","wrongnum");
            return this;
        }

        public QueryBuilder excludeWrongnum(){
            setFetchFields("excludeFields","wrongnum");
            return this;
        }

        public QueryBuilder fuzzyLatestlogip (List<String> fuzzyLatestlogip){
            this.fuzzyLatestlogip = fuzzyLatestlogip;
            return this;
        }

        public QueryBuilder fuzzyLatestlogip (String ... fuzzyLatestlogip){
            this.fuzzyLatestlogip = solveNullList(fuzzyLatestlogip);
            return this;
        }

        public QueryBuilder rightFuzzyLatestlogip (List<String> rightFuzzyLatestlogip){
            this.rightFuzzyLatestlogip = rightFuzzyLatestlogip;
            return this;
        }

        public QueryBuilder rightFuzzyLatestlogip (String ... rightFuzzyLatestlogip){
            this.rightFuzzyLatestlogip = solveNullList(rightFuzzyLatestlogip);
            return this;
        }

        public QueryBuilder latestlogip(String latestlogip){
            setLatestlogip(latestlogip);
            return this;
        }

        public QueryBuilder latestlogipList(String ... latestlogip){
            this.latestlogipList = solveNullList(latestlogip);
            return this;
        }

        public QueryBuilder latestlogipList(List<String> latestlogip){
            this.latestlogipList = latestlogip;
            return this;
        }

        public QueryBuilder fetchLatestlogip(){
            setFetchFields("fetchFields","latestlogip");
            return this;
        }

        public QueryBuilder excludeLatestlogip(){
            setFetchFields("excludeFields","latestlogip");
            return this;
        }

        public QueryBuilder fuzzyLatesttime (List<String> fuzzyLatesttime){
            this.fuzzyLatesttime = fuzzyLatesttime;
            return this;
        }

        public QueryBuilder fuzzyLatesttime (String ... fuzzyLatesttime){
            this.fuzzyLatesttime = solveNullList(fuzzyLatesttime);
            return this;
        }

        public QueryBuilder rightFuzzyLatesttime (List<String> rightFuzzyLatesttime){
            this.rightFuzzyLatesttime = rightFuzzyLatesttime;
            return this;
        }

        public QueryBuilder rightFuzzyLatesttime (String ... rightFuzzyLatesttime){
            this.rightFuzzyLatesttime = solveNullList(rightFuzzyLatesttime);
            return this;
        }

        public QueryBuilder latesttime(String latesttime){
            setLatesttime(latesttime);
            return this;
        }

        public QueryBuilder latesttimeList(String ... latesttime){
            this.latesttimeList = solveNullList(latesttime);
            return this;
        }

        public QueryBuilder latesttimeList(List<String> latesttime){
            this.latesttimeList = latesttime;
            return this;
        }

        public QueryBuilder fetchLatesttime(){
            setFetchFields("fetchFields","latesttime");
            return this;
        }

        public QueryBuilder excludeLatesttime(){
            setFetchFields("excludeFields","latesttime");
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

        public JpyUser build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> useridList;

        public List<Integer> getUseridList(){return this.useridList;}

        private Integer useridSt;

        private Integer useridEd;

        public Integer getUseridSt(){return this.useridSt;}

        public Integer getUseridEd(){return this.useridEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> userphoneList;

        public List<String> getUserphoneList(){return this.userphoneList;}


        private List<String> fuzzyUserphone;

        public List<String> getFuzzyUserphone(){return this.fuzzyUserphone;}

        private List<String> rightFuzzyUserphone;

        public List<String> getRightFuzzyUserphone(){return this.rightFuzzyUserphone;}
        private List<String> bussinessidList;

        public List<String> getBussinessidList(){return this.bussinessidList;}


        private List<String> fuzzyBussinessid;

        public List<String> getFuzzyBussinessid(){return this.fuzzyBussinessid;}

        private List<String> rightFuzzyBussinessid;

        public List<String> getRightFuzzyBussinessid(){return this.rightFuzzyBussinessid;}
        private List<String> addtimeList;

        public List<String> getAddtimeList(){return this.addtimeList;}


        private List<String> fuzzyAddtime;

        public List<String> getFuzzyAddtime(){return this.fuzzyAddtime;}

        private List<String> rightFuzzyAddtime;

        public List<String> getRightFuzzyAddtime(){return this.rightFuzzyAddtime;}
        private List<String> userpasswdList;

        public List<String> getUserpasswdList(){return this.userpasswdList;}


        private List<String> fuzzyUserpasswd;

        public List<String> getFuzzyUserpasswd(){return this.fuzzyUserpasswd;}

        private List<String> rightFuzzyUserpasswd;

        public List<String> getRightFuzzyUserpasswd(){return this.rightFuzzyUserpasswd;}
        private List<String> userstatusList;

        public List<String> getUserstatusList(){return this.userstatusList;}


        private List<String> fuzzyUserstatus;

        public List<String> getFuzzyUserstatus(){return this.fuzzyUserstatus;}

        private List<String> rightFuzzyUserstatus;

        public List<String> getRightFuzzyUserstatus(){return this.rightFuzzyUserstatus;}
        private List<String> wrongnumList;

        public List<String> getWrongnumList(){return this.wrongnumList;}


        private List<String> fuzzyWrongnum;

        public List<String> getFuzzyWrongnum(){return this.fuzzyWrongnum;}

        private List<String> rightFuzzyWrongnum;

        public List<String> getRightFuzzyWrongnum(){return this.rightFuzzyWrongnum;}
        private List<String> latestlogipList;

        public List<String> getLatestlogipList(){return this.latestlogipList;}


        private List<String> fuzzyLatestlogip;

        public List<String> getFuzzyLatestlogip(){return this.fuzzyLatestlogip;}

        private List<String> rightFuzzyLatestlogip;

        public List<String> getRightFuzzyLatestlogip(){return this.rightFuzzyLatestlogip;}
        private List<String> latesttimeList;

        public List<String> getLatesttimeList(){return this.latesttimeList;}


        private List<String> fuzzyLatesttime;

        public List<String> getFuzzyLatesttime(){return this.fuzzyLatesttime;}

        private List<String> rightFuzzyLatesttime;

        public List<String> getRightFuzzyLatesttime(){return this.rightFuzzyLatesttime;}

        public ConditionBuilder useridBetWeen(Integer useridSt,Integer useridEd){
            this.useridSt = useridSt;
            this.useridEd = useridEd;
            return this;
        }

        public ConditionBuilder useridGreaterEqThan(Integer useridSt){
            this.useridSt = useridSt;
            return this;
        }
        public ConditionBuilder useridLessEqThan(Integer useridEd){
            this.useridEd = useridEd;
            return this;
        }


        public ConditionBuilder useridList(Integer ... userid){
            this.useridList = solveNullList(userid);
            return this;
        }

        public ConditionBuilder useridList(List<Integer> userid){
            this.useridList = userid;
            return this;
        }

        public ConditionBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public ConditionBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public ConditionBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public ConditionBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public ConditionBuilder fuzzyUserphone (List<String> fuzzyUserphone){
            this.fuzzyUserphone = fuzzyUserphone;
            return this;
        }

        public ConditionBuilder fuzzyUserphone (String ... fuzzyUserphone){
            this.fuzzyUserphone = solveNullList(fuzzyUserphone);
            return this;
        }

        public ConditionBuilder rightFuzzyUserphone (List<String> rightFuzzyUserphone){
            this.rightFuzzyUserphone = rightFuzzyUserphone;
            return this;
        }

        public ConditionBuilder rightFuzzyUserphone (String ... rightFuzzyUserphone){
            this.rightFuzzyUserphone = solveNullList(rightFuzzyUserphone);
            return this;
        }

        public ConditionBuilder userphoneList(String ... userphone){
            this.userphoneList = solveNullList(userphone);
            return this;
        }

        public ConditionBuilder userphoneList(List<String> userphone){
            this.userphoneList = userphone;
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

        public ConditionBuilder fuzzyUserpasswd (List<String> fuzzyUserpasswd){
            this.fuzzyUserpasswd = fuzzyUserpasswd;
            return this;
        }

        public ConditionBuilder fuzzyUserpasswd (String ... fuzzyUserpasswd){
            this.fuzzyUserpasswd = solveNullList(fuzzyUserpasswd);
            return this;
        }

        public ConditionBuilder rightFuzzyUserpasswd (List<String> rightFuzzyUserpasswd){
            this.rightFuzzyUserpasswd = rightFuzzyUserpasswd;
            return this;
        }

        public ConditionBuilder rightFuzzyUserpasswd (String ... rightFuzzyUserpasswd){
            this.rightFuzzyUserpasswd = solveNullList(rightFuzzyUserpasswd);
            return this;
        }

        public ConditionBuilder userpasswdList(String ... userpasswd){
            this.userpasswdList = solveNullList(userpasswd);
            return this;
        }

        public ConditionBuilder userpasswdList(List<String> userpasswd){
            this.userpasswdList = userpasswd;
            return this;
        }

        public ConditionBuilder fuzzyUserstatus (List<String> fuzzyUserstatus){
            this.fuzzyUserstatus = fuzzyUserstatus;
            return this;
        }

        public ConditionBuilder fuzzyUserstatus (String ... fuzzyUserstatus){
            this.fuzzyUserstatus = solveNullList(fuzzyUserstatus);
            return this;
        }

        public ConditionBuilder rightFuzzyUserstatus (List<String> rightFuzzyUserstatus){
            this.rightFuzzyUserstatus = rightFuzzyUserstatus;
            return this;
        }

        public ConditionBuilder rightFuzzyUserstatus (String ... rightFuzzyUserstatus){
            this.rightFuzzyUserstatus = solveNullList(rightFuzzyUserstatus);
            return this;
        }

        public ConditionBuilder userstatusList(String ... userstatus){
            this.userstatusList = solveNullList(userstatus);
            return this;
        }

        public ConditionBuilder userstatusList(List<String> userstatus){
            this.userstatusList = userstatus;
            return this;
        }

        public ConditionBuilder fuzzyWrongnum (List<String> fuzzyWrongnum){
            this.fuzzyWrongnum = fuzzyWrongnum;
            return this;
        }

        public ConditionBuilder fuzzyWrongnum (String ... fuzzyWrongnum){
            this.fuzzyWrongnum = solveNullList(fuzzyWrongnum);
            return this;
        }

        public ConditionBuilder rightFuzzyWrongnum (List<String> rightFuzzyWrongnum){
            this.rightFuzzyWrongnum = rightFuzzyWrongnum;
            return this;
        }

        public ConditionBuilder rightFuzzyWrongnum (String ... rightFuzzyWrongnum){
            this.rightFuzzyWrongnum = solveNullList(rightFuzzyWrongnum);
            return this;
        }

        public ConditionBuilder wrongnumList(String ... wrongnum){
            this.wrongnumList = solveNullList(wrongnum);
            return this;
        }

        public ConditionBuilder wrongnumList(List<String> wrongnum){
            this.wrongnumList = wrongnum;
            return this;
        }

        public ConditionBuilder fuzzyLatestlogip (List<String> fuzzyLatestlogip){
            this.fuzzyLatestlogip = fuzzyLatestlogip;
            return this;
        }

        public ConditionBuilder fuzzyLatestlogip (String ... fuzzyLatestlogip){
            this.fuzzyLatestlogip = solveNullList(fuzzyLatestlogip);
            return this;
        }

        public ConditionBuilder rightFuzzyLatestlogip (List<String> rightFuzzyLatestlogip){
            this.rightFuzzyLatestlogip = rightFuzzyLatestlogip;
            return this;
        }

        public ConditionBuilder rightFuzzyLatestlogip (String ... rightFuzzyLatestlogip){
            this.rightFuzzyLatestlogip = solveNullList(rightFuzzyLatestlogip);
            return this;
        }

        public ConditionBuilder latestlogipList(String ... latestlogip){
            this.latestlogipList = solveNullList(latestlogip);
            return this;
        }

        public ConditionBuilder latestlogipList(List<String> latestlogip){
            this.latestlogipList = latestlogip;
            return this;
        }

        public ConditionBuilder fuzzyLatesttime (List<String> fuzzyLatesttime){
            this.fuzzyLatesttime = fuzzyLatesttime;
            return this;
        }

        public ConditionBuilder fuzzyLatesttime (String ... fuzzyLatesttime){
            this.fuzzyLatesttime = solveNullList(fuzzyLatesttime);
            return this;
        }

        public ConditionBuilder rightFuzzyLatesttime (List<String> rightFuzzyLatesttime){
            this.rightFuzzyLatesttime = rightFuzzyLatesttime;
            return this;
        }

        public ConditionBuilder rightFuzzyLatesttime (String ... rightFuzzyLatesttime){
            this.rightFuzzyLatesttime = solveNullList(rightFuzzyLatesttime);
            return this;
        }

        public ConditionBuilder latesttimeList(String ... latesttime){
            this.latesttimeList = solveNullList(latesttime);
            return this;
        }

        public ConditionBuilder latesttimeList(List<String> latesttime){
            this.latesttimeList = latesttime;
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

        private JpyUser obj;

        public Builder(){
            this.obj = new JpyUser();
        }

        public Builder userid(Integer userid){
            this.obj.setUserid(userid);
            return this;
        }
        public Builder username(String username){
            this.obj.setUsername(username);
            return this;
        }
        public Builder userphone(String userphone){
            this.obj.setUserphone(userphone);
            return this;
        }
        public Builder bussinessid(String bussinessid){
            this.obj.setBussinessid(bussinessid);
            return this;
        }
        public Builder addtime(String addtime){
            this.obj.setAddtime(addtime);
            return this;
        }
        public Builder userpasswd(String userpasswd){
            this.obj.setUserpasswd(userpasswd);
            return this;
        }
        public Builder userstatus(String userstatus){
            this.obj.setUserstatus(userstatus);
            return this;
        }
        public Builder wrongnum(String wrongnum){
            this.obj.setWrongnum(wrongnum);
            return this;
        }
        public Builder latestlogip(String latestlogip){
            this.obj.setLatestlogip(latestlogip);
            return this;
        }
        public Builder latesttime(String latesttime){
            this.obj.setLatesttime(latesttime);
            return this;
        }
        public JpyUser build(){return obj;}
    }

}
