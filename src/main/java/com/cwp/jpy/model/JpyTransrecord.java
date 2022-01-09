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
public class JpyTransrecord implements Serializable {

    private static final long serialVersionUID = 1641268197492L;


    /**
    * 
    * isNullAble:0
    */
    private String bussid;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String jstradeno;

    /**
    * 
    * isNullAble:1
    */
    private String jstime;

    /**
    * 
    * isNullAble:1
    */
    private String jsnum;

    /**
    * 
    * isNullAble:1
    */
    private String transcountid;

    /**
    * 
    * isNullAble:1
    */
    private String transbankname;

    /**
    * 
    * isNullAble:1
    */
    private String transcountname;

    /**
    * 
    * isNullAble:1
    */
    private String transtatus;

    /**
    * 
    * isNullAble:1
    */
    private String transcomtime;


    public void setBussid(String bussid){this.bussid = bussid;}

    public String getBussid(){return this.bussid;}

    public void setJstradeno(String jstradeno){this.jstradeno = jstradeno;}

    public String getJstradeno(){return this.jstradeno;}

    public void setJstime(String jstime){this.jstime = jstime;}

    public String getJstime(){return this.jstime;}

    public void setJsnum(String jsnum){this.jsnum = jsnum;}

    public String getJsnum(){return this.jsnum;}

    public void setTranscountid(String transcountid){this.transcountid = transcountid;}

    public String getTranscountid(){return this.transcountid;}

    public void setTransbankname(String transbankname){this.transbankname = transbankname;}

    public String getTransbankname(){return this.transbankname;}

    public void setTranscountname(String transcountname){this.transcountname = transcountname;}

    public String getTranscountname(){return this.transcountname;}

    public void setTranstatus(String transtatus){this.transtatus = transtatus;}

    public String getTranstatus(){return this.transtatus;}

    public void setTranscomtime(String transcomtime){this.transcomtime = transcomtime;}

    public String getTranscomtime(){return this.transcomtime;}
    @Override
    public String toString() {
        return "JpyTransrecord{" +
                "bussid='" + bussid + '\'' +
                "jstradeno='" + jstradeno + '\'' +
                "jstime='" + jstime + '\'' +
                "jsnum='" + jsnum + '\'' +
                "transcountid='" + transcountid + '\'' +
                "transbankname='" + transbankname + '\'' +
                "transcountname='" + transcountname + '\'' +
                "transtatus='" + transtatus + '\'' +
                "transcomtime='" + transcomtime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyTransrecord set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyTransrecord set){
            this.set = set;
            return this;
        }

