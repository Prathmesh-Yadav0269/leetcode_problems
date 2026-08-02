class Solution {
    public int findNumbers(int[] nums) {
         int answer = 0; // Counts how many numbers have even digits

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];     // Current number
            int digitCount = 0;    // Count digits of THIS number only

            while (num != 0) {
                num = num / 10;
                digitCount++;
            }

            if (digitCount % 2 == 0) {
                answer++;
            }
        }

        return answer;
    }
}