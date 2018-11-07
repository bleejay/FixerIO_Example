package FixerIO_Example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class KeyReader {

    private String apiKey;

    public KeyReader() {

        Properties appProps = new Properties();
        try {
            appProps.load(new FileReader("resources/app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.apiKey = appProps.getProperty("api_key");
    }

    public String getApiKey() {
        return apiKey;
    }
}
