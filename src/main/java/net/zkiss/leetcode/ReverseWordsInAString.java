package net.zkiss.leetcode;

import java.util.List;
import java.util.stream.Collectors;

//https://leetcode.com/problems/reverse-words-in-a-string
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        return List.of(s.trim().split("\\s+"))
                .reversed()
                .stream()
                .collect(Collectors.joining(" "));
    }
}
