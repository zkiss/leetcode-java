package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeafSimilarTreesTest {

    private final LeafSimilarTrees lst = new LeafSimilarTrees();

    @Test
    void example1() {
        var root1 = TreeNode.of(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4);
        var root2 = TreeNode.of(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8);
        assertThat(lst.leafSimilar(root1, root2)).isTrue();
    }

    @Test
    void example2() {
        var root1 = TreeNode.of(1, 2, 3);
        var root2 = TreeNode.of(1, 3, 2);
        assertThat(lst.leafSimilar(root1, root2)).isFalse();
    }

    @Test
    void different() {
        var r1 = new TreeNode(1);
        var r2 = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(2));
        assertThat(lst.leafSimilar(r1, r2)).isFalse();
    }
}