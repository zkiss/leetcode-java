package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KokoEatingBananasTest {
    private final KokoEatingBananas ke = new KokoEatingBananas();

    @Test
    void example1() {
        assertThat(ke.minEatingSpeed(new int[]{3, 6, 7, 11}, 8)).isEqualTo(4);
    }

    @Test
    void example2() {
        assertThat(ke.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5)).isEqualTo(30);
    }

    @Test
    void example3() {
        assertThat(ke.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6)).isEqualTo(23);
    }

    @Test
    void one_pile() {
        assertThat(ke.minEatingSpeed(new int[]{100}, 10)).isEqualTo(10);
    }

    @Test
    void almost() {
        assertThat(ke.minEatingSpeed(new int[]{1_000_000_000}, 1_000_000_000 - 1)).isEqualTo(2);
    }

    @Test
    void fail1() {
        assertThat(ke.minEatingSpeed(new int[]{1000000000, 1000000000}, 3)).isEqualTo(1000000000);
    }
}