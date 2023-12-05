package pl.pingwit.lec_20.point_1;

public interface Converter<T, U> {

    U convert(T input);
}
