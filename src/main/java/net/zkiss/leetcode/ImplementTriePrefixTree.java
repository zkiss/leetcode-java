package net.zkiss.leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/implement-trie-prefix-tree
public class ImplementTriePrefixTree {
    class Trie {

        private final Raw raw;

        public Trie() {
            this.raw = new Raw();
        }

        public void insert(String word) {
            raw.insert(0, word.toCharArray());
        }

        public boolean search(String word) {
            return raw.search(0, word.toCharArray(), false);
        }

        public boolean startsWith(String prefix) {
            return raw.search(0, prefix.toCharArray(), true);
        }

        private static class Raw {
            private final Map<Character, Raw> t = new HashMap<>();
            private boolean word = false;

            private void insert(int from, char[] word) {
                if (from == word.length) {
                    this.word = true;
                    return;
                }
                var raw = t.computeIfAbsent(word[from], __ -> new Raw());
                raw.insert(from + 1, word);
            }

            public boolean search(int from, char[] word, boolean prefix) {
                if (from == word.length) {
                    return prefix || this.word;
                }
                if (!t.containsKey(word[from])) {
                    return false;
                }
                return t.get(word[from]).search(from + 1, word, prefix);
            }
        }
    }
}
