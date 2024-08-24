package net.zkiss.leetcode;

//https://leetcode.com/problems/decode-string
public class DecodeString {
    public String decodeString(String s) {
        var sb = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                sb.append(c);
                i++;
                continue;
            }

            if (!Character.isDigit(c)) {
                throw new RuntimeException("digit expected");
            }

            var j = i + 1;
            while (Character.isDigit(s.charAt(j))) {
                j++;
            }
            var multiplier = Integer.parseInt(s.substring(i, j));

            if ('[' != s.charAt(j)) {
                throw new RuntimeException("'[' expected");
            }

            int balance = 1;
            var ss = j + 1;
            while (balance > 0) {
                switch (s.charAt(ss)) {
                    case '[': {
                        balance++;
                        break;
                    }
                    case ']': {
                        balance--;
                        break;
                    }
                }
                ss++;
            }

            var multiplied = decodeString(s.substring(j + 1, ss - 1));
            i = ss;
            sb.repeat(multiplied, multiplier);
        }

        return sb.toString();
    }
}
