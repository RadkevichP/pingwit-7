package pl.pingwit.lec_7.point_2;

import org.apache.commons.lang3.RandomStringUtils;
import pl.pingwit.lec_7.point_1.subpoint.Student;

public class StudentGroup {

    public static final String UNIVERSITY;

    private String index;
    private Student[] students;

    static {
        System.out.println("Hello from STATIC init block!");
        UNIVERSITY = "Oxford University";
    }

    {
        this.index = RandomStringUtils.randomAlphabetic(6);
        System.out.println("Hello from init block!");
    }

    public StudentGroup() {
    }

    public StudentGroup(Student[] students) {
        this.students = students;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
