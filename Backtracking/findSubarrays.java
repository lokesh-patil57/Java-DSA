package Backtracking;

public class findSubarrays {
    public static void FindSubArr(String str, String ans , int i){
        // base case 
        if (i==str.length()) {
            System.out.println(ans);
            return;
        }

        // Yes Choice
        FindSubArr(str, ans+str.charAt(i), i+1);

        // No choice
        FindSubArr(str, ans, i+1);
    }
    public static void main(String[] args) {
        
    }
}
