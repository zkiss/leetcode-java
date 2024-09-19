package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence lcs = new LongestCommonSubsequence();

    @Test
    void example1() {
        assertThat(lcs.longestCommonSubsequence("abcde", "ace")).isEqualTo(3);
    }

    @Test
    void example2() {
        assertThat(lcs.longestCommonSubsequence("abc", "abc")).isEqualTo(3);
    }

    @Test
    void example3() {
        assertThat(lcs.longestCommonSubsequence("abc", "def")).isEqualTo(0);
    }

    @Test
    void one() {
        assertThat(lcs.longestCommonSubsequence("a", "a")).isEqualTo(1);
        assertThat(lcs.longestCommonSubsequence("a", "b")).isEqualTo(0);
    }

    @Test
    void multiple() {
        assertThat(lcs.longestCommonSubsequence("abcd", "dcba_abc_ab")).isEqualTo(3);
        assertThat(lcs.longestCommonSubsequence("abcd", "abcd_abc")).isEqualTo(4);
        assertThat(lcs.longestCommonSubsequence("abcd", "abc_abcd")).isEqualTo(4);
        assertThat(lcs.longestCommonSubsequence("abcd", "jiokk[a]po[b]ok[c]pokpok[abcd]pok")).isEqualTo(4);
    }

    @Test
    void example1_analysis() {
        assertThat(lcs.longestCommonSubsequence("a", "ace")).isEqualTo(1);
        assertThat(lcs.longestCommonSubsequence("ab", "ace")).isEqualTo(1);
        assertThat(lcs.longestCommonSubsequence("abc", "ace")).isEqualTo(2);
        assertThat(lcs.longestCommonSubsequence("abcd", "ace")).isEqualTo(2);
        assertThat(lcs.longestCommonSubsequence("abcde", "ace")).isEqualTo(3);
    }
}