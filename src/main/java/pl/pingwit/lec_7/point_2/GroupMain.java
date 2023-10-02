package pl.pingwit.lec_7.point_2;

import pl.pingwit.lec_7.point_1.subpoint.Student;

public class GroupMain {

    public static void main(String[] args) {

        Student[] students = new Student[9];

        StudentGroup studentGroup = new StudentGroup(students);

        System.out.println(studentGroup.getIndex());
    }
}
