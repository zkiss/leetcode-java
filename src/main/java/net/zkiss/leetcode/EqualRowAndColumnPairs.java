package net.zkiss.leetcode;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

// https://leetcode.com/problems/equal-row-and-column-pairs
public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int ans = 0;

        Integer[] colHash = new Integer[grid.length];

        for (int row = 0; row < grid.length; row++) {
            cc:
            for (int col = 0; col < grid[row].length; col++) {

                var rowHash = Objects.hash(Arrays.stream(grid[row]).boxed().toArray());

                if (colHash[col] != null && rowHash != colHash[col]) {
                    continue;
                }

                if (colHash[col] == null) {
                    final int c = col;
                    colHash[col] = Objects.hash(IntStream.range(0, grid.length)
                            .mapToObj(r -> Integer.valueOf(grid[r][c]))
                            .toArray());
                }

                if (rowHash != colHash[col]) {
                    continue;
                }

                for (int i = 0; i < grid.length; i++) {
                    if (grid[row][i] != grid[i][col]) {
                        continue cc;
                    }
                }
                ans++;
            }
        }
        return ans;
    }
}
