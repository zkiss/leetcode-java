package net.zkiss.leetcode;

import java.util.*;
import java.util.stream.Stream;

//https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero
public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public int minReorder(int n, int[][] connections) {
        var adj = Stream.generate(ArrayList::new)
                .limit(n)
                .toArray(ArrayList[]::new);
        for (int i = 0; i < connections.length; i++) {
            var edge = connections[i];
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(-edge[0]);
        }
        return dfs(0, new boolean[n], adj);
    }

    private int dfs(int dest, boolean[] visited, ArrayList<Integer>[] adj) {
        var ans = 0;
        visited[dest] = true;
        for (var neighbour : adj[dest]) {
            if (!visited[Math.abs(neighbour)]) {
                if (neighbour > 0) {
                    ans++;
                }
                ans += dfs(Math.abs(neighbour), visited, adj);
            }
        }

        return ans;
    }

}
