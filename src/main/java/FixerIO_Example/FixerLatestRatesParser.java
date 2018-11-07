package FixerIO_Example;

import org.json.simple.JSONObject;

public class FixerLatestRatesParser {

    JSONObject ratesFile;

    public FixerLatestRatesParser() {
        FixerHttpManager fixerHttpManager = new FixerHttpManager();
        JSONFactory jsonFactory = new JSONFactory();
        fixerHttpManager.setLatestRates();
        jsonFactory.setLatestRatesJSON(fixerHttpManager.getLatestRates());
        ratesFile = jsonFactory.getLatestRatesJSON();
    }

    //getters
    private Object getJSONValue(String key){return ratesFile.get(key);}
    public boolean getFileSuccess(){return (boolean) getJSONValue("success");}
    public long getTimeStamp(){return (long) getJSONValue("timestamp");}
    public String getBaseRate(){return getJSONValue("base").toString();}
    public String getDate(){return getJSONValue("date").toString();}
    public JSONObject getRates(){return (JSONObject) getJSONValue("rates");}
    public Double getSpecificRate(String key){
        JSONObject allRates = getRates();
        return (Double) allRates.get(key);
    }
}
