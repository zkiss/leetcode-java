package net.zkiss.leetcode;

//https://leetcode.com/problems/merge-strings-alternately
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        var i = 0;
        var j = 0;
        var sb = new StringBuilder(word1.length() + word2.length());
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++))
                    .append(word2.charAt(j++));
        }
        if (i < word1.length()) {
            sb.append(word1.substring(i));
        } else {
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }
}
