package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static net.zkiss.leetcode.common.TreeNode.n;
import static org.assertj.core.api.Assertions.assertThat;

class CountGoodNodesInBinaryTreeTest {

    private final CountGoodNodesInBinaryTree cgn = new CountGoodNodesInBinaryTree();

    @Test
    void example1() {
        var root = n(3,
                n(1,
                        n(3),
                        null),
                n(4,
                        n(1),
                        n(5)));
        assertThat(cgn.goodNodes(root)).isEqualTo(4);
    }

    @Test
    void example2() {
        var root = n(3,
                n(3,
                        n(4),
                        n(2)),
                null);
        assertThat(cgn.goodNodes(root)).isEqualTo(3);
    }

    @Test
    void example3() {
        assertThat(cgn.goodNodes(n(1))).isEqualTo(1);
    }
}