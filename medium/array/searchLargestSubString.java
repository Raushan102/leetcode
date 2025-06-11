package medium.array;

public class searchLargestSubString {

    // this question is not solve yet

     public static boolean has( String str,char ele){

         for (int i = 0; i < str.length() ; i++) {
             if(str.charAt(i) == ele){
                 return true;
             }
         }
         return false;
     }


     public  static int lengthOfLongestSubstring(String str){

         String  currrentString="";
         String  finalAns="";


         for (int i = 0; i < str.length() ; i++) {

              if(has(currrentString,str.charAt(i))){
                   if(currrentString.length() > finalAns.length()){
                       finalAns=currrentString;
                   }
                   currrentString="";
                  currrentString+=str.charAt(i);
              }else{
                  currrentString+=str.charAt(i);
              }
         }

         if(currrentString.length() > finalAns.length()-1){
            finalAns=currrentString;
         }

         return finalAns.length();

     }

    public static void main(String[] args) {
      String str="pwwkew";
        System.out.println(lengthOfLongestSubstring(str));


    }
}
