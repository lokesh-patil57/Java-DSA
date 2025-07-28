
import java.util.Scanner;

public class factorial {
    public static int fact(int a) {
        int fact = 1;
        for(int i=1 ; i<=a ; i++){
            fact = fact*i ;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact  = fact(a);
        System.out.println("Factorial is :"+fact);
        sc.close();
    }
}
