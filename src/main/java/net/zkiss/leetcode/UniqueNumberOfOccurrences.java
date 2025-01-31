package net.zkiss.leetcode;

import java.util.HashMap;

//https://leetcode.com/problems/unique-number-of-occurrences
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        var cnts = new HashMap<Integer, Integer>();
        for (var n : arr) {
            cnts.compute(n, (k, v) -> v == null ? 1 : v + 1);
        }
        return cnts.values().stream().distinct().toList().size() == cnts.size();
    }
}
