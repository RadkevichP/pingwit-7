package pl.pingwit.lec_6.point_4;

public class ClassExample {

    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setCity("Vilnius");
        address1.setStreet("Laisves");
        address1.setHouseNumber("12");
        address1.setZipCode("05115");

        String addressString = address1.toString();
        System.out.println(addressString);

        Person person1 = new Person("Pavel" , "Radkevich", address1);
        String personString = person1.toString();


        System.out.println(personString);
    }

}
