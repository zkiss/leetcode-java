package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumTwinSumOfALinkedListTest {

    private final MaximumTwinSumOfALinkedList mts = new MaximumTwinSumOfALinkedList();

    @Test
    void example1() {
        assertThat(mts.pairSum(ListNode.of(5, 4, 2, 1))).isEqualTo(6);
    }

    @Test
    void example2() {
        assertThat(mts.pairSum(ListNode.of(4, 2, 2, 3))).isEqualTo(7);
    }

    @Test
    void example3() {
        assertThat(mts.pairSum(ListNode.of(1, 100000))).isEqualTo(100001);
    }

}