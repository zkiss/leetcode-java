package net.zkiss.leetcode;

//https://leetcode.com/problems/max-consecutive-ones-iii/
public class MaxConsecutiveOnesIii {
    public int longestOnes(int[] nums, int k) {
        var l = 0;
        var max = 0;
        var flipped = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                if (flipped < k) {
                    flipped++;
                } else {
                    while (nums[l] == 1) {
                        l++;
                    }
                    l++;
                }
            }
            max = Math.max(max, i + 1 - l);
        }
        return max;
    }
}
