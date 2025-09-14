package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsInAStringTest {

    private final ReverseWordsInAString rw = new ReverseWordsInAString();

    @Test
    void example1() {
        assertThat(rw.reverseWords("the sky is blue")).isEqualTo("blue is sky the");
    }

    @Test
    void example2() {
        assertThat(rw.reverseWords("  hello world  ")).isEqualTo("world hello");
    }

    @Test
    void example3() {
        assertThat(rw.reverseWords("a good   example")).isEqualTo("example good a");
    }

    @Test
    void one_word() {
        assertThat(rw.reverseWords("word")).isEqualTo("word");
    }
}