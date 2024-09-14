package net.zkiss.leetcode;

import org.assertj.core.api.Condition;
import org.assertj.core.description.Description;
import org.assertj.core.description.TextDescription;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class FindPeakElementTest {

    private final FindPeakElement fp = new FindPeakElement();

    @Test
    void example1() {
        var nums = new int[]{1, 2, 3, 1};
        assertThat(fp.findPeakElement(nums))
                .is(peakIn(nums))
                .isEqualTo(2);
    }

    @Test
    void example2() {
        var nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        assertThat(fp.findPeakElement(nums)).is(peakIn(nums));
    }

    @Test
    void increasing() {
        var nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertThat(fp.findPeakElement(nums))
                .is(peakIn(nums))
                .isEqualTo(6);
    }

    @Test
    void decreasing() {
        var nums = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(fp.findPeakElement(nums))
                .is(peakIn(nums))
                .isEqualTo(0);
    }

    @Test
    void middle() {
        var nums = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        assertThat(fp.findPeakElement(nums))
                .is(peakIn(nums))
                .isEqualTo(4);
    }

    @Test
    void left() {
        var nums = new int[]{1, 2, 1, 0, -1, -2};
        assertThat(fp.findPeakElement(nums))
                .is(peakIn(nums))
                .isEqualTo(1);
    }

    @Test
    void right() {
        var nums = new int[]{1, 2, 3, 4, 5, 6, 5, 4};
        assertThat(fp.findPeakElement(nums))
                .is(peakIn(nums))
                .isEqualTo(5);
    }

    @Test
    void alternating() {
        var nums = new int[]{1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3};
        assertThat(fp.findPeakElement(nums)).is(peakIn(nums));
    }

    private static Condition<? super Integer> peakIn(int[] nums) {
        return new Condition<>() {
            @Override
            public Description description() {
                return new TextDescription("peak index in array: %s", Arrays.toString(nums));
            }

            @Override
            public boolean matches(Integer i) {
                return smallerAt(i - 1, nums[i]) &&
                        smallerAt(i + 1, nums[i]);
            }

            private boolean smallerAt(int i, int val) {
                if (i < 0 || nums.length <= i) {
                    return true;
                }
                return nums[i] < val;
            }
        };
    }
}