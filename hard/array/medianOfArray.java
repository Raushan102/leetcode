package hard;

public class medianOfArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int array1Length = nums1.length;
        int array2Length = nums2.length;

        int total_length_of_both_array = array1Length + array2Length;

        int low = 0;
        int high = array1Length;

        while (low <= high) {

            int middle = (low + high) / 2;

            int cut1 = middle;
            int cut2 = (total_length_of_both_array / 2) - cut1;

            int array1_left = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int array1_right = (cut1 == array1Length) ? Integer.MAX_VALUE : nums1[cut1];
            int array2_left = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int array2_right = (cut2 == array2Length) ? Integer.MAX_VALUE : nums2[cut2];

            if (array1_left <= array2_right && array2_left <= array1_right) {
                if (total_length_of_both_array % 2 != 0) {
                    return Math.min(array1_right, array2_right);
                } else {
                    return (double) (Math.max(array1_left, array2_left) + Math.min(array1_right, array2_right)) / 2;
                }
            } else if (array1_left > array2_right) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }


        }
        return 0.0;


    }

    public static void main(String[] args) {
        int[] num1 = {3, 4};
        int[] num2 = {1, 2};

        System.out.println(findMedianSortedArrays(num1, num2));
    }


}
