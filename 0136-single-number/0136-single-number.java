class Solution {
    public int singleNumber(int[] nums) {

        // Start with 0
        int answer = 0;

        // Traverse every element
        for (int i = 0; i < nums.length; i++) {

            // XOR the current number with answer
            answer = answer ^ nums[i];
        }

        // The remaining value is the single number
        return answer;
    }
}