package double_index;

import java.util.List;

public class LongestWord_524 {
    public String findLongestWord(String s, List<String> d) {
        if (s == null || d == null) {
            return "";
        }
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length(), l2 = target.length();
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)) {
                // compareTo 按字典序比较，当equals成立时才为0
                continue;
            }
            if (isWord(s, target)) {
                longestWord = target;
            }
        }
        return longestWord;
    }

    public static boolean isWord(String s, String word) {
        if (s.length() < word.length()) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (j < word.length() && i < s.length()) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == word.length();
    }
}
