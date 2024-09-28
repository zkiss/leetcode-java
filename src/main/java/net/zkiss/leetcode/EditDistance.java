package net.zkiss.leetcode;

import java.util.stream.IntStream;

//https://leetcode.com/problems/edit-distance
public class EditDistance {
    public int minDistance(String word1, String word2) {
        var minDistances = new Integer[word1.length()][word2.length()];
        return md(word1, 0, word2, 0, minDistances);
    }

    private Integer md(String word1, int i1, String word2, int i2, Integer[][] minDistances) {
        if (word1.length() <= i1 && word2.length() <= i2) {
            return 0;
        }
        if (word1.length() <= i1) {
            // insert remaining into w1
            return word2.length() - i2;
        }
        if (word2.length() <= i2) {
            // delete remaining from w1
            return word1.length() - i1;
        }

        if (minDistances[i1][i2] != null) {
            return minDistances[i1][i2];
        }

        var c1 = word1.charAt(i1);
        var c2 = word2.charAt(i2);

        return minDistances[i1][i2] = min(
                // accept match if same or replace to match
                (c1 == c2 ? 0 : 1) + md(word1, i1 + 1, word2, i2 + 1, minDistances),
                // delete current
                1 + md(word1, i1 + 1, word2, i2, minDistances),
                // insert same
                1 + md(word1, i1, word2, i2 + 1, minDistances)
        );
    }

    private static int min(int... ints) {
        return IntStream.of(ints).min().orElseThrow();
    }
}
