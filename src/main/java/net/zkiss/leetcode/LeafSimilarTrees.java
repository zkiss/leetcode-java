package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/leaf-similar-trees
public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        var l1 = leafs(root1);
        var l2 = leafs(root2);

        return l1.equals(l2);
    }

    private List<Integer> leafs(TreeNode root) {
        var ret = new LinkedList<Integer>();
        var q = new LinkedList<TreeNode>();
        q.push(root);
        while (!q.isEmpty()) {
            var c = q.pop();
            if (c.right != null) {
                q.push(c.right);
            }
            if (c.left != null) {
                q.push(c.left);
            }
            if (c.right == null && c.left == null) {
                ret.add(c.val);
            }
        }
        return ret;
    }

}
