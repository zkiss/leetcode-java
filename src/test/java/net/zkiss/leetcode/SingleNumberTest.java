package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {

    private final SingleNumber sn = new SingleNumber();

    @Test
    void example1() {
        assertThat(sn.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
    }

    @Test
    void example2() {
        assertThat(sn.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
    }

    @Test
    void example3() {
        assertThat(sn.singleNumber(new int[]{1})).isEqualTo(1);
    }
}