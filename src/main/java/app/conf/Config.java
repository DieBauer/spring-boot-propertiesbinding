package app.conf;

import app.Data;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DataProperties.class)
public class Config {

    @Bean
    public Data data(DataProperties p) {
        return p.getMyData();
    }


    @Bean
    @ConfigurationPropertiesBinding
    public DataConverter converter() {
        return new DataConverter();
    }


}
