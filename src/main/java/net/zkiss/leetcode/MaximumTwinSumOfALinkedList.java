package net.zkiss.leetcode;

import net.zkiss.leetcode.common.ListNode;

import java.util.LinkedList;

//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list
public class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        var slow = head;
        var fast = head.next;
        var stack = new LinkedList<Integer>();
        stack.push(slow.val);

        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            stack.push(slow.val);
        }

        var max = 0;
        while (slow.next != null) {
            var sum = stack.pop() + slow.next.val;
            max = Math.max(max, sum);
            slow = slow.next;
        }

        return max;
    }
}
