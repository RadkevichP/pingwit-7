package pl.pingwit.lec_17.point_1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class DefaultValueProcessor {


    public void process(Object obj) throws IllegalAccessException {
        // узнать класс
        // получить поля
        // открыть доступ к полю
        // проверить, есть ли в списке аннотаций defaultValue
        // если анотация есть, и значение у поля - null, то засетать дефолтные значения

        Class<?> clazz = obj.getClass();
        for (Field declaredField : clazz.getDeclaredFields()) {
            declaredField.setAccessible(true);
            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(DefaultValue.class) && declaredField.get(obj) == null) {
                    // Objects.isNull(declaredField.get(obj)); - альтернативная проверка на null
                    if (declaredField.getType().equals(String.class)) {
                        declaredField.set(obj, "defaultValue");
                    }
                    if (declaredField.getType().equals(LocalDate.class)) {
                        declaredField.set(obj, LocalDate.now());
                    }
                    if (declaredField.getType().equals(Integer.class)) {
                        declaredField.set(obj, 1);
                    }
                }
            }
        }

    }
}
