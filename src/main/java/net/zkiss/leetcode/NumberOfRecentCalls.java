package net.zkiss.leetcode;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/number-of-recent-calls
public class NumberOfRecentCalls {
    public static class RecentCounter {

        private final List<Integer> calls;

        public RecentCounter() {
            this.calls = new LinkedList<>();
        }

        public int ping(int t) {
            calls.add(t);

            var limit = t-3000;
            while(calls.getFirst() < limit) {
                calls.removeFirst();
            }
            return calls.size();
        }
    }
}
