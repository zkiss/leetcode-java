package net.zkiss.leetcode;

//https://leetcode.com/problems/can-place-flowers
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; n > 0 && i < flowerbed.length; i++) {
            var empty = flowerbed[i] == 0;
            if (!empty) continue;

            var left = i == 0 || flowerbed[i - 1] == 0;
            var right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
            if (left && right) {
                n--;
                flowerbed[i] = 1;
            }
        }

        return n == 0;
    }
}
