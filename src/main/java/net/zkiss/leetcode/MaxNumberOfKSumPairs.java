package net.zkiss.leetcode;

import java.util.HashMap;

//https://leetcode.com/problems/max-number-of-k-sum-pairs
public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        var occurrence = new HashMap<Integer, Integer>();
        var ans = 0;
        for (var n : nums) {
            var needs = k - n;
            var has = occurrence.computeIfAbsent(needs, __ -> 0);
            if (has > 0) {
                occurrence.put(needs, has - 1);
                ans++;
            } else {
                occurrence.compute(n, (__, v) -> v == null ? 1 : v + 1);
            }
        }
        return ans;
    }
}
