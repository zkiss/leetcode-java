package net.zkiss.leetcode;

//https://leetcode.com/problems/dota2-senate
public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        if (senate.length() == 1) {
            return result(senate.charAt(0));
        }

        var ss = senate.toCharArray();
        var k = 0;
        while (true) {
            int target = next(enemyOf(ss[k]), ss, k);
            if (target == -1) {
                return result(ss[k]);
            }
            ss[target] = 'X';
            k = next(ss, k);
        }
    }

    private int next(final char search, char[] senate, final int start) {
        var i = start;
        while (senate[i] != search) {
            i++;
            if (i >= senate.length) {
                i = 0;
            }
            if (i == start) {
                return -1;
            }
        }
        return i;
    }

    private char enemyOf(char s) {
        return switch (s) {
            case 'D' -> 'R';
            case 'R' -> 'D';
            default -> throw new IllegalArgumentException("" + s);
        };
    }

    private String result(char c) {
        return switch (c) {
            case 'D' -> "Dire";
            case 'R' -> "Radiant";
            default -> throw new IllegalArgumentException("" + c);
        };
    }


    private int next(char[] senate, final int start) {
        if (senate[start] == 'X') {
            throw new IllegalArgumentException("start");
        }
        int next = start;
        do {
            next++;
            if (next >= senate.length) {
                next = 0;
            }
        } while (senate[next] == 'X');
        return next;
    }
}
