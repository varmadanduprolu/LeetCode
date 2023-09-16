package com.varma.other;

import java.util.*;

public class SumFour_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len= sc.nextInt();
        int B= sc.nextInt();;
        int []A=new int[len];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(sumFour(A,B));
    }

    private static ArrayList<ArrayList<Integer>> sumFour(int[] A, int B) {
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        Arrays.sort(A);
        for (int i = 0; i < A.length-1; i++) {
           if (i==0 || A[i]!=A[i-1]){
               int j=i+1;
               int k=j+1;
               int l=A.length-1;
               int tar=B-A[i];
               while(k<l){
                   if ((A[j]+A[k]+A[l])==tar){
                       ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(A[i],A[j],A[k],A[l]));
                      // List<Integer> temp= Arrays.asList(A[i], A[j],A[k],A[l]);
                       arrayLists.add(numbers);
                       j=j+2;
                       k=k+2;
                       l--;
                   } else if ((A[j]+A[k]+A[l])<tar) {
                       j=j+2;
                       k=k+2;
                   }else l--;
               }
           }
        }
        return arrayLists;
    }
}
