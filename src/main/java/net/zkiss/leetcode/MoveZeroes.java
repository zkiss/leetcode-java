package net.zkiss.leetcode;

//https://leetcode.com/problems/move-zeroes
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        var nz = 0;
        for (var n : nums) {
            if (n != 0) {
                nums[nz++] = n;
            }
        }
        while (nz < nums.length) {
            nums[nz++] = 0;
        }
    }
}
