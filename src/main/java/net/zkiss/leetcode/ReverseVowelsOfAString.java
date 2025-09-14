package net.zkiss.leetcode;

import java.util.Set;

// https://leetcode.com/problems/reverse-vowels-of-a-string
public class ReverseVowelsOfAString {
    private static final Set<Character> VOWELS = Set.of(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
    );

    public String reverseVowels(String s) {
        var array = s.toCharArray();
        var i = 0;
        var j = array.length - 1;
        while (i < j) {
            var iv = VOWELS.contains(array[i]);
            var jv = VOWELS.contains(array[j]);
            if (iv ^ jv) {
                if (iv) j--;
                else i++;
                continue;
            }

            if (iv) {
                var tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
            }
            i++;
            j--;
        }
        return new String(array);
    }
}
