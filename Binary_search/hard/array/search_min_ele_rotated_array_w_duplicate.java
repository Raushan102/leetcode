package Binary_search.hard.array;

public class search_min_ele_rotated_array_w_duplicate {

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums[start] < nums[end]) {
            return nums[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (mid > start && nums[mid - 1] > nums[mid]) {
                return nums[mid - 1];
            } else if (nums[start] == nums[mid] && nums[mid] == nums[end]) {

                if (nums[start] > nums[start + 1]) {
                    return nums[start + 1];
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return nums[end];
                }
                end--;
            } else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                return start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {

    }
}
