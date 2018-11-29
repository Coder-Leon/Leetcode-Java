package double_index;

public class TwoSum_167 {
    public static int[] twoSum(int[] num, int target) {
        if(num == null || num.length < 2){
            return new int[]{};
        }
        int i = 0;
        int j = num.length - 1;
        while (i <= j) {
            if (num[i] + num[j] < target){
                i++;
            } else if (num[i] + num[j] > target) {
                j--;
            } else {
                return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{1, 2, 3, 4, 6}, 6);
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
