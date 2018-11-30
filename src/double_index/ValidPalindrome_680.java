package double_index;

public class ValidPalindrome_680 {
    public boolean validPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return false;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (i == j) {
                return true;
            }
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else if (s.charAt(i + 1) == s.charAt(j)) {
                i += 2;
                j--;
            } else if (s.charAt(i) == s.charAt(j - 1)) {
                i++;
                j -= 2;
            }
        }
        return false;
    }
}
