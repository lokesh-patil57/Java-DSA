public class ButterflyP {
    public static void butterfly_pattern(int n) {
        // Outer loop 
        //First Half
        for (int i = 1; i <= n; i++) {
            // Star-1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Star-2
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        //Second Half
        for (int i = n; i >= 1; i--) {
            // Star-1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // Star-2
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        butterfly_pattern(4);
    }
}
