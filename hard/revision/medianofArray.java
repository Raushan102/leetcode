package hard.revision;

public class medianofArray {

     public  static   double findMedianOFArray(int number1[],int numbers2 []){
         if(number1.length > numbers2.length){
             return findMedianOFArray(numbers2,number1);
         }

         int number1Length=number1.length;
         int number2Length=numbers2.length;

         int low=0;
         int high=number1Length-1;

         int N=number1Length+number2Length;




         while(low <=high){
             int middle = (low+high)/2;
             int cut1= middle;
             int cut2 =(N/2)-cut1;

             int cut1left=(cut1==0) ? Integer.MIN_VALUE: number1[cut1-1];
             int cut1right=(cut1==number1Length) ? Integer.MAX_VALUE:number1[cut1];
             int cut2left=(cut2==0) ? Integer.MIN_VALUE: numbers2[cut2-1];
             int cut2right=(cut2==number2Length) ? Integer.MAX_VALUE:numbers2[cut2];


             if(cut1right <= cut2right && cut2left <= cut2right){
                 if(N%2!=0){
                     return (double) Math.min(cut1right,cut2right);
                 }else{
                     return (double)  (Math.max(cut1left,cut2left) + Math.min(cut2right,cut1right) )/ 2 ;
                 }
             }else if(cut1left > cut2right){
               high=cut1-1;
             }else{
                 low=cut1+1;
             }



         }
         return 0.0;
     }

    public static void main(String[] args) {
        int [] num1={3,4};
        int [] num2={1,2};

        System.out.println(findMedianOFArray(num1,num2));
    }
}
