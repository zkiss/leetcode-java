package net.zkiss.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/successful-pairs-of-spells-and-potions
public class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        return Arrays.stream(spells)
                .map(s -> {
                    var needs = divide(success, s);
                    var idx = binSearch(potions, needs);
                    return potions.length - idx;
                })
                .toArray();
    }

    private static long divide(long n, int parts) {
        var ans = n / parts;
        if (ans * parts < n) {
            return ans + 1;
        }
        return ans;
    }

    public static int binSearch(int[] arr, long val) {
        // java's built-in bin-search doesn't guarantee finding minimum index, when equal found...
        var lo = 0;
        var hi = arr.length;
        while (lo < hi) {
            var mid = lo + (hi - lo) / 2;
            if (val <= arr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
