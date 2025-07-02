package Binary_search.hard.array.cyclic_sort;

import java.util.Arrays;

public class FirstMissingPosition {
    public static int firstMissingPosition(int []nums){
        int smallest=Integer.MAX_VALUE;


// replace negative value with 0 because we only have to return the positive value
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                nums[i]=0;
            }
            smallest=Math.min(nums[i],smallest); // with smallest for set the range
        }

        if(smallest > 1){
            return 1;
        }


        int i=0;
        while(i!=nums.length){

            if(  (nums[i]-smallest) <= (nums.length-1) && nums[i] != (i+smallest) && nums[i]!=nums[(nums[i]-smallest)]){
                 int temp=nums[i];
                 nums[i]=nums[temp-smallest];
                nums[temp-smallest]=temp;
            }else {
                i++;
            }
        }

       int j=0;
        while(j!=nums.length){
          if(nums[j] != j+smallest){
              return (j+smallest);

          }
          j++;
        }

        return smallest > 1 ?1 :(j+smallest);
    }
    public static void main(String[] args) {
        int []arr={7,8,9,11,12};
        System.out.println(firstMissingPosition(arr));

    }
}
