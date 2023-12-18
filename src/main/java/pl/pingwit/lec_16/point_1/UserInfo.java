package pl.pingwit.lec_16.point_1;

import pl.pingwit.lec_16.point_2.FirstCapitalLetter;
import pl.pingwit.lec_16.point_2.MyAnnotation;
import pl.pingwit.lec_17.point_1.DefaultValue;

import java.time.LocalDate;
import java.util.Objects;

public class UserInfo {

    private static final String JUST_FIELD = "HAHAHA!";

    @DefaultValue
    @FirstCapitalLetter
    public final String name;

    @DefaultValue
    @FirstCapitalLetter
    private final String surname;

    @DefaultValue
    private final String phone;

    @DefaultValue
    private final String email;

    @DefaultValue
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(name, userInfo.name) && Objects.equals(surname, userInfo.surname) && Objects.equals(phone, userInfo.phone) && Objects.equals(email, userInfo.email) && Objects.equals(dateOfBirth, userInfo.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phone, email, dateOfBirth);
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
