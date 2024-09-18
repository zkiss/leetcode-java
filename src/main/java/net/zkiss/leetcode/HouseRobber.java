package net.zkiss.leetcode;

//https://leetcode.com/problems/house-robber
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length >= 3) {
            nums[2] += nums[0];
        }
        for (int i = 3; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 2], nums[i - 3]);
        }
        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
}
