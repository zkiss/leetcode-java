package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-right-side-view
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        var ret = new LinkedList<Integer>();
        dfs(root, 0, ret);
        return ret;
    }

    private void dfs(TreeNode node, int level, LinkedList<Integer> list) {
        if (node == null) {
            return;
        }
        if (level == list.size()) {
            list.add(node.val);
        }
        dfs(node.right, level + 1, list);
        dfs(node.left, level + 1, list);
    }
}
