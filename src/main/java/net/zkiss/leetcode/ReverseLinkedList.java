package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;

//https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        var prev = (ListNode) null;
        var ret = (ListNode) null;
        while (head != null) {
            var next = head.next;

            ret = head;
            ret.next = prev;
            prev = head;

            head = next;
        }

        return ret;
    }
}
