package com.company;

public class Q61 {


    public static void main(String[] args) {
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6},5)); // return 1
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8},6)); // return 1
        System.out.println(isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7},15)); // return 0
    }

    static int  isPairedN(int[] a, int n){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i!=j && a[i]!=a[j] && a[i] + a[j]==n && n==i+j){
                    return 1;
                }
            }
        }
        return 0;
    }
}
