
public class MaxSumofArray {
    public static void subArrays(int numbers[]) {
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                curSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]+" | ");
                    curSum += numbers[k];
                }
                if (maxSum<curSum) {
                    maxSum = curSum;
                } else if (minSum> curSum) {
                    minSum = curSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum : "+maxSum);
        System.out.println("Min Sum : "+minSum);
    }
    public static void main(String[] args) {
        int numbers[] ={1,-2,6,-1,3};
        subArrays(numbers);
    }
}
