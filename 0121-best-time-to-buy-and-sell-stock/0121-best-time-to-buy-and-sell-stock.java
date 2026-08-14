class Solution {
    public int maxProfit(int[] prices) {

        // Store the cheapest price we have seen so far
        int minPrice = prices[0];

        // Store the maximum profit found so far
        int maxProfit = 0;

        // Start from the second day
        for (int i = 1; i < prices.length; i++) {

            // If today's price is cheaper,
            // update the minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate the profit if we sell today
            int profit = prices[i] - minPrice;

            // Update maximum profit if today's profit is better
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Return the best profit
        return maxProfit;
    }
}