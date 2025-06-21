package Binary_search.easy.array;

import java.util.ArrayList;

public class Intersection2 {
    public static void main(String[] args) {

    }
    public static int[] another(int nums1[],int nums2[]){

        ArrayList<Integer> set1=new ArrayList<>();

        for(int ele : nums1){
            set1.add(ele);
        }

        ArrayList <Integer> intersection=new ArrayList<>();


        for(int ele : nums2){
            if(set1.contains(ele)){
                intersection.add(ele);
                Integer in=ele;
                set1.remove(in);

            }
        }

        int[] arr = new int[intersection.size()];
        int i = 0;
        for (int ele : intersection) {
            arr[i] = ele;
            i++;
        }
        return arr;


    }
}
