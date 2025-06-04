package hard.array;

public class FindInMountainArray {

    public static int findInMountainArray(int[] array, int target) {
        int[] tempArr = {-1, -1};
        int start = 0;
        int firstEnd = findPkPoint(array);
        int secondStart = firstEnd + 1;
        int lastEnd = array.length - 1;

        tempArr[0] = helperFunction(array, start, firstEnd, target, true);
        tempArr[1] = helperFunction(array, secondStart, lastEnd, target, false);

        return (tempArr[0] == -1) ? tempArr[1] : tempArr[0];

    }

    public static int findPkPoint(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < array[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }


        }
        return start;
    }

    public static int helperFunction(int[] array, int start, int end, int target, boolean leftSearch) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (leftSearch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={0,1,2,4,2,1};
        System.out.println(findInMountainArray(arr,3));

    }
}
