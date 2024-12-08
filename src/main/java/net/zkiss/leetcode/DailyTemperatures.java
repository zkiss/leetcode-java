package net.zkiss.leetcode;

import java.util.LinkedList;

//https://leetcode.com/problems/daily-temperatures/
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        var stack = new LinkedList<Integer>();
        var ans = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return ans;
    }
}
