package medium.array;

import com.sun.security.jgss.GSSUtil;

public class SearchInRotatedDuplicateArray {
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
            }else if(array[start] == array[mid] && array[end] == array[mid]){

                if(array[start] > array[start+1]){
                    return start;
                }
                start++;

                if(array[end] < array[end-1]){
                    return end-1;
                }

                end--;
            }
            else if(array[start] < array[mid] || (array[start] == array[mid] && array[end] < array[mid])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public  static boolean  searchElement(int [] array,int target,int start,int end){
        while(start <= end){
            int mid = start+(end-start)/2;

            if(array[mid] > target){
                end=mid-1;
            }else if(array[mid] < target){
                start=mid+1;
            }else{
                return true;
            }

        }

        return false;
    }


    public static  boolean search(int [] array,int target ){
        int start=0;
        int pivot=findPivot(array);
        System.out.println(pivot);
        int end=array.length-1;

        if(pivot == -1){
            return false;
        }

        if(array[pivot] == target){
            return true;
        }

        if(array[start] > target){
            return searchElement(array,target,pivot+1,end);
        }

        return  searchElement(array,target,start,pivot-1);
    }
    public static void main(String[] args) {

        int [] array={2,5,6,0,0,1,2};
        System.out.println(search(array,0));

    }
}
