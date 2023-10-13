package pl.pingwit.lec_10.stringClass;

public class StringMain {

    public static void main(String[] args) {

        // создание строк
        String anyString = new String(new char[]{'p', 'i', 'n'});

        String someString = "Sasha";
        String someString2 = "Sasha";
        String someString3 = "Sasha";

        System.out.println("ссылки одинаковы? :" + (someString2 == someString));
        System.out.println("ссылки 1 и 3 одинаковы? :" + (someString == someString3));

        // изменение строк
        String someString4 = someString;
        someString = someString + " postfix";

        System.out.println("someString4 = " + someString4);
        System.out.println(someString);

        // конкатенация  - это сложение строк
        String first = "1";
        String second = "2";
        String sum = first + second;
        System.out.println(sum);

        // форматирование строк
        String template = "сумма к выдаче: %d, уважаемый %s, распишитесь";

        System.out.printf(template, 1200, "Алексей");

        System.out.println();
        System.out.printf(template, 3000, "Viktor");
        System.out.println();
        System.out.printf(template, 100, "Fedor");
        System.out.println();
        System.out.println("----------------------------------------");

        String alex = template.formatted(1200, "Алексей");
        String alex2 = String.format(template, 1200, "Алексей");

        //
        String city = "Vilnius";

        System.out.printf("uppercase city: %s", city.toUpperCase());
        System.out.println();

        String lowerCase = city.toLowerCase();

        //
        String newCity = "VilNiUs";
        System.out.println(newCity.equalsIgnoreCase(city));


        //
        String user = "pavel_user";
        boolean b = user.endsWith("user");
        boolean b1 = user.startsWith("pav");
        boolean e = user.contains(" ");

        String emptyString = "";
        boolean empty = emptyString.isEmpty();

        System.out.println("пустая ли строка ? " + "    ".isEmpty());

        //
        String blankString = "    ";
        boolean blank = blankString.isBlank();

        //
        String someValue = "opopopoppo";
        System.out.println(someValue.replace("p", "!"));
    }
}
