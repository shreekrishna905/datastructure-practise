package com.company;

public class Q36 {

    public static void main(String[] args) {
        System.out.println(isIsolated(163)); // return 1
        System.out.println(isIsolated(162)); // return 0
    }

    static int isIsolated(long n){
        if(n > 2097151)
            return -1;
        long square = n*n;
        long cube = n*n*n;
        while (square > 0) {
            long num = cube;
            long rem = square % 10;
            boolean isExist = false;
            while(num > 0){
                if(rem == num%10)
                    return 0;
                num = num/10;
            }
            square = square /10;
        }
        return 1;
    }
}
