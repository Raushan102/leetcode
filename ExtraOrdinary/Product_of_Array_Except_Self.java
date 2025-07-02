package ExtraOrdinary;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
// video ref:https://www.youtube.com/watch?v=TW2m8m_FNJE&t=1639s
public class Product_of_Array_Except_Self {
    // first way  timeComplexity  O(n)
    public static void productOFSum_Way1(int[] nums) {

        int product = 1;
        for (int ele : nums) {
            product *= ele;
        }

        for (int i = 0; i < nums.length; i++) {
            int result = product / nums[i];
            nums[i] = result;
        }

    }

    // use this way if explicitly mentioned that can not use division method or operation

    public static void product_of_array_way2(int[] nums) {
        // this way is fully depends on prefix and suffix array like
        // preparing prefix Array

        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }


        for (int i = 1; i < nums.length; i++) {

            nums[i] = prefix[i] * suffix[i];

        }

    }

    // if question say don't use divide operation and then solve in O(n) time complexity


    public static int[] product_of_array_way3(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(product_of_array_way3(arr)));
    }
}
