package Binary_search.medium.array.cyclicSort;

import java.util.*;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class Find_All_duplicate_Number {

    public static  List<Integer> findDuplicates(int[] nums) {
      List<Integer> list=new ArrayList<>();
        int i=0;
        while(i!=nums.length){

            if(nums[i]!= i+1 && nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;

            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length ; j++) {
            if(nums[j]!=j+1){
                list.add(nums[j]);

            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[]={1};
        System.out.println(findDuplicates(arr));
    }
}
