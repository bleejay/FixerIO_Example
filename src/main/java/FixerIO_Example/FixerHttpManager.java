package FixerIO_Example;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class FixerHttpManager {

    private String baseUrl;
    private String apiKey;
    private String latestRates;

    public FixerHttpManager() {
        KeyReader keyReader = new KeyReader();
        apiKey = "access_key=" + keyReader.getApiKey();
        baseUrl = "http://data.fixer.io/api";
    }

    public void setLatestRates(){
        try {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet getLatestRates = new HttpGet(baseUrl + "/latest?" + apiKey);
        CloseableHttpResponse response = httpClient.execute(getLatestRates);
        latestRates = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLatestRates() {
        return latestRates;
    }
}
