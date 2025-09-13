package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static net.zkiss.leetcode.common.Lang.ints;
import static org.assertj.core.api.Assertions.assertThat;

class KidsWithTheGreatestNumberOfCandiesTest {

    private final KidsWithTheGreatestNumberOfCandies kids = new KidsWithTheGreatestNumberOfCandies();

    @Test
    void example1() {
        var result = kids.kidsWithCandies(ints(2, 3, 5, 1, 3), 3);

        assertThat(result).containsExactly(true, true, true, false, true);
    }

    @Test
    void example2() {
        var result = kids.kidsWithCandies(ints(4, 2, 1, 1, 2), 1);

        assertThat(result).containsExactly(true, false, false, false, false);
    }

    @Test
    void example3() {
        var result = kids.kidsWithCandies(ints(12, 1, 12), 10);

        assertThat(result).containsExactly(true, false, true);
    }
}