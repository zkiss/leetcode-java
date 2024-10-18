package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxConsecutiveOnesIiiTest {

    private final MaxConsecutiveOnesIii m = new MaxConsecutiveOnesIii();

    @Test
    void example1() {
        assertThat(m.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2)).isEqualTo(6);
    }

    @Test
    void example2() {
        assertThat(m.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3)).isEqualTo(10);
    }
}