package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheHighestAltitudeTest {

    private final FindTheHighestAltitude fh = new FindTheHighestAltitude();

    @Test
    void example1() {
        assertThat(fh.largestAltitude(new int[]{-5, 1, 5, 0, -7})).isEqualTo(1);
    }

    @Test
    void example2() {
        assertThat(fh.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})).isEqualTo(0);
    }

    @Test
    void negative() {
        assertThat(fh.largestAltitude(new int[]{-4})).isEqualTo(0);
    }
}