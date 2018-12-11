package double_index;

public class MergeSortedArray_88 {
    public void merge(int[] num1, int[] num2, int m, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int indexMerge = m + n - 1;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) {
                num1[indexMerge--] = num2[index2--];
            } else if (index2 < 0) {
                num1[indexMerge--] = num1[index1--];
            } else if (num1[index1] > num2[index2]) {
                num1[indexMerge--] = num1[index1--];
            } else {
                num1[indexMerge--] = num2[index2--];
            }
        }
    }
}
