package net.zkiss.leetcode;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii
public class CombinationSumIii {
    public List<List<Integer>> combinationSum3(int k, int n) {
        var results = new LinkedList<List<Integer>>();
        cs(n, k, 1, new LinkedList<>(), results);
        return results;
    }

    private void cs(int target, int numbers, int start, List<Integer> current, List<List<Integer>> results) {
        if (numbers == 1) {
            if (start <= target && target <= 9) {
                current.add(target);
                results.add(List.copyOf(current));
                current.removeLast();
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (target - i < i + 1) {
                continue;
            }
            current.add(i);
            cs(target - i, numbers - 1, i + 1, current, results);
            current.removeLast();
        }
    }

}
