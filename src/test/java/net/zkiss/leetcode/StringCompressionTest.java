package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCompressionTest {

    private final StringCompression sc = new StringCompression();

    @Test
    void example1() {
        var chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        var l = sc.compress(chars);
        assertThat(l).isEqualTo(6);
        assertThat(chars).startsWith('a', '2', 'b', '2', 'c', '3');
    }

    @Test
    void example2() {
        var chars = new char[]{'a'};
        var l = sc.compress(chars);
        assertThat(l).isEqualTo(1);
        assertThat(chars).containsExactly('a');
    }

    @Test
    void example3() {
        var chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        var l = sc.compress(chars);
        assertThat(l).isEqualTo(4);
        assertThat(chars).startsWith('a', 'b', '1', '2');
    }
}