package Binary_search.easy.array.cyclicSort;
import java.util.*;
//448 https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
class FindDisappearNumbers {
    public static  List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> list=new ArrayList<>();

        int i=0;
        int n=nums.length;

        while(i!=n){
            if(nums[i] <= n && nums[i]!=(i+1)   && nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[(temp-1)];
                nums[(temp-1)]=temp;
            }else{
                i++;
            }
        }


        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
        }

        return list;
        
    }

    public static void main(String[] args) {
        int arr[]={1,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}