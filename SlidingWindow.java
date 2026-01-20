/**
 * Algorithm: Fixed Size Sliding Window
 *
 * Problem:
 * Given an array of integers and a number k, find the maximum sum of a contiguous subarray of size k.
 *
 * Time Complexity: O(N) - We traverse the array once.
 * Space Complexity: O(1) - We use only a few variables for storage.
 *
 * Example:
 * Input: [2, 1, 5, 1, 3, 2], k = 3
 * Output: 9
 * Explanation:
 * [2, 1, 5] = 8
 * [1, 5, 1] = 7
 * [5, 1, 3] = 9 (Max)
 * [1, 3, 2] = 6
 */
public class SlidingWindow {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = findMaxSum(arr, k);
        System.out.println("Maximum Sum: " + result); // Output: 9
    }

    public static int findMaxSum(int[] arr, int k) {
        // Edge case: if array is smaller than the window size
        if (arr.length < k) {
            return -1; // Or throw an exception
        }

        int windowSum = 0;

        // Step 1: Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window from the k-th element to the end
        for (int i = k; i < arr.length; i++) {
            // "The Magic": Add the new element (right) and remove the old element (left)
            // This maintains the window size of 'k' without re-looping.
            windowSum = windowSum + arr[i] - arr[i - k];
            
            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
