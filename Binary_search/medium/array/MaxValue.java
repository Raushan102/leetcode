package Binary_search.medium.array;
//https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/description/

public class MaxValue {

    public static int maxValue(int n, int index, int maxSum) {
     int start=0;
     int end=maxSum;

     while(start <= end){

         int leftSum=0;
         int rightSum=0;
         int []ansArray=new int[n];
         int mid=start+(end-start)/2;

         ansArray[index]=mid;

         if(index > 0){
             for(int i=index-1;i >=0 ;i--){

                int  temp=ansArray[i+1];

                if(temp==1){
                    ansArray[i]=1;

                }else{
                    ansArray[i]=(temp-1);

                }
                 leftSum+=ansArray[i];

             }
         }

         if(index < (n-1)){
             for (int i = index+1; i < ansArray.length; i++) {

                 int  temp=ansArray[i-1];

                 if(temp==1){
                     ansArray[i]=1;
                 }else{
                     ansArray[i]=(temp-1);
                 }
                 rightSum+=ansArray[i];
             }
         }

         int totalsum=leftSum+rightSum+mid;

         if(totalsum > maxSum){
             end=mid-1;
         }else{
             start=mid+1;
         }



     }
     return start-1;

    }
    public static void main(String[] args) {

        System.out.println(maxValue(6,1,10));
    }
}
