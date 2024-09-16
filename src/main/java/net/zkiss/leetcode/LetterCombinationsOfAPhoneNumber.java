package net.zkiss.leetcode;

import java.util.List;
import java.util.stream.Stream;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number
public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        return combos(digits).toList();
    }

    private Stream<String> combos(String digits) {
        if (digits.isEmpty()) {
            return Stream.empty();
        }
        return letters(digits.charAt(0)).chars()
                .mapToObj(c -> (char) c)
                .flatMap(c -> digits.length() == 1 ?
                        Stream.of(c + "") :
                        combos(digits.substring(1))
                                .map(sub -> c + sub));
    }

    private String letters(char n) {
        return switch (n) {
            case '2' -> "abc";
            case '3' -> "def";
            case '4' -> "ghi";
            case '5' -> "jkl";
            case '6' -> "mno";
            case '7' -> "pqrs";
            case '8' -> "tuv";
            case '9' -> "wxyz";
            default -> throw new IllegalArgumentException("" + n);
        };
    }
}
