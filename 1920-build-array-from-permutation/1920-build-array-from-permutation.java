class Solution {
    public int[] buildArray(int[] nums) {

        // Create a new array of the same size
        int[] ans = new int[nums.length];

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Store nums[nums[i]] in ans[i]
            ans[i] = nums[nums[i]];
        }

        // Return the answer array
        return ans;
    }
}