package main.binary.NumberOf1Bits;

/**
 * 191. Number of 1 Bits
 */
public class Solution {
    public int hammingWeight(int n) {
        int ones = 0;
        while (n != 0) {
            ones += n & 1;
            n = n >>> 1;
        }
        return ones;
    }

    // Integer.bitCount(int i)
    public int hammingWeight2(int n) {
        return Integer.bitCount(n);
    }
}
