package net.zkiss.leetcode;

import java.util.TreeSet;

//https://leetcode.com/problems/smallest-number-in-infinite-set
public class SmallestNumberInInfiniteSet {
    static class SmallestInfiniteSet {

        private int smallest;
        private final TreeSet<Integer> returned;

        public SmallestInfiniteSet() {
            smallest=1;
            this.returned = new TreeSet();
        }

        public int popSmallest() {
            if (returned.isEmpty()) {
                return smallest++;
            }
            return returned.removeFirst();
        }

        public void addBack(int num) {
            if (smallest <= num) {
                return;
            }
            returned.add(num);
            var min = returned.first();
            var max = returned.last();
            if (max + 1 == smallest && max - returned.size() + 1 == min) {
                returned.clear();
                smallest = min;
            }
        }
    }
}
