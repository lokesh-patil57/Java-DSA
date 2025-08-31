package Backtracking;

public class Permutations {
    public static void findPermutation(String str , String ans) {
        //Base Case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }

        // Recurssion
        for (int i = 0; i < str.length(); i++) {
            char currr =str.charAt(i);
            //"abcde " => "ab"+"de" = "abde"
            String Newstr = str.substring(0,i)+str.substring(i+1);
            findPermutation(Newstr, ans+currr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
