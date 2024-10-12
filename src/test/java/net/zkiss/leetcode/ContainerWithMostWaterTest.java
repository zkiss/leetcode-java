package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater c = new ContainerWithMostWater();

    @Test
    void example1() {
        assertThat(c.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})).isEqualTo(49);
    }

    @Test
    void example2() {
        assertThat(c.maxArea(new int[]{1, 1})).isEqualTo(1);
    }
}