package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SuccessfulPairsOfSpellsAndPotionsTest {

    private final SuccessfulPairsOfSpellsAndPotions sp = new SuccessfulPairsOfSpellsAndPotions();

    @Test
    void example1() {
        assertThat(sp.successfulPairs(
                new int[]{5, 1, 3},
                new int[]{1, 2, 3, 4, 5},
                7
        )).containsExactly(4, 0, 3);
    }

    @Test
    void example2() {
        assertThat(sp.successfulPairs(
                new int[]{3, 1, 2},
                new int[]{8, 5, 8},
                16
        )).containsExactly(2, 0, 2);
    }

    @Test
    void high_spell() {
        assertThat(sp.successfulPairs(
                new int[]{1, 100, 2},
                new int[]{1, 2, 3},
                50
        )).containsExactly(0, 3, 0);
    }

    @Test
    void high_potion() {
        assertThat(sp.successfulPairs(
                new int[]{1},
                new int[]{1, 100, 3},
                50
        )).containsExactly(1);
    }

    @Test
    void overflow() {
        assertThat(sp.successfulPairs(
                new int[]{10, 20, 100_000, 30},
                new int[]{10, 20, 100_000, 30},
                10_000_000_000L
        )).containsExactly(0, 0, 1, 0);
    }

    @Test
    void binary_search_edge_cases_lower() {
        // lower
        assertThat(sp.successfulPairs(
                new int[]{2},
                new int[]{5, 6, 7, 8},
                9
        )).containsExactly(4);
        assertThat(sp.successfulPairs(
                new int[]{2},
                new int[]{5, 6, 7, 8},
                10
        )).containsExactly(4);
        assertThat(sp.successfulPairs(
                new int[]{2},
                new int[]{5, 6, 7, 8},
                11
        )).containsExactly(3);
    }

    @Test
    void binary_search_edge_cases_mid() {
        assertThat(sp.successfulPairs(
                new int[]{2},
                new int[]{5, 6, 7, 8},
                12
        )).containsExactly(3);
        assertThat(sp.successfulPairs(
                new int[]{2},
                new int[]{5, 6, 7, 8},
                13
        )).containsExactly(2);
        assertThat(sp.successfulPairs(
                new int[]{2},
                new int[]{5, 6, 7, 8},
                14
        )).containsExactly(2);
    }

    @Test
    void binary_search_edge_cases_higher() {
        assertThat(sp.successfulPairs(
                new int[]{2},
                new int[]{5, 6, 7, 8},
                15
        )).containsExactly(1);
        assertThat(sp.successfulPairs(
                new int[]{2},
                new int[]{5, 6, 7, 8},
                16
        )).containsExactly(1);
        assertThat(sp.successfulPairs(
                new int[]{2},
                new int[]{5, 6, 7, 8},
                17
        )).containsExactly(0);
    }

    @Test
    void fail1() {
        assertThat(sp.successfulPairs(
                new int[]{15, 39, 38, 35, 33, 25, 31, 12, 40, 27, 29, 16, 22, 24, 7, 36, 29, 34, 24, 9, 11, 35, 21, 3, 33, 10, 9, 27, 35, 17, 14, 3, 35, 35, 39, 23, 35, 14, 31, 7},
                new int[]{25, 19, 30, 37, 14, 30, 38, 22, 38, 38, 26, 33, 34, 23, 40, 28, 15, 29, 36, 39, 39, 37, 32, 38, 8, 17, 39, 20, 4, 39, 39, 7, 30, 35, 29, 23},
                317
        )).containsExactly(28, 33, 33, 33, 33, 33, 33, 23, 34, 33, 33, 29, 32, 33, 0, 33, 33, 33, 33, 13, 22, 33, 31, 0, 33, 17, 13, 33, 33, 30, 27, 0, 33, 33, 33, 33, 33, 27, 33, 0);
    }

    @Test
    void fail1_simple() {
        assertThat(sp.successfulPairs(
                new int[]{14},
                new int[]{4, 7, 8, 14, 15, 17, 19, 20, 22, 23, 23, 25, 26, 28, 29, 29, 30, 30, 30, 32, 33, 34, 35, 36, 37, 37, 38, 38, 38, 38, 39, 39, 39, 39, 39, 40},
                317
        )).containsExactly(27);
    }

}