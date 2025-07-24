public class CountingSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // loop to find the largest value among the array values
        for (int i = 0; i < arr.length; i++) {
            largest =  Math.max(largest, arr[i]);
        }

        //count array to store the frequency of each element
        // For our example, the size will be 7 + 1 = 8 (indices 0 through 7).
        int count[] = new int[largest+1];
        // For each number in 'arr', use that number as an index for the 'count' array
        // and increment the value at that index. This tallies the occurrences of each number.
        for (int i = 0; i < arr.length; i++) {
            // Example: If arr[i] is 2, then count[2] is incremented.
            count[arr[i]]++ ; 
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                // Place the number 'i' into the original array at the current position 'j'.
                arr[j] = i;
                // Move to the next position in the original array for the next element.
                j++;
                // Decrement the count for the number 'i' since we've now placed one instance of it.   
                count[i]--;
            }
        }
    }
    public static void printf(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,3,2,4,6,7,1,2,3};
        countingSort(arr);
        printf(arr); 
    }
}
