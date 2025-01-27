package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {

    private final IsSubsequence is = new IsSubsequence();

    @Test
    void example0() {
        assertTrue(is.isSubsequence("ace", "abcde"));
        assertFalse(is.isSubsequence("aec", "abcde"));
    }

    @Test
    void example1() {
        assertTrue(is.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void example2() {
        assertFalse(is.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void sames() {
        assertTrue(is.isSubsequence("", ""));
        assertTrue(is.isSubsequence("abc", "abc"));
    }

    @Test
    void shorter() {
        assertFalse(is.isSubsequence("abcde", "abc"));
    }
}