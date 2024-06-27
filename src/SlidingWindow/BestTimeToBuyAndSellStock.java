package SlidingWindow;

public class BestTimeToBuyAndSellStock {

    public int stock(int[] prices) {
        int profit = 0;
        int minVal = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minVal) minVal = prices[i];
            else if(profit < prices[i] - minVal) profit = prices[i] - minVal;
        }
        return profit;
    }
}
