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
public class JpyWepayRes implements Serializable {

    private static final long serialVersionUID = 1640164296203L;


    /**
    * 
    * isNullAble:0
    */
    private String id;

    /**
    * 
    * isNullAble:1
    */
    private String mchid;

    /**
    * 
    * isNullAble:1
    */
    private String out_trade_no;

    /**
    * 
    * isNullAble:1
    */
    private String create_time;

    /**
    * 
    * isNullAble:1
    */
    private String transaction_id;

    /**
    * 
    * isNullAble:1
    */
    private String trade_type;

    /**
    * 
    * isNullAble:1
    */
    private String trade_state;

    /**
    * 
    * isNullAble:1
    */
    private String trade_state_desc;

    /**
    * 
    * isNullAble:1
    */
    private String bank_type;

    /**
    * 
    * isNullAble:1
    */
    private String attach;

    /**
    * 
    * isNullAble:1
    */
    private String success_time;

    /**
    * 
    * isNullAble:1
    */
    private String payer;


    public void setId(String id){this.id = id;}

    public String getId(){return this.id;}

    public void setMchid(String mchid){this.mchid = mchid;}

    public String getMchid(){return this.mchid;}

    public void setOut_trade_no(String out_trade_no){this.out_trade_no = out_trade_no;}

    public String getOut_trade_no(){return this.out_trade_no;}

    public void setCreate_time(String create_time){this.create_time = create_time;}

    public String getCreate_time(){return this.create_time;}

    public void setTransaction_id(String transaction_id){this.transaction_id = transaction_id;}

    public String getTransaction_id(){return this.transaction_id;}

    public void setTrade_type(String trade_type){this.trade_type = trade_type;}

    public String getTrade_type(){return this.trade_type;}

    public void setTrade_state(String trade_state){this.trade_state = trade_state;}

    public String getTrade_state(){return this.trade_state;}

    public void setTrade_state_desc(String trade_state_desc){this.trade_state_desc = trade_state_desc;}

    public String getTrade_state_desc(){return this.trade_state_desc;}

    public void setBank_type(String bank_type){this.bank_type = bank_type;}

    public String getBank_type(){return this.bank_type;}

    public void setAttach(String attach){this.attach = attach;}

    public String getAttach(){return this.attach;}

    public void setSuccess_time(String success_time){this.success_time = success_time;}

    public String getSuccess_time(){return this.success_time;}

    public void setPayer(String payer){this.payer = payer;}

