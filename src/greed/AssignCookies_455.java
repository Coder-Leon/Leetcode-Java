package greed;

import java.util.Arrays;

public class AssignCookies_455 {
    public static int assighCookies(int[] children, int[] cookies) {
        int i = 0;
        Arrays.sort(children);
        Arrays.sort(cookies);
        int j = 0;
        while (i < children.length && j < cookies.length) {
            if (children[i] <= cookies[j]){
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] children = new int[]{1, 2, 3, 3};
        int[] cookies = new int[]{1, 2, 3, 1};
        int result = assighCookies(children, cookies);
        System.out.println(result);
    }
}
