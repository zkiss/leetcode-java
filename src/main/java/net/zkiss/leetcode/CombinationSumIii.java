package net.zkiss.leetcode;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii
public class CombinationSumIii {
    public List<List<Integer>> combinationSum3(int k, int n) {
        var ans = new LinkedList<List<Integer>>();
        cs3(k, n, 1, new LinkedList<>(), ans);
        return ans;
    }

    private void cs3(int k, int n, int start, LinkedList<Integer> current, LinkedList<List<Integer>> ans) {
        if (k == 1) {
            if (start <= n && n <= 9) {
                current.add(n);
                ans.add(List.copyOf(current));
                current.removeLast();
            }
            return;
        }

        for (var i = start; i <= 9; i++) {
            current.add(i);
            cs3(k - 1, n - i, i + 1, current, ans);
            current.removeLast();
        }
    }

}
