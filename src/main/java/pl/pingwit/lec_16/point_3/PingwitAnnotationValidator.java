package pl.pingwit.lec_16.point_3;

import pl.pingwit.lec_16.point_2.FirstCapitalLetter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;


public class PingwitAnnotationValidator {

    private static final Pattern FIRST_CAPITAL_LETTER_PATTERN = Pattern.compile("^[A-Z].*");

    public void validate(Object obj) throws IllegalAccessException {
        // поверить, есть ли у объекта поля, помеченные @FirstCapitalLetter
        // поверить значения этих полей
        Class<?> clazz = obj.getClass();

        for (Field declaredField : clazz.getDeclaredFields()) {
            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(FirstCapitalLetter.class) && declaredField.getType().equals(String.class)) {
                    declaredField.setAccessible(true);
                    String value = (String) declaredField.get(obj);
                    if (!FIRST_CAPITAL_LETTER_PATTERN.matcher(value).matches()) {
                        String message = String.format("Field %s with value %s must start with capital letter!", declaredField.getName(), value);
                        throw new PingwitValidationException(message);
                    }
                }
            }
        }
    }

}
