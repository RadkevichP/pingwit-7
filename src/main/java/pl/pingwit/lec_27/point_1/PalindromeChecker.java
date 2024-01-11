package pl.pingwit.lec_27.point_1;

import org.apache.commons.lang3.StringUtils;

public class PalindromeChecker {
    public boolean isPalindrome(String string) {
        if (StringUtils.isBlank(string)) {
            throw new IllegalArgumentException("String is blank");
        }
        char[] symbol = string.toLowerCase()
                .replace(" ", "")
                .toCharArray();

        int left = 0;
        int right = symbol.length - 1;
        while (left < right) {
            if (symbol[left] != symbol[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
