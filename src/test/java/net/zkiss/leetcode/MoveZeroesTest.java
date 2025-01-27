package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZeroesTest {

    private final MoveZeroes mz = new MoveZeroes();

    @Test
    void example1() {
        var numbers = new int[]{0, 1, 0, 3, 12};
        mz.moveZeroes(numbers);
        assertThat(numbers).containsExactly(1, 3, 12, 0, 0);
    }

    @Test
    void example2() {
        var numbers = new int[]{0};
        mz.moveZeroes(numbers);
        assertThat(numbers).containsExactly(0);
    }
}