class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Track the minimum price
        int maxProfit = 0; // Track the maximum profit
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; 
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; 
            }
        }
        
        return maxProfit;
    }
}
