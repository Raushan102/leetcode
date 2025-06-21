package Binary_search.medium.array;
//https://leetcode.com/problems/single-element-in-a-sorted-array/

public class SingleNonDuplicate {

      public static int singleNonDuplicate(int []nums){
          int start=0;
          int end=nums.length-1;
          int n=nums.length-1;

          while(start <=end){
              int mid=start+(end-start)/2;

              if((mid+1)%2==0){

                  if(mid > 0 && nums[mid-1]==nums[mid]){
                      start=mid+1;
                  }else if(mid < n && nums[mid]==nums[mid+1]){
                      end=mid-1;
                  }else{
                      return nums[mid];
                  }
              }else{

                  if(mid < n && nums[mid]==nums[mid+1]){
                      start=mid+1;
                  }else if(mid > 0 && nums[mid]==nums[mid-1]){
                      end=mid-1;
                  }else{
                      return nums[mid];
                  }

              }
          }
          return -1;

      }

    public static void main(String[] args) {
  int []arr={1,2,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));

    }
}
