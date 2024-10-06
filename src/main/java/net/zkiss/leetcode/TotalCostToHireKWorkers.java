package net.zkiss.leetcode;

import java.util.PriorityQueue;

//https://leetcode.com/problems/total-cost-to-hire-k-workers
public class TotalCostToHireKWorkers {

    public long totalCost(int[] costs, int k, int candidates) {
        var n = Math.max(0, Math.min(k, costs.length - 2 * candidates));
        var m = k - n;

        var leftIdx = candidates;
        var rightIdx = costs.length - candidates;
        var leftMins = leftIdx < rightIdx ?
                pq(costs, 0, leftIdx) :
                pq(costs, 0, costs.length);
        var rightMins = leftIdx < rightIdx ?
                pq(costs, rightIdx, costs.length) :
                null;

        var cost = 0L;

        while (n > 0) {
            var left = leftMins.peek();
            var right = rightMins.peek();
            cost += Math.min(left, right);
            if (left <= right) {
                leftMins.remove(left);
                leftMins.add(costs[leftIdx++]);
            } else {
                rightMins.remove(right);
                rightMins.add(costs[--rightIdx]);
            }
            n--;
        }

        if (rightMins != null)
            leftMins.addAll(rightMins);
        while (m > 0) {
            cost += leftMins.poll();
            m--;
        }

        return cost;
    }

    private PriorityQueue<Integer> pq(int[] costs, int from, int to) {
        var pq = new PriorityQueue<Integer>();
        for (int i = from; i < to; i++) {
            pq.add(costs[i]);
        }
        return pq;
    }
}
