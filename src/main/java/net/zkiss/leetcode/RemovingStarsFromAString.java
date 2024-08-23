package net.zkiss.leetcode;

// https://leetcode.com/problems/removing-stars-from-a-string
public class RemovingStarsFromAString {
    public String removeStars(String s) {
        var sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
