package net.zkiss.leetcode;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/find-the-difference-of-two-arrays
public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var n1 = IntStream.of(nums1).boxed().collect(Collectors.toSet());
        var n2 = IntStream.of(nums2).boxed().collect(Collectors.toSet());
        return List.of(
                n1.stream().filter(Predicate.not(n2::contains)).toList(),
                n2.stream().filter(Predicate.not(n1::contains)).toList()
        );
    }
}
