package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesTest {

    private final NumberOfProvinces np = new NumberOfProvinces();

    @Test
    void example1() {
        assertThat(np.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})).isEqualTo(2);
    }

    @Test
    void example2() {
        assertThat(np.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}})).isEqualTo(3);
    }

    @Test
    void single_road() {
        var conn = conn(4);
        connect(conn, 0, 1);
        connect(conn, 1, 2);
        connect(conn, 2, 3);
        assertThat(np.findCircleNum(conn)).isEqualTo(1);
    }

    @Test
    void single_road_zigzag() {
        var conn = conn(5);
        connect(conn, 0, 2);
        connect(conn, 2, 1);
        connect(conn, 1, 4);
        connect(conn, 4, 3);
        assertThat(np.findCircleNum(conn)).isEqualTo(1);
    }

    @Test
    void multiple_clusters() {
        var conn = conn(8);
        // 0,1,3
        connect(conn, 0, 1);
        connect(conn, 1, 3);
        connect(conn, 0, 3);
        // 2,4,5,6,7
        connect(conn, 2, 4);
        connect(conn, 4, 5);
        connect(conn, 4, 6);
        connect(conn, 6, 7);
        assertThat(np.findCircleNum(conn)).isEqualTo(2);
    }

    @Test
    void single() {
        var conn = conn(1);
        assertThat(np.findCircleNum(conn)).isEqualTo(1);
    }

    private static int[][] conn(int numCities) {
        var conn = new int[numCities][numCities];
        for (int i = 0; i < numCities; i++) {
            conn[i][i] = 1;
        }
        return conn;
    }

    private static void connect(int[][] conn, int a, int b) {
        conn[a][b] = 1;
        conn[b][a] = 1;
    }
}