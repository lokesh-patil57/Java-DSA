package Functions;
import java.util.*;

public class parameter {
    public static int calSum(int a , int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calSum(a, b);
        System.out.println("Sum is :" + sum);
        sc.close();
    }
    
}
