package sort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest_215 {
    public int findKthLargest1(int[] nums, int k){
        if (nums == null || nums.length < 1){
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest2(int[] nums, int k){
        if (nums == null || nums.length < 1){
            return 0;
        }
        // 维护一个小顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums) {
            pq.offer(val);
            if (pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public int findKthLargest3(int[] nums, int k){
        if (nums == null || nums.length < 1){
            return 0;
        }
        k = nums.length - k;
        int L = 0;
        int R = nums.length - 1;
        while (L < R){
            int j = partition(nums, L, R);
            if (j == k){
                break;
            } else if (j < k){
                L = j + 1;
            } else {
                R = j - 1;
            }
        }
        return nums[k];
    }

    public static int partition(int[] nums, int l, int r) {
        int less = l;
        int more = r + 1;
        int flagNum = nums[l];

        while (true){
            while (nums[++less] < flagNum && less < r);
            while (nums[--more] > flagNum && more > l);
            if (less >= more){
                break;
            }
            swap(nums, less, more);
        }
        swap(nums, l, more);
        return more;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
