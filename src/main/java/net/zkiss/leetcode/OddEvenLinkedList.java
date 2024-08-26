package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;

//https://leetcode.com/problems/odd-even-linked-list
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        var ho = head;
        var he = head.next;
        var o = ho;
        var e = o.next;

        while (e != null) {
            var oo = e.next;
            var ee = oo != null ? oo.next : null;
            o.next = oo;
            e.next = ee;
            e = ee;
            if (oo != null)
                o = oo;
        }

        o.next = he;
        return ho;
    }
}
