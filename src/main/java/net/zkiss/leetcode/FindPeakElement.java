package net.zkiss.leetcode;

//https://leetcode.com/problems/find-peak-element
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        var lo = 0;
        var hi = nums.length;
        while (lo < hi) {
            var mid = lo + (hi - lo) / 2;

            var leftSmaller = mid - 1 < 0 || nums[mid - 1] < nums[mid];
            if (!leftSmaller) {
                // bigger
                hi = mid;
                continue;
            }

            var rightSmaller = nums.length <= mid + 1 || nums[mid + 1] < nums[mid];
            if (!rightSmaller) {
                // bigger
                lo = mid;
                continue;
            }
            return mid;
        }
        return lo;
    }
}
