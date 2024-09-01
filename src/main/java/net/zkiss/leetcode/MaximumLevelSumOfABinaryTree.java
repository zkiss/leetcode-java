package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

import java.util.ArrayList;

//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree
public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        var sums = new ArrayList<Integer>();
        bfs(root, 0, sums);
        return maxIdx(sums) + 1;
    }

    private void bfs(TreeNode root, int level, ArrayList<Integer> sums) {
        if (root == null) {
            return;
        }
        if (level == sums.size()) {
            sums.add(root.val);
        } else {
            sums.set(level, sums.get(level) + root.val);
        }
        bfs(root.left, level + 1, sums);
        bfs(root.right, level + 1, sums);
    }

    private int maxIdx(ArrayList<Integer> sums) {
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < sums.size(); i++) {
            if (sums.get(i) > max) {
                max = sums.get(i);
                idx = i;
            }
        }
        return idx;
    }
}
