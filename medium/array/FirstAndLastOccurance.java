package medium.array;


public class FirstAndLastOccurance {
    public static int[] firstAnsLastOccur(int[] array, int target) {
        int[] arr = {-1, -1};
        arr[0] = search(array, target, true);
        arr[1] = search(array, target, false);
        return arr;


    }

    public static int search(int[] array, int target, boolean findFirstOccurance) {
        int start = 0;
        int ans = -1;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirstOccurance) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return ans;

    }

    public static void main(String[] args) {
   int arr []={2,3,4,4,4,4,4,5,6,7,7,7};

   for(int i : firstAnsLastOccur(arr,4)){
       System.out.println(i);
   }

    }
}
