package Arrays;

public class SubArrays {
    public static void subArrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]+" | ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of pairs : "+ts);
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10};
        subArrays(numbers);
    }
}
