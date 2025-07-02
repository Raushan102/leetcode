package Binary_search.easy.Revision;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    public static List<Integer> FindDisappearedNumber(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int n = arr.length;
        while (i != n) {

            if (arr[i] != i + 1 && (arr[i] - 1) < n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }

        }

        for (int j = 0; j < arr.length; j++) {

                if (arr[j] != (j + 1)) {
                    list.add(j+1);
                }


        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(FindDisappearedNumber(arr));
    }
}
