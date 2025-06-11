package Binary_search.easy.array;

public class findMissingElement {

   public static int missingNumber(int[]nums){
       int n=nums.length;

       int maxSum=n*(n+1)/2;
       int sum=0;

       for(int ele : nums){
           sum+=ele;
       }
       return (maxSum - sum);
   }
}
