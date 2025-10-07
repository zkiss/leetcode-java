package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

// https://leetcode.com/problems/count-good-nodes-in-binary-tree
public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return goodNodes(root, Integer.MIN_VALUE);
    }

    private int goodNodes(TreeNode root, int max) {
        if (root == null) return 0;
        var ans = 0;
        if (root.val >= max) {
            ans++;
        }
        max = Math.max(max, root.val);
        ans += goodNodes(root.left, max);
        ans += goodNodes(root.right, max);
        return ans;
    }
}
