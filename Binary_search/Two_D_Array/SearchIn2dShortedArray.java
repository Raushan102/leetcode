package Binary_search.Two_D_Array;
// search element in row and col wise sorted matrix
public class SearchIn2dShortedArray {
    public static String findElement(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && row >= 0 && col < matrix[0].length && col > 0) {

            if (matrix[row][col] < target) {
                row++;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                return "[" + row + "]" + "[" + col + "]";
            }
        }
        return "[" + -1 + "]" + "[" + -1 + "]";
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 10}, {2, 5, 8, 11}, {3, 6, 9, 12}};
        System.out.println(findElement(matrix, 9));
    }
}
