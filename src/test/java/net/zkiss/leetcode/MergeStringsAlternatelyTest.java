package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately msa = new MergeStringsAlternately();

    @Test
    void example1() {
        assertThat(msa.mergeAlternately("abc", "pqr")).isEqualTo("apbqcr");
    }

    @Test
    void example2() {
        assertThat(msa.mergeAlternately("ab", "pqrs")).isEqualTo("apbqrs");
    }

    @Test
    void example3() {
        assertThat(msa.mergeAlternately("abcd", "pq")).isEqualTo("apbqcd");
    }

}