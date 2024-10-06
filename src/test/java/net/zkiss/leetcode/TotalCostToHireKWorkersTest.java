package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class TotalCostToHireKWorkersTest {

    private final TotalCostToHireKWorkers tc = new TotalCostToHireKWorkers();

    @Test
    void example1() {
        assertThat(tc.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4)).isEqualTo(11);
    }

    @Test
    void example2() {
        assertThat(tc.totalCost(new int[]{1, 2, 4, 1}, 3, 3)).isEqualTo(4);
    }

    @Test
    void fail1() {
        assertThat(tc.totalCost(
                new int[]{28, 35, 21, 13, 21, 72, 35, 52, 74, 92, 25, 65, 77, 1, 73, 32, 43, 68, 8, 100, 84, 80, 14, 88, 42, 53, 98, 69, 64, 40, 60, 23, 99, 83, 5, 21, 76, 34},
                32,
                12
        )).isEqualTo(1407);
    }

    @Test
    void all() {
        assertThat(tc.totalCost(new int[]{1, 2, 3, 4, 5}, 5, 2)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

    @Test
    void fail2() {
        assertThat(tc.totalCost(
                IntStream.generate(() -> 100_000)
                        .limit(100_000)
                        .toArray(),
                100_000,
                1000
        )).isEqualTo(10000000000L);
    }
}