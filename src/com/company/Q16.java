package com.company;

/**
 * A Pascal number is a number that is the sum of the integers from 1 to j for some j. For
 * example 6 is a Pascal number because 6 = 1 + 2 + 3. Here j is 3. Another Pascal number
 * is 15 because 15 = 1 + 2 + 3 + 4 + 5. An example of a number that is not a Pascal number
 * is 7 because it falls between the Pascal numbers 6 and 10.
 * Write a function named isPascal that returns 1 if its integer argument is a Pascal number,
 * otherwise it returns 0.
 * The signature of the function is
 * int isPascal (int n)
 */
public class Q16 {

    public static void main(String[] args) {
        System.out.println(isPascal(6)); // return 1
        System.out.println(isPascal(15)); // return 1
        System.out.println(isPascal(7)); // return 0;
    }


    static int isPascal(int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=i;
            if(sum>n) return 0;
            else if (sum==n) return 1;
        }
        return 0;
    }
}
