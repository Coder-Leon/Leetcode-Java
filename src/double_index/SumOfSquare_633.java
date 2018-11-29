package double_index;

public class SumOfSquare_633 {
    public boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }
        int right = (int) Math.sqrt(c);
        int left = 0;
        while (left <= right) {
            int powSum = left * left + right * right;
            if (powSum < c) {
                left++;
            } else if (powSum > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}
