package Binary_search.easy.array;

import java.util.Arrays;

public class specialElementWith_x_ele {

    public static boolean public_Helper_function(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                end = mid;

            } else {
                start = mid + 1;
            }
            System.out.println(end);
            System.out.println(target);
        }

        int result = (arr.length) - end;
        return result == target;
    }

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);

        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int ele : nums) {
            max = Math.max(max, ele);
        }

        int i = 0;

        while (i != (max+1)) {
            if (public_Helper_function(nums, i)) {
                return i;
            } else {
                i++;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int []arr=   {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
        System.out.println(specialArray(arr));
    }
}
