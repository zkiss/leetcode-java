package net.zkiss.leetcode;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee
public class BestTimeToBuyAndSellStockWithTransactionFee {

    public static final int BUY = 0;
    private static final int SELL = 1;

    public int maxProfit(int[] prices, int fee) {
        var maxProfits = new Integer[prices.length][2];
        return buy(0, prices, maxProfits, fee);
    }

    private int buy(int at, int[] prices, Integer[][] maxProfits, int fee) {
        if (prices.length <= at) {
            return 0;
        }
        if (maxProfits[at][BUY] != null) {
            return maxProfits[at][BUY];
        }
        var buy_now = -prices[at] + sell(at + 1, prices, maxProfits, fee);
        var buy_later = buy(at + 1, prices, maxProfits, fee);
        maxProfits[at][BUY] = Math.max(buy_now, buy_later);
        return maxProfits[at][BUY];
    }

    private int sell(int at, int[] prices, Integer[][] maxProfits, int fee) {
        if (prices.length <= at) {
            return 0;
        }
        if (maxProfits[at][SELL] != null) {
            return maxProfits[at][SELL];
        }
        var sell_now = prices[at] - fee + buy(at + 1, prices, maxProfits, fee);
        var sell_later = sell(at + 1, prices, maxProfits, fee);
        maxProfits[at][SELL] = Math.max(sell_now, sell_later);
        return maxProfits[at][SELL];
    }
}
