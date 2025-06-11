package Binary_search.easy.array;

public class searchInsert {

     public static int Search_insert(int [] nums,int target){
         int start=0;
         int end=nums.length-1;

         while (start <=end){
             int mid=start+(end-start)/2;
             if(nums[mid] < target){
                 start=mid+1;
             }else if(nums[mid] > target){
                 end=mid-1;
             }else {
                 return mid;
             }
         }

         return start;
     }

    public static void main(String[] args) {
    int [] nums={2,3,4,5,7};
        System.out.println(Search_insert(nums,8));
    }
}
