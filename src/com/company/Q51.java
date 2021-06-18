package com.company;

public class Q51 {

    public static void main(String[] args) {
        System.out.println(matchPattern(new int[]{1, 1, 1, 2, 2, 1, 1, 3},new int[] {1, 2, 1, 3}));
    }

    static int matchPattern(int[] a, int[] pattern){
        int expectedPattern[] = new int[pattern.length];
        expectedPattern[0] = a[0];
        int index =1;
        for(int i=0;i<a.length -1;i++){
            if(a[i] !=a[i+1]){
                expectedPattern[index] = a[i+1];
                index++;
            }
        }
        for(int j=0;j<pattern.length;j++){
            if(expectedPattern[j]!=pattern[j]){
                return 0;
            }
        }
        return 1;
    }
}
