package net.zkiss.leetcode;

import java.util.LinkedList;

//https://leetcode.com/problems/dota2-senate
public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        var elim = new LinkedList<Character>();
        for (var c : senate.toCharArray()) {
            elim.add(c);
        }
        var dVote = 0;
        var rVote = 0;
        while (true) {
            var dLive = 0;
            var rLive = 0;
            var i = elim.iterator();
            while (i.hasNext()) {
                var c = i.next();
                if (c == 'D') {
                    if (rVote > 0) {
                        rVote--;
                        i.remove();
                    } else {
                        dVote++;
                        dLive++;
                    }
                } else { // R
                    if (dVote > 0) {
                        dVote--;
                        i.remove();
                    } else {
                        rVote++;
                        rLive++;
                    }
                }
            }

            if (dLive == 0) {
                return "Radiant";
            }
            if (rLive == 0) {
                return "Dire";
            }
        }
    }
}
