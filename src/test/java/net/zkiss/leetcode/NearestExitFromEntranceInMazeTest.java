package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NearestExitFromEntranceInMazeTest {

    private final NearestExitFromEntranceInMaze ne = new NearestExitFromEntranceInMaze();

    @Test
    void example1() {
        var maze = new char[][]{
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}
        };
        assertThat(ne.nearestExit(maze, new int[]{1, 2})).isEqualTo(1);
    }

    @Test
    void example2() {
        var maze = new char[][]{
                {'+', '+', '+'},
                {'.', '.', '.'},
                {'+', '+', '+'}
        };
        assertThat(ne.nearestExit(maze, new int[]{1, 0})).isEqualTo(2);
    }

    @Test
    void exanple3() {
        assertThat(ne.nearestExit(
                new char[][]{{'.', '+'}},
                new int[]{0, 0}
        )).isEqualTo(-1);
    }

    @Test
    void fail1() {
        var maze = new char[][]{
                {'+', '.', '+', '+', '+', '+', '+'},
                {'+', '.', '+', '.', '.', '.', '+'},
                {'+', '.', '+', '.', '+', '.', '+'},
                {'+', '.', '.', '.', '.', '.', '+'},
                {'+', '+', '+', '+', '.', '+', '.'}
        };
        assertThat(ne.nearestExit(maze, new int[]{0, 1})).isEqualTo(7);
    }
}