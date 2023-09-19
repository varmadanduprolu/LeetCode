package com.varma.leetcode.medium;

import java.util.Scanner;

public class ReverseInteger_7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(num));
    }

    /**
     * Reverses the digits of an integer.
     *
     * @param num  The integer to be reversed.
     * @return     The reversed integer.
     */
    private static int reverse(int num) {
        int result=0;
            while (num != 0) {
                int rev = num % 10;
                num = num / 10;
                // Check if adding the digit to the result will cause overflow
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && rev > 7)) {
                    return 0;
                }
                // Check if adding the digit to the result will cause underflow
                if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && rev < -8)) {
                    return 0;
                }
                result = result * 10 + rev;

            }
            return result;
    }
}
