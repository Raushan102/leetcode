package easy.array;

public class BiotonicArrayLargeNumberSearch {


    public  int findPeakElement(int nums[]){
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(nums[mid] < nums[mid+1]){

                start=mid+1;
            }else{
                end=mid; // because
            }
        }
        return start;
    }
    public static void main(String[] args) {
    int [] arrr={1,2,3,1};

        System.out.println( new BiotonicArrayLargeNumberSearch().findPeakElement(arrr));
    }
}
