class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minBuy = prices[0];
        for(int i=1;i<prices.length;i++){
            int profit = prices[i] - minBuy;
            maxProfit = Math.max(maxProfit,profit);
            minBuy = Math.min(minBuy,prices[i]);
        }
        return maxProfit;
    }
}