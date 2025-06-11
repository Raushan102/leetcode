package easy.array;

public class mySqrt {

    public static int MySqrt(int x){
        if(x<2){
            return x;
        }

        int start=1;
        int end=x;


        while(start<=end){
            int mid=start+(end-start)/2;

            if( (long)mid*mid > (long) x){
                end=mid-1;
            }else if(mid*mid < x){
                 start=mid+1;
            }else {
                return mid;
            }
        }
        return Math.round(end);
    }
    public static void main(String[] args) {
        System.out.println(MySqrt(50));
    }
}
