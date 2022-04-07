class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = buy + 1;
        int maxProfit = 0;
            
        while(sell < prices.length) {
            if(prices[sell] <= prices[buy]) {
                buy = sell;
                sell++;
                continue;
            }
            
            int profit = prices[sell] - prices[buy];
            
            if(profit > maxProfit) maxProfit = profit;
            
            sell++;
        }
        
        return maxProfit;
    }
}
