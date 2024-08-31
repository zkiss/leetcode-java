package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

//https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree
public class LongestZigzagPathInABinaryTree {
    public int longestZigZag(TreeNode root) {
        return dfs(root, 0, 0, 0);
    }

    private int dfs(TreeNode root, int left, int right, int max) {
        if (root == null) {
            return 0;
        }
        max = Math.max(max, Math.max(left, right));

        max = Math.max(max, dfs(root.left, right + 1, 0, max));
        max = Math.max(max, dfs(root.right, 0, left + 1, max));

        return max;
    }
}
