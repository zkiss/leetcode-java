package net.zkiss.leetcode;

//https://leetcode.com/problems/longest-common-subsequence
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        var results = new int[text1.length()][text2.length()];
        for (var i = 0; i < text1.length(); i++) {
            var c1 = text1.charAt(i);
            for (var j = 0; j < text2.length(); j++) {
                var c2 = text2.charAt(j);
                if (c1 == c2) {
                    var prefix = i == 0 || j == 0 ? 0 : results[i - 1][j - 1];
                    results[i][j] = 1 + prefix;
                } else {
                    var t1Prefix = i == 0 ? 0 : results[i - 1][j];
                    var t2Prefix = j == 0 ? 0 : results[i][j - 1];
                    results[i][j] = Math.max(t1Prefix, t2Prefix);
                }
            }
        }
        return results[text1.length() - 1][text2.length() - 1];
    }
}
