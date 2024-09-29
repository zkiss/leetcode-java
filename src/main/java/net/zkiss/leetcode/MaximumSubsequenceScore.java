package net.zkiss.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

//https://leetcode.com/problems/maximum-subsequence-score
public class MaximumSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        var decreasingByN2 = IntStream.range(0, nums1.length)
                .mapToObj(Integer::valueOf)
                .sorted(Comparator.<Integer>comparingInt(idx -> nums2[idx]).reversed())
                .toList();

        var topkNum1s = new PriorityQueue<Integer>();
        var sumTopK = 0L;
        var ans = 0L;

        for (var i : decreasingByN2) {
            var n1 = nums1[i];
            var n2 = nums2[i];

            topkNum1s.add(n1);
            sumTopK += n1;
            if (topkNum1s.size() > k) {
                sumTopK -= topkNum1s.remove();
            }
            if (topkNum1s.size() == k) {
                ans = Math.max(ans, sumTopK * n2);
            }
        }
        return ans;
    }
}
