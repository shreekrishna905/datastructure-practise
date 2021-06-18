package com.company;

/**
 * The fundamental theorem of arithmetic states that every natural number greater than 1 can be
 * written as a unique product of prime numbers. So, for instance, 6936=2*2*2*3*17*17. Write a
 * method named encodeNumber what will encode a number n as an array that contains the prime
 * numbers that, when multipled together, will equal n. So encodeNumber(6936) would return the
 * array {2, 2, 2, 3, 17, 17}. If the number is <= 1 the function should return null;If you are programming in Java or C#, the function signature is
 * int[ ] encodeNumber(int n)
 * If you are programming in C or C++, the function signature is
 * int *encodeNumber(int n) and the last element of the returned array is 0.
 * Note that if you are programming in Java or C#, the returned array should be big enough to
 * contain the prime factors and no bigger. If you are programming in C or C++ you will need one
 * additional element to contain the terminating zero.
 * Hint: proceed as follows:
 * 1. Compute the total number of prime factors including duplicates.
 * 2. Allocate an array to hold the prime factors. Do not hard-code the size of the returned
 * array!!
 * 3. Populate the allocated array with the prime factors. The elements of the array when multiplied
 * together should equal the number.
 * Examples
 * if n is return reason
 * 2 {2} because 2 is prime
 * 6 {2, 3} because 6 = 2*3 and 2 and 3 are prime.
 * 14 {2, 7} because 14=2*7 and 2 and 7 are prime
 * numbers.
 * 24 {2, 2, 2, 3} because 24 = 2*2*2*3 and 2 and 3 are prime
 * 1200 {2, 2, 2, 2, 3, 5, 5} because 1200=2*2*2*2*3*5*5 and those are all
 * prime
 * 1 null because n must be greater than 1
 * -18 null because n must be greater than 1
 */
public class Q50 {

    public static void main(String[] args) {
        int[] a = encodeNumber(6936);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }

    static int[] encodeNumber(int n){
        int i=1;
        int index =0;
        int a[] = new int[n];
        while(n > 1){
            i++;
            if(isPrime(i)){
                while(n%i==0){
                    a[index] = i;
                    n = n/i;
                    index++;
                }
            }
        }
        int[] newArr = new int[index];
        for(int j=0;j<index;j++){
            newArr[j] = a[j];
        }
        return newArr;
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
