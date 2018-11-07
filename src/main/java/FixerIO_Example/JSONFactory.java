package FixerIO_Example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFactory {

    private JSONObject latestRatesJSON;

    public JSONObject getLatestRatesJSON() {return latestRatesJSON;}

    public void setLatestRatesJSON(String latestRatesJSONString) {
        try {
            JSONParser parser = new JSONParser();
            this.latestRatesJSON = (JSONObject) parser.parse(latestRatesJSONString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
