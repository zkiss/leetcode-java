package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountGoodNodesInBinaryTreeTest {

    private final CountGoodNodesInBinaryTree cgn = new CountGoodNodesInBinaryTree();

    @Test
    void example1() {
        var root = TreeNode.of(3, 1, 4, 3, null, 1, 5);
        assertThat(cgn.goodNodes(root)).isEqualTo(4);
    }

    @Test
    void example2() {
        var root = TreeNode.of(3, 3, null, 4, 2);
        assertThat(cgn.goodNodes(root)).isEqualTo(3);
    }

    @Test
    void example3() {
        assertThat(cgn.goodNodes(TreeNode.of(1))).isEqualTo(1);
    }
}