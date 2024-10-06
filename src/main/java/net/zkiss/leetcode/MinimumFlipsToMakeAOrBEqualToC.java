package net.zkiss.leetcode;

//https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c
public class MinimumFlipsToMakeAOrBEqualToC {
    public int minFlips(int a, int b, int c) {
        var or = a | b;
        var missed = or ^ c;
        var cnt = 0;
        // missing ones: just add a one to either
        cnt += countOnes(missed & c);
        // missing zero: only one has one
        cnt += countOnes(missed & (a ^ b));
        // missing zero: where both are ones
        var bothOnes = ~(a ^ b) & a;
        cnt += 2 * countOnes(missed & bothOnes);
        return cnt;
    }

    private int countOnes(int v) {
        var cnt = 0;
        while (v != 0) {
            v &= v - 1;
            cnt++;
        }
        return cnt;
    }
}
