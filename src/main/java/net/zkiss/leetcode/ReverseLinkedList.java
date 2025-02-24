package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;

//https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        var rev = (ListNode) null;
        while (head != null) {
            var tail = head.next;
            head.next = rev;
            rev = head;
            head = tail;
        }
        return rev;
    }
}
