package pl.pingwit.lec_11.point_1;

import org.apache.commons.lang3.StringUtils;

public class StringTrimMain {

    public static void main(String[] args) {

        String stringWithWhitespaces = "  Alex Terner  ";
        System.out.println(stringWithWhitespaces.trim());

        // API
        String justString = "Alex+Terner";
        System.out.println(justString.replace("e", "opa"));

        System.out.println(justString);
        System.out.println(justString.replace("+", " "));
    }
}