    public String getPayer(){return this.payer;}
    @Override
    public String toString() {
        return "JpyWepayRes{" +
                "id='" + id + '\'' +
                "mchid='" + mchid + '\'' +
                "out_trade_no='" + out_trade_no + '\'' +
                "create_time='" + create_time + '\'' +
                "transaction_id='" + transaction_id + '\'' +
                "trade_type='" + trade_type + '\'' +
                "trade_state='" + trade_state + '\'' +
                "trade_state_desc='" + trade_state_desc + '\'' +
                "bank_type='" + bank_type + '\'' +
                "attach='" + attach + '\'' +
                "success_time='" + success_time + '\'' +
                "payer='" + payer + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private JpyWepayRes set;

        private ConditionBuilder where;

        public UpdateBuilder set(JpyWepayRes set){
            this.set = set;
            return this;
        }

        public JpyWepayRes getSet(){
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

    public static class QueryBuilder extends JpyWepayRes{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<String> mchidList;

        public List<String> getMchidList(){return this.mchidList;}


        private List<String> fuzzyMchid;

        public List<String> getFuzzyMchid(){return this.fuzzyMchid;}

        private List<String> rightFuzzyMchid;

        public List<String> getRightFuzzyMchid(){return this.rightFuzzyMchid;}
        private List<String> out_trade_noList;

        public List<String> getOut_trade_noList(){return this.out_trade_noList;}


        private List<String> fuzzyOut_trade_no;

        public List<String> getFuzzyOut_trade_no(){return this.fuzzyOut_trade_no;}

        private List<String> rightFuzzyOut_trade_no;

        public List<String> getRightFuzzyOut_trade_no(){return this.rightFuzzyOut_trade_no;}
        private List<String> create_timeList;

        public List<String> getCreate_timeList(){return this.create_timeList;}


        private List<String> fuzzyCreate_time;

        public List<String> getFuzzyCreate_time(){return this.fuzzyCreate_time;}

        private List<String> rightFuzzyCreate_time;

        public List<String> getRightFuzzyCreate_time(){return this.rightFuzzyCreate_time;}
        private List<String> transaction_idList;

        public List<String> getTransaction_idList(){return this.transaction_idList;}


        private List<String> fuzzyTransaction_id;

        public List<String> getFuzzyTransaction_id(){return this.fuzzyTransaction_id;}

        private List<String> rightFuzzyTransaction_id;

        public List<String> getRightFuzzyTransaction_id(){return this.rightFuzzyTransaction_id;}
        private List<String> trade_typeList;

        public List<String> getTrade_typeList(){return this.trade_typeList;}


        private List<String> fuzzyTrade_type;

        public List<String> getFuzzyTrade_type(){return this.fuzzyTrade_type;}

        private List<String> rightFuzzyTrade_type;

        public List<String> getRightFuzzyTrade_type(){return this.rightFuzzyTrade_type;}
        private List<String> trade_stateList;

        public List<String> getTrade_stateList(){return this.trade_stateList;}


        private List<String> fuzzyTrade_state;

        public List<String> getFuzzyTrade_state(){return this.fuzzyTrade_state;}

        private List<String> rightFuzzyTrade_state;

        public List<String> getRightFuzzyTrade_state(){return this.rightFuzzyTrade_state;}
        private List<String> trade_state_descList;

        public List<String> getTrade_state_descList(){return this.trade_state_descList;}


        private List<String> fuzzyTrade_state_desc;

        public List<String> getFuzzyTrade_state_desc(){return this.fuzzyTrade_state_desc;}

        private List<String> rightFuzzyTrade_state_desc;

        public List<String> getRightFuzzyTrade_state_desc(){return this.rightFuzzyTrade_state_desc;}
        private List<String> bank_typeList;

        public List<String> getBank_typeList(){return this.bank_typeList;}


        private List<String> fuzzyBank_type;

        public List<String> getFuzzyBank_type(){return this.fuzzyBank_type;}

        private List<String> rightFuzzyBank_type;

        public List<String> getRightFuzzyBank_type(){return this.rightFuzzyBank_type;}
        private List<String> attachList;

        public List<String> getAttachList(){return this.attachList;}


        private List<String> fuzzyAttach;

        public List<String> getFuzzyAttach(){return this.fuzzyAttach;}

        private List<String> rightFuzzyAttach;

        public List<String> getRightFuzzyAttach(){return this.rightFuzzyAttach;}
        private List<String> success_timeList;

        public List<String> getSuccess_timeList(){return this.success_timeList;}


        private List<String> fuzzySuccess_time;

        public List<String> getFuzzySuccess_time(){return this.fuzzySuccess_time;}

        private List<String> rightFuzzySuccess_time;

        public List<String> getRightFuzzySuccess_time(){return this.rightFuzzySuccess_time;}
        private List<String> payerList;

        public List<String> getPayerList(){return this.payerList;}


        private List<String> fuzzyPayer;

        public List<String> getFuzzyPayer(){return this.fuzzyPayer;}

        private List<String> rightFuzzyPayer;

        public List<String> getRightFuzzyPayer(){return this.rightFuzzyPayer;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyId (List<String> fuzzyId){
            this.fuzzyId = fuzzyId;
            return this;
        }

        public QueryBuilder fuzzyId (String ... fuzzyId){
            this.fuzzyId = solveNullList(fuzzyId);
            return this;
        }

        public QueryBuilder rightFuzzyId (List<String> rightFuzzyId){
            this.rightFuzzyId = rightFuzzyId;
            return this;
        }

        public QueryBuilder rightFuzzyId (String ... rightFuzzyId){
            this.rightFuzzyId = solveNullList(rightFuzzyId);
            return this;
        }

        public QueryBuilder id(String id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(String ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<String> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyMchid (List<String> fuzzyMchid){
            this.fuzzyMchid = fuzzyMchid;
            return this;
        }

        public QueryBuilder fuzzyMchid (String ... fuzzyMchid){
            this.fuzzyMchid = solveNullList(fuzzyMchid);
            return this;
        }

        public QueryBuilder rightFuzzyMchid (List<String> rightFuzzyMchid){
            this.rightFuzzyMchid = rightFuzzyMchid;
            return this;
        }

        public QueryBuilder rightFuzzyMchid (String ... rightFuzzyMchid){
            this.rightFuzzyMchid = solveNullList(rightFuzzyMchid);
            return this;
        }

        public QueryBuilder mchid(String mchid){
            setMchid(mchid);
            return this;
        }

        public QueryBuilder mchidList(String ... mchid){
            this.mchidList = solveNullList(mchid);
            return this;
        }

        public QueryBuilder mchidList(List<String> mchid){
            this.mchidList = mchid;
            return this;
        }

        public QueryBuilder fetchMchid(){
            setFetchFields("fetchFields","mchid");
            return this;
        }

        public QueryBuilder excludeMchid(){
            setFetchFields("excludeFields","mchid");
            return this;
        }

        public QueryBuilder fuzzyOut_trade_no (List<String> fuzzyOut_trade_no){
            this.fuzzyOut_trade_no = fuzzyOut_trade_no;
            return this;
        }

        public QueryBuilder fuzzyOut_trade_no (String ... fuzzyOut_trade_no){
            this.fuzzyOut_trade_no = solveNullList(fuzzyOut_trade_no);
            return this;
        }

        public QueryBuilder rightFuzzyOut_trade_no (List<String> rightFuzzyOut_trade_no){
            this.rightFuzzyOut_trade_no = rightFuzzyOut_trade_no;
            return this;
        }

        public QueryBuilder rightFuzzyOut_trade_no (String ... rightFuzzyOut_trade_no){
            this.rightFuzzyOut_trade_no = solveNullList(rightFuzzyOut_trade_no);
            return this;
        }

        public QueryBuilder out_trade_no(String out_trade_no){
            setOut_trade_no(out_trade_no);
            return this;
        }

        public QueryBuilder out_trade_noList(String ... out_trade_no){
            this.out_trade_noList = solveNullList(out_trade_no);
            return this;
        }

        public QueryBuilder out_trade_noList(List<String> out_trade_no){
            this.out_trade_noList = out_trade_no;
            return this;
        }

        public QueryBuilder fetchOut_trade_no(){
            setFetchFields("fetchFields","out_trade_no");
            return this;
        }

        public QueryBuilder excludeOut_trade_no(){
            setFetchFields("excludeFields","out_trade_no");
            return this;
        }

        public QueryBuilder fuzzyCreate_time (List<String> fuzzyCreate_time){
            this.fuzzyCreate_time = fuzzyCreate_time;
            return this;
        }

        public QueryBuilder fuzzyCreate_time (String ... fuzzyCreate_time){
            this.fuzzyCreate_time = solveNullList(fuzzyCreate_time);
            return this;
        }

        public QueryBuilder rightFuzzyCreate_time (List<String> rightFuzzyCreate_time){
            this.rightFuzzyCreate_time = rightFuzzyCreate_time;
            return this;
        }

        public QueryBuilder rightFuzzyCreate_time (String ... rightFuzzyCreate_time){
            this.rightFuzzyCreate_time = solveNullList(rightFuzzyCreate_time);
            return this;
        }

        public QueryBuilder create_time(String create_time){
            setCreate_time(create_time);
            return this;
        }

        public QueryBuilder create_timeList(String ... create_time){
            this.create_timeList = solveNullList(create_time);
            return this;
        }

        public QueryBuilder create_timeList(List<String> create_time){
            this.create_timeList = create_time;
            return this;
        }

        public QueryBuilder fetchCreate_time(){
            setFetchFields("fetchFields","create_time");
            return this;
        }

        public QueryBuilder excludeCreate_time(){
            setFetchFields("excludeFields","create_time");
            return this;
        }

        public QueryBuilder fuzzyTransaction_id (List<String> fuzzyTransaction_id){
            this.fuzzyTransaction_id = fuzzyTransaction_id;
            return this;
        }

        public QueryBuilder fuzzyTransaction_id (String ... fuzzyTransaction_id){
            this.fuzzyTransaction_id = solveNullList(fuzzyTransaction_id);
            return this;
        }

        public QueryBuilder rightFuzzyTransaction_id (List<String> rightFuzzyTransaction_id){
            this.rightFuzzyTransaction_id = rightFuzzyTransaction_id;
            return this;
        }

        public QueryBuilder rightFuzzyTransaction_id (String ... rightFuzzyTransaction_id){
            this.rightFuzzyTransaction_id = solveNullList(rightFuzzyTransaction_id);
            return this;
        }

        public QueryBuilder transaction_id(String transaction_id){
            setTransaction_id(transaction_id);
            return this;
        }

        public QueryBuilder transaction_idList(String ... transaction_id){
            this.transaction_idList = solveNullList(transaction_id);
            return this;
        }

        public QueryBuilder transaction_idList(List<String> transaction_id){
            this.transaction_idList = transaction_id;
            return this;
        }

        public QueryBuilder fetchTransaction_id(){
            setFetchFields("fetchFields","transaction_id");
            return this;
        }

        public QueryBuilder excludeTransaction_id(){
            setFetchFields("excludeFields","transaction_id");
            return this;
        }

        public QueryBuilder fuzzyTrade_type (List<String> fuzzyTrade_type){
            this.fuzzyTrade_type = fuzzyTrade_type;
            return this;
        }

        public QueryBuilder fuzzyTrade_type (String ... fuzzyTrade_type){
            this.fuzzyTrade_type = solveNullList(fuzzyTrade_type);
            return this;
        }

        public QueryBuilder rightFuzzyTrade_type (List<String> rightFuzzyTrade_type){
            this.rightFuzzyTrade_type = rightFuzzyTrade_type;
            return this;
        }

        public QueryBuilder rightFuzzyTrade_type (String ... rightFuzzyTrade_type){
            this.rightFuzzyTrade_type = solveNullList(rightFuzzyTrade_type);
            return this;
        }

        public QueryBuilder trade_type(String trade_type){
            setTrade_type(trade_type);
            return this;
        }

        public QueryBuilder trade_typeList(String ... trade_type){
            this.trade_typeList = solveNullList(trade_type);
            return this;
        }

        public QueryBuilder trade_typeList(List<String> trade_type){
            this.trade_typeList = trade_type;
            return this;
        }

        public QueryBuilder fetchTrade_type(){
            setFetchFields("fetchFields","trade_type");
            return this;
        }

        public QueryBuilder excludeTrade_type(){
            setFetchFields("excludeFields","trade_type");
            return this;
        }

        public QueryBuilder fuzzyTrade_state (List<String> fuzzyTrade_state){
            this.fuzzyTrade_state = fuzzyTrade_state;
            return this;
        }

        public QueryBuilder fuzzyTrade_state (String ... fuzzyTrade_state){
            this.fuzzyTrade_state = solveNullList(fuzzyTrade_state);
            return this;
        }

        public QueryBuilder rightFuzzyTrade_state (List<String> rightFuzzyTrade_state){
            this.rightFuzzyTrade_state = rightFuzzyTrade_state;
            return this;
        }

        public QueryBuilder rightFuzzyTrade_state (String ... rightFuzzyTrade_state){
            this.rightFuzzyTrade_state = solveNullList(rightFuzzyTrade_state);
            return this;
        }

        public QueryBuilder trade_state(String trade_state){
            setTrade_state(trade_state);
            return this;
        }

        public QueryBuilder trade_stateList(String ... trade_state){
            this.trade_stateList = solveNullList(trade_state);
            return this;
        }

        public QueryBuilder trade_stateList(List<String> trade_state){
            this.trade_stateList = trade_state;
            return this;
        }

        public QueryBuilder fetchTrade_state(){
            setFetchFields("fetchFields","trade_state");
            return this;
        }

        public QueryBuilder excludeTrade_state(){
            setFetchFields("excludeFields","trade_state");
            return this;
        }

        public QueryBuilder fuzzyTrade_state_desc (List<String> fuzzyTrade_state_desc){
            this.fuzzyTrade_state_desc = fuzzyTrade_state_desc;
            return this;
        }

        public QueryBuilder fuzzyTrade_state_desc (String ... fuzzyTrade_state_desc){
            this.fuzzyTrade_state_desc = solveNullList(fuzzyTrade_state_desc);
            return this;
        }

        public QueryBuilder rightFuzzyTrade_state_desc (List<String> rightFuzzyTrade_state_desc){
            this.rightFuzzyTrade_state_desc = rightFuzzyTrade_state_desc;
            return this;
        }

        public QueryBuilder rightFuzzyTrade_state_desc (String ... rightFuzzyTrade_state_desc){
            this.rightFuzzyTrade_state_desc = solveNullList(rightFuzzyTrade_state_desc);
            return this;
        }

        public QueryBuilder trade_state_desc(String trade_state_desc){
            setTrade_state_desc(trade_state_desc);
            return this;
        }

        public QueryBuilder trade_state_descList(String ... trade_state_desc){
            this.trade_state_descList = solveNullList(trade_state_desc);
            return this;
        }

        public QueryBuilder trade_state_descList(List<String> trade_state_desc){
            this.trade_state_descList = trade_state_desc;
            return this;
        }

        public QueryBuilder fetchTrade_state_desc(){
            setFetchFields("fetchFields","trade_state_desc");
            return this;
        }

        public QueryBuilder excludeTrade_state_desc(){
            setFetchFields("excludeFields","trade_state_desc");
            return this;
        }

        public QueryBuilder fuzzyBank_type (List<String> fuzzyBank_type){
            this.fuzzyBank_type = fuzzyBank_type;
            return this;
        }

        public QueryBuilder fuzzyBank_type (String ... fuzzyBank_type){
            this.fuzzyBank_type = solveNullList(fuzzyBank_type);
            return this;
        }

        public QueryBuilder rightFuzzyBank_type (List<String> rightFuzzyBank_type){
            this.rightFuzzyBank_type = rightFuzzyBank_type;
            return this;
        }

        public QueryBuilder rightFuzzyBank_type (String ... rightFuzzyBank_type){
            this.rightFuzzyBank_type = solveNullList(rightFuzzyBank_type);
            return this;
        }

        public QueryBuilder bank_type(String bank_type){
            setBank_type(bank_type);
            return this;
        }

        public QueryBuilder bank_typeList(String ... bank_type){
            this.bank_typeList = solveNullList(bank_type);
            return this;
        }

        public QueryBuilder bank_typeList(List<String> bank_type){
            this.bank_typeList = bank_type;
            return this;
        }

        public QueryBuilder fetchBank_type(){
            setFetchFields("fetchFields","bank_type");
            return this;
        }

        public QueryBuilder excludeBank_type(){
            setFetchFields("excludeFields","bank_type");
            return this;
        }

        public QueryBuilder fuzzyAttach (List<String> fuzzyAttach){
            this.fuzzyAttach = fuzzyAttach;
            return this;
        }

        public QueryBuilder fuzzyAttach (String ... fuzzyAttach){
            this.fuzzyAttach = solveNullList(fuzzyAttach);
            return this;
        }

        public QueryBuilder rightFuzzyAttach (List<String> rightFuzzyAttach){
            this.rightFuzzyAttach = rightFuzzyAttach;
            return this;
        }

        public QueryBuilder rightFuzzyAttach (String ... rightFuzzyAttach){
            this.rightFuzzyAttach = solveNullList(rightFuzzyAttach);
            return this;
        }

        public QueryBuilder attach(String attach){
            setAttach(attach);
            return this;
        }

        public QueryBuilder attachList(String ... attach){
            this.attachList = solveNullList(attach);
            return this;
        }

        public QueryBuilder attachList(List<String> attach){
            this.attachList = attach;
            return this;
        }

        public QueryBuilder fetchAttach(){
            setFetchFields("fetchFields","attach");
            return this;
        }

        public QueryBuilder excludeAttach(){
            setFetchFields("excludeFields","attach");
            return this;
        }

        public QueryBuilder fuzzySuccess_time (List<String> fuzzySuccess_time){
            this.fuzzySuccess_time = fuzzySuccess_time;
            return this;
        }

        public QueryBuilder fuzzySuccess_time (String ... fuzzySuccess_time){
            this.fuzzySuccess_time = solveNullList(fuzzySuccess_time);
            return this;
        }

        public QueryBuilder rightFuzzySuccess_time (List<String> rightFuzzySuccess_time){
            this.rightFuzzySuccess_time = rightFuzzySuccess_time;
            return this;
        }

        public QueryBuilder rightFuzzySuccess_time (String ... rightFuzzySuccess_time){
            this.rightFuzzySuccess_time = solveNullList(rightFuzzySuccess_time);
            return this;
        }

        public QueryBuilder success_time(String success_time){
            setSuccess_time(success_time);
            return this;
        }

        public QueryBuilder success_timeList(String ... success_time){
            this.success_timeList = solveNullList(success_time);
            return this;
        }

        public QueryBuilder success_timeList(List<String> success_time){
            this.success_timeList = success_time;
            return this;
        }

        public QueryBuilder fetchSuccess_time(){
            setFetchFields("fetchFields","success_time");
            return this;
        }

        public QueryBuilder excludeSuccess_time(){
            setFetchFields("excludeFields","success_time");
            return this;
        }

        public QueryBuilder fuzzyPayer (List<String> fuzzyPayer){
            this.fuzzyPayer = fuzzyPayer;
            return this;
        }

        public QueryBuilder fuzzyPayer (String ... fuzzyPayer){
            this.fuzzyPayer = solveNullList(fuzzyPayer);
            return this;
        }

        public QueryBuilder rightFuzzyPayer (List<String> rightFuzzyPayer){
            this.rightFuzzyPayer = rightFuzzyPayer;
            return this;
        }

        public QueryBuilder rightFuzzyPayer (String ... rightFuzzyPayer){
            this.rightFuzzyPayer = solveNullList(rightFuzzyPayer);
            return this;
        }

        public QueryBuilder payer(String payer){
            setPayer(payer);
            return this;
        }

        public QueryBuilder payerList(String ... payer){
            this.payerList = solveNullList(payer);
            return this;
        }

        public QueryBuilder payerList(List<String> payer){
            this.payerList = payer;
            return this;
        }

        public QueryBuilder fetchPayer(){
            setFetchFields("fetchFields","payer");
            return this;
        }

        public QueryBuilder excludePayer(){
            setFetchFields("excludeFields","payer");
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

        public JpyWepayRes build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<String> mchidList;

        public List<String> getMchidList(){return this.mchidList;}


        private List<String> fuzzyMchid;

        public List<String> getFuzzyMchid(){return this.fuzzyMchid;}

        private List<String> rightFuzzyMchid;

        public List<String> getRightFuzzyMchid(){return this.rightFuzzyMchid;}
        private List<String> out_trade_noList;

        public List<String> getOut_trade_noList(){return this.out_trade_noList;}


        private List<String> fuzzyOut_trade_no;

        public List<String> getFuzzyOut_trade_no(){return this.fuzzyOut_trade_no;}

        private List<String> rightFuzzyOut_trade_no;

        public List<String> getRightFuzzyOut_trade_no(){return this.rightFuzzyOut_trade_no;}
        private List<String> create_timeList;

        public List<String> getCreate_timeList(){return this.create_timeList;}


        private List<String> fuzzyCreate_time;

        public List<String> getFuzzyCreate_time(){return this.fuzzyCreate_time;}

        private List<String> rightFuzzyCreate_time;

        public List<String> getRightFuzzyCreate_time(){return this.rightFuzzyCreate_time;}
        private List<String> transaction_idList;

        public List<String> getTransaction_idList(){return this.transaction_idList;}


        private List<String> fuzzyTransaction_id;

        public List<String> getFuzzyTransaction_id(){return this.fuzzyTransaction_id;}

        private List<String> rightFuzzyTransaction_id;

        public List<String> getRightFuzzyTransaction_id(){return this.rightFuzzyTransaction_id;}
        private List<String> trade_typeList;

        public List<String> getTrade_typeList(){return this.trade_typeList;}


        private List<String> fuzzyTrade_type;

        public List<String> getFuzzyTrade_type(){return this.fuzzyTrade_type;}

        private List<String> rightFuzzyTrade_type;

        public List<String> getRightFuzzyTrade_type(){return this.rightFuzzyTrade_type;}
        private List<String> trade_stateList;

        public List<String> getTrade_stateList(){return this.trade_stateList;}


        private List<String> fuzzyTrade_state;

        public List<String> getFuzzyTrade_state(){return this.fuzzyTrade_state;}

        private List<String> rightFuzzyTrade_state;

        public List<String> getRightFuzzyTrade_state(){return this.rightFuzzyTrade_state;}
        private List<String> trade_state_descList;

        public List<String> getTrade_state_descList(){return this.trade_state_descList;}


        private List<String> fuzzyTrade_state_desc;

        public List<String> getFuzzyTrade_state_desc(){return this.fuzzyTrade_state_desc;}

        private List<String> rightFuzzyTrade_state_desc;

        public List<String> getRightFuzzyTrade_state_desc(){return this.rightFuzzyTrade_state_desc;}
        private List<String> bank_typeList;

        public List<String> getBank_typeList(){return this.bank_typeList;}


        private List<String> fuzzyBank_type;

        public List<String> getFuzzyBank_type(){return this.fuzzyBank_type;}

        private List<String> rightFuzzyBank_type;

        public List<String> getRightFuzzyBank_type(){return this.rightFuzzyBank_type;}
        private List<String> attachList;

        public List<String> getAttachList(){return this.attachList;}


        private List<String> fuzzyAttach;

        public List<String> getFuzzyAttach(){return this.fuzzyAttach;}

        private List<String> rightFuzzyAttach;

        public List<String> getRightFuzzyAttach(){return this.rightFuzzyAttach;}
        private List<String> success_timeList;

        public List<String> getSuccess_timeList(){return this.success_timeList;}


        private List<String> fuzzySuccess_time;

        public List<String> getFuzzySuccess_time(){return this.fuzzySuccess_time;}

        private List<String> rightFuzzySuccess_time;

        public List<String> getRightFuzzySuccess_time(){return this.rightFuzzySuccess_time;}
        private List<String> payerList;

        public List<String> getPayerList(){return this.payerList;}


        private List<String> fuzzyPayer;

        public List<String> getFuzzyPayer(){return this.fuzzyPayer;}

        private List<String> rightFuzzyPayer;

        public List<String> getRightFuzzyPayer(){return this.rightFuzzyPayer;}

        public ConditionBuilder fuzzyId (List<String> fuzzyId){
            this.fuzzyId = fuzzyId;
            return this;
        }

        public ConditionBuilder fuzzyId (String ... fuzzyId){
            this.fuzzyId = solveNullList(fuzzyId);
            return this;
        }

        public ConditionBuilder rightFuzzyId (List<String> rightFuzzyId){
            this.rightFuzzyId = rightFuzzyId;
            return this;
        }

        public ConditionBuilder rightFuzzyId (String ... rightFuzzyId){
            this.rightFuzzyId = solveNullList(rightFuzzyId);
            return this;
        }

        public ConditionBuilder idList(String ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<String> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyMchid (List<String> fuzzyMchid){
            this.fuzzyMchid = fuzzyMchid;
            return this;
        }

        public ConditionBuilder fuzzyMchid (String ... fuzzyMchid){
            this.fuzzyMchid = solveNullList(fuzzyMchid);
            return this;
        }

        public ConditionBuilder rightFuzzyMchid (List<String> rightFuzzyMchid){
            this.rightFuzzyMchid = rightFuzzyMchid;
            return this;
        }

        public ConditionBuilder rightFuzzyMchid (String ... rightFuzzyMchid){
            this.rightFuzzyMchid = solveNullList(rightFuzzyMchid);
            return this;
        }

        public ConditionBuilder mchidList(String ... mchid){
            this.mchidList = solveNullList(mchid);
            return this;
        }

        public ConditionBuilder mchidList(List<String> mchid){
            this.mchidList = mchid;
            return this;
        }

        public ConditionBuilder fuzzyOut_trade_no (List<String> fuzzyOut_trade_no){
            this.fuzzyOut_trade_no = fuzzyOut_trade_no;
            return this;
        }

        public ConditionBuilder fuzzyOut_trade_no (String ... fuzzyOut_trade_no){
            this.fuzzyOut_trade_no = solveNullList(fuzzyOut_trade_no);
            return this;
        }

        public ConditionBuilder rightFuzzyOut_trade_no (List<String> rightFuzzyOut_trade_no){
            this.rightFuzzyOut_trade_no = rightFuzzyOut_trade_no;
            return this;
        }

        public ConditionBuilder rightFuzzyOut_trade_no (String ... rightFuzzyOut_trade_no){
            this.rightFuzzyOut_trade_no = solveNullList(rightFuzzyOut_trade_no);
            return this;
        }

        public ConditionBuilder out_trade_noList(String ... out_trade_no){
            this.out_trade_noList = solveNullList(out_trade_no);
            return this;
        }

        public ConditionBuilder out_trade_noList(List<String> out_trade_no){
            this.out_trade_noList = out_trade_no;
            return this;
        }

        public ConditionBuilder fuzzyCreate_time (List<String> fuzzyCreate_time){
            this.fuzzyCreate_time = fuzzyCreate_time;
            return this;
        }

        public ConditionBuilder fuzzyCreate_time (String ... fuzzyCreate_time){
            this.fuzzyCreate_time = solveNullList(fuzzyCreate_time);
            return this;
        }

        public ConditionBuilder rightFuzzyCreate_time (List<String> rightFuzzyCreate_time){
            this.rightFuzzyCreate_time = rightFuzzyCreate_time;
            return this;
        }

        public ConditionBuilder rightFuzzyCreate_time (String ... rightFuzzyCreate_time){
            this.rightFuzzyCreate_time = solveNullList(rightFuzzyCreate_time);
            return this;
        }

        public ConditionBuilder create_timeList(String ... create_time){
            this.create_timeList = solveNullList(create_time);
            return this;
        }

        public ConditionBuilder create_timeList(List<String> create_time){
            this.create_timeList = create_time;
            return this;
        }

        public ConditionBuilder fuzzyTransaction_id (List<String> fuzzyTransaction_id){
            this.fuzzyTransaction_id = fuzzyTransaction_id;
            return this;
        }

        public ConditionBuilder fuzzyTransaction_id (String ... fuzzyTransaction_id){
            this.fuzzyTransaction_id = solveNullList(fuzzyTransaction_id);
            return this;
        }

        public ConditionBuilder rightFuzzyTransaction_id (List<String> rightFuzzyTransaction_id){
            this.rightFuzzyTransaction_id = rightFuzzyTransaction_id;
            return this;
        }

        public ConditionBuilder rightFuzzyTransaction_id (String ... rightFuzzyTransaction_id){
            this.rightFuzzyTransaction_id = solveNullList(rightFuzzyTransaction_id);
            return this;
        }

        public ConditionBuilder transaction_idList(String ... transaction_id){
            this.transaction_idList = solveNullList(transaction_id);
            return this;
        }

        public ConditionBuilder transaction_idList(List<String> transaction_id){
            this.transaction_idList = transaction_id;
            return this;
        }

        public ConditionBuilder fuzzyTrade_type (List<String> fuzzyTrade_type){
            this.fuzzyTrade_type = fuzzyTrade_type;
            return this;
        }

        public ConditionBuilder fuzzyTrade_type (String ... fuzzyTrade_type){
            this.fuzzyTrade_type = solveNullList(fuzzyTrade_type);
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_type (List<String> rightFuzzyTrade_type){
            this.rightFuzzyTrade_type = rightFuzzyTrade_type;
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_type (String ... rightFuzzyTrade_type){
            this.rightFuzzyTrade_type = solveNullList(rightFuzzyTrade_type);
            return this;
        }

        public ConditionBuilder trade_typeList(String ... trade_type){
            this.trade_typeList = solveNullList(trade_type);
            return this;
        }

        public ConditionBuilder trade_typeList(List<String> trade_type){
            this.trade_typeList = trade_type;
            return this;
        }

        public ConditionBuilder fuzzyTrade_state (List<String> fuzzyTrade_state){
            this.fuzzyTrade_state = fuzzyTrade_state;
            return this;
        }

        public ConditionBuilder fuzzyTrade_state (String ... fuzzyTrade_state){
            this.fuzzyTrade_state = solveNullList(fuzzyTrade_state);
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_state (List<String> rightFuzzyTrade_state){
            this.rightFuzzyTrade_state = rightFuzzyTrade_state;
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_state (String ... rightFuzzyTrade_state){
            this.rightFuzzyTrade_state = solveNullList(rightFuzzyTrade_state);
            return this;
        }

        public ConditionBuilder trade_stateList(String ... trade_state){
            this.trade_stateList = solveNullList(trade_state);
            return this;
        }

        public ConditionBuilder trade_stateList(List<String> trade_state){
            this.trade_stateList = trade_state;
            return this;
        }

        public ConditionBuilder fuzzyTrade_state_desc (List<String> fuzzyTrade_state_desc){
            this.fuzzyTrade_state_desc = fuzzyTrade_state_desc;
            return this;
        }

        public ConditionBuilder fuzzyTrade_state_desc (String ... fuzzyTrade_state_desc){
            this.fuzzyTrade_state_desc = solveNullList(fuzzyTrade_state_desc);
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_state_desc (List<String> rightFuzzyTrade_state_desc){
            this.rightFuzzyTrade_state_desc = rightFuzzyTrade_state_desc;
            return this;
        }

        public ConditionBuilder rightFuzzyTrade_state_desc (String ... rightFuzzyTrade_state_desc){
            this.rightFuzzyTrade_state_desc = solveNullList(rightFuzzyTrade_state_desc);
            return this;
        }

        public ConditionBuilder trade_state_descList(String ... trade_state_desc){
            this.trade_state_descList = solveNullList(trade_state_desc);
            return this;
        }

        public ConditionBuilder trade_state_descList(List<String> trade_state_desc){
            this.trade_state_descList = trade_state_desc;
            return this;
        }

        public ConditionBuilder fuzzyBank_type (List<String> fuzzyBank_type){
            this.fuzzyBank_type = fuzzyBank_type;
            return this;
        }

        public ConditionBuilder fuzzyBank_type (String ... fuzzyBank_type){
            this.fuzzyBank_type = solveNullList(fuzzyBank_type);
            return this;
        }

        public ConditionBuilder rightFuzzyBank_type (List<String> rightFuzzyBank_type){
            this.rightFuzzyBank_type = rightFuzzyBank_type;
            return this;
        }

        public ConditionBuilder rightFuzzyBank_type (String ... rightFuzzyBank_type){
            this.rightFuzzyBank_type = solveNullList(rightFuzzyBank_type);
            return this;
        }

        public ConditionBuilder bank_typeList(String ... bank_type){
            this.bank_typeList = solveNullList(bank_type);
            return this;
        }

        public ConditionBuilder bank_typeList(List<String> bank_type){
            this.bank_typeList = bank_type;
            return this;
        }

        public ConditionBuilder fuzzyAttach (List<String> fuzzyAttach){
            this.fuzzyAttach = fuzzyAttach;
            return this;
        }

        public ConditionBuilder fuzzyAttach (String ... fuzzyAttach){
            this.fuzzyAttach = solveNullList(fuzzyAttach);
            return this;
        }

        public ConditionBuilder rightFuzzyAttach (List<String> rightFuzzyAttach){
            this.rightFuzzyAttach = rightFuzzyAttach;
            return this;
        }

        public ConditionBuilder rightFuzzyAttach (String ... rightFuzzyAttach){
            this.rightFuzzyAttach = solveNullList(rightFuzzyAttach);
            return this;
        }

        public ConditionBuilder attachList(String ... attach){
            this.attachList = solveNullList(attach);
            return this;
        }

        public ConditionBuilder attachList(List<String> attach){
            this.attachList = attach;
            return this;
        }

        public ConditionBuilder fuzzySuccess_time (List<String> fuzzySuccess_time){
            this.fuzzySuccess_time = fuzzySuccess_time;
            return this;
        }

        public ConditionBuilder fuzzySuccess_time (String ... fuzzySuccess_time){
            this.fuzzySuccess_time = solveNullList(fuzzySuccess_time);
            return this;
        }

        public ConditionBuilder rightFuzzySuccess_time (List<String> rightFuzzySuccess_time){
            this.rightFuzzySuccess_time = rightFuzzySuccess_time;
            return this;
        }

        public ConditionBuilder rightFuzzySuccess_time (String ... rightFuzzySuccess_time){
            this.rightFuzzySuccess_time = solveNullList(rightFuzzySuccess_time);
            return this;
        }

        public ConditionBuilder success_timeList(String ... success_time){
            this.success_timeList = solveNullList(success_time);
            return this;
        }

        public ConditionBuilder success_timeList(List<String> success_time){
            this.success_timeList = success_time;
            return this;
        }

        public ConditionBuilder fuzzyPayer (List<String> fuzzyPayer){
            this.fuzzyPayer = fuzzyPayer;
            return this;
        }

        public ConditionBuilder fuzzyPayer (String ... fuzzyPayer){
            this.fuzzyPayer = solveNullList(fuzzyPayer);
            return this;
        }

        public ConditionBuilder rightFuzzyPayer (List<String> rightFuzzyPayer){
            this.rightFuzzyPayer = rightFuzzyPayer;
            return this;
        }

        public ConditionBuilder rightFuzzyPayer (String ... rightFuzzyPayer){
            this.rightFuzzyPayer = solveNullList(rightFuzzyPayer);
            return this;
        }

        public ConditionBuilder payerList(String ... payer){
            this.payerList = solveNullList(payer);
            return this;
        }

        public ConditionBuilder payerList(List<String> payer){
            this.payerList = payer;
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

        private JpyWepayRes obj;

        public Builder(){
            this.obj = new JpyWepayRes();
        }

        public Builder id(String id){
            this.obj.setId(id);
            return this;
        }
        public Builder mchid(String mchid){
            this.obj.setMchid(mchid);
            return this;
        }
        public Builder out_trade_no(String out_trade_no){
            this.obj.setOut_trade_no(out_trade_no);
            return this;
        }
        public Builder create_time(String create_time){
            this.obj.setCreate_time(create_time);
            return this;
        }
        public Builder transaction_id(String transaction_id){
            this.obj.setTransaction_id(transaction_id);
            return this;
        }
        public Builder trade_type(String trade_type){
            this.obj.setTrade_type(trade_type);
            return this;
        }
        public Builder trade_state(String trade_state){
            this.obj.setTrade_state(trade_state);
            return this;
        }
        public Builder trade_state_desc(String trade_state_desc){
            this.obj.setTrade_state_desc(trade_state_desc);
            return this;
        }
        public Builder bank_type(String bank_type){
            this.obj.setBank_type(bank_type);
            return this;
        }
        public Builder attach(String attach){
            this.obj.setAttach(attach);
            return this;
        }
        public Builder success_time(String success_time){
            this.obj.setSuccess_time(success_time);
            return this;
        }
        public Builder payer(String payer){
            this.obj.setPayer(payer);
            return this;
        }
        public JpyWepayRes build(){return obj;}
    }

}
