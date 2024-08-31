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
        for (int i = 0, left = 1, right = 2; i < nodes.length; i++) {
            if (nodes[i] == null) continue;
            if (left < nodes.length) nodes[i].left = nodes[left];
            if (right < nodes.length) nodes[i].right = nodes[right];
            left += 2;
            right += 2;
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
