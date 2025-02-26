package net.zkiss.leetcode;

//https://leetcode.com/problems/guess-number-higher-or-lower
public class GuessNumberHigherOrLower {
    private static int N;

    public static void pick(int n) {
        N = n;
    }

    static int guess(int n) {
        return Integer.compare(N, n);
    }

    public int guessNumber(int n) {
        var lo = 1;
        var hi = n;
        while (lo < hi) {
            var mid = lo + (hi - lo) / 2;
            var comp = guess(mid);
            if (comp == 0) {
                return mid;
            }
            if (comp < 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
