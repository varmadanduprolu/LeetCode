package com.varma.other;

public class powerOfThree {
    public static void main(String[] args) {
        System.out.println( isPowerOfThree(28));
    }
    public static boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int pow=power(n);
        System.out.println(Math.pow(3,pow)+" "+ pow);
        if((int)Math.pow(3,pow)==n){
            return true;
        }
        return false;
    }
    static int power(int n){
        if(n==1){
            return 1;
        }
        return 1+power(n/3);
    }
}

