package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {
    private final ReverseLinkedList rll = new ReverseLinkedList();

    @Test
    void example1() {
        assertThat(rll.reverseList(ListNode.of(1, 2, 3, 4, 5)))
                .isEqualTo(ListNode.of(5, 4, 3, 2, 1));
    }

    @Test
    void example2() {
        assertThat(rll.reverseList(ListNode.of(1, 2)))
                .isEqualTo(ListNode.of(2, 1));
    }

    @Test
    void example3() {
        assertThat(rll.reverseList(ListNode.of()))
                .isEqualTo(ListNode.of());
    }

    @Test
    void one() {
        assertThat(rll.reverseList(ListNode.of(1)))
                .isEqualTo(ListNode.of(1));
    }
}