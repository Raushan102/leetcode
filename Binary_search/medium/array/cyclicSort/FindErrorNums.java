package Binary_search.medium.array.cyclicSort;
//https://leetcode.com/problems/set-mismatch/description/
import java.util.Arrays;

public class FindErrorNums {
    public static  int [] findErrorNums(int []nums){

          int arr[]=new int[2];
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
                    arr[0]=nums[j];
                    arr[1]=j+1;

                }
            }


            return arr;
    }
    public static void main(String [] args){
        int arr[]={1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
