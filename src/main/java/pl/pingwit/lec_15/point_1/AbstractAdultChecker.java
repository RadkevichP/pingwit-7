package pl.pingwit.lec_15.point_1;

import java.time.LocalDate;

public abstract class AbstractAdultChecker {

    public boolean isAdult(Person person) {
        LocalDate dateOfBirth = person.getDateOfBirth();
        LocalDate personAdultDate = dateOfBirth.plusYears(getAdultAge());
        /*personAdultDate.isBefore();
        personAdultDate.isEqual();
        personAdultDate.isAfter();*/
        return personAdultDate.isBefore(LocalDate.now()) || personAdultDate.isEqual(LocalDate.now());
    }

    protected abstract int getAdultAge();
}
