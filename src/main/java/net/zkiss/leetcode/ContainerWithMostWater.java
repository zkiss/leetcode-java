package net.zkiss.leetcode;

//https://leetcode.com/problems/container-with-most-water
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        var l = 0;
        var r = height.length - 1;
        var max = 0;
        while (l < r) {
            var hl = height[l];
            var hr = height[r];
            max = Math.max(max, Math.min(hl, hr) * (r - l));
            if (hl < hr) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
