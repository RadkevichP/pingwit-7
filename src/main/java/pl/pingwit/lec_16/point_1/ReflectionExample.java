package pl.pingwit.lec_16.point_1;


import pl.pingwit.lec_15.point_1.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

public class ReflectionExample {

    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException, InstantiationException {
        Object userInfo = new UserInfo("Peter", "Parker", "898776", "hahaha", LocalDate.of(2016, 8, 8));
        Object person = new Person("Steven", "Meaven", LocalDate.now());

        showReflectionTricks(userInfo);
        showReflectionTricks(person);
    }

    private static void showReflectionTricks(Object obj) throws IllegalAccessException {
        /*if (obj instanceof UserInfo) {
            UserInfo userInfo1 = (UserInfo) obj;  //type casting }
        }
        if (obj instanceof Person) {
            Person person = (Person) obj;
        }*/
        Class<?> clazz = obj.getClass();
        System.out.println(clazz.getCanonicalName());
        System.out.println(clazz.getSimpleName());

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            System.out.println(
                    String.format("field %s has type %s and value %s",
                            declaredField.getName(),
                            declaredField.getType(),
                            declaredField.get(obj)
                    ));
            if (declaredField.getType().equals(String.class)) {
                declaredField.set(obj, "defaultValue");
            }
        }
        System.out.println(obj);
    }
}