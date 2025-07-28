package Arrays.HW;


public class RepeatedValue {
    // Time complexity O(n2)
    public static boolean repeatCheck(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // Alternate method
    
    // Time complexity O(n)
    // public boolean containsDuplicate(int nums[]) {
    //     HashSet<Integer> set = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (set.contains(nums[i])) {
    //             return true;
    //         } else {
    //             set.add(nums[i]);
    //         }
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4 };
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(repeatCheck(number));
        System.out.println(repeatCheck(nums));
        
        // System.out.println(containsDuplicate(nums));
    }
}
