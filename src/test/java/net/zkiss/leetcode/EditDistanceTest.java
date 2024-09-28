package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EditDistanceTest {

    private final EditDistance ed = new EditDistance();

    @Test
    void example1() {
        assertThat(ed.minDistance("horse", "ros")).isEqualTo(3);
    }

    @Test
    void example2() {
        assertThat(ed.minDistance("intention", "execution")).isEqualTo(5);
    }

    @Test
    void same() {
        assertThat(ed.minDistance("ababcdefg", "abcdefg")).isEqualTo(2);
    }
}