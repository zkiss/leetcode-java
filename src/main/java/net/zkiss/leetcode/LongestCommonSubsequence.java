package net.zkiss.leetcode;

//https://leetcode.com/problems/longest-common-subsequence
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        var results = new int[text1.length()][text2.length()];
        for (int i = text1.length() - 1; 0 <= i; i--) {
            var c1 = text1.charAt(i);
            for (int j = text2.length() - 1; 0 <= j; j--) {
                var c2 = text2.charAt(j);
                if (c1 == c2) {
                    var tail = i == text1.length() - 1 || j == text2.length() - 1 ? 0 : results[i + 1][j + 1];
                    results[i][j] = 1 + tail;
                } else {
                    var t1Tail = i == text1.length() - 1 ? 0 : results[i + 1][j];
                    var t2Tail = j == text2.length() - 1 ? 0 : results[i][j + 1];
                    results[i][j] = Math.max(t1Tail, t2Tail);
                }
            }
        }
        return results[0][0];
    }
}
