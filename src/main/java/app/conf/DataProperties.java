package app.conf;


import app.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class DataProperties {
    Data myData;

    public void setMyData(Data myData) {
        this.myData = myData;
    }

    public Data getMyData() {
        return myData;
    }
}
