package Strings;

public class PalindromeString {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("Not Palindrome");
                return false;
            }
        }
        System.out.println("Is Palindrome");
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        isPalindrome(str);
    }
}
