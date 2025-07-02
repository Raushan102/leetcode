package Binary_search.medium.array;
import java.util.Arrays;

  // video for ref=https://www.youtube.com/watch?v=dt0UzAz7SPg
 //  leetcode link=https://leetcode.com/problems/spiral-matrix-iii/description/
// time complexity O((max fo row and col)^2)

public class Spiral_Matrix_III {
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int [][] ans=new int[rows*cols][2];

        int [][] directionArray=new int[][]{
                {0,1}, // East direction
                {1,0}, // south direction
                {0,-1}, // west
                {-1,0}  // North
        };

        int step=0; // count steps
        int index=0; // count how way cell we visited
        int direction=0; //  calculate in which direct we have to  move

        // add the start position that  is already given
        ans[index][0]=rStart;
        ans[index][1]=cStart;
        index++; // increase counter

        while (index < rows*cols){

            if(direction == 0 || direction == 2){ // if we move east or west increase the step
                step++;
            }

            for (int i=0 ; i<step;i++){
                // calculate next row and col in a direction
                rStart+=directionArray[direction][0];
                cStart+=directionArray[direction][1];

                if( rStart >=0 && rStart < rows &&cStart >=0 && cStart < cols){ // check weather we are at in  the matrix cell or out of matrix
                    ans[index][0]=rStart;   // add row and col in the  array
                    ans[index][1]=cStart;
                    index++;
                }
            }

            direction=(direction+1) % 4;   // change direction % 4 because  we have to return in east direct after north
        }
        return ans;

    }

    public static void main(String[] args) {
     int result [][]=spiralMatrixIII(5,6,1,4);

     for(int ele[] : result){
         System.out.println(Arrays.toString(ele));
     }
    }
}
