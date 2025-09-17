package net.zkiss.leetcode;

import java.util.Set;

// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public int maxVowels(String s, int k) {
        var max = 0;
        for (int i = 0; i < k; i++) {
            if (VOWELS.contains(s.charAt(i))) max++;
        }
        var cnt = max;
        for (int i = k; i < s.length(); i++) {
            if (VOWELS.contains(s.charAt(i))) cnt++;
            if (VOWELS.contains(s.charAt(i - k))) cnt--;
            max = Math.max(max, cnt);
        }
        return max;
    }
}
