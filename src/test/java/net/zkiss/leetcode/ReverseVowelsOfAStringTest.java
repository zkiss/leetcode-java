package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseVowelsOfAStringTest {

    private final ReverseVowelsOfAString rvs = new ReverseVowelsOfAString();

    @Test
    void example1() {
        assertThat(rvs.reverseVowels("IceCreAm")).isEqualTo("AceCreIm");
    }

    @Test
    void example2() {
        assertThat(rvs.reverseVowels("leetcode")).isEqualTo("leotcede");
    }

    @Test
    void no_vowels() {
        assertThat(rvs.reverseVowels("bcdfgh")).isEqualTo("bcdfgh");
    }

    @Test
    void single_vowel() {
        assertThat(rvs.reverseVowels("bbbab")).isEqualTo("bbbab");
    }
}