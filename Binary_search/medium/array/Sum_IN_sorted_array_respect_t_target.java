package Binary_search.medium.array;

import java.util.Arrays;
import java.util.EnumSet;

public class Sum_IN_sorted_array_respect_t_target {

    public  static  int []  findPair(int [] numbers,int target){
        int start=0;
        int end=numbers.length-1;

      
        if(numbers.length == 1){
            return new int[]{-1,-1};
        }

        while(start<=end){
            if((numbers[start]+ numbers[end])> target){
                end--;

            }else if((numbers[start]+ numbers[end])< target){
                    start++;
            }else {

                return  new int[]{start,end};
            }
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int  [] numbers = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(findPair(numbers,target)));
    }
}
