package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();

    @Test
    void example1() {
        assertThat(p.productExceptSelf(new int[]{1, 2, 3, 4})).containsExactly(24, 12, 8, 6);
    }

    @Test
    void example2() {
        assertThat(p.productExceptSelf(new int[]{-1, 1, 0, -3, 3})).containsExactly(0, 0, 9, 0, 0);
    }
}