package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DetermineIfTwoStringsAreCloseTest {

    private final DetermineIfTwoStringsAreClose dt = new DetermineIfTwoStringsAreClose();

    @Test
    void example1() {
        assertThat(dt.closeStrings("abc", "bca")).isTrue();
    }

    @Test
    void example2() {
        assertThat(dt.closeStrings("a", "aa")).isFalse();
    }

    @Test
    void example3() {
        assertThat(dt.closeStrings("cabbba", "abbccc")).isTrue();
    }

    @Test
    void fail1() {
        assertThat(dt.closeStrings("uau", "ssx")).isFalse();
    }
}