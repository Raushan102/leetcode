package Binary_search.medium.Rrevision;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static int[] first_and_last_position(int numbers [],int target){
         int ansArray []={-1,-1};

         ansArray[0]= helperFunction( numbers, target,false);
         ansArray[1]=helperFunction(numbers,target,true);
         return ansArray;



    }

    public  static int helperFunction(int numbers[],int target,boolean search_right_side){
        int ans=-1;
        int start=0;
        int end=numbers.length-1;

        while(start<=end){
           int middle=start+(end-start)/2;

           if(numbers[middle] > target){
               end=middle-1;
           }else if(numbers[middle] < target){
               start=middle+1;

           }else{
               ans=middle;
               if(search_right_side){
                   start=middle+1;
               }else{
                   end=middle-1;
               }
           }

        }
        return  ans;
    }
    public static void main(String[] args) {
      int numbers[]={1,2,4,4,4,4,4,5,5,5,7,7,7,7,8};
      int num []= first_and_last_position(numbers,78);
        System.out.println(Arrays.toString(num));
    }
}
