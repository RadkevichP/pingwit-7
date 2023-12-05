package pl.pingwit.lec_20.point_1;

public class StringToIntegerConverter implements Converter<String, Integer>{
    @Override
    public Integer convert(String input) {
        return input.length();
    }
}
