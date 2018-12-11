package sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency_451 {
    public static String sortString(String s) {
        if (s == null || s.length() < 3) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character>[] bucket = new ArrayList[s.length()];
        for (char c : map.keySet()) {
            int count = map.get(c);
            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }
            for (int i = 0; i < count; i++) {
                bucket[count].add(c);
            }
        }
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size(); j++) {
                    sb.append(bucket[i].get(j));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortString("treeae"));
    }
}
