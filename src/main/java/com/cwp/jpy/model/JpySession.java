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
public class JpySession implements Serializable {

    private static final long serialVersionUID = 1638761808474L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer userid;

    /**
    * 
    * isNullAble:1
    */
    private String session;

    /**
    * 
    * isNullAble:1
    */
    private String timer;

    /**
    * 
    * isNullAble:1
    */
    private String sessionip;


    public void setUserid(Integer userid){this.userid = userid;}

    public Integer getUserid(){return this.userid;}

    public void setSession(String session){this.session = session;}

    public String getSession(){return this.session;}

    public void setTimer(String timer){this.timer = timer;}

    public String getTimer(){return this.timer;}

    public void setSessionip(String sessionip){this.sessionip = sessionip;}

    public String getSessionip(){return this.sessionip;}
    @Override
    public String toString() {
        return "JpySession{" +
                "userid='" + userid + '\'' +
                "session='" + session + '\'' +
                "timer='" + timer + '\'' +
                "sessionip='" + sessionip + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpySession set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpySession set){
            this.set = set;
            return this;
        }

        public JpySession getSet(){
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

    public static class QueryBuilder extends JpySession{
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

        private List<String> sessionList;

        public List<String> getSessionList(){return this.sessionList;}


        private List<String> fuzzySession;

        public List<String> getFuzzySession(){return this.fuzzySession;}

        private List<String> rightFuzzySession;

        public List<String> getRightFuzzySession(){return this.rightFuzzySession;}
        private List<String> timerList;

        public List<String> getTimerList(){return this.timerList;}


        private List<String> fuzzyTimer;

        public List<String> getFuzzyTimer(){return this.fuzzyTimer;}

        private List<String> rightFuzzyTimer;

        public List<String> getRightFuzzyTimer(){return this.rightFuzzyTimer;}
        private List<String> sessionipList;

        public List<String> getSessionipList(){return this.sessionipList;}


        private List<String> fuzzySessionip;

        public List<String> getFuzzySessionip(){return this.fuzzySessionip;}

        private List<String> rightFuzzySessionip;

        public List<String> getRightFuzzySessionip(){return this.rightFuzzySessionip;}
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

        public QueryBuilder fuzzySession (List<String> fuzzySession){
            this.fuzzySession = fuzzySession;
            return this;
        }

        public QueryBuilder fuzzySession (String ... fuzzySession){
            this.fuzzySession = solveNullList(fuzzySession);
            return this;
        }

        public QueryBuilder rightFuzzySession (List<String> rightFuzzySession){
            this.rightFuzzySession = rightFuzzySession;
            return this;
        }

        public QueryBuilder rightFuzzySession (String ... rightFuzzySession){
            this.rightFuzzySession = solveNullList(rightFuzzySession);
            return this;
        }

        public QueryBuilder session(String session){
            setSession(session);
            return this;
        }

        public QueryBuilder sessionList(String ... session){
            this.sessionList = solveNullList(session);
            return this;
        }

        public QueryBuilder sessionList(List<String> session){
            this.sessionList = session;
            return this;
        }

        public QueryBuilder fetchSession(){
            setFetchFields("fetchFields","session");
            return this;
        }

        public QueryBuilder excludeSession(){
            setFetchFields("excludeFields","session");
            return this;
        }

        public QueryBuilder fuzzyTimer (List<String> fuzzyTimer){
            this.fuzzyTimer = fuzzyTimer;
            return this;
        }

        public QueryBuilder fuzzyTimer (String ... fuzzyTimer){
            this.fuzzyTimer = solveNullList(fuzzyTimer);
            return this;
        }

        public QueryBuilder rightFuzzyTimer (List<String> rightFuzzyTimer){
            this.rightFuzzyTimer = rightFuzzyTimer;
            return this;
        }

        public QueryBuilder rightFuzzyTimer (String ... rightFuzzyTimer){
            this.rightFuzzyTimer = solveNullList(rightFuzzyTimer);
            return this;
        }

        public QueryBuilder timer(String timer){
            setTimer(timer);
            return this;
        }

        public QueryBuilder timerList(String ... timer){
            this.timerList = solveNullList(timer);
            return this;
        }

        public QueryBuilder timerList(List<String> timer){
            this.timerList = timer;
            return this;
        }

        public QueryBuilder fetchTimer(){
            setFetchFields("fetchFields","timer");
            return this;
        }

        public QueryBuilder excludeTimer(){
            setFetchFields("excludeFields","timer");
            return this;
        }

        public QueryBuilder fuzzySessionip (List<String> fuzzySessionip){
            this.fuzzySessionip = fuzzySessionip;
            return this;
        }

        public QueryBuilder fuzzySessionip (String ... fuzzySessionip){
            this.fuzzySessionip = solveNullList(fuzzySessionip);
            return this;
        }

        public QueryBuilder rightFuzzySessionip (List<String> rightFuzzySessionip){
            this.rightFuzzySessionip = rightFuzzySessionip;
            return this;
        }

        public QueryBuilder rightFuzzySessionip (String ... rightFuzzySessionip){
            this.rightFuzzySessionip = solveNullList(rightFuzzySessionip);
            return this;
        }

        public QueryBuilder sessionip(String sessionip){
            setSessionip(sessionip);
            return this;
        }

        public QueryBuilder sessionipList(String ... sessionip){
            this.sessionipList = solveNullList(sessionip);
            return this;
        }

        public QueryBuilder sessionipList(List<String> sessionip){
            this.sessionipList = sessionip;
            return this;
        }

        public QueryBuilder fetchSessionip(){
            setFetchFields("fetchFields","sessionip");
            return this;
        }

        public QueryBuilder excludeSessionip(){
            setFetchFields("excludeFields","sessionip");
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

        public JpySession build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> useridList;

        public List<Integer> getUseridList(){return this.useridList;}

        private Integer useridSt;

        private Integer useridEd;

        public Integer getUseridSt(){return this.useridSt;}

        public Integer getUseridEd(){return this.useridEd;}

        private List<String> sessionList;

        public List<String> getSessionList(){return this.sessionList;}


        private List<String> fuzzySession;

        public List<String> getFuzzySession(){return this.fuzzySession;}

        private List<String> rightFuzzySession;

        public List<String> getRightFuzzySession(){return this.rightFuzzySession;}
        private List<String> timerList;

        public List<String> getTimerList(){return this.timerList;}


        private List<String> fuzzyTimer;

        public List<String> getFuzzyTimer(){return this.fuzzyTimer;}

        private List<String> rightFuzzyTimer;

        public List<String> getRightFuzzyTimer(){return this.rightFuzzyTimer;}
        private List<String> sessionipList;

        public List<String> getSessionipList(){return this.sessionipList;}


        private List<String> fuzzySessionip;

        public List<String> getFuzzySessionip(){return this.fuzzySessionip;}

        private List<String> rightFuzzySessionip;

        public List<String> getRightFuzzySessionip(){return this.rightFuzzySessionip;}

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

        public ConditionBuilder fuzzySession (List<String> fuzzySession){
            this.fuzzySession = fuzzySession;
            return this;
        }

        public ConditionBuilder fuzzySession (String ... fuzzySession){
            this.fuzzySession = solveNullList(fuzzySession);
            return this;
        }

        public ConditionBuilder rightFuzzySession (List<String> rightFuzzySession){
            this.rightFuzzySession = rightFuzzySession;
            return this;
        }

        public ConditionBuilder rightFuzzySession (String ... rightFuzzySession){
            this.rightFuzzySession = solveNullList(rightFuzzySession);
            return this;
        }

        public ConditionBuilder sessionList(String ... session){
            this.sessionList = solveNullList(session);
            return this;
        }

        public ConditionBuilder sessionList(List<String> session){
            this.sessionList = session;
            return this;
        }

        public ConditionBuilder fuzzyTimer (List<String> fuzzyTimer){
            this.fuzzyTimer = fuzzyTimer;
            return this;
        }

        public ConditionBuilder fuzzyTimer (String ... fuzzyTimer){
            this.fuzzyTimer = solveNullList(fuzzyTimer);
            return this;
        }

        public ConditionBuilder rightFuzzyTimer (List<String> rightFuzzyTimer){
            this.rightFuzzyTimer = rightFuzzyTimer;
            return this;
        }

        public ConditionBuilder rightFuzzyTimer (String ... rightFuzzyTimer){
            this.rightFuzzyTimer = solveNullList(rightFuzzyTimer);
            return this;
        }

        public ConditionBuilder timerList(String ... timer){
            this.timerList = solveNullList(timer);
            return this;
        }

        public ConditionBuilder timerList(List<String> timer){
            this.timerList = timer;
            return this;
        }

        public ConditionBuilder fuzzySessionip (List<String> fuzzySessionip){
            this.fuzzySessionip = fuzzySessionip;
            return this;
        }

        public ConditionBuilder fuzzySessionip (String ... fuzzySessionip){
            this.fuzzySessionip = solveNullList(fuzzySessionip);
            return this;
        }

        public ConditionBuilder rightFuzzySessionip (List<String> rightFuzzySessionip){
            this.rightFuzzySessionip = rightFuzzySessionip;
            return this;
        }

        public ConditionBuilder rightFuzzySessionip (String ... rightFuzzySessionip){
            this.rightFuzzySessionip = solveNullList(rightFuzzySessionip);
            return this;
        }

        public ConditionBuilder sessionipList(String ... sessionip){
            this.sessionipList = solveNullList(sessionip);
            return this;
        }

        public ConditionBuilder sessionipList(List<String> sessionip){
            this.sessionipList = sessionip;
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

        private JpySession obj;

        public Builder(){
            this.obj = new JpySession();
        }

        public Builder userid(Integer userid){
            this.obj.setUserid(userid);
            return this;
        }
        public Builder session(String session){
            this.obj.setSession(session);
            return this;
        }
        public Builder timer(String timer){
            this.obj.setTimer(timer);
            return this;
        }
        public Builder sessionip(String sessionip){
            this.obj.setSessionip(sessionip);
            return this;
        }
        public JpySession build(){return obj;}
    }

}
