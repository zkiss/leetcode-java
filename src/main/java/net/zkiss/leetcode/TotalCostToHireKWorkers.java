package net.zkiss.leetcode;

import java.util.PriorityQueue;

//https://leetcode.com/problems/total-cost-to-hire-k-workers
public class TotalCostToHireKWorkers {

    public long totalCost(int[] costs, int k, int candidates) {
        var left = new PriorityQueue<Integer>();
        var right = new PriorityQueue<Integer>();
        int i = 0;
        int j = costs.length;
        while (left.size() < candidates && i < j) left.add(costs[i++]);
        while (right.size() < candidates && i < j) right.add(costs[--j]);
        var cost = 0L;

        while (k > 0) {
            var l = Integer.MAX_VALUE;
            var r = Integer.MAX_VALUE;
            if (!left.isEmpty()) {
                l = left.peek();
            }
            if (!right.isEmpty()) {
                r = right.peek();
            }
            cost += Math.min(l, r);
            if (l <= r) {
                left.remove(l);
                if (i < j) {
                    left.add(costs[i++]);
                }
            } else {
                right.remove(r);
                if (i < j) {
                    right.add(costs[--j]);
                }
            }
            k--;
        }
        return cost;
    }
}
