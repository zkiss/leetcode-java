package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PathSumIIITest {

    private final PathSumIII ps3 = new PathSumIII();

    @Test
    void example1() {
        var root = TreeNode.of(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
        assertThat(ps3.pathSum(root, 8)).isEqualTo(3);
    }

    @Test
    void example2() {
        var root = TreeNode.of(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1);
        assertThat(ps3.pathSum(root, 22)).isEqualTo(3);
    }

    @Test
    void zero() {
        assertThat(ps3.pathSum(TreeNode.of(), 0)).isEqualTo(0);
    }

    @Test
    void one() {
        assertThat(ps3.pathSum(TreeNode.of(10), 10)).isEqualTo(1);
    }
}