package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxNumberOfKSumPairsTest {

    private final MaxNumberOfKSumPairs m = new MaxNumberOfKSumPairs();

    @Test
    void example1() {
        assertThat(m.maxOperations(new int[]{1, 2, 3, 4}, 5)).isEqualTo(2);
    }

    @Test
    void example2() {
        assertThat(m.maxOperations(new int[]{3, 1, 3, 4, 3}, 6)).isEqualTo(1);
    }
}