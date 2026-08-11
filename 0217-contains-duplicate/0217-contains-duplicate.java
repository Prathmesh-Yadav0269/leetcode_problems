import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Create a HashSet to store numbers we have already seen
        HashSet<Integer> set = new HashSet<>();

        // Traverse through every element of the array
        for (int i = 0; i < nums.length; i++) {

            // Check if the current number already exists in the set
            if (set.contains(nums[i])) {

                // Duplicate found
                return true;
            }

            // Current number has not appeared before,
            // so store it in the set
            set.add(nums[i]);
        }

        // No duplicate was found
        return false;
    }
}