package BitManupulation;

public class CheckPowerofTwo {
    public static boolean checkPowerOfTwo (int n) {
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOfTwo(16));
        System.out.println(checkPowerOfTwo(15));
    }
}
