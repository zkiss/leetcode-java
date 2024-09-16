package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LetterCombinationsOfAPhoneNumberTest {

    private final LetterCombinationsOfAPhoneNumber lc = new LetterCombinationsOfAPhoneNumber();

    @Test
    void example1() {
        assertThat(lc.letterCombinations("23"))
                .containsExactlyInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    }

    @Test
    void example2() {
        assertThat(lc.letterCombinations("")).isEmpty();
    }

    @Test
    void example3() {
        assertThat(lc.letterCombinations("2")).containsExactlyInAnyOrder("a", "b", "c");
    }

    @Test
    void numbers() {
        assertThat(lc.letterCombinations("2")).containsExactlyInAnyOrder("a", "b", "c");
        assertThat(lc.letterCombinations("3")).containsExactlyInAnyOrder("d", "e", "f");
        assertThat(lc.letterCombinations("4")).containsExactlyInAnyOrder("g", "h", "i");
        assertThat(lc.letterCombinations("5")).containsExactlyInAnyOrder("j", "k", "l");
        assertThat(lc.letterCombinations("6")).containsExactlyInAnyOrder("m", "n", "o");
        assertThat(lc.letterCombinations("7")).containsExactlyInAnyOrder("p", "q", "r", "s");
        assertThat(lc.letterCombinations("8")).containsExactlyInAnyOrder("t", "u", "v");
        assertThat(lc.letterCombinations("9")).containsExactlyInAnyOrder("w", "x", "y", "z");
    }
}