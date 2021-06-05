package com.company;

/**
 * A Meera array is an array that contains the value 0 if and only if it contains a prime
 * number. The array {7, 6, 0, 10, 1} is a Meera array because it contains a prime number (7)
 * and also contains a 0. The array {6, 10, 1} is a Meera array because it contains no prime
 * number and also contains no 0.The array {7, 6, 10} is not a Meera array because it contains a prime number (7) but does
 * not contain a 0. The array {6, 10, 0} is not a Meera array because it contains a 0 but does
 * not contain a prime number.
 * It is okay if a Meera array contains more than one value 0 and more than one prime, so
 * the array {3, 7, 0, 8, 0, 5} is a Meera array (3, 5 and 7 are the primes and there are two
 * zeros.).
 * Write a function named isMeera that returns 1 if its array argument is a Meera array and
 * returns 0 otherwise.
 * You may assume the existence of a function named isPrime that returns 1 if its argument
 * is a prime and returns 0 otherwise. You do not have to write isPrime, you can just call it.
 * If you are programming in Java or C#, the function signature is
 * int isMeera(int [ ] a)
 */
public class Q4 {


    public static void main(String[] args) {
        int[] a ={7, 6, 0, 10, 1}; // return 1
        int[] b = {6, 10, 1}; //return 1
        int[] c = {7, 6, 10}; // return 0
        int[] d = {6, 10, 0}; // return 0
        int [] e = {3, 7, 0, 8, 0, 5}; // return 1
        System.out.println(isMeera(a));
        System.out.println(isMeera(b));
        System.out.println(isMeera(c));
        System.out.println(isMeera(d));
        System.out.println(isMeera(e));
    }

    static int isMeera(int[] a){
        boolean hasZero = false;
        boolean hasPrime = false;
        for(int i=0;i<a.length;i++){
            if(isPrime(a[i])==1)
                hasPrime = true;
            if(a[i]==0)
                hasZero = true;
        }
        if(hasZero && hasPrime)
            return 1;
        else if (!hasZero && !hasPrime)
            return 1;
        else
            return 0;
    }

    static int isPrime(int num){
        int i;
        for(i=2;i<num;i++){
            if(num%i==0){
                return 0;
            }
        }
        if(i==num){
            return 1;
        }
        return 0;
    }


}
