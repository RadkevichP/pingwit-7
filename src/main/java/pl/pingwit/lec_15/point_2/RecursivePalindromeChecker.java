package pl.pingwit.lec_15.point_2;

public class RecursivePalindromeChecker {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ABdadBA"));
    }

    private static boolean isPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
        return false;
    }

}
