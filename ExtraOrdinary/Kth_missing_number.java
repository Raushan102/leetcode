package ExtraOrdinary;

public class Kth_missing_number {

    // simple brute force approach ====
 // leetcode link: https://leetcode.com/problems/kth-missing-positive-number/description/
    public static  boolean  helperbinarySearch(int [] arr,int target ){
        int start=0;
        int end=arr.length-1;

        while(start<= end){
            int mid=start+(end-start)/2;
            if(arr[mid] == target){
                return true;
            }

            if(arr[mid] > target){
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        return false;
    }

    public static int findKthPositive(int[] arr, int k) {
        int currentVal=1;
        int number=0;

        while(number != k){
            if(helperbinarySearch(arr,currentVal)){
                currentVal++;
            }else{
                currentVal++;
                number++;
            }
        }
        return currentVal-1;
    }
    //===========================

    //========= O(n) solution ======================;

    public  static int find_kth_Miss_number(int [] nums,int k){
        int num=1;
        int i=0;

        while(i< nums.length && k > 0){
            if(nums[i] == num){
                i++;
            }else{
                k--;
            }
            num++;
        }

        while(k > 0){
            k--;
            num++;
        }

        return num-1;

    }

    // =================O(log n)=======================================;
    //this code find the kth missing number in array in O(log n ) time complicity;
  //  video  link : https://www.youtube.com/watch?v=BltzCxN1vRc

    public static int find_kth_missing_number_(int nums[],int k){

        int start=0;
        int end= nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            int result=nums[mid] -(mid+1);
            if(result < k){
                start=mid+1;
            }else {
                end=mid-1;
            }

        }
        return end+k+1;

    }

    public static void main(String[] args) {
        int nums[]={1,2};
        System.out.println(find_kth_missing_number_(nums,1));
    }


}
