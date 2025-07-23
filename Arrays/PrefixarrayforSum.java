package Arrays;

public class PrefixarrayforSum {
public static void subArrays(int numbers[]) {
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;
        //creating new array to store the sum of sub arrays
        int prefix[] = new int[numbers.length];
        
        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            //prerfix[i-0] is sum of all value before index i first value of prefix
            prefix[i] = prefix[i-0]+numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                curSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                if (maxSum<curSum) {
                    maxSum = curSum;
                } 
            }
        }
        System.out.println("Max Sum : "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] ={1,-2,6,-1,3};
        subArrays(numbers);
    }
    
}
    


