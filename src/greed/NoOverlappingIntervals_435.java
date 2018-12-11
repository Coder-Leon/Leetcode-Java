package greed;

import java.util.Arrays;
import java.util.Comparator;

public class NoOverlappingIntervals_435 {

    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.end - o2.end; // 升序
            }
        });
        int end = intervals[0].end;
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= end) {
                end = intervals[i].end;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Interval i1 = new Interval(3, 4);
        Interval i2 = new Interval(0, 2);
        Interval i3 = new Interval(1, 2);
        Interval[] intervals = new Interval[]{i1, i2, i3};
        int result = eraseOverlapIntervals(intervals);
        System.out.println(result);
    }
}
