package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AsteroidCollisionTest {

    private final AsteroidCollision ac = new AsteroidCollision();

    @Test
    void example1() {
        assertThat(ac.asteroidCollision(ints(5, 10, -5))).isEqualTo(ints(5, 10));
    }

    @Test
    void example2() {
        assertThat(ac.asteroidCollision(ints(8, -8))).isEqualTo(ints());
    }

    @Test
    void example3() {
        assertThat(ac.asteroidCollision(ints(10, 2, -5))).isEqualTo(ints(10));
    }

    @Test
    void only_positives() {
        assertThat(ac.asteroidCollision(ints(1, 2))).isEqualTo(ints(1, 2));
        assertThat(ac.asteroidCollision(ints(1, 2, 3))).isEqualTo(ints(1, 2, 3));
    }

    @Test
    void only_negatives() {
        assertThat(ac.asteroidCollision(ints(-1, -2))).isEqualTo(ints(-1, -2));
    }

    @Test
    void no_collision() {
        assertThat(ac.asteroidCollision(ints(-8, 8))).isEqualTo(ints(-8, 8));
    }

    @Test
    void total_elimination() {
        assertThat(ac.asteroidCollision(ints(10, -1, -2, -3, -6, -9, -10))).isEqualTo(ints());
        assertThat(ac.asteroidCollision(ints(10, 9, 8, 7, 6, 3, 1, -10))).isEqualTo(ints());
    }

    private static int[] ints(int... ints) {
        return ints;
    }
}