package BitManupulation;

public class UpdateIthBit {
    public static int updateIthBit(int n ,int i , int newbit) {
        int bit = ~(1<<i);    
        n =  n&bit;
        int bitMask = newbit<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
