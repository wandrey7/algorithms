import java.util.HashMap;
import java.util.Map;

/*
 * Two Sum
 * Approach: HashMap (One Pass)
 * * Time Complexity: O(n)
 * - We traverse the list containing N elements only once.
 * - Each lookup/insert in the HashMap costs O(1) on average.
 * * Space Complexity: O(n)
 * - In the worst case, we store almost all elements in the HashMap.
 */
public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Result: " + result[0] + ", " + result[1]);
    }

    private static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            int nes = target - currentNum;

            if(hm.containsKey(nes)){
                return new int[]{hm.get(nes), i};
            }

            hm.put(currentNum, i);
        }
        return new int[]{};
    }
}
