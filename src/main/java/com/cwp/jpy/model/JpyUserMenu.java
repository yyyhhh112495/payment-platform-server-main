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
public class JpyUserMenu implements Serializable {

    private static final long serialVersionUID = 1639385873915L;


    /**
    * 
    * isNullAble:0
    */
    private Integer userid;

    /**
    * 
    * isNullAble:1
    */
    private Integer menuid;

    /**
    * 
    * isNullAble:1
    */
    private String timer;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer tid;


    public void setUserid(Integer userid){this.userid = userid;}

    public Integer getUserid(){return this.userid;}

    public void setMenuid(Integer menuid){this.menuid = menuid;}

    public Integer getMenuid(){return this.menuid;}

    public void setTimer(String timer){this.timer = timer;}

    public String getTimer(){return this.timer;}

    public void setTid(Integer tid){this.tid = tid;}

    public Integer getTid(){return this.tid;}
    @Override
    public String toString() {
        return "JpyUserMenu{" +
                "userid='" + userid + '\'' +
                "menuid='" + menuid + '\'' +
                "timer='" + timer + '\'' +
                "tid='" + tid + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyUserMenu set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyUserMenu set){
            this.set = set;
            return this;
        }

        public JpyUserMenu getSet(){
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

    public static class QueryBuilder extends JpyUserMenu{
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

        private List<Integer> menuidList;

        public List<Integer> getMenuidList(){return this.menuidList;}

        private Integer menuidSt;

        private Integer menuidEd;

        public Integer getMenuidSt(){return this.menuidSt;}

        public Integer getMenuidEd(){return this.menuidEd;}

        private List<String> timerList;

        public List<String> getTimerList(){return this.timerList;}


        private List<String> fuzzyTimer;

        public List<String> getFuzzyTimer(){return this.fuzzyTimer;}

        private List<String> rightFuzzyTimer;

        public List<String> getRightFuzzyTimer(){return this.rightFuzzyTimer;}
        private List<Integer> tidList;

        public List<Integer> getTidList(){return this.tidList;}

        private Integer tidSt;

        private Integer tidEd;

        public Integer getTidSt(){return this.tidSt;}

        public Integer getTidEd(){return this.tidEd;}

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

        public QueryBuilder menuidBetWeen(Integer menuidSt,Integer menuidEd){
            this.menuidSt = menuidSt;
            this.menuidEd = menuidEd;
            return this;
        }

        public QueryBuilder menuidGreaterEqThan(Integer menuidSt){
            this.menuidSt = menuidSt;
            return this;
        }
        public QueryBuilder menuidLessEqThan(Integer menuidEd){
            this.menuidEd = menuidEd;
            return this;
        }


        public QueryBuilder menuid(Integer menuid){
            setMenuid(menuid);
            return this;
        }

        public QueryBuilder menuidList(Integer ... menuid){
            this.menuidList = solveNullList(menuid);
            return this;
        }

        public QueryBuilder menuidList(List<Integer> menuid){
            this.menuidList = menuid;
            return this;
        }

        public QueryBuilder fetchMenuid(){
            setFetchFields("fetchFields","menuid");
            return this;
        }

        public QueryBuilder excludeMenuid(){
            setFetchFields("excludeFields","menuid");
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

        public QueryBuilder tidBetWeen(Integer tidSt,Integer tidEd){
            this.tidSt = tidSt;
            this.tidEd = tidEd;
            return this;
        }

        public QueryBuilder tidGreaterEqThan(Integer tidSt){
            this.tidSt = tidSt;
            return this;
        }
        public QueryBuilder tidLessEqThan(Integer tidEd){
            this.tidEd = tidEd;
            return this;
        }


        public QueryBuilder tid(Integer tid){
            setTid(tid);
            return this;
        }

        public QueryBuilder tidList(Integer ... tid){
            this.tidList = solveNullList(tid);
            return this;
        }

        public QueryBuilder tidList(List<Integer> tid){
            this.tidList = tid;
            return this;
        }

        public QueryBuilder fetchTid(){
            setFetchFields("fetchFields","tid");
            return this;
        }

        public QueryBuilder excludeTid(){
            setFetchFields("excludeFields","tid");
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

        public JpyUserMenu build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> useridList;

        public List<Integer> getUseridList(){return this.useridList;}

        private Integer useridSt;

        private Integer useridEd;

        public Integer getUseridSt(){return this.useridSt;}

        public Integer getUseridEd(){return this.useridEd;}

        private List<Integer> menuidList;

        public List<Integer> getMenuidList(){return this.menuidList;}

        private Integer menuidSt;

        private Integer menuidEd;

        public Integer getMenuidSt(){return this.menuidSt;}

        public Integer getMenuidEd(){return this.menuidEd;}

        private List<String> timerList;

        public List<String> getTimerList(){return this.timerList;}


        private List<String> fuzzyTimer;

        public List<String> getFuzzyTimer(){return this.fuzzyTimer;}

        private List<String> rightFuzzyTimer;

        public List<String> getRightFuzzyTimer(){return this.rightFuzzyTimer;}
        private List<Integer> tidList;

        public List<Integer> getTidList(){return this.tidList;}

        private Integer tidSt;

        private Integer tidEd;

        public Integer getTidSt(){return this.tidSt;}

        public Integer getTidEd(){return this.tidEd;}


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

        public ConditionBuilder menuidBetWeen(Integer menuidSt,Integer menuidEd){
            this.menuidSt = menuidSt;
            this.menuidEd = menuidEd;
            return this;
        }

        public ConditionBuilder menuidGreaterEqThan(Integer menuidSt){
            this.menuidSt = menuidSt;
            return this;
        }
        public ConditionBuilder menuidLessEqThan(Integer menuidEd){
            this.menuidEd = menuidEd;
            return this;
        }


        public ConditionBuilder menuidList(Integer ... menuid){
            this.menuidList = solveNullList(menuid);
            return this;
        }

        public ConditionBuilder menuidList(List<Integer> menuid){
            this.menuidList = menuid;
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

        public ConditionBuilder tidBetWeen(Integer tidSt,Integer tidEd){
            this.tidSt = tidSt;
            this.tidEd = tidEd;
            return this;
        }

        public ConditionBuilder tidGreaterEqThan(Integer tidSt){
            this.tidSt = tidSt;
            return this;
        }
        public ConditionBuilder tidLessEqThan(Integer tidEd){
            this.tidEd = tidEd;
            return this;
        }


        public ConditionBuilder tidList(Integer ... tid){
            this.tidList = solveNullList(tid);
            return this;
        }

        public ConditionBuilder tidList(List<Integer> tid){
            this.tidList = tid;
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

        private JpyUserMenu obj;

        public Builder(){
            this.obj = new JpyUserMenu();
        }

        public Builder userid(Integer userid){
            this.obj.setUserid(userid);
            return this;
        }
        public Builder menuid(Integer menuid){
            this.obj.setMenuid(menuid);
            return this;
        }
        public Builder timer(String timer){
            this.obj.setTimer(timer);
            return this;
        }
        public Builder tid(Integer tid){
            this.obj.setTid(tid);
            return this;
        }
        public JpyUserMenu build(){return obj;}
    }

}
