package net.zkiss.leetcode;

//https://leetcode.com/problems/unique-paths
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        var paths = new int[m][n];
        return paths(0, 0, paths);
    }

    private int paths(int m, int n, int[][] paths) {
        if (paths.length <= m || paths[m].length <= n) {
            return 0;
        }
        if (m == paths.length - 1 && n == paths[m].length - 1) {
            return 1;
        }

        if (paths[m][n] != 0) {
            return paths[m][n];
        }
        paths[m][n] = paths(m + 1, n, paths) + paths(m, n + 1, paths);
        return paths[m][n];
    }
}
