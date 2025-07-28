//  Print out the sum of the numbers inthe second row of the “nums” array.
//  Example :
//  Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//  Output - 18


public class SumofRow {
    public static void main(String[] args) {
        int nums[][]  = { {1,4,9},{11,4,3},{2,2,3} };
        int sum = 0;

        for (int i = 0; i < nums[0].length; i++) {
            sum += nums[1][i];
        }
        System.out.println(sum);
    }
}
