package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CombinationSumIiiTest {

    private final CombinationSumIii cs = new CombinationSumIii();

    @Test
    void example1() {
        assertThat(cs.combinationSum3(3, 7)).satisfiesExactly(
                l -> assertThat(l).containsExactlyInAnyOrder(1, 2, 4)
        );
    }

    @Test
    void example2() {
        assertThat(cs.combinationSum3(3, 9)).satisfiesExactly(
                l -> assertThat(l).containsExactlyInAnyOrder(1, 2, 6),
                l -> assertThat(l).containsExactlyInAnyOrder(1, 3, 5),
                l -> assertThat(l).containsExactlyInAnyOrder(2, 3, 4)
        );
    }

    @Test
    void example3() {
        assertThat(cs.combinationSum3(4, 1)).isEmpty();
    }

    @Test
    void two() {
        assertThat(cs.combinationSum3(2, 10)).satisfiesExactly(
                l -> assertThat(l).containsExactlyInAnyOrder(1, 9),
                l -> assertThat(l).containsExactlyInAnyOrder(2, 8),
                l -> assertThat(l).containsExactlyInAnyOrder(3, 7),
                l -> assertThat(l).containsExactlyInAnyOrder(4, 6)
        );
    }

    @Test
    void fail1() {
        assertThat(cs.combinationSum3(2, 18)).isEmpty();
    }
}