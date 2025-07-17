package Functions;
import java.util.Scanner;

public class PrimeNo {
    public static boolean isPrime(int a) {
        boolean isPrime = true;
        for(int i=2;i<=a-1 ;i++) {
            if (a % i ==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static boolean opPrime(int a) {
        if (a==2) {
            return true;
        } else if (a==0||a==1) {
            return false;
        }
        for(int i=2; i<= Math.sqrt(a) ; i++) {
            if (a%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean prime = opPrime(a);
        System.out.println("the given on is prime : "+prime);
        
        sc.close();
    }
}
