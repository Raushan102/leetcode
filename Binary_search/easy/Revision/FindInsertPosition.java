package Binary_search.easy.Revision;

public class FindInsertPosition {
    public static int findInsertedPosition(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while(start < end){
            int mid=start+(end-start)/2;

            if(arr[mid] > target){
                end=mid;
            }else if(arr[mid] < target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
      int arrr[]={1,3,4,5};
        System.out.println(findInsertedPosition(arrr,2));
    }
}
