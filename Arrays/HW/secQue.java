
public class secQue {
    public static int search(int[] nums, int target) {
        // Initialize left and right pointers for binary search
        int left = 0;
        int right = nums.length - 1;

        // Perform binary search
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // If the middle element is the target, return its index
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            // Case 1: The left half is sorted (nums[left] <= nums[mid])
            if (nums[left] <= nums[mid]) {
                // Check if the target lies within the sorted left half
                // If target is greater than or equal to nums[left] AND less than nums[mid]
                if (target >= nums[left] && target < nums[mid]) {
                    // Target is in the left sorted half, so discard the right half
                    right = mid - 1;
                } else {
                    // Target is not in the left sorted half, so it must be in the right (unsorted or sorted) half
                    left = mid + 1;
                }
            }
            // Case 2: The right half is sorted (nums[mid] < nums[right])
            else {
                // Check if the target lies within the sorted right half
                // If target is greater than nums[mid] AND less than or equal to nums[right]
                if (target > nums[mid] && target <= nums[right]) {
                    // Target is in the right sorted half, so discard the left half
                    left = mid + 1;
                } else {
                    // Target is not in the right sorted half, so it must be in the left (unsorted or sorted) half
                    right = mid - 1;
                }
            }
        }

        // If the loop finishes, the target was not found in the array
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int numbers[] = {4, 5, 6, 7, 0, 1, 2};
        int goal = 0;
        int target = 3;
        System.out.println(search(nums , target ));
        System.out.println(search(numbers, goal));
    }
}
