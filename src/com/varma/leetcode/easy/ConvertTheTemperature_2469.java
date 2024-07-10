package com.varma.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTheTemperature_2469 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        System.out.println(Arrays.toString(convertTheTemperature(n)));
    }

    private static float[] convertTheTemperature(float n) {
        float str[] = new float[2];
         str[0]=Float.parseFloat(String.format("%.5f", n + 273.15000));
         str[1]= Float.parseFloat(String.format("%.5f", n * 1.8 + 32.00000));
        return str;
    }
}
