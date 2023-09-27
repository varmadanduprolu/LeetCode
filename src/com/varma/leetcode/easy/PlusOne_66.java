package com.varma.leetcode.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PlusOne_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(plusOne2(nums)));
    }

    /**
     * Adds one to the given array of digits.
     *
     * @param digits The array of digits.
     * @return The resulting array after adding one.
     */

    public static int[] plusOne2(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        // Check if the last digit is 9 and the array has only one element
        if (digits[digits.length - 1] == 9 && digits.length == 1) {
            list.add(0);
            list.add(1);
        } else if (digits[digits.length - 1] == 9) {
            list.add(0);
            digits[digits.length - 2]++;
        } else {
            list.add(digits[digits.length - 1] + 1);
        }
        // Iterate through the remaining digits from right to left
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] > 9 && (i - 1) >= 0) {
                list.add(0);
                digits[i - 1]++;
            } else if (digits[i] > 9 && (i - 1) < 0) {
                list.add(0);
                list.add(1);
            } else {
                list.add(digits[i]);
            }
        }
        int[] arr = new int[list.size()];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(j);
            j--;
        }
        return arr;
    }

    public static int[] plusOne1(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        long res = 0;
        for (int i : nums) {
            res = res * 10 + i;
        }
        res += 1;
        while (res > 0) {
            long element = res % 10;
            list.add((int) element);
            res /= 10;
        }
        int[] arr = new int[list.size()];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = list.get(j);
            j++;
        }
        return arr;
    }

    private static int[] plusOne(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        BigInteger res = BigInteger.ZERO;
        for (int i : nums) {
            res = res.multiply(BigInteger.TEN).add(BigInteger.valueOf(i));
        }
        res = res.add(BigInteger.ONE);
        while (res.compareTo(BigInteger.ZERO) > 0) {
            long element = res.mod(BigInteger.TEN).longValue();
            list.add((int) element);
            res = res.divide(BigInteger.TEN);
        }
        int[] arr = new int[list.size()];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = list.get(j);
            j++;
        }
        return arr;
    }


}
