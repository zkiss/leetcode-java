package net.zkiss.leetcode;

//https://leetcode.com/problems/dota2-senate
public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        var ss = senate.toCharArray();
        var balance = 0; // d <= 0 <= r
        while (true) {
            var rLive = 0;
            var dLive = 0;
            for (int i = 0; i < ss.length; i++) {
                if (ss[i] == 'R') {
                    if (balance < 0) {
                        ss[i] = 'X';
                    } else {
                        rLive++;
                    }
                    balance++;
                } else if (ss[i] == 'D') {
                    if (0 < balance) {
                        ss[i] = 'X';
                    } else {
                        dLive++;
                    }
                    balance--;
                }
            }
            if (rLive == 0) {
                return "Dire";
            }
            if (dLive == 0) {
                return "Radiant";
            }
        }
    }

}
