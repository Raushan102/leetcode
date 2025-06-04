package medium.array;

public class SearchInRotatedArray {

    public static  int findPivot(int array [] ){
         int start =0;
         int end=array.length-1;

         if(array.length == 1){
             return 0;
         }

         if(array[start] < array[end]){
             return end;
         }

         while(start <=end){
             int mid=start+(end-start)/2;
             if( mid < end && array[mid] > array[mid+1]){
                 return mid;
             }else if(mid > start && array[mid-1]> array[mid]){
                 return mid-1;
             }else if(array[start] < array[mid]){
                 start=mid+1;
             }else{
                 end=mid-1;
             }
         }
         return -1;
    }

    public  static int  search(int [] array,int target,int start,int end){
        while(start <= end){
            int mid = start+(end-start)/2;

            if(array[mid] > target){
                end=mid-1;
            }else if(array[mid] < target){
                start=mid+1;
            }else{
                return mid;
            }

        }

        return -1;
    }


    public static  int FindInRotatedArray(int [] array,int target ){
        int start=0;
        int pivot=findPivot(array);
        int end=array.length-1;

        if(pivot == -1){
            return pivot;
        }

        if(array[pivot] == target){
            return pivot;
        }

        if(array[start] > target){
           return search(array,target,pivot+1,end);
        }

        return  search(array,target,start,pivot-1);
    }



    public static void main(String[] args) {
        int [] roatedArray={1,3};

        System.out.println(FindInRotatedArray(roatedArray,1));
    }
}
