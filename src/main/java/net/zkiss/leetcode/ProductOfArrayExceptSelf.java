package net.zkiss.leetcode;

//https://leetcode.com/problems/product-of-array-except-self
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        var dec = new int[nums.length];
        dec[nums.length - 1] = nums[nums.length - 1];
        for (var i = nums.length - 2; i > 0; i--) {
            dec[i] = nums[i] * dec[i + 1];
        }
        for (var i = 1; i < nums.length; i++) {
            nums[i] *= nums[i - 1];
        }

        var ans = new int[nums.length];
        ans[0] = dec[1];
        ans[ans.length - 1] = nums[nums.length - 2];
        for (var i = 1; i < ans.length - 1; i++) {
            ans[i] = nums[i - 1] * dec[i + 1];
        }
        return ans;
    }
}
