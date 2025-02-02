package net.zkiss.leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/determine-if-two-strings-are-close
public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        var c1 = counts(word1);
        var c2 = counts(word2);
        if (!c1.keySet().equals(c2.keySet())) {
            return false;
        }

        return valueCounts(c1).equals(valueCounts(c2));
    }

    private Map<Character, Integer> counts(String word) {
        var occurrences = new HashMap<Character, Integer>();
        for (var c : word.toCharArray()) {
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
        }
        return occurrences;
    }

    private Map<Integer, Integer> valueCounts(Map<Character, Integer> occurrences) {
        var occurrenceCounts = new HashMap<Integer, Integer>();
        for (var o : occurrences.values()) {
            occurrenceCounts.put(o, occurrenceCounts.getOrDefault(o, 0) + 1);
        }
        return occurrenceCounts;
    }
}
