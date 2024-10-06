package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementTriePrefixTreeTest {

    private final ImplementTriePrefixTree.Trie t = new ImplementTriePrefixTree().new Trie();

    @Test
    void example1() {
        t.insert("apple");
        assertThat(t.search("apple")).isTrue();
        assertThat(t.search("app")).isFalse();
        assertThat(t.startsWith("app")).isTrue();
        t.insert("app");
        assertThat(t.search("app")).isTrue();
    }
}