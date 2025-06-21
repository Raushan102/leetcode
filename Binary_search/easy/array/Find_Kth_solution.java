package Binary_search.easy.array;

public class Find_Kth_solution {

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

    public static void main(String[] args) {
       int[] arr = {1,2,3,4};
       int k = 2;
        System.out.println( findKthPositive(arr,k));

    }
}
