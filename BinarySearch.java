/*
 * Binary Search
 * ----------------------
 * Given a sorted array 'nums' and an integer 'target', return the index of target.
 * Return -1 if the target does not exist.
 *
 * COMPLEXITY:
 * - Time: O(log n) -> Divide and conquer approach.
 * - Space: O(1) -> Iterative solution (no recursion stack or extra structures).
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int output =  binarySearch(nums, target); // 4
        System.out.println(output);
    }

    private static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}