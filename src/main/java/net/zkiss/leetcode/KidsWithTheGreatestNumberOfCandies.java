package net.zkiss.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var max = IntStream.of(candies).max().orElseThrow();
        var res = new ArrayList<Boolean>(candies.length);

        for (int candy : candies) {
            res.add((candy + extraCandies) >= max);
        }

        return res;
    }
}
