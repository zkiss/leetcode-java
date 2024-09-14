package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static net.zkiss.leetcode.common.TreeNode.n;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeRightSideViewTest {

    private final BinaryTreeRightSideView btr = new BinaryTreeRightSideView();

    @Test
    void example1() {
        assertThat(btr.rightSideView(TreeNode.of(1, 2, 3, null, 5, null, 4))).containsExactly(1, 3, 4);
    }

    @Test
    void example2() {
        assertThat(btr.rightSideView(TreeNode.of(1, null, 3))).containsExactly(1, 3);
    }

    @Test
    void example3() {
        assertThat(btr.rightSideView(TreeNode.of())).containsExactly();
    }

    @Test
    void left_longer() {
        var root = n(1,
                n(2,
                        n(3),
                        n(4,
                                null,
                                n(5))),
                n(6));
        assertThat(btr.rightSideView(root)).containsExactly(1, 6, 4, 5);
    }
}