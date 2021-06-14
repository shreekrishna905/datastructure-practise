package com.company;

public class Q43 {

    public static void main(String[] args) {
        System.out.println(getExponent(28,3)); // return 0
        System.out.println(getExponent(27,3)); // return 3
        System.out.println(getExponent(280,7)); // return 1
        System.out.println(getExponent(-250,5)); // return 3

    }

    static int getExponent(int n, int p){
        if(p<=1) {
            return -1;
        }
        int factor = 0;
        while(true){
            if(n%p==0) {
                factor++;
                n = n/p;
            } else {
                break;
            }
        }
        return factor;
    }

}
