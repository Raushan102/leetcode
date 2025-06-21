package Binary_search.Two_D_Array;
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

public class Count_negativeNumber_in_s_matrix {



    public static int countNegatives(int[][] grid) {


        int total_row=grid.length;
        int total_col=grid[0].length;

        int row=0;
        int col=grid[0].length-1;
        int negativeNumberCounter=0;

        while(row >= 0 && row < total_row && col >= 0 && col < total_col){
            if(grid[row][col] < 0){
                negativeNumberCounter= negativeNumberCounter+(total_row-row);
                col--;
            }else{
                row++;
            }


        }


        return negativeNumberCounter;

    }
    public static void main(String[] args) {
        int [][]grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
}
