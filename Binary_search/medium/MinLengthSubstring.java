package Binary_search.medium;

public class MinLengthSubstring {

    //https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=problem-list-v2&envId=binary-search

    public static int find_min_pair(int [] nums,int target){

        if(nums.length == 0 ){
            return 0;
        }


        int left=0;
        int right=0;
         int sum=0;
        int minLength=Integer.MAX_VALUE;

        for( right=0;right<nums.length;right++){

           sum=sum+nums[right];

            while(sum >= target){
                minLength=Math.min(minLength,right-left+1);
                sum-=nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }



    public static void main(String[] args) {

        int arr []={2,3,1,2,4,3};
        System.out.println(find_min_pair(arr,7));


    }
}
