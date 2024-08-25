package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;

//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list
public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        var slow = new ListNode(0, head);
        var fast = head;

        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }

        if (slow.next == head) {
            return null;
        }
        if (slow.next == null) {
            return head;
        }
        slow.next = slow.next.next;
        return head;
    }
}
