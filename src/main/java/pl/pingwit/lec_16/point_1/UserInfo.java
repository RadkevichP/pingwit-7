package pl.pingwit.lec_16.point_1;

import pl.pingwit.lec_16.point_2.FirstCapitalLetter;
import pl.pingwit.lec_16.point_2.MyAnnotation;

import java.time.LocalDate;

public class UserInfo {

    private static final String JUST_FIELD = "HAHAHA!";

    @FirstCapitalLetter
    public final String name;

    @FirstCapitalLetter
    private final String surname;
    private final String phone;
    private final String email;
    private final LocalDate dateOfBirth;

    @MyAnnotation("Pavel")
    public UserInfo(String name, String surname, String phone, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getAge() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
