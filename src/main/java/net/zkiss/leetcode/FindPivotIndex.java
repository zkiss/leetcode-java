package net.zkiss.leetcode;

//https://leetcode.com/problems/find-pivot-index
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        var rsum = new int[nums.length];
        for(int i=nums.length-2;0<=i;i--) {
            rsum[i] = nums[i+1]+rsum[i+1];
        }
        if(rsum[0]==0) return 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] == rsum[i]) {
                return i;
            }
            nums[i] += nums[i-1];
        }
        return -1;
    }
}
