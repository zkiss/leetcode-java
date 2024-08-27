package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeafSimilarTreesTest {

    private final LeafSimilarTrees lst = new LeafSimilarTrees();

    @Test
    void example1() {
        var root1 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(9),
                        new TreeNode(8)));
        var root2 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(7)),
                new TreeNode(1,
                        new TreeNode(4),
                        new TreeNode(2,
                                new TreeNode(9),
                                new TreeNode(8))));
        assertThat(lst.leafSimilar(root1, root2)).isTrue();
    }

    @Test
    void example2() {
        var root1 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        var root2 = new TreeNode(1,
                new TreeNode(3),
                new TreeNode(2));
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