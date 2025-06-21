package Binary_search.easy.array;

import java.util.*;
//https://leetcode.com/problems/intersection-of-two-arrays/

public class Intersection {


    public static void main(String[] args) {
     int [] nums1={1,2,2,2,1};
     int nums2[]={2,2,2};
        System.out.println( Arrays.toString(InterSn(nums1,nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
       // sorting both  the array
        Arrays.sort(nums1);
        Arrays.sort(nums2);


        int lengthOFNum1 = nums1.length - 1;
        int lengthOfNum2 = nums2.length - 1;
        Set<Integer> Intersection = new HashSet<>(); //  Set is  abstract class we can not create instance of abstract class

        int p1 = 0;
        int p2 = 0;

        while (p1 <= lengthOFNum1 && p2 < lengthOfNum2) {

            if (nums1[p1] == nums2[p2]) {
                Intersection.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }


        }

        int[] arr = new int[Intersection.size()];
        int i = 0;
        for (int ele : Intersection) {
            arr[i] = ele;
            i++;
        }
        return arr;

    }

    // try for optimal solution

    public static int[] InterSn(int nums1[],int nums2[]){

        Set <Integer> set1=new HashSet<>();

        for(int ele : nums1){
            set1.add(ele);
        }

        Set <Integer> intersection=new HashSet<>();


        for(int ele : nums2){
             if(set1.contains(ele)){
                  intersection.add(ele);

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
