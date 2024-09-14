package net.zkiss.leetcode;

import net.zkiss.leetcode.common.TreeNode;
import org.assertj.core.api.Condition;
import org.assertj.core.description.Description;
import org.assertj.core.description.TextDescription;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteNodeInABstTest {

    private final DeleteNodeInABst del = new DeleteNodeInABst();

    @Test
    void example1() {
        var root = TreeNode.of(5, 3, 6, 2, 4, null, 7);
        assertThat(del.deleteNode(root, 3)).is(searchTree());
    }

    @Test
    void example2() {
        var root = TreeNode.of(5, 3, 6, 2, 4, null, 7);
        assertThat(del.deleteNode(root, 0)).is(searchTree());
    }

    @Test
    void example3() {
        assertThat(del.deleteNode(TreeNode.of(), 0)).is(searchTree());
    }

    @Test
    void should_delete_root() {
        var root = TreeNode.of(5, 3, 6, 1, 4, null, 7);
        assertThat(del.deleteNode(root, 5)).is(searchTree());
    }

    @Test
    void should_delete_only_node() {
        assertThat(del.deleteNode(TreeNode.of(1), 1)).isEqualTo(TreeNode.of());
    }

    @Test
    void fail1() {
        assertThat(del.deleteNode(TreeNode.of(2, 1), 2)).isEqualTo(TreeNode.of(1));
    }

    private static Condition<? super TreeNode> searchTree() {
        return new Condition<>() {
            @Override
            public boolean matches(TreeNode value) {
                if (value == null) {
                    return true;
                }
                if (value.left != null && (value.left.val >= value.val || !matches(value.left))) {
                    return false;
                }
                if (value.right != null && (value.val >= value.right.val || !matches(value.right))) {
                    return false;
                }
                return true;
            }

            @Override
            public Description description() {
                return new TextDescription("a search tree");
            }
        };
    }
}