package SlidingWindow;

public class Main {

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock stocks = new BestTimeToBuyAndSellStock();
        int[] prices = {10,1,5,6,7,1};
        System.out.println(stocks.stock(prices));
    }
}
