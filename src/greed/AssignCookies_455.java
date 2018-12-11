package greed;

import java.util.Arrays;

public class AssignCookies_455 {
    public int assighCookies(int[] children, int[] cookies) {
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
}
