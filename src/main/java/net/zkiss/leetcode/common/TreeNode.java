package net.zkiss.leetcode.common;

public class TreeNode {

    public static TreeNode n(int val) {
        return new TreeNode(val);
    }

    public static TreeNode n(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
