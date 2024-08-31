package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree
public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);

        LinkedList<TreeNode> currentPath = new LinkedList<>();
        List<TreeNode> found = null;

        while (!queue.isEmpty()) {
            var c = queue.pop();
            currentPath.add(c);
            if (c == p || c == q) {
                if (found == null) {
                    found = List.copyOf(currentPath);
                } else {
                    return lca(found, currentPath);
                }
            }
            if (c.left != null) queue.push(c.left);
            if (c.right != null) queue.push(c.right);
            if (c.left == null && c.right == null && !queue.isEmpty()) {
                var next = queue.peek();
                while (!currentPath.isEmpty()) {
                    var pl = currentPath.removeLast();
                    if (pl.left == next || pl.right == next) {
                        currentPath.add(pl);
                        break;
                    }
                }
            }
        }
        throw new IllegalArgumentException("LCA not found");
    }

    private TreeNode lca(List<TreeNode> path1, List<TreeNode> path2) {
        if (path1.getFirst() != path2.getFirst()) {
            throw new IllegalArgumentException("Root not shared");
        }

        TreeNode last = path1.getFirst();
        var i1 = path1.iterator();
        var i2 = path2.iterator();
        while (i1.hasNext() && i2.hasNext()) {
            var p1 = i1.next();
            var p2 = i2.next();
            if (p1 != p2) {
                return last;
            }
            last = p1;
        }

        return last;
    }

}
