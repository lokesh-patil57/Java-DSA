package BitManupulation;
public class EvenandOdd {
    public static void evenandOdd(int n) {
        int bitMask = 1;
        // Even check
        if ((n & bitMask )==0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

    }
    public static void main(String[] args) {
        evenandOdd(23);
        evenandOdd(13);
        evenandOdd(14);
    }
}
