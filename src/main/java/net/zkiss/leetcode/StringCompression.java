package net.zkiss.leetcode;

//https://leetcode.com/problems/string-compression
public class StringCompression {
    public int compress(char[] chars) {
        char c = chars[0];
        var cnt = 1;
        var w = 1;
        for (int r = 1; r < chars.length; r++) {
            if (chars[r] == c) {
                cnt++;
                continue;
            }
            c = chars[r];
            if (cnt > 1) {
                for (char n : Integer.toString(cnt).toCharArray()) {
                    chars[w++] = n;
                }
                cnt = 1;
            }
            chars[w++] = c;
        }
        if (cnt > 1) {
            for (char n : Integer.toString(cnt).toCharArray()) {
                chars[w++] = n;
            }
        }
        return w;
    }
}
