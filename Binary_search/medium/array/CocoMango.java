package Binary_search.medium.array;
//https://leetcode.com/problems/koko-eating-bananas/submissions/1669527182/
public class CocoMango {
    public static int cocoFood(int piles[],int h){
        int start=1;
        int end=0;
        int ans=0;
        for(int ele : piles){
           end=Math.max(ele,end);
        }

        while(start<=end) {
            int mid = start + (end - start) / 2;

            int banaeat = 0;
            int i = 0;
            int temp = 0;

            while (i != (piles.length)) {
                int result = (int) Math.ceil((double) piles[i] / mid);
                banaeat += result;
                i++;
            }

            if(banaeat<=h){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return ans;

    }


    public static void main(String[] args) {
      int[]  piles = {3,6,7,11}; int h = 8;
        System.out.println(cocoFood(piles,h));
    }
}
