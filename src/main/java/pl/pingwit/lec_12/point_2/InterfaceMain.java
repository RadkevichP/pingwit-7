package pl.pingwit.lec_12.point_2;

public class InterfaceMain {

    public static void main(String[] args) {
        PalindromeChecker arrayPalindromeChecker = new ArrayPalindromeChecker();

        PalindromeChecker stringUtilPalindromeChecker = new StringUtilPalindromeChecker();

        arrayPalindromeChecker.isPalindrome("abba");
        stringUtilPalindromeChecker.isPalindrome("abba");

        Integer someConstant = PalindromeChecker.SOME_CONSTANT;
        boolean b = PalindromeChecker.randomBooleanValue();

    }
}
