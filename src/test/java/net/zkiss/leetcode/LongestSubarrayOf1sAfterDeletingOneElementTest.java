package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubarrayOf1sAfterDeletingOneElementTest {

    private final LongestSubarrayOf1sAfterDeletingOneElement ls = new LongestSubarrayOf1sAfterDeletingOneElement();

    @Test
    void example1() {
        assertThat(ls.longestSubarray(new int[]{1, 1, 0, 1})).isEqualTo(3);
    }

    @Test
    void example2() {
        assertThat(ls.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1})).isEqualTo(5);
    }

    @Test
    void example3() {
        assertThat(ls.longestSubarray(new int[]{1, 1, 1})).isEqualTo(2);
    }

    @Test
    void one() {
        assertThat(ls.longestSubarray(new int[]{0, 0, 1, 0})).isEqualTo(1);
    }

    @Test
    void zero() {
        assertThat(ls.longestSubarray(new int[]{0, 0, 0, 0, 0})).isEqualTo(0);
    }
}