package Binary_search.medium.array;
// leetcode 1818 problem
//https://leetcode.com/problems/minimum-absolute-sum-difference/description/

import java.util.Arrays;

public class Min_abs_sum {


    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int[] Copy_of_num1 = Arrays.copyOfRange(nums1, 0, nums1.length);
        Arrays.sort(Copy_of_num1);

        long Min_Abs_Diff = 0; // long because it can exceed the range of int
        long abs_diff = 0; // long  because it can exceed the range of int

        for (int i = 0; i < nums1.length; i++) {
            abs_diff += Math.abs(nums2[i] - nums1[i]);
        }

        Min_Abs_Diff = abs_diff;


        for (int i = 0; i < nums1.length; i++) {
            int closest = findClosestDiff(Copy_of_num1, nums2[i]);

            long temp=  abs_diff - Math.abs(nums2[i] - nums1[i]); // long it can exceed the range of int
            temp += Math.abs(closest - nums2[i]);

            if (Min_Abs_Diff > temp) {
                Min_Abs_Diff = temp;
            }

        }
        return (int)(Min_Abs_Diff % 1_000_000_007);  // it just because of question we have to return the ans with % 10^9+7;
    }


    public static int findClosestDiff(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return target;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        int startDiff = Math.abs(  start > arr.length-1?arr[0] - target: arr[start] - target);
        int enddiff = Math.abs( end  < 0  ? arr[arr.length-1] - target: arr[end] - target);

        if (startDiff < enddiff) {
            return  start > arr.length-1 ?arr[start -1]: arr[start];
        } else {
            return end  < 0 ?arr[0]: arr[end];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,7,5};
        int[] arr2 ={2,3,5};
        System.out.println(minAbsoluteSumDiff(arr, arr2));

    }
}
