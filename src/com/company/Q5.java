package com.company;

/**
 * 1. A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. Note that
 * first two Fibonacci numbers are 1 and any Fibonacci number other than the first two is the
 * sum ofthe previous two Fibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2
 * and so on.
 * Write a function named isFibonacci that returns 1 if its integer argument is
 * a Fibonacci number, otherwise it returns 0.
 * The signature of the function is
 * int isFibonacci (int n)
 */
public class Q5 {

    public static void main(String[] args) {
        System.out.println(isFibonacci(5)); // return 1
        System.out.println(isFibonacci(21)); // return 1
        System.out.println(isFibonacci(34)); // return 1
        System.out.println(isFibonacci(3)); // return 1
        System.out.println(isFibonacci(20)); // return 0
    }

    static int isFibonacci(int n){
        int a = 1;
        int b = 1;
        while(true){
            int c = a+b;
            a=b;
            b=c;
            if(b==n){
                return 1;
            } else if (b > n){
                break;
            }
        }
        return 0;
    }
}
