package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumFlipsToMakeAOrBEqualToCTest {

    private final MinimumFlipsToMakeAOrBEqualToC mf = new MinimumFlipsToMakeAOrBEqualToC();

    @Test
    void example1() {
        // 010
        // 110
        // 101
        assertThat(mf.minFlips(2, 6, 5)).isEqualTo(3);
    }

    @Test
    void example2() {
        // 100
        // 010
        // 111
        assertThat(mf.minFlips(4, 2, 7)).isEqualTo(1);
    }

    @Test
    void example3() {
        assertThat(mf.minFlips(1, 2, 3)).isEqualTo(0);
    }
}