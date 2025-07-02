package Binary_search.easy.Revision;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static int [] findFirstAndLastPosition(int arr[],int target)
    {
        int result[]={-1,-1};
        result[0]=helperBinaryFunction(arr,target,true);
        result[1]=helperBinaryFunction(arr,target,false);

        return result;

    }

    public static int helperBinaryFunction(int arr[],int target,boolean FindInLeft){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                ans=mid;
                if(FindInLeft){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
int arr[]={1,2,3,7,7,7,8};
        System.out.println(Arrays.toString(findFirstAndLastPosition(arr,9)));


    }
}
