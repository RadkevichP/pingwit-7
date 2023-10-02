package pl.pingwit.lec_7.point_1;


import org.apache.commons.lang3.RandomStringUtils;
import pl.pingwit.lec_7.point_1.subpoint.Student;

public class Main {
    public static void main(String[] args) {
        String s = RandomStringUtils.randomAlphabetic(5);
        System.out.println(s);

        Student student = new Student();
        int age = student.age;



    }
}
