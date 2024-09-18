package net.zkiss.leetcode;

//https://leetcode.com/problems/min-cost-climbing-stairs
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        var res = new Integer[cost.length];
        res[cost.length - 1] = cost[cost.length - 1];
        res[cost.length - 2] = cost[cost.length - 2];
        return Math.min(
                dp(0, cost, res),
                dp(1, cost, res));
    }

    private int dp(int i, int[] cost, Integer[] res) {
        if (res[i] != null) {
            return res[i];
        }
        res[i] = cost[i] + Math.min(
                dp(i + 1, cost, res),
                dp(i + 2, cost, res));
        return res[i];
    }
}
