package net.zkiss.leetcode;

//https://leetcode.com/problems/is-subsequence
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        var i = 0;
        var j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
