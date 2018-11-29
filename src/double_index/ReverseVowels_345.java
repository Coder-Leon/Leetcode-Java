package double_index;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowels_345 {
    public String reverseVowels(String s) {
        if (s == null) {
            return null;
        }
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i = 0;
        int j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char leftStr = s.charAt(i);
            char rightStr = s.charAt(j);
            if (!set.contains(leftStr)) {
                result[i++] = leftStr;
            } else if (!set.contains(rightStr)) {
                result[j--] = rightStr;
            } else {
                result[j--] = leftStr;
                result[i++] = rightStr;
            }
        }
        return new String(result);
    }
}
