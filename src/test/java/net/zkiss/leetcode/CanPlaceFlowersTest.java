package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static net.zkiss.leetcode.common.Lang.ints;
import static org.assertj.core.api.Assertions.assertThat;

class CanPlaceFlowersTest {

    private final CanPlaceFlowers cpf = new CanPlaceFlowers();

    @Test
    void example1() {
        assertThat(cpf.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)).isTrue();
    }

    @Test
    void example2() {
        assertThat(cpf.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)).isFalse();
    }

    @Test
    void one() {
        assertThat(cpf.canPlaceFlowers(new int[]{0}, 1)).isTrue();
        assertThat(cpf.canPlaceFlowers(new int[]{1}, 1)).isFalse();
    }

    @Test
    void two() {
        assertThat(cpf.canPlaceFlowers(new int[]{0, 0}, 1)).isTrue();
        assertThat(cpf.canPlaceFlowers(new int[]{0, 0}, 2)).isFalse();
        assertThat(cpf.canPlaceFlowers(new int[]{1, 0}, 1)).isFalse();
        assertThat(cpf.canPlaceFlowers(new int[]{0, 1}, 1)).isFalse();
    }

    @Test
    void longer() {
        assertThat(cpf.canPlaceFlowers(ints(0, 0, 0, 0, 0, 0), 3)).isTrue();
        assertThat(cpf.canPlaceFlowers(ints(0, 0, 0, 0, 0, 0), 4)).isFalse();
    }
}