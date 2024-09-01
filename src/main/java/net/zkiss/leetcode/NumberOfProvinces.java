package net.zkiss.leetcode;

//https://leetcode.com/problems/number-of-provinces
public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int[] groups = new int[isConnected.length];
        int group = 1;
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] == 0) {
                dfs(isConnected, i, group, groups);
                group++;
            }
        }
        return group - 1;
    }

    private void dfs(int[][] isConnected, int start, int group, int[] groups) {
        if (groups[start] != 0) {
            return;
        }
        groups[start] = group;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[start][i] != 0) {
                dfs(isConnected, i, group, groups);
            }
        }
    }
}
