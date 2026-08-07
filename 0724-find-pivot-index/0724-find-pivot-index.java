class Solution {
    public int pivotIndex(int[] nums) {

        // Step 1: Find the total sum of the array
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
        }

        // Step 2: Initially, there is nothing on the left
        int leftSum = 0;

        // Step 3: Check every index
        for (int i = 0; i < nums.length; i++) {

            // Calculate the sum on the right side
            int rightSum = totalSum - leftSum - nums[i];

            // Check whether left sum and right sum are equal
            if (leftSum == rightSum) {
                return i;
            }

            // Current element becomes part of the left side
            leftSum = leftSum + nums[i];
        }

        // No pivot index found
        return -1;
    }
}