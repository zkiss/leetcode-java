package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;

//https://leetcode.com/problems/odd-even-linked-list
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        var even = head.next;
        var o = head;
        var e = even;
        while (e != null && e.next != null) {
            var o2 = e.next;
            var e2 = o2.next;
            o.next = o2;
            o = o2;
            e.next = e2;
            e = e2;
        }
        o.next = even;
        if (e != null) {
            e.next = null;
        }
        return head;
    }
}
