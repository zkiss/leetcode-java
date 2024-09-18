package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HouseRobberTest {

    private final HouseRobber hr = new HouseRobber();

    @Test
    void example1() {
        assertThat(hr.rob(new int[]{1, 2, 3, 1})).isEqualTo(4);
    }

    @Test
    void example2() {
        assertThat(hr.rob(new int[]{2, 7, 9, 3, 1})).isEqualTo(12);
    }

    @Test
    void one() {
        assertThat(hr.rob(new int[]{4})).isEqualTo(4);
    }

    @Test
    void two() {
        assertThat(hr.rob(new int[]{4, 5})).isEqualTo(5);
        assertThat(hr.rob(new int[]{5, 4})).isEqualTo(5);
    }
}