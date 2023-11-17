package pl.pingwit.lec_16.point_1;

import org.apache.commons.lang3.RandomUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMethodTricks {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        RandomGreetingService randomGreetingService = new RandomGreetingService();
        randomGreetingService.greetPerson("ooo");

        callMethodsReflectively(randomGreetingService);
    }

    private static void callMethodsReflectively(Object obj) throws InvocationTargetException, IllegalAccessException {
        // ищем все методы с 1 аргументом типа String, если нашли такие методы - вызываем с аргументом 'Вася"
        Class<?> clazz = obj.getClass();
        for (Method declaredMethod : clazz.getDeclaredMethods()) {
            if (declaredMethod.getParameterCount() == 1 &&
                    declaredMethod.getParameters()[0].getType().equals(String.class)) {
                declaredMethod.invoke(obj, "Вася");
            }
        }
    }
}
