package net.zkiss.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.function.Function;

//https://leetcode.com/problems/rotting-oranges
public class RottingOranges {

    record Front(Position p, int minute) {
    }

    record Position(int i, int j) {
        Position up() {
            return new Position(i - 1, j);
        }

        Position down() {
            return new Position(i + 1, j);
        }

        Position left() {
            return new Position(i, j - 1);
        }

        Position right() {
            return new Position(i, j + 1);
        }
    }

    private static final int FRESH = 1;
    private static final int ROTTEN = 2;

    public int orangesRotting(int[][] grid) {
        var q = new LinkedList<Front>();
        var fresh = new HashSet<Position>(100, 1.0f);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ROTTEN) {
                    q.add(new Front(new Position(i, j), 0));
                } else if (grid[i][j] == FRESH) {
                    fresh.add(new Position(i, j));
                }
            }
        }

        var ans = 0;
        while (!q.isEmpty()) {
            var f = q.removeFirst();

            if (grid[f.p.i][f.p.j] == ROTTEN && f.minute != 0) {
                continue;
            }

            grid[f.p.i][f.p.j] = ROTTEN;
            fresh.remove(f.p);
            ans = Math.max(ans, f.minute);
            spread(grid, f, Position::left, q);
            spread(grid, f, Position::right, q);
            spread(grid, f, Position::up, q);
            spread(grid, f, Position::down, q);
        }

        return fresh.isEmpty() ? ans : -1;
    }

    private void spread(int[][] grid, Front front, Function<Position, Position> next, LinkedList<Front> q) {
        var np = next.apply(front.p);
        if (canGo(grid, np)) {
            q.add(new Front(np, front.minute + 1));
        }
    }

    private boolean canGo(int[][] grid, Position p) {
        if (p.i < 0 || grid.length <= p.i || p.j < 0 || grid[p.i].length <= p.j) {
            return false;
        }
        if (grid[p.i][p.j] == FRESH) {
            return true;
        }
        return false;
    }

}
