package net.zkiss.leetcode;

//https://leetcode.com/problems/decode-string
public class DecodeString {
    public String decodeString(String s) {
        var sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            var c = s.charAt(i);

            if (Character.isAlphabetic(c)) {
                sb.append(c);
                i++;
                continue;
            }

            var start = i;
            while (Character.isDigit(s.charAt(i))) {
                i++;
            }
            var multiplier = Integer.parseInt(s.substring(start, i));

            var balance = 1;
            start = ++i;
            while (balance > 0) {
                var cc = s.charAt(i++);
                if (cc == '[') balance++;
                if (cc == ']') balance--;
            }

            sb.repeat(decodeString(s.substring(start, i - 1)), multiplier);
        }
        return sb.toString();
    }
}
