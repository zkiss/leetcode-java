package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CountingBitsTest {

    //  0: 00000000
    //  1: 00000001
    //  2: 00000010
    //  3: 00000011
    //  4: 00000100
    //  5: 00000101
    //  6: 00000110
    //  7: 00000111
    //  8: 00001000
    //  9: 00001001
    // 10: 00001010
    // 11: 00001011
    // 12: 00001100
    // 13: 00001101
    // 14: 00001110
    // 15: 00001111
    // 16: 00010000

    private final CountingBits cb = new CountingBits();

    @Test
    void example1() {
        assertThat(cb.countBits(2)).containsExactly(0, 1, 1);
    }

    @Test
    void example2() {
        assertThat(cb.countBits(5)).containsExactly(0, 1, 1, 2, 1, 2);
    }

    @Test
    void zero() {
        assertThat(cb.countBits(0)).containsExactly(0);
    }
}