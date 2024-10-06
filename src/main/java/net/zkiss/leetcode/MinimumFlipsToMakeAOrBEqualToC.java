package net.zkiss.leetcode;

//https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c
public class MinimumFlipsToMakeAOrBEqualToC {
    public int minFlips(int a, int b, int c) {
        var or = a | b;
        var missed = or ^ c;
        // at least one where not same
        return Integer.bitCount(missed) +
                // need to change both where both are ones but should be 0
                Integer.bitCount(missed & (a & b));
    }
}
