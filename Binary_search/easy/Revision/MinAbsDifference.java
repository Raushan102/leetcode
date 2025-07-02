package Binary_search.easy.Revision;

import java.util.Arrays;

public class MinAbsDifference {

    public static int finsAbsValue(int[] nums1,int [] nums2)
    {
        int [] copyOFnums1= Arrays.copyOf(nums1,nums1.length);
        Arrays.sort(copyOFnums1);

        long totalAbs= 0;

        for (int i = 0; i < nums1.length; i++) {
            totalAbs+=Math.abs(nums1[i]-nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){

            long result=helperfunction(copyOFnums1,nums1,nums2,i,totalAbs);

             if(totalAbs > result){
                 totalAbs=result;
             }
        }
        return (int) totalAbs;

    }

    public static long helperfunction(int []  arr,int [] nums1,int[] nums2,int index,long totalSume){

        int start=0;
        int end=arr.length-1;
        long currentSome=totalSume;
        long temp=currentSome-Math.abs(nums1[index]-nums2[index]);

        while(start<=end){

            int mid=start+(end-start)/2;

            long temp2=temp+Math.abs(arr[mid]-nums2[index]);

            if(temp2 > currentSome){
                end=mid-1;
            }else{
                currentSome=temp2;
                start=mid+1;
            }

        }

        return currentSome;
    }


    public static void main(String[] args) {
        int nums1 []={1,10,4,4,2,7};
        int [] nums2={9,3,5,1,7,4};


        System.out.println(finsAbsValue(nums1,nums2));



    }


}
