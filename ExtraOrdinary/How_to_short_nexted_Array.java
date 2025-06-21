package ExtraOrdinary;

import java.util.Arrays;

public class How_to_short_nexted_Array {
    public static void findRightInterval(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));


        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }

    }
    public static void main(String[] args) {

    }
}
