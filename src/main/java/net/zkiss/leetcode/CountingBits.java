package net.zkiss.leetcode;

//https://leetcode.com/problems/counting-bits
public class CountingBits {

    private static final byte[] ONES = bitsUpTo(0xff);

    private static byte[] bitsUpTo(int limit) {
        byte[] res = new byte[limit + 1];
        for (int i = 0; i <= limit; i++) {
            byte cnt = 0;
            var w = i;
            while (w != 0) {
                cnt += w & 1;
                w >>>= 1;
            }
            res[i] = cnt;
        }
        return res;
    }


    public int[] countBits(int n) {
        int[] res = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int cnt = 0;
            var w = i;
            while (w != 0) {
                cnt += ONES[w & 0xff];
                w >>>= 8;
            }
            res[i] = cnt;
        }
        return res;
    }
}
