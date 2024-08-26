package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;

//https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        var ret = new ListNode(head.val);
        while (head.next != null) {
            head = head.next;
            ret = new ListNode(head.val, ret);
        }

        return ret;
    }
}
