package easy.array;
 // question https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class NextGreaterLetter {


    public static   char nextGreaterLetter(char []letters,char target){
          int start=0;
          int end=letters.length-1;

          while(start <=end){
              int middle= start+(end-start)/2;

              if(letters[middle] > target)
                  end=middle-1;
              else
                  start=middle+1;

          }
        // return  (start >= letters.length) ? letters[0]:letters[start];  both are same line 19 and 20 we can use any one
        return  letters[start%letters.length];  // when start become the length of the letter then at that case it will return the first element of the array

    }


    public static void main(String[] args) {
     char [] letters={'x','x','y','y'};
     char target='z';
        System.out.println(nextGreaterLetter(letters,target));
    }
}
