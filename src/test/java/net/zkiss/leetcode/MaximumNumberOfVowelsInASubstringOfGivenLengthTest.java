package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    private final MaximumNumberOfVowelsInASubstringOfGivenLength mnv = new MaximumNumberOfVowelsInASubstringOfGivenLength();

    @Test
    void example1() {
        assertThat(mnv.maxVowels("abciiidef", 3)).isEqualTo(3);
    }

    @Test
    void example2() {
        assertThat(mnv.maxVowels("aeiou", 2)).isEqualTo(2);
    }

    @Test
    void example3() {
        assertThat(mnv.maxVowels("leetcode", 3)).isEqualTo(2);
    }
}