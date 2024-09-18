package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    private final MinCostClimbingStairs mc = new MinCostClimbingStairs();

    @Test
    void example1() {
        assertThat(mc.minCostClimbingStairs(new int[]{10, 15, 20})).isEqualTo(15);
    }

    @Test
    void example2() {
        assertThat(mc.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})).isEqualTo(6);
    }

    @Test
    void min() {
        assertThat(mc.minCostClimbingStairs(new int[]{1, 2})).isEqualTo(1);
    }

    @Test
    void zeroes() {
        assertThat(mc.minCostClimbingStairs(new int[]{0, 0, 0, 0})).isEqualTo(0);
    }
}