package pl.pingwit.lec_15.point_1;

import java.time.LocalDate;

public class AdultChecker {

    private final int adultAge;

    public AdultChecker(int adultAge) {
        this.adultAge = adultAge;
    }

    public boolean isAdult(Person person) {
        LocalDate dateOfBirth = person.getDateOfBirth();
        LocalDate personAdultDate = dateOfBirth.plusYears(adultAge);
        /*personAdultDate.isBefore();
        personAdultDate.isEqual();
        personAdultDate.isAfter();*/
        return personAdultDate.isBefore(LocalDate.now()) || personAdultDate.isEqual(LocalDate.now());
    }
}
