package Binary_search.medium.array;

public class Max_area {
    public int maxArea(int[] height) {
       int maxWater= Integer.MIN_VALUE;
       int start=0;
       int end =height.length-1;

       while(start < end){
           int breath=end-start;
           int high=Math.min(height[end],height[start]);
           int current_water= breath*high;
           maxWater=Math.max(maxWater,current_water);

           if(height[start] <= height[end] ){
               start++;
           }else{
               end--;
           }
       }
       return  maxWater;
    }
    public static void main(String[] args) {
          int [] height={1,1};

        System.out.println(new Max_area().maxArea(height));
    }
}
