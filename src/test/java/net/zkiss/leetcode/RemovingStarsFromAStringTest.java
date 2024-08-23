package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemovingStarsFromAStringTest {

    private final RemovingStarsFromAString rem = new RemovingStarsFromAString();

    @Test
    void example1() {
        assertThat(rem.removeStars("leet**cod*e")).isEqualTo("lecoe");
    }

    @Test
    void example2() {
        assertThat(rem.removeStars("erase*****")).isEqualTo("");
    }
}