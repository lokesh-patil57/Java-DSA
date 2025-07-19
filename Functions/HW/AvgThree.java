import java.util.Scanner;

public class AvgThree {
    public static int avgThree(int a, int b, int c) {
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = avgThree(a, b, c);
        System.out.println("Average of no is : "+avg);
        sc.close();
    }
}
