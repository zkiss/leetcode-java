package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static net.zkiss.leetcode.common.TreeNode.n;
import static org.assertj.core.api.Assertions.assertThat;

class LongestZigzagPathInABinaryTreeTest {

    private final LongestZigzagPathInABinaryTree lzp = new LongestZigzagPathInABinaryTree();

    @Test
    void example1() {
        var root = TreeNode.of(1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1);
        assertThat(lzp.longestZigZag(root)).isEqualTo(3);
    }

    @Test
    void example2() {
        var root = TreeNode.of(1, 1, 1, null, 1, null, null, 1, 1, null, 1);
        assertThat(lzp.longestZigZag(root)).isEqualTo(4);
    }

    @Test
    void example3() {
        assertThat(lzp.longestZigZag(TreeNode.of(1))).isEqualTo(0);
    }

    @Test
    void single_long_path() {
        assertThat(lzp.longestZigZag(zigZag(6, true))).isEqualTo(6);
        assertThat(lzp.longestZigZag(zigZag(6, false))).isEqualTo(6);
    }

    @Test
    void longer_path_deep() {
        var root = zigZag(5, true);
        end(root).right = zigZag(10, true);
        assertThat(lzp.longestZigZag(root)).isEqualTo(10);
    }

    @Test
    void longer_path_root() {
        var root = zigZag(10, true);
        end(root).right = zigZag(5, true);
        assertThat(lzp.longestZigZag(root)).isEqualTo(11);
    }

    private static TreeNode zigZag(int len, boolean right) {
        if (len == 0) {
            return n(1);
        }
        var child = zigZag(len - 1, !right);
        return n(1,
                (right ? null : child),
                (right ? child : null));
    }

    private static TreeNode end(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root;
        }
        if (root.left != null) {
            return end(root.left);
        }
        return end(root.right);
    }
}