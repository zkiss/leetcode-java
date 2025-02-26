package net.zkiss.leetcode;

//https://leetcode.com/problems/find-the-highest-altitude
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        var a = 0;
        var max = a;
        for (var g : gain) {
            a += g;
            max = Math.max(max, a);
        }
        return max;
    }
}
