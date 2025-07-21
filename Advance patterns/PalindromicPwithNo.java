public class PalindromicPwithNo {
    public static void palindromic_pattern_with_numbers(int n) {
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //desending
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            //Asending
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        palindromic_pattern_with_numbers(5);
    }
}
