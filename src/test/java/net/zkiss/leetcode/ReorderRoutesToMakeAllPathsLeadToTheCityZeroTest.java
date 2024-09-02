package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {

    private final ReorderRoutesToMakeAllPathsLeadToTheCityZero rrm = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();

    @Test
    void example1() {
        var c = new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        assertThat(rrm.minReorder(6, c)).isEqualTo(3);
    }

    @Test
    void example2() {
        var c = new int[][]{{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        assertThat(rrm.minReorder(5, c)).isEqualTo(2);
    }

    @Test
    void example3() {
        var c = new int[][]{{1, 0}, {2, 0}};
        assertThat(rrm.minReorder(3, c)).isEqualTo(0);
    }

    @Test
    void example1_different_order() {
        var c = new int[][]{{0, 1}, {2, 3}, {1, 3}, {4, 5}, {4, 0}};
        assertThat(rrm.minReorder(6, c)).isEqualTo(3);
    }

    @Test
    void minimal() {
        assertThat(rrm.minReorder(2, roads(road(1, 0)))).isEqualTo(0);
        assertThat(rrm.minReorder(2, roads(road(0, 1)))).isEqualTo(1);
    }

    private static int[][] roads(int[]... roads) {
        return roads;
    }

    private static int[] road(int from, int to) {
        return new int[]{from, to};
    }
}