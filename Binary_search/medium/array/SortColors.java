package Binary_search.medium.array;
import java.util.*;
public class SortColors {

    // to solve this problem we  use the two pointer approach and set a current number first set it to 0 and  start search from last and check weather element of j
    // if equal to current number if yes then swap with i and increase the i pointer if arr[i] is equal to current number similarly check each time and if j is not
    // equal to current number decrease the j after this we check when ever we get i == j it means current number are all in correct position and increase the counter
    // by 1 again this process repeat until we get final answer . this approach is use only if elements of array is in range and range is low  we can also use cycle
    // sort if array don't contain the duplicate value here we have duplicate value that's why i use this approach also we can use any sorting algo
    public  static  void sortColors(int[] nums) {

        int i=0;
        int j=nums.length-1;
        int currentNumber =0;

        while(i<=j){
            if(i==j){
                currentNumber++;
                j=nums.length-1;
            }

            while( i < nums.length-1 && nums[i]== currentNumber){
                i++;
            }

            if(nums[j]==currentNumber){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

                while( i < nums.length-1 && nums[i]== currentNumber){
                    i++;
                }
            }else{
                j--;
            }


        }

    }

    public static void main(String[] args) {
    int arr[]={1,2};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
