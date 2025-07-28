import java.util.Scanner;

public class funcOverPara {
    public static int sum(int a,int b) {
        return a+b;
    }
    public static float sum (float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sum(5, 1);
        float b = sum(3.3f, 2.7f);
        System.out.println(a);
        System.out.println(b);
        


        sc.close();
    }
}
