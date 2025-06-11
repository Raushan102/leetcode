package Binary_search.easy.array;

// greatest number that is smaller or equal to the target
// important part  of the binary search

public class floorNumberBS {

    public  static int floorNumber(int []array,int target){
        int start=0;
        int end= array.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid] > target)
                end=mid-1;
            else if(array[mid] < target)
                start=mid+1;
            else
                return array[mid] ;  // also we can return the index
        }
        return  array[end] ; // we can also remove the index of the

    }
    public static void main(String[] args) {
        int [] array={2,3,4,234,500};
        System.out.println(    floorNumber(array,400));
    }
}
