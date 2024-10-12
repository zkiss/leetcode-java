package net.zkiss.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons
public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.<int[], Integer>comparing(b -> b[0])
                .thenComparing(b -> b[1]));

        var cnt = 0;
        var ends = new PriorityQueue<Integer>();
        for (var balloon : points) {
            if (ends.isEmpty()) {
                ends.add(balloon[1]);
                continue;
            }
            var end = ends.peek();
            if (balloon[0] > end) {
                cnt++;
                ends.clear();
            }
            ends.add(balloon[1]);
        }
        if (!ends.isEmpty()) {
            cnt++;
        }
        return cnt;
    }
}
