package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree md = new MaximumDepthOfBinaryTree();

    @Test
    void example1() {
        assertThat(md.maxDepth(TreeNode.of(3, 9, 20, null, null, 15, 7))).isEqualTo(3);
    }

    @Test
    void example2() {
        assertThat(md.maxDepth(TreeNode.of(1, null, 2))).isEqualTo(2);
    }

    @Test
    void zero() {
        assertThat(md.maxDepth(null)).isEqualTo(0);
    }

    @Test
    void one() {
        assertThat(md.maxDepth(new TreeNode(1))).isEqualTo(1);
    }
}