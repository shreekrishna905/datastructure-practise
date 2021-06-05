package com.company;

/**
 * 1. An array is called balanced if its even numbered elements (a[0], a[2], etc.) are even and its odd
 * numbered elements (a[1], a[3], etc.) are odd. Write a function named isBalanced that accepts an array of
 * integers and returns 1 if the array is balanced, otherwise it returns 0. Examples: {2, 3, 6, 7} is balanced sincea[0] and a[2] are even, a[1] and a[3] are odd.
 * {6, 7, 2, 3, 12} is balanced since a[0], a[2] and a[4] are even, a[1]
 * and a[3] are odd. {7, 15, 2, 3} is not balanced since a[0] is odd. {16, 6, 2, 3} is not balanced since a[1] is even.
 * If you are programming in Java or C#, the function signature is
 * int isBalanced(int[ ] a)
 */
public class Q15 {

    public static void main(String[] args) {
        int a[] = {2, 3, 6, 7};
        int b[] = {6, 7, 2, 3, 12};
        int c[] = {16, 6, 2, 3};
        System.out.println(isBalanced(a)); // return 1
        System.out.println(isBalanced(b)); // return 1
        System.out.println(isBalanced(c)); // return 0
    }

    static int isBalanced(int[] a){

        for(int i=0;i<a.length;i++){
            if(i%2==0 && a[i]%2!=0)
                return 0;
            if(i%2!=0 && a[i]%2==0)
                return 0;
        }

        return 1;
    }
}



