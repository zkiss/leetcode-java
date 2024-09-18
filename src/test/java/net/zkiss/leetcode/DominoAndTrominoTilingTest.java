package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DominoAndTrominoTilingTest {

    private final DominoAndTrominoTiling da = new DominoAndTrominoTiling();

    @Test
    void one_example2() {
        // |
        assertThat(da.numTilings(1)).isEqualTo(1);
    }

    @Test
    void two() {
        // ||
        // ==
        assertThat(da.numTilings(2)).isEqualTo(2);
    }

    @Test
    void three_example1() {
        // |||
        // //
        // \\
        // ==|
        // |==
        assertThat(da.numTilings(3)).isEqualTo(5);
    }

    @Test
    void four() {
        // ||||
        // ====
        // ==||
        // |==|
        // ||==
        // /__\
        // \--/
        // //|
        // \\|
        // |\\
        // |//
        assertThat(da.numTilings(4)).isEqualTo(11);
    }

    @Test
    void five() {
        assertThat(da.numTilings(5)).isEqualTo(24);
    }
}