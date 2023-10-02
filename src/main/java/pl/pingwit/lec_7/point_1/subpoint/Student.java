package pl.pingwit.lec_7.point_1.subpoint;

public class Student {

    public int age; // в учебных целях
    String name;   // default, package
    protected String email;
    private boolean isForeigner;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isForeigner() {
        return isForeigner;
    }

    public void setForeigner(boolean foreigner) {
        isForeigner = foreigner;
    }
}
