package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

//https://leetcode.com/problems/count-good-nodes-in-binary-tree
public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return goodNodes(root, root.val);
    }

    private int goodNodes(TreeNode root, int min) {
        min = Math.max(min, root.val);
        var ret = 0;
        if (root.val >= min) {
            ret++;
        }
        if (root.left != null) {
            ret += goodNodes(root.left, min);
        }
        if (root.right != null) {
            ret += goodNodes(root.right, min);
        }
        return ret;
    }
}
