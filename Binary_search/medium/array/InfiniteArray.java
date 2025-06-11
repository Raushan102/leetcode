package Binary_search.medium.array;


public class InfiniteArray {

    public static void findRange(int[] array, int target) {
        int start = 0;
        int end = 2;

        while (array[end] < target) {
            int tempStart = end;
            end = end + (end - start+1) * 2;
            start = tempStart;
        }
        System.out.println(search(array,target,start,end));
    }

 public static int  search(int [] arr,int target,int start,int end ){
         while(start<=end){
             int mid = start+(end-start)/2;
             if(arr[mid] > target){
                end=mid-1;
             }else if(arr[mid]< target){
                 start=mid+1;
             }else{
                 return mid;
             }
         }
         return -1;
  }


    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; // remember this is an infinite array
        findRange(arr,14);

    }
}
