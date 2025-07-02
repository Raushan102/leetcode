package Binary_search.medium;
import java.util.*;
//https://leetcode.com/problems/rotate-array/
// video: https://www.youtube.com/watch?v=TYT5TJSfGlo
public class Rotate_Array {

    // to solve this question rotate the array of k time in O(n) time complexity and O(1) space complexity
    // solution:
    //1. reverse entire array
    //2. then reverse the 0 to k-1 element
    //3 then reverse the  k to arr.length-1 element

    public static void rotate(int[] nums, int k) {

        int i=0;
        int j= nums.length-1;
        k=k%nums.length;
//  reverse entire array
        while(i<=j){
            int temp=nums[j];
            nums[j]= nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
// reverse 0 to k-1 element
        i=0;
        j=k-1;

        while(i<=j){
            int temp=nums[j];
            nums[j]= nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
// reverse the k to nums.length-1 element
        i=k;
        j= nums.length-1;
        while(i<=j){
            int temp=nums[j];
            nums[j]= nums[i];
            nums[i]=temp;
            i++;
            j--;
        }


    }
    public static void main(String[] args) {
        int [] arr={1,2,34,23,56,9,75,34};
        rotate(arr,1);
        System.out.println( Arrays.toString(arr));

    }
}
