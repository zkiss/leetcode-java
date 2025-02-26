package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindPivotIndexTest {

    private final FindPivotIndex fp = new FindPivotIndex();

    @Test
    void example1() {
        assertThat(fp.pivotIndex(new int[]{1, 7, 3, 6, 5, 6})).isEqualTo(3);
    }

    @Test
    void example2() {
        assertThat(fp.pivotIndex(new int[]{1, 2, 3})).isEqualTo(-1);
    }

    @Test
    void example3() {
        assertThat(fp.pivotIndex(new int[]{2, 1, -1})).isEqualTo(0);
    }
}