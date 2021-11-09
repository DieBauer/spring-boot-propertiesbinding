package app.conf;

import app.Data;
import org.springframework.core.convert.converter.Converter;

public class DataConverter implements Converter<String, Data> {
    @Override
    public Data convert(String source) {
        return new Data(source);
    }
}
