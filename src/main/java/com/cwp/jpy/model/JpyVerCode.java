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
public class JpyVerCode implements Serializable {

    private static final long serialVersionUID = 1638771777802L;


    /**
    * 
    * isNullAble:1
    */
    private String userphone;

    /**
    * 
    * isNullAble:1
    */
    private String vercode;

    /**
    * 
    * isNullAble:1
    */
    private String timer;


    public void setUserphone(String userphone){this.userphone = userphone;}

    public String getUserphone(){return this.userphone;}

    public void setVercode(String vercode){this.vercode = vercode;}

    public String getVercode(){return this.vercode;}

    public void setTimer(String timer){this.timer = timer;}

    public String getTimer(){return this.timer;}
    @Override
    public String toString() {
        return "JpyVerCode{" +
                "userphone='" + userphone + '\'' +
                "vercode='" + vercode + '\'' +
                "timer='" + timer + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyVerCode set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyVerCode set){
            this.set = set;
            return this;
        }

        public JpyVerCode getSet(){
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

    public static class QueryBuilder extends JpyVerCode{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> userphoneList;

        public List<String> getUserphoneList(){return this.userphoneList;}


        private List<String> fuzzyUserphone;

        public List<String> getFuzzyUserphone(){return this.fuzzyUserphone;}

        private List<String> rightFuzzyUserphone;

        public List<String> getRightFuzzyUserphone(){return this.rightFuzzyUserphone;}
        private List<String> vercodeList;

        public List<String> getVercodeList(){return this.vercodeList;}


        private List<String> fuzzyVercode;

        public List<String> getFuzzyVercode(){return this.fuzzyVercode;}

        private List<String> rightFuzzyVercode;

        public List<String> getRightFuzzyVercode(){return this.rightFuzzyVercode;}
        private List<String> timerList;

        public List<String> getTimerList(){return this.timerList;}


        private List<String> fuzzyTimer;

        public List<String> getFuzzyTimer(){return this.fuzzyTimer;}

        private List<String> rightFuzzyTimer;

        public List<String> getRightFuzzyTimer(){return this.rightFuzzyTimer;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyVercode (List<String> fuzzyVercode){
            this.fuzzyVercode = fuzzyVercode;
            return this;
        }

        public QueryBuilder fuzzyVercode (String ... fuzzyVercode){
            this.fuzzyVercode = solveNullList(fuzzyVercode);
            return this;
        }

        public QueryBuilder rightFuzzyVercode (List<String> rightFuzzyVercode){
            this.rightFuzzyVercode = rightFuzzyVercode;
            return this;
        }

        public QueryBuilder rightFuzzyVercode (String ... rightFuzzyVercode){
            this.rightFuzzyVercode = solveNullList(rightFuzzyVercode);
            return this;
        }

        public QueryBuilder vercode(String vercode){
            setVercode(vercode);
            return this;
        }

        public QueryBuilder vercodeList(String ... vercode){
            this.vercodeList = solveNullList(vercode);
            return this;
        }

        public QueryBuilder vercodeList(List<String> vercode){
            this.vercodeList = vercode;
            return this;
        }

        public QueryBuilder fetchVercode(){
            setFetchFields("fetchFields","vercode");
            return this;
        }

        public QueryBuilder excludeVercode(){
            setFetchFields("excludeFields","vercode");
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

        public JpyVerCode build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> userphoneList;

        public List<String> getUserphoneList(){return this.userphoneList;}


        private List<String> fuzzyUserphone;

        public List<String> getFuzzyUserphone(){return this.fuzzyUserphone;}

        private List<String> rightFuzzyUserphone;

        public List<String> getRightFuzzyUserphone(){return this.rightFuzzyUserphone;}
        private List<String> vercodeList;

        public List<String> getVercodeList(){return this.vercodeList;}


        private List<String> fuzzyVercode;

        public List<String> getFuzzyVercode(){return this.fuzzyVercode;}

        private List<String> rightFuzzyVercode;

        public List<String> getRightFuzzyVercode(){return this.rightFuzzyVercode;}
        private List<String> timerList;

        public List<String> getTimerList(){return this.timerList;}


        private List<String> fuzzyTimer;

        public List<String> getFuzzyTimer(){return this.fuzzyTimer;}

        private List<String> rightFuzzyTimer;

        public List<String> getRightFuzzyTimer(){return this.rightFuzzyTimer;}

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

        public ConditionBuilder fuzzyVercode (List<String> fuzzyVercode){
            this.fuzzyVercode = fuzzyVercode;
            return this;
        }

        public ConditionBuilder fuzzyVercode (String ... fuzzyVercode){
            this.fuzzyVercode = solveNullList(fuzzyVercode);
            return this;
        }

        public ConditionBuilder rightFuzzyVercode (List<String> rightFuzzyVercode){
            this.rightFuzzyVercode = rightFuzzyVercode;
            return this;
        }

        public ConditionBuilder rightFuzzyVercode (String ... rightFuzzyVercode){
            this.rightFuzzyVercode = solveNullList(rightFuzzyVercode);
            return this;
        }

        public ConditionBuilder vercodeList(String ... vercode){
            this.vercodeList = solveNullList(vercode);
            return this;
        }

        public ConditionBuilder vercodeList(List<String> vercode){
            this.vercodeList = vercode;
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

        private JpyVerCode obj;

        public Builder(){
            this.obj = new JpyVerCode();
        }

        public Builder userphone(String userphone){
            this.obj.setUserphone(userphone);
            return this;
        }
        public Builder vercode(String vercode){
            this.obj.setVercode(vercode);
            return this;
        }
        public Builder timer(String timer){
            this.obj.setTimer(timer);
            return this;
        }
        public JpyVerCode build(){return obj;}
    }

}
