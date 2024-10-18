package net.zkiss.leetcode;

//https://leetcode.com/problems/maximum-average-subarray-i
public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        var sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        var max = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(sum, max);
        }

        return ((double) max) / k;
    }

}
