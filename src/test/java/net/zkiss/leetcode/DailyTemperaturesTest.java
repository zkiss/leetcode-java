package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DailyTemperaturesTest {

    private final DailyTemperatures dt = new DailyTemperatures();

    @Test
    void example1() {
        assertThat(dt.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}))
                .isEqualTo(new int[]{1, 1, 4, 2, 1, 1, 0, 0});
    }

    @Test
    void example2() {
        assertThat(dt.dailyTemperatures(new int[]{30, 40, 50, 60})).isEqualTo(new int[]{1, 1, 1, 0});
    }

    @Test
    void example3() {
        assertThat(dt.dailyTemperatures(new int[]{30, 60, 90})).isEqualTo(new int[]{1, 1, 0});
    }
}