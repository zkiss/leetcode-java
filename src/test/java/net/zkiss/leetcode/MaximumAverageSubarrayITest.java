package net.zkiss.leetcode;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

class MaximumAverageSubarrayITest {

    private static final Offset<Double> ERROR = offset(1d / 100_000);

    private final MaximumAverageSubarrayI m = new MaximumAverageSubarrayI();

    @Test
    void example1() {
        assertThat(m.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4)).isCloseTo(12.75, ERROR);
    }

    @Test
    void example2() {
        assertThat(m.findMaxAverage(new int[]{5}, 1)).isCloseTo(5, ERROR);
    }
}