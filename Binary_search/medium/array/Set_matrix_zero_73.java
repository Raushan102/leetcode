package Binary_search.medium.array;

import java.util.Arrays;

public class Set_matrix_zero_73 {

    public static void setZeroes(int[][] matrix) {

        int row=matrix.length;
        int col=matrix[0].length;

        int[][] temp_matrix=new int[row][col]; // make temporary matrix
        for (int i=0;i<row;i++){
            Arrays.fill(temp_matrix[i],1); // fill all the cell  with 1;
        }

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < col; j++) {
                 if(matrix[i][j]==0){
                     helperfunction(temp_matrix,i,j); //  if matrix[i][j]== 0 fill all the row and col with zero of temporary matrix
                 }
            }

        }

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < col; j++) {
                if(temp_matrix[i][j]==0){ // check if the val of temporary matrix cell is equal to zero then replace the...
                    matrix[i][j]=0;      // value of cell with zero in matrix

                }
            }

        }
    }


    public static void helperfunction(int [][] matrix,int row,int col){
        int [][] direction={{0,1},{1,0},{-1,0},{0,-1}}; // all the directing from the current row and col to
                                                         // travel all the row and col from current position
        int dir=0;
        int tempRow=row;
        int tempCol=col;

        while(dir < direction.length){

            while(true){
                tempRow+=direction[dir][0]; // calculating next row and col to fill
                tempCol+=direction[dir][1];

               // check weather it's correct row and col or not if yes then replace 1 with zero
                if(tempRow >= 0 && tempRow < matrix.length && tempCol >= 0 && tempCol < matrix[0].length){
                    matrix[tempRow][tempCol]=0;
                }else{
                    break; // if we are out of matrix boundary then break means we are down in that direction
                }

            }
            dir++; // fill in the next direction

            // return to initial position after replace ele in a particular direction
            tempRow=row;
            tempCol=col;

        }

    }


    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        setZeroes(matrix);
        for( int [] ele : matrix){
            System.out.println(Arrays.toString(ele));
        }

    }
}
