package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RottingOrangesTest {

    private final RottingOranges ro = new RottingOranges();

    @Test
    void example1() {
        assertThat(ro.orangesRotting(new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        })).isEqualTo(4);
    }

    @Test
    void example2() {
        assertThat(ro.orangesRotting(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        })).isEqualTo(-1);
    }

    @Test
    void example3() {
        assertThat(ro.orangesRotting(new int[][]{{0, 2}})).isEqualTo(0);
    }

    @Test
    void empty() {
        assertThat(ro.orangesRotting(new int[][]{{0}})).isEqualTo(0);
    }

    @Test
    void no_rotten() {
        assertThat(ro.orangesRotting(new int[][]{
                {1, 0, 0},
                {0, 1, 1}
        })).isEqualTo(-1);
    }
}