        public JpyTransrecord getSet(){
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

    public static class QueryBuilder extends JpyTransrecord{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> bussidList;

        public List<String> getBussidList(){return this.bussidList;}


        private List<String> fuzzyBussid;

        public List<String> getFuzzyBussid(){return this.fuzzyBussid;}

        private List<String> rightFuzzyBussid;

        public List<String> getRightFuzzyBussid(){return this.rightFuzzyBussid;}
        private List<String> jstradenoList;

        public List<String> getJstradenoList(){return this.jstradenoList;}


        private List<String> fuzzyJstradeno;

        public List<String> getFuzzyJstradeno(){return this.fuzzyJstradeno;}

        private List<String> rightFuzzyJstradeno;

        public List<String> getRightFuzzyJstradeno(){return this.rightFuzzyJstradeno;}
        private List<String> jstimeList;

        public List<String> getJstimeList(){return this.jstimeList;}


        private List<String> fuzzyJstime;

        public List<String> getFuzzyJstime(){return this.fuzzyJstime;}

        private List<String> rightFuzzyJstime;

        public List<String> getRightFuzzyJstime(){return this.rightFuzzyJstime;}
        private List<String> jsnumList;

        public List<String> getJsnumList(){return this.jsnumList;}


        private List<String> fuzzyJsnum;

        public List<String> getFuzzyJsnum(){return this.fuzzyJsnum;}

        private List<String> rightFuzzyJsnum;

        public List<String> getRightFuzzyJsnum(){return this.rightFuzzyJsnum;}
        private List<String> transcountidList;

        public List<String> getTranscountidList(){return this.transcountidList;}


        private List<String> fuzzyTranscountid;

        public List<String> getFuzzyTranscountid(){return this.fuzzyTranscountid;}

        private List<String> rightFuzzyTranscountid;

        public List<String> getRightFuzzyTranscountid(){return this.rightFuzzyTranscountid;}
        private List<String> transbanknameList;

        public List<String> getTransbanknameList(){return this.transbanknameList;}


        private List<String> fuzzyTransbankname;

        public List<String> getFuzzyTransbankname(){return this.fuzzyTransbankname;}

        private List<String> rightFuzzyTransbankname;

        public List<String> getRightFuzzyTransbankname(){return this.rightFuzzyTransbankname;}
        private List<String> transcountnameList;

        public List<String> getTranscountnameList(){return this.transcountnameList;}


        private List<String> fuzzyTranscountname;

        public List<String> getFuzzyTranscountname(){return this.fuzzyTranscountname;}

        private List<String> rightFuzzyTranscountname;

        public List<String> getRightFuzzyTranscountname(){return this.rightFuzzyTranscountname;}
        private List<String> transtatusList;

        public List<String> getTranstatusList(){return this.transtatusList;}


        private List<String> fuzzyTranstatus;

        public List<String> getFuzzyTranstatus(){return this.fuzzyTranstatus;}

        private List<String> rightFuzzyTranstatus;

        public List<String> getRightFuzzyTranstatus(){return this.rightFuzzyTranstatus;}
        private List<String> transcomtimeList;

        public List<String> getTranscomtimeList(){return this.transcomtimeList;}


        private List<String> fuzzyTranscomtime;

        public List<String> getFuzzyTranscomtime(){return this.fuzzyTranscomtime;}

        private List<String> rightFuzzyTranscomtime;

        public List<String> getRightFuzzyTranscomtime(){return this.rightFuzzyTranscomtime;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyJstradeno (List<String> fuzzyJstradeno){
            this.fuzzyJstradeno = fuzzyJstradeno;
            return this;
        }

        public QueryBuilder fuzzyJstradeno (String ... fuzzyJstradeno){
            this.fuzzyJstradeno = solveNullList(fuzzyJstradeno);
            return this;
        }

        public QueryBuilder rightFuzzyJstradeno (List<String> rightFuzzyJstradeno){
            this.rightFuzzyJstradeno = rightFuzzyJstradeno;
            return this;
        }

        public QueryBuilder rightFuzzyJstradeno (String ... rightFuzzyJstradeno){
            this.rightFuzzyJstradeno = solveNullList(rightFuzzyJstradeno);
            return this;
        }

        public QueryBuilder jstradeno(String jstradeno){
            setJstradeno(jstradeno);
            return this;
        }

        public QueryBuilder jstradenoList(String ... jstradeno){
            this.jstradenoList = solveNullList(jstradeno);
            return this;
        }

        public QueryBuilder jstradenoList(List<String> jstradeno){
            this.jstradenoList = jstradeno;
            return this;
        }

        public QueryBuilder fetchJstradeno(){
            setFetchFields("fetchFields","jstradeno");
            return this;
        }

        public QueryBuilder excludeJstradeno(){
            setFetchFields("excludeFields","jstradeno");
            return this;
        }

        public QueryBuilder fuzzyJstime (List<String> fuzzyJstime){
            this.fuzzyJstime = fuzzyJstime;
            return this;
        }

        public QueryBuilder fuzzyJstime (String ... fuzzyJstime){
            this.fuzzyJstime = solveNullList(fuzzyJstime);
            return this;
        }

        public QueryBuilder rightFuzzyJstime (List<String> rightFuzzyJstime){
            this.rightFuzzyJstime = rightFuzzyJstime;
            return this;
        }

        public QueryBuilder rightFuzzyJstime (String ... rightFuzzyJstime){
            this.rightFuzzyJstime = solveNullList(rightFuzzyJstime);
            return this;
        }

        public QueryBuilder jstime(String jstime){
            setJstime(jstime);
            return this;
        }

        public QueryBuilder jstimeList(String ... jstime){
            this.jstimeList = solveNullList(jstime);
            return this;
        }

        public QueryBuilder jstimeList(List<String> jstime){
            this.jstimeList = jstime;
            return this;
        }

        public QueryBuilder fetchJstime(){
            setFetchFields("fetchFields","jstime");
            return this;
        }

        public QueryBuilder excludeJstime(){
            setFetchFields("excludeFields","jstime");
            return this;
        }

        public QueryBuilder fuzzyJsnum (List<String> fuzzyJsnum){
            this.fuzzyJsnum = fuzzyJsnum;
            return this;
        }

        public QueryBuilder fuzzyJsnum (String ... fuzzyJsnum){
            this.fuzzyJsnum = solveNullList(fuzzyJsnum);
            return this;
        }

        public QueryBuilder rightFuzzyJsnum (List<String> rightFuzzyJsnum){
            this.rightFuzzyJsnum = rightFuzzyJsnum;
            return this;
        }

        public QueryBuilder rightFuzzyJsnum (String ... rightFuzzyJsnum){
            this.rightFuzzyJsnum = solveNullList(rightFuzzyJsnum);
            return this;
        }

        public QueryBuilder jsnum(String jsnum){
            setJsnum(jsnum);
            return this;
        }

        public QueryBuilder jsnumList(String ... jsnum){
            this.jsnumList = solveNullList(jsnum);
            return this;
        }

        public QueryBuilder jsnumList(List<String> jsnum){
            this.jsnumList = jsnum;
            return this;
        }

        public QueryBuilder fetchJsnum(){
            setFetchFields("fetchFields","jsnum");
            return this;
        }

        public QueryBuilder excludeJsnum(){
            setFetchFields("excludeFields","jsnum");
            return this;
        }

        public QueryBuilder fuzzyTranscountid (List<String> fuzzyTranscountid){
            this.fuzzyTranscountid = fuzzyTranscountid;
            return this;
        }

        public QueryBuilder fuzzyTranscountid (String ... fuzzyTranscountid){
            this.fuzzyTranscountid = solveNullList(fuzzyTranscountid);
            return this;
        }

        public QueryBuilder rightFuzzyTranscountid (List<String> rightFuzzyTranscountid){
            this.rightFuzzyTranscountid = rightFuzzyTranscountid;
            return this;
        }

        public QueryBuilder rightFuzzyTranscountid (String ... rightFuzzyTranscountid){
            this.rightFuzzyTranscountid = solveNullList(rightFuzzyTranscountid);
            return this;
        }

        public QueryBuilder transcountid(String transcountid){
            setTranscountid(transcountid);
            return this;
        }

        public QueryBuilder transcountidList(String ... transcountid){
            this.transcountidList = solveNullList(transcountid);
            return this;
        }

        public QueryBuilder transcountidList(List<String> transcountid){
            this.transcountidList = transcountid;
            return this;
        }

        public QueryBuilder fetchTranscountid(){
            setFetchFields("fetchFields","transcountid");
            return this;
        }

        public QueryBuilder excludeTranscountid(){
            setFetchFields("excludeFields","transcountid");
            return this;
        }

        public QueryBuilder fuzzyTransbankname (List<String> fuzzyTransbankname){
            this.fuzzyTransbankname = fuzzyTransbankname;
            return this;
        }

        public QueryBuilder fuzzyTransbankname (String ... fuzzyTransbankname){
            this.fuzzyTransbankname = solveNullList(fuzzyTransbankname);
            return this;
        }

        public QueryBuilder rightFuzzyTransbankname (List<String> rightFuzzyTransbankname){
            this.rightFuzzyTransbankname = rightFuzzyTransbankname;
            return this;
        }

        public QueryBuilder rightFuzzyTransbankname (String ... rightFuzzyTransbankname){
            this.rightFuzzyTransbankname = solveNullList(rightFuzzyTransbankname);
            return this;
        }

        public QueryBuilder transbankname(String transbankname){
            setTransbankname(transbankname);
            return this;
        }

        public QueryBuilder transbanknameList(String ... transbankname){
            this.transbanknameList = solveNullList(transbankname);
            return this;
        }

        public QueryBuilder transbanknameList(List<String> transbankname){
            this.transbanknameList = transbankname;
            return this;
        }

        public QueryBuilder fetchTransbankname(){
            setFetchFields("fetchFields","transbankname");
            return this;
        }

        public QueryBuilder excludeTransbankname(){
            setFetchFields("excludeFields","transbankname");
            return this;
        }

        public QueryBuilder fuzzyTranscountname (List<String> fuzzyTranscountname){
            this.fuzzyTranscountname = fuzzyTranscountname;
            return this;
        }

        public QueryBuilder fuzzyTranscountname (String ... fuzzyTranscountname){
            this.fuzzyTranscountname = solveNullList(fuzzyTranscountname);
            return this;
        }

        public QueryBuilder rightFuzzyTranscountname (List<String> rightFuzzyTranscountname){
            this.rightFuzzyTranscountname = rightFuzzyTranscountname;
            return this;
        }

        public QueryBuilder rightFuzzyTranscountname (String ... rightFuzzyTranscountname){
            this.rightFuzzyTranscountname = solveNullList(rightFuzzyTranscountname);
            return this;
        }

        public QueryBuilder transcountname(String transcountname){
            setTranscountname(transcountname);
            return this;
        }

        public QueryBuilder transcountnameList(String ... transcountname){
            this.transcountnameList = solveNullList(transcountname);
            return this;
        }

        public QueryBuilder transcountnameList(List<String> transcountname){
            this.transcountnameList = transcountname;
            return this;
        }

        public QueryBuilder fetchTranscountname(){
            setFetchFields("fetchFields","transcountname");
            return this;
        }

        public QueryBuilder excludeTranscountname(){
            setFetchFields("excludeFields","transcountname");
            return this;
        }

        public QueryBuilder fuzzyTranstatus (List<String> fuzzyTranstatus){
            this.fuzzyTranstatus = fuzzyTranstatus;
            return this;
        }

        public QueryBuilder fuzzyTranstatus (String ... fuzzyTranstatus){
            this.fuzzyTranstatus = solveNullList(fuzzyTranstatus);
            return this;
        }

        public QueryBuilder rightFuzzyTranstatus (List<String> rightFuzzyTranstatus){
            this.rightFuzzyTranstatus = rightFuzzyTranstatus;
            return this;
        }

        public QueryBuilder rightFuzzyTranstatus (String ... rightFuzzyTranstatus){
            this.rightFuzzyTranstatus = solveNullList(rightFuzzyTranstatus);
            return this;
        }

        public QueryBuilder transtatus(String transtatus){
            setTranstatus(transtatus);
            return this;
        }

        public QueryBuilder transtatusList(String ... transtatus){
            this.transtatusList = solveNullList(transtatus);
            return this;
        }

        public QueryBuilder transtatusList(List<String> transtatus){
            this.transtatusList = transtatus;
            return this;
        }

        public QueryBuilder fetchTranstatus(){
            setFetchFields("fetchFields","transtatus");
            return this;
        }

        public QueryBuilder excludeTranstatus(){
            setFetchFields("excludeFields","transtatus");
            return this;
        }

        public QueryBuilder fuzzyTranscomtime (List<String> fuzzyTranscomtime){
            this.fuzzyTranscomtime = fuzzyTranscomtime;
            return this;
        }

        public QueryBuilder fuzzyTranscomtime (String ... fuzzyTranscomtime){
            this.fuzzyTranscomtime = solveNullList(fuzzyTranscomtime);
            return this;
        }

        public QueryBuilder rightFuzzyTranscomtime (List<String> rightFuzzyTranscomtime){
            this.rightFuzzyTranscomtime = rightFuzzyTranscomtime;
            return this;
        }

        public QueryBuilder rightFuzzyTranscomtime (String ... rightFuzzyTranscomtime){
            this.rightFuzzyTranscomtime = solveNullList(rightFuzzyTranscomtime);
            return this;
        }

        public QueryBuilder transcomtime(String transcomtime){
            setTranscomtime(transcomtime);
            return this;
        }

        public QueryBuilder transcomtimeList(String ... transcomtime){
            this.transcomtimeList = solveNullList(transcomtime);
            return this;
        }

        public QueryBuilder transcomtimeList(List<String> transcomtime){
            this.transcomtimeList = transcomtime;
            return this;
        }

        public QueryBuilder fetchTranscomtime(){
            setFetchFields("fetchFields","transcomtime");
            return this;
        }

        public QueryBuilder excludeTranscomtime(){
            setFetchFields("excludeFields","transcomtime");
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

        public JpyTransrecord build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> bussidList;

        public List<String> getBussidList(){return this.bussidList;}


        private List<String> fuzzyBussid;

        public List<String> getFuzzyBussid(){return this.fuzzyBussid;}

        private List<String> rightFuzzyBussid;

        public List<String> getRightFuzzyBussid(){return this.rightFuzzyBussid;}
        private List<String> jstradenoList;

        public List<String> getJstradenoList(){return this.jstradenoList;}


        private List<String> fuzzyJstradeno;

        public List<String> getFuzzyJstradeno(){return this.fuzzyJstradeno;}

        private List<String> rightFuzzyJstradeno;

        public List<String> getRightFuzzyJstradeno(){return this.rightFuzzyJstradeno;}
        private List<String> jstimeList;

        public List<String> getJstimeList(){return this.jstimeList;}


        private List<String> fuzzyJstime;

        public List<String> getFuzzyJstime(){return this.fuzzyJstime;}

        private List<String> rightFuzzyJstime;

        public List<String> getRightFuzzyJstime(){return this.rightFuzzyJstime;}
        private List<String> jsnumList;

        public List<String> getJsnumList(){return this.jsnumList;}


        private List<String> fuzzyJsnum;

        public List<String> getFuzzyJsnum(){return this.fuzzyJsnum;}

        private List<String> rightFuzzyJsnum;

        public List<String> getRightFuzzyJsnum(){return this.rightFuzzyJsnum;}
        private List<String> transcountidList;

        public List<String> getTranscountidList(){return this.transcountidList;}


        private List<String> fuzzyTranscountid;

        public List<String> getFuzzyTranscountid(){return this.fuzzyTranscountid;}

        private List<String> rightFuzzyTranscountid;

        public List<String> getRightFuzzyTranscountid(){return this.rightFuzzyTranscountid;}
        private List<String> transbanknameList;

        public List<String> getTransbanknameList(){return this.transbanknameList;}


        private List<String> fuzzyTransbankname;

        public List<String> getFuzzyTransbankname(){return this.fuzzyTransbankname;}

        private List<String> rightFuzzyTransbankname;

        public List<String> getRightFuzzyTransbankname(){return this.rightFuzzyTransbankname;}
        private List<String> transcountnameList;

        public List<String> getTranscountnameList(){return this.transcountnameList;}


        private List<String> fuzzyTranscountname;

        public List<String> getFuzzyTranscountname(){return this.fuzzyTranscountname;}

        private List<String> rightFuzzyTranscountname;

        public List<String> getRightFuzzyTranscountname(){return this.rightFuzzyTranscountname;}
        private List<String> transtatusList;

        public List<String> getTranstatusList(){return this.transtatusList;}


        private List<String> fuzzyTranstatus;

        public List<String> getFuzzyTranstatus(){return this.fuzzyTranstatus;}

        private List<String> rightFuzzyTranstatus;

        public List<String> getRightFuzzyTranstatus(){return this.rightFuzzyTranstatus;}
        private List<String> transcomtimeList;

        public List<String> getTranscomtimeList(){return this.transcomtimeList;}


        private List<String> fuzzyTranscomtime;

        public List<String> getFuzzyTranscomtime(){return this.fuzzyTranscomtime;}

        private List<String> rightFuzzyTranscomtime;

        public List<String> getRightFuzzyTranscomtime(){return this.rightFuzzyTranscomtime;}

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

        public ConditionBuilder fuzzyJstradeno (List<String> fuzzyJstradeno){
            this.fuzzyJstradeno = fuzzyJstradeno;
            return this;
        }

        public ConditionBuilder fuzzyJstradeno (String ... fuzzyJstradeno){
            this.fuzzyJstradeno = solveNullList(fuzzyJstradeno);
            return this;
        }

        public ConditionBuilder rightFuzzyJstradeno (List<String> rightFuzzyJstradeno){
            this.rightFuzzyJstradeno = rightFuzzyJstradeno;
            return this;
        }

        public ConditionBuilder rightFuzzyJstradeno (String ... rightFuzzyJstradeno){
            this.rightFuzzyJstradeno = solveNullList(rightFuzzyJstradeno);
            return this;
        }

        public ConditionBuilder jstradenoList(String ... jstradeno){
            this.jstradenoList = solveNullList(jstradeno);
            return this;
        }

        public ConditionBuilder jstradenoList(List<String> jstradeno){
            this.jstradenoList = jstradeno;
            return this;
        }

        public ConditionBuilder fuzzyJstime (List<String> fuzzyJstime){
            this.fuzzyJstime = fuzzyJstime;
            return this;
        }

        public ConditionBuilder fuzzyJstime (String ... fuzzyJstime){
            this.fuzzyJstime = solveNullList(fuzzyJstime);
            return this;
        }

        public ConditionBuilder rightFuzzyJstime (List<String> rightFuzzyJstime){
            this.rightFuzzyJstime = rightFuzzyJstime;
            return this;
        }

        public ConditionBuilder rightFuzzyJstime (String ... rightFuzzyJstime){
            this.rightFuzzyJstime = solveNullList(rightFuzzyJstime);
            return this;
        }

        public ConditionBuilder jstimeList(String ... jstime){
            this.jstimeList = solveNullList(jstime);
            return this;
        }

        public ConditionBuilder jstimeList(List<String> jstime){
            this.jstimeList = jstime;
            return this;
        }

        public ConditionBuilder fuzzyJsnum (List<String> fuzzyJsnum){
            this.fuzzyJsnum = fuzzyJsnum;
            return this;
        }

        public ConditionBuilder fuzzyJsnum (String ... fuzzyJsnum){
            this.fuzzyJsnum = solveNullList(fuzzyJsnum);
            return this;
        }

        public ConditionBuilder rightFuzzyJsnum (List<String> rightFuzzyJsnum){
            this.rightFuzzyJsnum = rightFuzzyJsnum;
            return this;
        }

        public ConditionBuilder rightFuzzyJsnum (String ... rightFuzzyJsnum){
            this.rightFuzzyJsnum = solveNullList(rightFuzzyJsnum);
            return this;
        }

        public ConditionBuilder jsnumList(String ... jsnum){
            this.jsnumList = solveNullList(jsnum);
            return this;
        }

        public ConditionBuilder jsnumList(List<String> jsnum){
            this.jsnumList = jsnum;
            return this;
        }

        public ConditionBuilder fuzzyTranscountid (List<String> fuzzyTranscountid){
            this.fuzzyTranscountid = fuzzyTranscountid;
            return this;
        }

        public ConditionBuilder fuzzyTranscountid (String ... fuzzyTranscountid){
            this.fuzzyTranscountid = solveNullList(fuzzyTranscountid);
            return this;
        }

        public ConditionBuilder rightFuzzyTranscountid (List<String> rightFuzzyTranscountid){
            this.rightFuzzyTranscountid = rightFuzzyTranscountid;
            return this;
        }

        public ConditionBuilder rightFuzzyTranscountid (String ... rightFuzzyTranscountid){
            this.rightFuzzyTranscountid = solveNullList(rightFuzzyTranscountid);
            return this;
        }

        public ConditionBuilder transcountidList(String ... transcountid){
            this.transcountidList = solveNullList(transcountid);
            return this;
        }

        public ConditionBuilder transcountidList(List<String> transcountid){
            this.transcountidList = transcountid;
            return this;
        }

        public ConditionBuilder fuzzyTransbankname (List<String> fuzzyTransbankname){
            this.fuzzyTransbankname = fuzzyTransbankname;
            return this;
        }

        public ConditionBuilder fuzzyTransbankname (String ... fuzzyTransbankname){
            this.fuzzyTransbankname = solveNullList(fuzzyTransbankname);
            return this;
        }

        public ConditionBuilder rightFuzzyTransbankname (List<String> rightFuzzyTransbankname){
            this.rightFuzzyTransbankname = rightFuzzyTransbankname;
            return this;
        }

        public ConditionBuilder rightFuzzyTransbankname (String ... rightFuzzyTransbankname){
            this.rightFuzzyTransbankname = solveNullList(rightFuzzyTransbankname);
            return this;
        }

        public ConditionBuilder transbanknameList(String ... transbankname){
            this.transbanknameList = solveNullList(transbankname);
            return this;
        }

        public ConditionBuilder transbanknameList(List<String> transbankname){
            this.transbanknameList = transbankname;
            return this;
        }

        public ConditionBuilder fuzzyTranscountname (List<String> fuzzyTranscountname){
            this.fuzzyTranscountname = fuzzyTranscountname;
            return this;
        }

        public ConditionBuilder fuzzyTranscountname (String ... fuzzyTranscountname){
            this.fuzzyTranscountname = solveNullList(fuzzyTranscountname);
            return this;
        }

        public ConditionBuilder rightFuzzyTranscountname (List<String> rightFuzzyTranscountname){
            this.rightFuzzyTranscountname = rightFuzzyTranscountname;
            return this;
        }

        public ConditionBuilder rightFuzzyTranscountname (String ... rightFuzzyTranscountname){
            this.rightFuzzyTranscountname = solveNullList(rightFuzzyTranscountname);
            return this;
        }

        public ConditionBuilder transcountnameList(String ... transcountname){
            this.transcountnameList = solveNullList(transcountname);
            return this;
        }

        public ConditionBuilder transcountnameList(List<String> transcountname){
            this.transcountnameList = transcountname;
            return this;
        }

        public ConditionBuilder fuzzyTranstatus (List<String> fuzzyTranstatus){
            this.fuzzyTranstatus = fuzzyTranstatus;
            return this;
        }

        public ConditionBuilder fuzzyTranstatus (String ... fuzzyTranstatus){
            this.fuzzyTranstatus = solveNullList(fuzzyTranstatus);
            return this;
        }

        public ConditionBuilder rightFuzzyTranstatus (List<String> rightFuzzyTranstatus){
            this.rightFuzzyTranstatus = rightFuzzyTranstatus;
            return this;
        }

        public ConditionBuilder rightFuzzyTranstatus (String ... rightFuzzyTranstatus){
            this.rightFuzzyTranstatus = solveNullList(rightFuzzyTranstatus);
            return this;
        }

        public ConditionBuilder transtatusList(String ... transtatus){
            this.transtatusList = solveNullList(transtatus);
            return this;
        }

        public ConditionBuilder transtatusList(List<String> transtatus){
            this.transtatusList = transtatus;
            return this;
        }

        public ConditionBuilder fuzzyTranscomtime (List<String> fuzzyTranscomtime){
            this.fuzzyTranscomtime = fuzzyTranscomtime;
            return this;
        }

        public ConditionBuilder fuzzyTranscomtime (String ... fuzzyTranscomtime){
            this.fuzzyTranscomtime = solveNullList(fuzzyTranscomtime);
            return this;
        }

        public ConditionBuilder rightFuzzyTranscomtime (List<String> rightFuzzyTranscomtime){
            this.rightFuzzyTranscomtime = rightFuzzyTranscomtime;
            return this;
        }

        public ConditionBuilder rightFuzzyTranscomtime (String ... rightFuzzyTranscomtime){
            this.rightFuzzyTranscomtime = solveNullList(rightFuzzyTranscomtime);
            return this;
        }

        public ConditionBuilder transcomtimeList(String ... transcomtime){
            this.transcomtimeList = solveNullList(transcomtime);
            return this;
        }

        public ConditionBuilder transcomtimeList(List<String> transcomtime){
            this.transcomtimeList = transcomtime;
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

        private JpyTransrecord obj;

        public Builder(){
            this.obj = new JpyTransrecord();
        }

        public Builder bussid(String bussid){
            this.obj.setBussid(bussid);
            return this;
        }
        public Builder jstradeno(String jstradeno){
            this.obj.setJstradeno(jstradeno);
            return this;
        }
        public Builder jstime(String jstime){
            this.obj.setJstime(jstime);
            return this;
        }
        public Builder jsnum(String jsnum){
            this.obj.setJsnum(jsnum);
            return this;
        }
        public Builder transcountid(String transcountid){
            this.obj.setTranscountid(transcountid);
            return this;
        }
        public Builder transbankname(String transbankname){
            this.obj.setTransbankname(transbankname);
            return this;
        }
        public Builder transcountname(String transcountname){
            this.obj.setTranscountname(transcountname);
            return this;
        }
        public Builder transtatus(String transtatus){
            this.obj.setTranstatus(transtatus);
            return this;
        }
        public Builder transcomtime(String transcomtime){
            this.obj.setTranscomtime(transcomtime);
            return this;
        }
        public JpyTransrecord build(){return obj;}
    }

}
