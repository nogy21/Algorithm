package main.binary.ReverseBits;

/**
 * 190. Reverse Bits (https://leetcode.com/problems/reverse-bits/)
 * : Reverse bits of a given 32 bits unsigned integer.
 *
 * Note
 * : Note that in some languages, such as Java, there is no unsigned integer type.
 *  In this case, both input and output will be given as a signed integer type. They should not affect your implementation,
 *  as the integer's internal binary representation is the same, whether it is signed or unsigned.
 *  In Java, the compiler represents the signed integers using 2's complement notation.
 *  Therefore, in Example 2 above, the input represents the signed integer -3 and the output represents the signed integer -1073741825.
 *
 * 아이디어
 * : 분할정복. 비트 시프트
 *
 * 십진수 예
 * : 12345678 -> 56781234 -> 78563412 -> 87654321 원하는 번호(반대번호)
 * 비트 예
 * : 00010111 -> 01110001 -> 11010100 -> 11101000
 */
public class Solution {
    public int reverseBits(int n) {
        n = ((n & 0xffff0000) >>> 16) | ((n & 0x0000ffff) << 16);
        n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
        n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);

        return n;
    }
}