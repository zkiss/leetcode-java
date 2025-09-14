package net.zkiss.leetcode;

//https://leetcode.com/problems/string-compression
public class StringCompression {
    public int compress(char[] chars) {
        int write = 0, currentStart = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read] != chars[read + 1]) {
                chars[write++] = chars[read];
                if (currentStart < read) {
                    for (char c : Integer.toString((read + 1) - currentStart).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                currentStart = read + 1;
            }
        }
        return write;
    }
}
