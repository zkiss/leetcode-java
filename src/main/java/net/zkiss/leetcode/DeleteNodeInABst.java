package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

//https://leetcode.com/problems/delete-node-in-a-bst
public class DeleteNodeInABst {

    private record Result(TreeNode found, TreeNode parent) {
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        var result = find(root, key);
        var found = result.found;
        var parent = result.parent;
        if (found == null) {
            return root;
        }

        if (parent == null) {
            if (found.right == null) {
                return found.left;
            }
            if (found.left == null) {
                return found.right;
            }
            insert(found.right, found.left);
            return found.right;
        }
        if (parent.left == found) parent.left = null;
        else parent.right = null;
        insert(parent, found.right);
        insert(parent, found.left);
        return root;
    }

    private void insert(TreeNode root, TreeNode node) {
        if (node == null) return;
        if (node.val < root.val) {
            if (root.left == null) root.left = node;
            else insert(root.left, node);
        } else {
            if (root.right == null) root.right = node;
            else insert(root.right, node);
        }
    }

    private Result find(TreeNode root, int key) {
        var parent = (TreeNode) null;
        while (root != null) {
            if (key == root.val) {
                return new Result(root, parent);
            }
            parent = root;
            if (key < root.val) root = root.left;
            else root = root.right;
        }
        return new Result(null, parent);
    }
}
