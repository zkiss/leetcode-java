package net.zkiss.leetcode;

//https://leetcode.com/problems/domino-and-tromino-tiling
public class DominoAndTrominoTiling {
    private static final int MOD = 1_000_000_000 + 7;

    public int numTilings(int n) {
        var tileCounts = new Integer[n][4];
        return count(0, true, true, tileCounts);
    }

    private int count(int i, boolean topFree, boolean bottomFree, Integer[][] tileCounts) {
        int state = state(topFree, bottomFree);
        if (tileCounts[i][state] != null) {
            return tileCounts[i][state];
        }
        if (i == tileCounts.length - 1) {
            return topFree ^ bottomFree ? 0 : 1;
        }

        var count = 0L;
        if (topFree && bottomFree) {
            count += count(i + 1, true, true, tileCounts);
            count += count(i + 1, false, true, tileCounts);
            count += count(i + 1, true, false, tileCounts);
            count += count(i + 1, false, false, tileCounts);
        }
        if (topFree && !bottomFree) {
            count += count(i + 1, false, true, tileCounts);
            count += count(i + 1, false, false, tileCounts);
        }
        if (!topFree && bottomFree) {
            count += count(i + 1, true, false, tileCounts);
            count += count(i + 1, false, false, tileCounts);
        }
        if (!topFree && !bottomFree) {
            count += count(i + 1, true, true, tileCounts);
        }
        tileCounts[i][state] = (int) (count % MOD);
        return tileCounts[i][state];
    }

    private int state(boolean topFree, boolean bottomFree) {
        var s = 0;
        s |= topFree ? 1 << 1 : 0;
        s |= bottomFree ? 1 : 0;
        return s;
    }
}
