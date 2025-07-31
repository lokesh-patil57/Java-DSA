package BitManupulation;

public class clearIthBit {
    public static int clearithBit(int n , int i ){
        int bitMask = ~(1<<i);
        return n & bitMask ;
    }
    public static void main(String[] args) {
        System.out.println("Value : " + clearithBit(10, 2));
    }
}
 