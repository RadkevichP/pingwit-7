package pl.pingwit.lec_12.point_2;

import org.apache.commons.lang3.StringUtils;

public class StringUtilPalindromeChecker implements PalindromeChecker {

    @Override
    public boolean isPalindrome(String word) {
        return StringUtils.reverse(word).equals(word);
    }
}
