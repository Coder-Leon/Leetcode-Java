package sort;

public class SortColors_75 {
    public void sortColors(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }
        int left = -1;
        int right = nums.length;
        int index = 0;
        while (index < right){
            if (nums[index] == 1){
                index++;
            } else if (nums[index] == 0) {
                swap(nums, ++left, index++);
            } else if (nums[index] == 2) {
                swap(nums, --right, index);
            }
        }

    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
