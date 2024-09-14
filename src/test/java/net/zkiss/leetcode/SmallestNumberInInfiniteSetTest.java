package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmallestNumberInInfiniteSetTest {

    private final SmallestNumberInInfiniteSet.SmallestInfiniteSet s = new SmallestNumberInInfiniteSet.SmallestInfiniteSet();

    @Test
    void example1() {
        s.addBack(2);
        assertThat(s.popSmallest()).isEqualTo(1);
        assertThat(s.popSmallest()).isEqualTo(2);
        assertThat(s.popSmallest()).isEqualTo(3);
        s.addBack(1);
        assertThat(s.popSmallest()).isEqualTo(1);
        assertThat(s.popSmallest()).isEqualTo(4);
        assertThat(s.popSmallest()).isEqualTo(5);
    }

    @Test
    void joining() {
        assertThat(s.popSmallest()).isEqualTo(1);
        assertThat(s.popSmallest()).isEqualTo(2);
        assertThat(s.popSmallest()).isEqualTo(3);
        assertThat(s.popSmallest()).isEqualTo(4);
        assertThat(s.popSmallest()).isEqualTo(5);
        s.addBack(2);
        s.addBack(3);
        s.addBack(4);
        s.addBack(5);
        assertThat(s.popSmallest()).isEqualTo(2);
        assertThat(s.popSmallest()).isEqualTo(3);
        assertThat(s.popSmallest()).isEqualTo(4);
        assertThat(s.popSmallest()).isEqualTo(5);
        assertThat(s.popSmallest()).isEqualTo(6);
    }
}