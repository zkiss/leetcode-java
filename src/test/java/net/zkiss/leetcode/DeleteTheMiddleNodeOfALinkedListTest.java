package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteTheMiddleNodeOfALinkedListTest {

    private final DeleteTheMiddleNodeOfALinkedList del = new DeleteTheMiddleNodeOfALinkedList();

    @Test
    void example1() {
        assertThat(del.deleteMiddle(ListNode.of(1, 3, 4, 7, 1, 2, 6)))
                .isEqualTo(ListNode.of(1, 3, 4, 1, 2, 6));
    }

    @Test
    void example2() {
        assertThat(del.deleteMiddle(ListNode.of(1, 2, 3, 4)))
                .isEqualTo(ListNode.of(1, 2, 4));
    }

    @Test
    void example3() {
        assertThat(del.deleteMiddle(ListNode.of(2, 1)))
                .isEqualTo(ListNode.of(2));
    }

    @Test
    void one() {
        assertThat(del.deleteMiddle(ListNode.of(1)))
                .isNull();
    }

    @Test
    void three() {
        assertThat(del.deleteMiddle(ListNode.of(1, 2, 3)))
                .isEqualTo(ListNode.of(1, 3));
    }
}