package pl.pingwit.lec_16.point_1;

import pl.pingwit.lec_16.point_2.FirstCapitalLetter;
import pl.pingwit.lec_17.point_1.DefaultValue;

import java.util.Objects;

public class Customer {

    @FirstCapitalLetter
    @DefaultValue
    private final String name;

    @FirstCapitalLetter
    @DefaultValue
    private final String surname;

    @DefaultValue
    private final String email;

    public Customer(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
