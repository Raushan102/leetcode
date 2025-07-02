package Binary_search.medium.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Spiral_Matrix_II {
    public static int [][] generateMatrix(int n) {


        int ans[][] = new int[n][n]; // creating the matrix of size 2n

        int number=1;  // number counter to fill the matrix in correct order
        int startRow = 0;
        int startCol = 0;
        int endRow =n- 1;
        int endCol = n - 1;


        while (startRow <= endRow && startCol <= endCol) {

            // fill int the top of the matrix
            for (int i = startCol; i <= endCol; i++) {
               ans[startRow][i]=number;
               number++;

            }

            if (number == (n*n)+1) { // check weather matrix is full or not
                return ans;
            }

            // fill in  left side of the matrix
            for (int i = startRow + 1; i <= endRow; i++) {

                ans[i][endCol]=number;
                number++;
            }

            if (number == (n*n)+1) { // check weather matrix is full or not
                return ans;
            }

            // fill in bottom of the matrix
            for (int i = endCol - 1; i >= startCol; i--) {
                ans[endRow][i]=number;
                number++;

            }

            if (number == (n*n)+1) { // check weather matrix is full or not
                return ans;
            }

           // fill in right part of the matrix
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                ans[i][startCol]=number;
                number++;
            }

            if (number == (n*n)+1) { // check weather matrix is full or not
                return ans;
            }

            // go one level deep of the matrix from current level
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        return ans;
    }

    public static void main(String[] args) {



      int result[][]=generateMatrix(3);

      for (int []ele:result){
          System.out.println(Arrays.toString(ele));
      }

    }
}
