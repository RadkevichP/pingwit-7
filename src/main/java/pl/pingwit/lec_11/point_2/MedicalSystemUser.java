package pl.pingwit.lec_11.point_2;

import java.util.Date;

public class MedicalSystemUser {
    private String name;
    private Date birthDate;
    private Gender gender;
    private String[] diseases;

    public MedicalSystemUser(String name, Date birthDate, Gender gender, String[] diseases) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.diseases = diseases;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public String[] getDiseases() {
        return diseases;
    }

}
