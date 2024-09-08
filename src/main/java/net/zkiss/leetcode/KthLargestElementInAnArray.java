package net.zkiss.leetcode;

import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-an-array
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        var top = new PriorityQueue<Integer>(k);
        for (int i = 0; i < nums.length; i++) {
            var n = nums[i];
            if (top.size() < k) {
                top.add(n);
            } else {
                var smallest = top.peek();
                if (n > smallest) {
                    top.add(n);
                    top.remove();
                }
            }
        }
        return top.peek();
    }
}
