package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UniqueNumberOfOccurrencesTest {

    private final UniqueNumberOfOccurrences un = new UniqueNumberOfOccurrences();

    @Test
    void example1() {
        assertTrue(un.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    @Test
    void example2() {
        assertFalse(un.uniqueOccurrences(new int[]{1, 2}));
    }

    @Test
    void example3() {
        assertTrue(un.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}