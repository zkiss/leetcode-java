package net.zkiss.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/successful-pairs-of-spells-and-potions
public class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        var maxp = Arrays.stream(potions).max().orElseThrow();
        var minSNeeded = (success + maxp - 1) / maxp;

        var largerPs = new int[maxp + 1];
        // 1. occurences
        for (int p : potions) {
            largerPs[p]++;
        }
        // 2. calc how many larger or eq
        for (int p = largerPs.length - 2; 0 < p; p--) {
            largerPs[p] += largerPs[p + 1];
        }

        // calc results
        for (int i = 0; i < spells.length; i++) {
            if (spells[i] < minSNeeded) {
                spells[i] = 0;
                continue;
            }
            var pNeeded = (success + spells[i] - 1) / spells[i];
            spells[i] = largerPs[(int) pNeeded];
        }
        return spells;
    }
}
