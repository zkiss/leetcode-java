package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreatestCommonDivisorOfStringsTest {

    private final GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();

    @Test
    void example1() {
        assertThat(gcd.gcdOfStrings("ABCABC", "ABC")).isEqualTo("ABC");
    }

    @Test
    void example2() {
        assertThat(gcd.gcdOfStrings("ABABAB", "ABAB")).isEqualTo("AB");
    }

    @Test
    void example3() {
        assertThat(gcd.gcdOfStrings("LEET", "CODE")).isEqualTo("");
    }
}