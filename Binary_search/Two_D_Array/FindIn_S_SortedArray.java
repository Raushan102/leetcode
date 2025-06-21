package Binary_search.Two_D_Array;

import java.util.Arrays;
// search in strictly sorted matrix in  O(log n) time complexity;

public class FindIn_S_SortedArray {


       public static int [] helperBinarySearchFunction(int [][]matrix,int row,int startcol,int endCol,int target){
            while(startcol <=endCol){

                int mid=startcol+(endCol-startcol)/2;

                if(matrix[row][mid] ==target){
                    return  new int[]{row,mid};
                }

                if(matrix[row][mid] > target){
                    endCol=mid-1;
                }else{
                    startcol=mid+1;
                }

            }
           return  new int[]{-1,-1};
        }

    static int [] findElement(int [][] matrix,int target){

           int startRow=0;
           int endRow=matrix.length-1;
           int col=(matrix[0].length-1)/2; // calculate the mid of col

          // eliminate the all the row till 2 row left
           while (startRow < (endRow-1)){
               int mid=startRow+(endRow-startRow)/2;

               if(matrix[mid][col] == target){
                   return new int[]{mid,col};
               }

               if(matrix[mid][col] < target){
                   startRow=mid;
               }else{
                   endRow=mid;
               }

           }


     int [] row1=helperBinarySearchFunction(matrix,startRow,0,matrix[0].length-1,target);

           if(row1[0]==-1){
               return row1=helperBinarySearchFunction(matrix,endRow,0,matrix[0].length-1,target);
           }

        return row1;

    }

    public static void main(String[] args) {
        int [][] matrix={ {1,2,3,4},{5,6,7,8},{9,10,11,12} ,{13,14,15,16}};


        System.out.println(Arrays.toString(findElement(matrix,17)));
    }
}
