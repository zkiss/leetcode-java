package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    private final BestTimeToBuyAndSellStockWithTransactionFee bt = new BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    void example1() {
        assertThat(bt.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2)).isEqualTo(8);
    }

    @Test
    void example2() {
        assertThat(bt.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3)).isEqualTo(6);
    }

    @Test
    void one() {
        assertThat(bt.maxProfit(new int[]{4}, 0)).isEqualTo(0);
    }

}