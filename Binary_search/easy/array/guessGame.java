package Binary_search.easy.array;

import java.util.Scanner;

public class guessGame {
    long RandomNumber;



    public int guess(int num) {

        System.out.println(RandomNumber);

        if (num > RandomNumber) {
            return -1;
        } else if (num < RandomNumber) {
            return 1;
        } else {
            return num;
        }


    }


    public int guessNumber(int n) {
        int start=0;
        int end=n;

        while (true) {
            int mid=start+(end-start)/2;
            int result=guess(mid);

            if (result == -1) {
                end=mid-1;
            } else if (result == 1) {
                start=mid+1;
            } else {
                break;
            }
        }

        return (int) RandomNumber;
    }

    public static void main(String[] args) {
        System.out.println( new guessGame().guessNumber(10));

    }
}
