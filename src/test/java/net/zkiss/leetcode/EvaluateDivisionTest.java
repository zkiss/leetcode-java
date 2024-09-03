package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EvaluateDivisionTest {

    public static final double PRECISION = 0.00001;
    private final EvaluateDivision ed = new EvaluateDivision();

    @Test
    void example1() {
        assertThat(ed.calcEquation(
                List.of(List.of("a", "b"), List.of("b", "c")),
                new double[]{2, 3},
                List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"), List.of("x", "x"))
        )).usingComparatorWithPrecision(PRECISION)
                .containsExactly(6, 0.5, -1, 1, -1);
    }

    @Test
    void example2() {
        assertThat(ed.calcEquation(
                List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd")),
                new double[]{1.5, 2.5, 5},
                List.of(List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"), List.of("cd", "bc"))
        )).usingComparatorWithPrecision(PRECISION)
                .containsExactly(3.75, 0.4, 5, 0.2);
    }

    @Test
    void example3() {
        assertThat(ed.calcEquation(
                List.of(List.of("a", "b")),
                new double[]{0.5},
                List.of(List.of("a", "b"), List.of("b", "a"), List.of("a", "c"), List.of("x", "y"))
        )).usingComparatorWithPrecision(PRECISION)
                .containsExactly(0.5, 2, -1, -1);
    }

    @Test
    void mix_sets() {
        assertThat(ed.calcEquation(
                List.of(List.of("a", "b"), List.of("b", "c"), List.of("x", "y")),
                new double[]{1, 2, 5},
                List.of(List.of("a", "x"))
        )).usingComparatorWithPrecision(PRECISION)
                .containsExactly(-1);
    }
}