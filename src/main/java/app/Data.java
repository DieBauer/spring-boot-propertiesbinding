package app;

import java.util.Optional;

public class Data {
    final String data;

    public Data(String data) {
        this.data = data;
    }

    public static Optional<Data> from(String s) {
        return Optional.of(new Data(s));
    }
}
