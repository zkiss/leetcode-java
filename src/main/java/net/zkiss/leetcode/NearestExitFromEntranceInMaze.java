package net.zkiss.leetcode;

import java.util.LinkedList;

//https://leetcode.com/problems/nearest-exit-from-entrance-in-maze
public class NearestExitFromEntranceInMaze {

    private static final char VISITED = '*';

    public int nearestExit(char[][] maze, int[] entrance) {
        var q = new LinkedList<int[]>();
        q.add(new int[]{entrance[0], entrance[1], 0});
        while (!q.isEmpty()) {
            var p = q.removeFirst();
            var i = p[0];
            var j = p[1];
            var steps = p[2];
            if (!canGo(maze, i, j)) continue;
            maze[i][j] = VISITED;
            if (steps != 0 && isExit(maze, i, j)) {
                return steps;
            }
            q.add(new int[]{i - 1, j, steps + 1});
            q.add(new int[]{i + 1, j, steps + 1});
            q.add(new int[]{i, j - 1, steps + 1});
            q.add(new int[]{i, j + 1, steps + 1});
        }
        return -1;
    }

    private boolean isExit(char[][] maze, int i, int j) {
        return i == 0 || j == 0 || i == maze.length - 1 || j == maze[0].length - 1;
    }

    private boolean canGo(char[][] maze, int i, int j) {
        if (i < 0 || maze.length <= i || j < 0 || maze[0].length <= j) return false;
        return maze[i][j] == '.';
    }
}
