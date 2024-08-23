package net.zkiss.leetcode;

import java.util.LinkedList;

//https://leetcode.com/problems/asteroid-collision
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        var result = new LinkedList<Integer>();
        for (final int a : asteroids) {
            var size = Math.abs(a);
            if (a < 0) {
                while (!result.isEmpty() && result.peekLast() > 0 && result.peekLast() < size) {
                    result.removeLast();
                }
                if (!result.isEmpty()) {
                    if (result.peekLast() > size) {
                        continue;
                    }
                    if (result.peekLast() == size) {
                        result.removeLast();
                        continue;
                    }
                }
                result.addLast(a);
            } else {
                result.addLast(a);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
