package Binary_search.medium.array.cyclicSort;

class findDuplicate {

    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i!=nums.length){

            if(nums[i]!= i+1 && nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;

            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length ; j++) {
             if(nums[j]!=j+1){
                 return nums[j];

             }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr []={3,3,3,3,3};
        System.out.println(findDuplicate(arr));

    }
}