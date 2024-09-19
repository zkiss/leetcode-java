package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UniquePathsTest {

    private final UniquePaths up = new UniquePaths();

    @Test
    void example1() {
        assertThat(up.uniquePaths(3, 7)).isEqualTo(28);
    }

    @Test
    void example2() {
        assertThat(up.uniquePaths(3, 2)).isEqualTo(3);
    }

    @Test
    void one() {
        assertThat(up.uniquePaths(1,1)).isEqualTo(1);
    }

    @Test
    void two() {
        assertThat(up.uniquePaths(2,2)).isEqualTo(2);
    }
}