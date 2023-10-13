package pl.pingwit.lec_10.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpMain {

    // Регулярные выражения
    // Regular Expressions

    // pavel@mail.com

    public static final Pattern EMAIL_PATTERN = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
    public static final Pattern EMAIL_PATTERN_2 = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private static final Pattern ENGLISH_LETTERS_ONLY = Pattern.compile("[a-zA-Z]*");
    private static final Pattern DIGITS_ONLY = Pattern.compile("\\d*");

    private static final Pattern SOME_PATTERN = Pattern.compile("^(.+)@(\\S+)$");
    private static final Pattern SOME_PATTERN_2 = Pattern.compile("^(.+)@(\\S+)$");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("введите email");
            String email = scanner.nextLine();

            //Matcher matcher = EMAIL_PATTERN.matcher(email);
            String message = String.format("имэйл %s вылиден? : %s", email, EMAIL_PATTERN_2.matcher(email).matches());
            System.out.println(message);
        }
    }
}
