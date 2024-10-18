package net.zkiss.leetcode;

//https://leetcode.com/problems/greatest-common-divisor-of-strings
public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        var a = str1 + str2;
        var b = str2 + str1;
        if (!a.equals(b)) {
            return "";
        }

        var gcdLen = gcd(str1.length(), str2.length());
        return a.substring(0, gcdLen);
    }

    private int gcd(int a, int b) {
        if (b > a) {
            return gcd(b, a);
        }
        var ab = a % b;
        if (ab == 0) {
            return b;
        }
        return gcd(b, ab);
    }
}
