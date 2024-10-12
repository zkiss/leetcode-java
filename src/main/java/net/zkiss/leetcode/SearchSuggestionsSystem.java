package net.zkiss.leetcode;

import java.util.*;
import java.util.stream.Stream;

//https://leetcode.com/problems/search-suggestions-system
public class SearchSuggestionsSystem {
    private static class Node {
        private final TreeMap<Character, Node> t = new TreeMap<>();
        private String word;

        private void insert(int from, String word) {
            if (from == word.length()) {
                this.word = word;
                return;
            }
            var raw = t.computeIfAbsent(word.charAt(from), __ -> new Node());
            raw.insert(from + 1, word);
        }

        private Stream<String> firstWords(int n) {
            if (n <= 0) {
                return Stream.empty();
            }
            int n2 = word != null ? n - 1 : n;
            return Stream.concat(
                    Stream.ofNullable(word),
                    t.entrySet().stream()
                            .flatMap(e -> e.getValue().firstWords(n2))
                            .limit(n2)
            );
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        var trie = new Node();
        for (String product : products) {
            trie.insert(0, product);
        }

        var ret = new LinkedList<List<String>>();

        for (int i = 0; i < searchWord.length(); i++) {
            trie = trie == null ? null : trie.t.get(searchWord.charAt(i));
            if (trie == null) {
                ret.add(List.of());
            } else {
                ret.add(trie.firstWords(3).toList());
            }
        }

        return ret;
    }
}
