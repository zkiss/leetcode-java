package net.zkiss.leetcode;

//https://leetcode.com/problems/koko-eating-bananas
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        var lo = piles[0];
        var hi = piles[0];
        for (int i = 1; i < piles.length; i++) {
            lo = Math.min(lo, piles[i]);
            hi = Math.max(hi, piles[i]);
        }
        lo = (lo * piles.length + h - 1) / h;

        while (lo < hi) {
            var mid = lo + (hi - lo) / 2;
            var finished = canEat(piles, mid, h);
            if (finished) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private boolean canEat(int[] piles, int n, int h) {
        int t = 0;
        for (var p : piles) {
            t += (p + n - 1) / n;
            if (t > h) {
                return false;
            }
        }
        return true;
    }
}
