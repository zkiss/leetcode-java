package net.zkiss.leetcode;

//https://leetcode.com/problems/increasing-triplet-subsequence
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        var first = Integer.MAX_VALUE;
        var second = Integer.MAX_VALUE;
        for (var n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
}
