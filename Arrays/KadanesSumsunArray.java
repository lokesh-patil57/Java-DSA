
public class KadanesSumsunArray {
    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            curSum = curSum + numbers[i];
            if (curSum<0) {
                curSum =0;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        System.out.println("Max sum :"+maxSum );
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}