package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KthLargestElementInAnArrayTest {

    private final KthLargestElementInAnArray kle = new KthLargestElementInAnArray();

    @Test
    void example1() {
        assertThat(kle.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2)).isEqualTo(5);
    }

    @Test
    void example2() {
        assertThat(kle.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4)).isEqualTo(4);
    }
}