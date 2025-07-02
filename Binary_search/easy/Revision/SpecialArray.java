package Binary_search.easy.Revision;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SpecialArray {

    public static int specialArray(int[] arr) {

        Arrays.sort(arr);

        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            max = Math.max(ele, max);
        }

        int start=0;
        int end=max;

        while(start <= end){
            int mid=start+(end-start)/2;

            if(helperBinary_function(arr,mid) > mid){
                start=mid+1;
            }else if(helperBinary_function(arr,mid) < mid){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }

    public static int helperBinary_function(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int n = arr.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return (n - end);
    }

    public static void main(String[] args) {
        int[] arr = {0,3,4,0};
        System.out.println(specialArray(arr));
    }
}
