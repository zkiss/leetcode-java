package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumLevelSumOfABinaryTreeTest {

    private final MaximumLevelSumOfABinaryTree mls = new MaximumLevelSumOfABinaryTree();

    @Test
    void example1() {
        assertThat(mls.maxLevelSum(TreeNode.of(1, 7, 0, 7, -8, null, null))).isEqualTo(2);
    }

    @Test
    void example2() {
        assertThat(mls.maxLevelSum(TreeNode.of(989, null, 10250, 98693, -89388, null, null, null, -32127)))
                .isEqualTo(2);
    }

    @Test
    void one() {
        assertThat(mls.maxLevelSum(TreeNode.of(10))).isEqualTo(1);
    }
}