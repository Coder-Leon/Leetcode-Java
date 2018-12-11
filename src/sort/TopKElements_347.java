package sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElements_347 {
    public int[] findTopK(int[] nums, int k) {
        int[] result = new int[k];
        if (nums == null || nums.length < 1) {
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length - 1];
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(key);
        }
        List<Integer> topK = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && topK.size() < k; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size(); j++) {
                    if (topK.size() < k) {
                        topK.add(bucket[i].get(j));
                    }
                }
            }
        }
        for (int i = 0; i < topK.size(); i++) {
            result[i] = topK.get(i);
        }
        return result;
    }
}
