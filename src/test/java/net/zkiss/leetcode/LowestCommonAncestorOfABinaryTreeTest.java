package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LowestCommonAncestorOfABinaryTreeTest {

    private final LowestCommonAncestorOfABinaryTree lca = new LowestCommonAncestorOfABinaryTree();

    @Test
    void example1() {
        var root = TreeNode.of(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        var p = find(root, 5);
        var q = find(root, 1);

        assertThat(lca.lowestCommonAncestor(root, p, q)).isSameAs(root);
    }

    @Test
    void example2() {
        var root = TreeNode.of(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        var p = find(root, 5);
        var q = find(root, 4);
        assertThat(lca.lowestCommonAncestor(root, p, q)).isSameAs(find(root, 5));
    }

    @Test
    void example3() {
        var root = TreeNode.of(1, 2);
        assertThat(lca.lowestCommonAncestor(root, find(root, 1), find(root, 2))).isSameAs(root);
    }

    private static TreeNode find(TreeNode root, int v) {
        if (root.val == v) {
            return root;
        }
        TreeNode ans = null;
        if (root.left != null) {
            ans = find(root.left, v);
            if (ans != null) {
                return ans;
            }
        }
        if (root.right != null) {
            return find(root.right, v);
        }
        return null;
    }
}