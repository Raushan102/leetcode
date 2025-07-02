package Binary_search.medium.array;

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> sprialMatrix(int [][] matrix){

      // crater  the list of ArrayList class because List is  interface
        List <Integer> list=new ArrayList<>();

        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;


        while(startRow<=endRow && startCol <= endCol) {

            // add the element of the top of the matrix in list
            for (int i = startCol; i <= endCol; i++) {
              list.add(matrix[startRow][i]);

            }

            // check weather all element of the matrix add or not
            if(list.size() == (matrix.length * matrix[0].length) ){
                return  list;
            }

           // add right side elements  of the matrix in list
            for (int i = startRow+1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }

            // check weather all element of the matrix add or not
            if(list.size() == (matrix.length * matrix[0].length) ){
                return  list;
            }

            // add bottom  element of matrix in list
            for (int i = endCol - 1; i >= startCol; i--) {
                    list.add(matrix[endRow][i]);
            }

            // check weather all element of the matrix add or not
            if(list.size() == (matrix.length * matrix[0].length) ){
                return  list;
            }

            // add left side element  of the matrix  in list
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                    list.add(matrix[i][startCol]) ;
            }

            // check weather all element of the matrix add or not
            if(list.size() == (matrix.length * matrix[0].length) ){
                return  list;
            }

            // go one level deep from current level in matrix
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        return  list; // return  list

    }

    public static void main(String[] args) {
    int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };

        System.out.println(sprialMatrix(matrix));

    }
}
