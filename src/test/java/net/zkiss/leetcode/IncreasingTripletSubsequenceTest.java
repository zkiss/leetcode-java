package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IncreasingTripletSubsequenceTest {

    private final IncreasingTripletSubsequence i = new IncreasingTripletSubsequence();

    @Test
    void example1() {
        assertThat(i.increasingTriplet(new int[]{1, 2, 3, 4, 5})).isTrue();
    }

    @Test
    void example2() {
        assertThat(i.increasingTriplet(new int[]{5, 4, 3, 2, 1})).isFalse();
    }

    @Test
    void example3() {
        assertThat(i.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6})).isTrue();
    }

    @Test
    void minimal() {
        assertThat(i.increasingTriplet(new int[]{1})).isFalse();
        assertThat(i.increasingTriplet(new int[]{1, 2})).isFalse();
        assertThat(i.increasingTriplet(new int[]{1, 2, 3})).isTrue();
        assertThat(i.increasingTriplet(new int[]{2, 2, 3})).isFalse();
        assertThat(i.increasingTriplet(new int[]{2, 3, 3})).isFalse();
        assertThat(i.increasingTriplet(new int[]{1, 4, 3})).isFalse();
        assertThat(i.increasingTriplet(new int[]{3, 2, 1})).isFalse();
        assertThat(i.increasingTriplet(new int[]{1, 2, -100, 3})).isTrue();
    }
}