package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

import java.util.IdentityHashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree
public class LongestZigzagPathInABinaryTree {
    public int longestZigZag(TreeNode root) {
        var paths = new IdentityHashMap<TreeNode, int[]>();
        return dfs(root, paths, 0);
    }

    private int dfs(TreeNode root, Map<TreeNode, int[]> paths, int max) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            paths.put(root, new int[]{0, 0});
            return max;
        }
        max = Math.max(max, dfs(root.left, paths, max));
        max = Math.max(max, dfs(root.right, paths, max));

        var left = 0;
        var right = 0;
        if (root.left != null) {
            left = 1 + paths.get(root.left)[1];
        }
        if (root.right != null) {
            right = 1 + paths.get(root.right)[0];
        }
        paths.put(root, new int[]{left, right});

        return Math.max(max, Math.max(left, right));
    }
}
