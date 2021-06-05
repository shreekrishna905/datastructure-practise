package com.company;

/**
 * . An array is defined to be odd-heavy if it contains at least one odd element and every odd
 * element is greater than every even element. So {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11
 * and 9) are greater than all the even elements. And {11, 4, 9, 2, 3, 10} is not odd-heavy because the even element
 * 10 is greater than the odd element 9. Write a function called isOddHeavy that accepts an integer array and
 * returns 1 if the array is odd-heavy; otherwise it returns 0. Some other examples: {1} is odd-heavy, {2} is not
 * odd-heavy, {1, 1, 1, 1} is odd-heavy, {2, 4, 6, 8, 11} is odd-heavy, {-2, -4, -6, -8, -11} is not odd-heavy.
 * If you are programming in Java or C#, the function signature is
 * int isOddHeavy(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isOddHeavy(int a[ ], int len)
 * where len is the number of elements in the array.
 */
public class Q14 {

    public static void main(String[] args) {
        int a[] = {11, 4, 9, 2, 8}; // return 1
        int b[] ={11, 4, 9, 2, 3, 10}; // return 0
        int c[] ={2, 4, 6, 8, 11}; // return 1

        System.out.println(isOddHeavy(a));
        System.out.println(isOddHeavy(b));
        System.out.println(isOddHeavy(c));
    }

    static int  isOddHeavy(int[] a){
        for(int i=0;i<a.length;i++){
            int odd =0;
            if(a[i]%2!=0) {
                odd = a[i];
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] > odd) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

}
