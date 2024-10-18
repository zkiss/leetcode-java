package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumNumberOfArrowsToBurstBalloonsTest {

    private final MinimumNumberOfArrowsToBurstBalloons mnb = new MinimumNumberOfArrowsToBurstBalloons();

    @Test
    void example1() {
        assertThat(mnb.findMinArrowShots(new int[][]{
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        })).isEqualTo(2);
    }

    @Test
    void example2() {
        assertThat(mnb.findMinArrowShots(new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        })).isEqualTo(4);
    }

    @Test
    void example3() {
        assertThat(mnb.findMinArrowShots(new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        })).isEqualTo(2);
    }

    @Test
    void one() {
        assertThat(mnb.findMinArrowShots(new int[][]{{1, 2}})).isEqualTo(1);
    }

    @Test
    void overlap() {
        assertThat(mnb.findMinArrowShots(new int[][]{
                {1, 10},
                {2, 9},
                {3, 8},
                {4, 6}
        })).isEqualTo(1);
        assertThat(mnb.findMinArrowShots(new int[][]{
                {1, 10},
                {1, 9},
                {1, 8},
                {1, 6}
        })).isEqualTo(1);
    }

    @Test
    void two_groups() {
        assertThat(mnb.findMinArrowShots(new int[][]{
                {1, 5},
                {1, 4},
                {1, 3},

                {6, 10},
                {7, 10},
                {8, 10}
        })).isEqualTo(2);
    }

    @Test
    void fail1() {
        assertThat(mnb.findMinArrowShots(new int[][]{
                {9, 12},
                {1, 10},
                {4, 11},
                {8, 12},
                {3, 9},
                {6, 9},
                {6, 7}
        })).isEqualTo(2);
        // same sorted
        assertThat(mnb.findMinArrowShots(new int[][]{
                {1, 10},
                {3, 9},
                {4, 11},
                {6, 7},
                {6, 9},
                {8, 12},
                {9, 12},
        })).isEqualTo(2);
    }
}