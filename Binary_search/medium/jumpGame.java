package Binary_search.medium;

public class jumpGame {
    public static boolean canJump(int[] nums) {
      int i=0;
      int n=nums.length-1;
      int ref=0;

      // check weather array contain the 1 element if yes then return true
      if(nums.length==1){
          return true;
      }
       while(i!= nums.length){

           if(i==n){    // check weather i==n if yes return true
               return true;
           }

           if(nums[i]>0){ // jump one step if number is greater the 0
               i++;
           }else{          // arr[i] is 0 then move backward and check weather any a[i] + i can  jump that 0 element index or not
                ref=i;
                int j=i;
               for(;j>=0;j--){ // move back and check any arr[j]+j can help me to jump the 0 element index
                   if(j+nums[j] > ref){ // if yes then jump one step forward from 0 element index
                       i=ref+1;
                       break;
                   }
               }
               if(j<0){     // if j == -1 it means no element can help me to jump the 0 element index
                   return false;  // return false
               }
           }

       }
       return true;
    }

    public static void main(String[] args) {
        int arr[]={3,2,1,0,4};
        System.out.println(canJump(arr));


    }
}
