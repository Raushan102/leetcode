package Binary_search.easy.array;

// Q. find the rotation count in rotated array
// example : {15,16,2,4,5,11,12} output=2

public class Find_the_rotation_count {

    static int FindThePivot(int [] array){
        int start=0;
        int end=array.length-1;

        while (start <=end){
            int mid=start+(end-start)/2;

            if(mid < array.length  && array[mid] > array[mid+1]){
                return mid;
            }else if(mid > 0 && array[mid-1] > array[mid]){
                return  mid-1;
            }else if(array[start] < array[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;
    }


    static  int findRotation(int array[]){
        return FindThePivot(array)+1;
    }

    public static void main(String[] args) {
        int []array={12,15,16,2,4,5,11};
        int array2[]={5,6,7,8,9,1,2,3,4};
        System.out.println(findRotation(array2));
    }
}
