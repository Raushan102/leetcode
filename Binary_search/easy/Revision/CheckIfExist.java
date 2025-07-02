package Binary_search.easy.Revision;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckIfExist {

    public static boolean checkIfExist(int arr[]){
        Arrays.sort(arr);

        for (int ele : arr){
             if(helperbinaryfuction(arr,ele)){
                 return true;
             }
        }
        return false;
    }

    public static boolean helperbinaryfuction(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if((2*arr[mid]) > target){
                end=mid-1;
            }else if((2* arr[mid]) < target){
                start=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    int arr[]={3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
}
