package net.zkiss.leetcode.common;

import java.util.Arrays;
import java.util.Optional;

public class TreeNode {

    public static TreeNode n(int val) {
        return new TreeNode(val);
    }

    public static TreeNode n(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }

    public static TreeNode of(Integer... vals) {
        if (vals.length == 0) {
            return null;
        }
        var nodes = Arrays.stream(vals)
                .map(i -> Optional.ofNullable(i)
                        .map(TreeNode::new)
                        .orElse(null))
                .toArray(TreeNode[]::new);
        for (var i = 0; i < nodes.length; i++) {
            if (nodes[i] == null) continue;
            var l = i * 2 + 1;
            if (l < nodes.length) {
                nodes[i].left = nodes[l];
            }
            var r = i * 2 + 2;
            if (r < nodes.length) {
                nodes[i].right = nodes[r];
            }
        }
        return nodes[0];
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

    @Override
    public String toString() {
        return "Node(" + val +
                (left != null ? ", left=" + left : "") +
                (right != null ? ", right=" + right : "") +
                ')';
    }
}
