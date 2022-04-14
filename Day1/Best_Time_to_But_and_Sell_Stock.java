class Solution {
    public int maxProfit(int[] prices) {
        int diff,profit=0,buy = prices[0];
        for(int i=1;i<prices.length;i++){
            diff = prices[i] - buy;
            profit = Math.max(profit,diff);
            buy= Math.min(buy,prices[i]);
        }
        return profit;
    }
}
