import java.util.Arrays;
import java.util.Collections;

public class InbuitSort {
    public static void printf(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        printf(arr);
    }
}
