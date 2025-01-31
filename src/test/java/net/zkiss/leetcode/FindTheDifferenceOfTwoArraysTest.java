package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheDifferenceOfTwoArraysTest {

    private final FindTheDifferenceOfTwoArrays fd = new FindTheDifferenceOfTwoArrays();

    @Test
    void example1() {
        var result = fd.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});
        assertThat(result.get(0)).containsExactlyInAnyOrder(1, 3);
        assertThat(result.get(1)).containsExactlyInAnyOrder(4, 6);
    }

    @Test
    void example2() {
        var result = fd.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});
        assertThat(result.get(0)).containsExactlyInAnyOrder(3);
        assertThat(result.get(1)).isEmpty();
    }
}