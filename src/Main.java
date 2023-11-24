import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the complement of each number and its index
        HashMap<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement (target - current number)
            int complement = target - nums[i];

            // Check if the complement is already in the hashmap
            if (numMap.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{numMap.get(complement), i};
            }

            // If not found, add the current number and its index to the hashmap
            numMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array or handle it as needed
        return new int[]{};
    }
}