package main.binary.SumOfTwoIntegers;

/**
 * 371. Sum of Two Integers
 * : Given two integers a and b, return the sum of the two integers without using the operators + and -.
 */
public class Solution {
    public int getSum(int a, int b) {
        int c;
        while (b != 0) {
            c = a & b;
            a = a ^ b;
            b = (c) << 1;
            System.out.print("a: " + Integer.toBinaryString(a) + ", ");
            System.out.print("b: " + Integer.toBinaryString(b) + ", ");
            System.out.println("c: " + Integer.toBinaryString(c));
        }
        return a;
    }
}
