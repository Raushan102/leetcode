package easy.array;
// find the smallest element in the array that is greater or equal to the target element


public class ceilingOFNumber {
    public static int ceilingNumber(int[] elements,int target){
        int start=0;
        int end=elements.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(elements[mid] > target)
                end=mid-1;
            else if(elements[mid] < target)
                start = mid + 1;
            else
                return elements[mid]; // also we can return the index
        }
        return elements[start];    // also we can return the index
    }
    public static void main(String[] args) {
      int[] array={1,2,3,4,5,6,7,8,100};
        System.out.println(ceilingNumber(array,99));
    }
}
