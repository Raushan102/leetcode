package Binary_search.medium.array;

public class Max_Value_of_Equation {

    public static int findMaxValueOfEquation(int[][] points, int k) {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<points.length;i++){
            if(i-1 >= 0){
                int result=Math.abs(points[i-1][0]-points[i][0]);
                if(result <=k){
                   max= Math.max((points[i-1][1]+points[i][1]+result),max);
                }
            }

            if(i+1 < points.length){
                int result=Math.abs(points[i][0]-points[i+1][0]);
                if(result <=k){
                    max= Math.max((points[i][1]+points[i+1][1]+result),max);
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[][] arr = {
                {-17, 5},
                {-10, -8},
                {-5, -13},
                {-2, 7},
                {8, -14}
        };



        System.out.println(findMaxValueOfEquation(arr,4));
    }
}
