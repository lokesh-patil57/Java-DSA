package Recursion;

public class OptiPowerofN {
    public static int OptiPower(int x ,int n) {
        if (n ==0) {
            return 1;
        }
        int halfPower = OptiPower(x, n/2);
        int halfPowerSq = halfPower *halfPower ;
        if (n %2 != 0) {
            halfPowerSq = x *halfPower*halfPower;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(OptiPower(x, n));
    }
}
