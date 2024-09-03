package net.zkiss.leetcode;

import java.util.*;

//https://leetcode.com/problems/evaluate-division
public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        var adj = new HashMap<String, Map<String, Double>>();
        for (int i = 0; i < equations.size(); i++) {
            var a = equations.get(i).get(0);
            var b = equations.get(i).get(1);
            var aConversion = adj.computeIfAbsent(a, __ -> new HashMap<>());
            aConversion.put(b, values[i]);
            var bConversion = adj.computeIfAbsent(b, __ -> new HashMap<>());
            bConversion.put(a, 1 / values[i]);
        }

        return queries.stream()
                .mapToDouble(q -> {
                    if (!adj.containsKey(q.get(1))) return -1;
                    return calcQuery(q.get(0), q.get(1), adj, new HashSet<>());
                })
                .toArray();
    }

    private double calcQuery(String c, String d, Map<String, Map<String, Double>> adj, Set<String> visited) {
        if (!adj.containsKey(c)) {
            return -1;
        }

        visited.add(c);

        var val = adj.get(c).get(d);
        if (val != null) {
            return val;
        }

        for (var e : adj.get(c).entrySet()) {
            if (e.getKey().equals(d)) {
                return e.getValue();
            }
            if (visited.contains(e.getKey())) continue;
            var v = calcQuery(e.getKey(), d, adj, visited);

            if (v == -1) continue;
            return v * e.getValue();
        }
        return -1;
    }
}
