package net.zkiss.leetcode;

//https://leetcode.com/problems/koko-eating-bananas
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        var lo = (long) piles[0];
        var hi = (long) piles[0];
        for (int i = 1; i < piles.length; i++) {
            lo = Math.min(lo, piles[i]);
            hi = Math.max(hi, piles[i]);
        }
        lo = (lo * piles.length + h - 1) / h;

        while (lo < hi) {
            var mid = lo + (hi - lo) / 2;
            var t = 0L;
            for (var p : piles) {
                t += (p + mid - 1) / mid;
            }

            if (t <= h) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return (int) lo;
    }
}
