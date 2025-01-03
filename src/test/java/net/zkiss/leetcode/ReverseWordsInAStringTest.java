package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsInAStringTest {

    private final ReverseWordsInAString rw = new ReverseWordsInAString();

    @Test
    void example1() {
        assertThat(rw.reverseWords("the sky is blue")).isEqualTo("blue is sky the");
    }
}