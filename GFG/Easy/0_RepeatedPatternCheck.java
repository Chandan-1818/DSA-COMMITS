/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/the-pattern-matcher/1
 * Platform     : GFG
 * Difficulty   : Easy
 */


class Solution {
    public boolean findPattern(String s) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                if (y > 0) {
                    if (x != y) {
                        return false;
                    }
                    x = 0;
                    y = 0;
                }
                x++;
            } else {
                y++;
            }
        }
        return x == y;
    }
}

