package ExtraOrdinary;

import Binary_search.easy.array.Intersection;

import java.util.ArrayList;
import java.util.Arrays;

public class Pair_of_candy {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceCandySum=0;
        int bobSizesCandySu=0;

        ArrayList < Integer> list =new ArrayList<>();

        for(int ele : aliceSizes){
            aliceCandySum+=ele;
        }
        for(int ele : bobSizes){
            bobSizesCandySu+=ele;
            list.add(ele);
        }

        for (int aliceSize : aliceSizes) {
            int result = (bobSizesCandySu - aliceCandySum) / 2 + aliceSize;

            if (list.contains(result)) {
                return new int[]{aliceSize, result};
            }
        }

        return new int[]{-1,-1};
    }
    public  static  boolean checkIfExist(int[] arr) {

        for (int k : arr) {

            for (int i : arr) {

                if (k == (2 * i)) {
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
      int [] arr1={1,2};
      int []arr2={3,2};

      int [] arr3={0,-2,2};

        System.out.println(checkIfExist(arr3));


        //System.out.println(2*x);

        //System.out.println(Arrays.toString(fairCandySwap(arr1,arr2)));
    }
}
