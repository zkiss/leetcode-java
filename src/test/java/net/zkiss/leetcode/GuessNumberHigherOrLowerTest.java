package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GuessNumberHigherOrLowerTest {

    private final GuessNumberHigherOrLower gn = new GuessNumberHigherOrLower();

    @Test
    void example1() {
        GuessNumberHigherOrLower.pick(6);
        assertThat(gn.guessNumber(10)).isEqualTo(6);
    }

    @Test
    void example2() {
        GuessNumberHigherOrLower.pick(1);
        assertThat(gn.guessNumber(1)).isEqualTo(1);
    }

    @Test
    void example3() {
        GuessNumberHigherOrLower.pick(1);
        assertThat(gn.guessNumber(2)).isEqualTo(1);
    }

    @Test
    void upper() {
        GuessNumberHigherOrLower.pick(2);
        assertThat(gn.guessNumber(2)).isEqualTo(2);

        GuessNumberHigherOrLower.pick(3);
        assertThat(gn.guessNumber(3)).isEqualTo(3);

        GuessNumberHigherOrLower.pick(4);
        assertThat(gn.guessNumber(4)).isEqualTo(4);
    }

    @Test
    void lower() {
        GuessNumberHigherOrLower.pick(1);
        assertThat(gn.guessNumber(1)).isEqualTo(1);
        assertThat(gn.guessNumber(2)).isEqualTo(1);
        assertThat(gn.guessNumber(3)).isEqualTo(1);
        assertThat(gn.guessNumber(4)).isEqualTo(1);
    }
}