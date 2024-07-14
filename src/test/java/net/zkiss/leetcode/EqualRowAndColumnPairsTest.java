package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqualRowAndColumnPairsTest {

    private final EqualRowAndColumnPairs sol = new EqualRowAndColumnPairs();

    @Test
    void example1() {
        var res = sol.equalPairs(new int[][]{
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        });
        assertThat(res).isEqualTo(1);
    }

    @Test
    void example2() {
        assertThat(sol.equalPairs(new int[][]{
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        })).isEqualTo(3);
    }
}