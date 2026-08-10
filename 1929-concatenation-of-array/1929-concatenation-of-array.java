class Solution {
    public int[] getConcatenation(int[] nums) {

        // Store the length of the original array
        int n = nums.length;

        // Create an array that is twice the size
        int[] ans = new int[2 * n];

        // Traverse the original array
        for (int i = 0; i < n; i++) {

            // Copy nums[i] to the first half
            ans[i] = nums[i];

            // Copy nums[i] to the second half
            ans[i + n] = nums[i];
        }

        // Return the concatenated array
        return ans;
    }
}