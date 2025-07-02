package Binary_search.easy.array.cyclicSort;

import java.util.Arrays;
//https://leetcode.com/problems/missing-number/

public class MissingNumber {

    public static int findMissingNumber(int[] arr) {

        int i = 0;
        while (i != arr.length) {
            if (arr[i] == i) {
                i++;
            } else {
                if (arr[i] >= arr.length) {
                    i++;
                } else {
                    int temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                }

            }
        }

        for (int j = 0; j < arr.length ; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return -1;
    }

    // second approach to solve this question is


    public static int secondAp(int arr[]){
        int n=arr.length;

        int total_sum=n*(n+1)/2;

        int actualSum=0;
        for (int ele:arr){
            actualSum+=ele;
        }

        return total_sum-actualSum;
    }



    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println( secondAp(arr));
        System.out.println(Arrays.toString(arr));
    }
}
