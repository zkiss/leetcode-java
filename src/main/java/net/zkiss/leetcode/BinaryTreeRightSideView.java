package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-right-side-view
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        var l = rightSideView(root.left);
        var r = rightSideView(root.right);
        var ans = new LinkedList<Integer>();
        ans.add(root.val);
        ans.addAll(r);
        if (l.size() > r.size()) {
            ans.addAll(l.subList(r.size(), l.size()));
        }
        return ans;
    }
}
