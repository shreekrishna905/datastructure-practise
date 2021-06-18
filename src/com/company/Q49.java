package com.company;

/**
 * 1. Write a function named largestPrimeFactor that will return the largest prime factor of a
 * number. If the number is <=1 it should return 0. Recall that a prime number is a number > 1 that
 * is divisible only by 1 and itself, e.g., 13 is prime but 14 is not.
 * The signature of the function is int largestPrimeFactor(int n)
 * Examples:
 * if n is return because
 * 10 5 because the prime factors of 10 are 2 and 5 and 5 is the largest one.
 * 6936 17 because the distinct prime factors of 6936 are 2, 3 and 17 and 17 is the largest
 * 1 0 because n must be greater than 1
 */
public class Q49 {

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10)); // return 5
        System.out.println(largestPrimeFactor(6936)); // return 17
    }

    static int largestPrimeFactor(int n){
        int max =0;
        for(int i =2;i<=n;i++){
            if(n%i==0 && isPrime(i) && i > max){
                max = i;
            }
        }
        return max;
    }

    static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
