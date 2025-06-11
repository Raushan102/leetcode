package Binary_search.hard.array;

public class Split_Array_Largest_Sum {
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int peace = 1;

            for (int ele : nums) {
                if (sum + ele > mid) {
                    sum = ele;
                    peace++;
                } else {
                    sum += ele;
                }
            }

            if (peace <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        System.out.println(splitArray(nums, 2));

    }
}
