package pl.pingwit.lec_16.point_1;

import pl.pingwit.lec_16.point_2.FirstCapitalLetter;

import java.util.Objects;

public class Customer {

    @FirstCapitalLetter
    private final String name;

    @FirstCapitalLetter
    private final String surname;
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
}
