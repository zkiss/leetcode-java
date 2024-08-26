package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OddEvenLinkedListTest {

    private final OddEvenLinkedList oell = new OddEvenLinkedList();

    @Test
    void example1() {
        assertThat(oell.oddEvenList(ListNode.of(1, 2, 3, 4, 5)))
                .isEqualTo(ListNode.of(1, 3, 5, 2, 4));
    }

    @Test
    void example2() {
        assertThat(oell.oddEvenList(ListNode.of(2, 1, 3, 5, 6, 4, 7)))
                .isEqualTo(ListNode.of(2, 3, 6, 7, 1, 5, 4));
    }

    @Test
    void zero_length() {
        assertThat(oell.oddEvenList(null)).isEqualTo(null);
    }

    @Test
    void one() {
        assertThat(oell.oddEvenList(ListNode.of(1))).isEqualTo(ListNode.of(1));
    }

    @Test
    void two() {
        assertThat(oell.oddEvenList(ListNode.of(1, 2))).isEqualTo(ListNode.of(1, 2));
    }

    @Test
    void three() {
        assertThat(oell.oddEvenList(ListNode.of(1, 2, 3))).isEqualTo(ListNode.of(1, 3, 2));
    }

    @Test
    void four() {
        assertThat(oell.oddEvenList(ListNode.of(1, 2, 3, 4))).isEqualTo(ListNode.of(1, 3, 2, 4));
    }
}