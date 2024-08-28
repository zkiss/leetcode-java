package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;

//https://leetcode.com/problems/path-sum-iii
public class PathSumIII {
    public int pathSum(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }

        var ret = 0;
        if (root.val == targetSum) {
            ret++;
        }
        ret += pathSumStart(root.left, targetSum - root.val);
        ret += pathSum(root.left, targetSum);
        ret += pathSumStart(root.right, targetSum - root.val);
        ret += pathSum(root.right, targetSum);
        return ret;
    }

    private int pathSumStart(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }

        var ret = 0;
        if (root.val == targetSum) {
            ret++;
        }
        ret += pathSumStart(root.left, targetSum - root.val);
        ret += pathSumStart(root.right, targetSum - root.val);
        return ret;
    }
}
