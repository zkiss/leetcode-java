package net.zkiss.leetcode;

//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element
public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        var l = 0;
        var deleted = false;
        var max = 0;
        for (var r = 0; r < nums.length; r++) {
            if (nums[r] != 1) {
                if (!deleted) deleted = true;
                else {
                    while (nums[l] == 1) l++;
                    // take the 0 out of the current range:
                    l++;
                }
            }
            // actual length of [l...r]: r+1-l
            max = Math.max(max, r - l);
        }
        // but delete 1, so r+1-l - 1 = r-l
        return max;
    }
}
