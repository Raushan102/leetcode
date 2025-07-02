package Binary_search.easy.Revision;

public class KthMissingNumber {

     public static int findKthMissingEle(int arr[],int k){
         int i=0;
         int j=1;



         while(i!=arr.length && k>0){
             if(arr[i] != j){
                 k--;
                 j++;
             }else{
                 j++;i++;
             }
         }

         for (int l = k; l > 0; l--) {
             j++;
         }

         return j-1;
     }

    public static void main(String[] args) {
         int [] arr={1,2,3,4};

        System.out.println(findKthMissingEle(arr,2));
    }
}
