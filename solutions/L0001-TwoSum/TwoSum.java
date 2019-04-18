import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp))
                return new int[] {map.get(tmp), i};
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = { 2, 7, 11, 15, 9 };
        int target = 9;
        int[] output = solution.twoSum(input, target);
        for (int i:output)
            System.out.println(i);
    }
}