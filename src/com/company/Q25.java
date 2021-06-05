package com.company;

public class Q25 {

    public static void main(String[] args) {
        int a[] = {3,0,0,0,0,3, 2, 0, 5, 3};
       // int b[] = {3, 2, 0, 5, 3};
        System.out.println(repsEqual(a,32053));
    }

    static int repsEqual(int[] a, int n){
        for(int i=a.length-1;i>=0;i--){
            int rem = n % 10;
            if(rem!=a[i]){
                return 0;
            }
            if(n==0 && n!=a[i])
                return 0;
            n = n/10;
        }
        return 1;
    }
}
