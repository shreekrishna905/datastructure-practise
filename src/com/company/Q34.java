package com.company;

/**
 * An isSym (even/odd Symmetric) array is defined to be an array in which even numbers and odd numbers appear in the same order from “both directions”. You can assume array has at least one element. See examples below:
 *
 * {2, 7, 9, 10, 11, 5, 8} is a isSym array.
 *
 * Note that from left to right or right to left we have even, odd, odd, even, odd, odd, even.
 *
 * {9, 8, 7, 13, 14, 17} is a isSym array.
 *
 * Note that from left to right or right to left we have {odd, even, odd, odd, even, odd}.
 *
 * However, {2, 7, 8, 9, 11, 13, 10} is not a isSym array.
 * From left to right we have {even, odd, even, odd,  odd, odd, even}.
 * From right to left we have {even, odd,  odd, odd, even, odd, even},
 * whichis not the same.
 *
 * Write a function named isSym that returns 1 if its array argument is a isSym array, otherwise it returns 0.
 *
 * If you are programming in Java or C#, the function signature is:
 *    int isSym (int [ ] a)
 *
 * If you are programming in C or C++, the function signature is:
 *    int isSym (int a[ ], int len) where len is the number of elements in the array.
 */
public class Q34 {

    public static void main(String[] args) {
        System.out.println(isSym(new int[]{2, 7, 9, 10, 11, 5, 8})); // return 1
        System.out.println(isSym(new int[]{9, 8, 7, 13, 14, 17})); // return 1
        System.out.println(isSym(new int[]{2, 7, 8, 9, 11, 13, 10})); // return 0
    }

    static int isSym(int[] a){
        int n = a.length +1 / 2;
        int j = a.length -1;
        for(int i=0;i<n;i++){
            if(a[i]%2!=a[j]%2)
                return 0;
            j--;
        }
        return 1;
    }

}
