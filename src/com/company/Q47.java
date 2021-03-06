package com.company;

/**
 * Define an m-n sequenced array to be an array that contains one or more occurrences of all the
 * integers between m and n inclusive. Furthermore, the array must be in ascending order and
 * contain only those integers. For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array. The array
 * {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it is missing a 4. The array {0, 2, 2, 3, 3}
 * is not a 2-3 sequenced array because the 0 is out of range. And {1,1, 3, 2, 2, 4} is not a 1-4
 * sequenced array because it is not in ascending order.
 * Write a method named isSequencedArray that returns 1 if its argument is a m-n sequenced
 * array, otherwise it returns 0.
 * If you are writing in Java or C# the function signature is
 * int isSequencedArray(int[ ] a, int m, int n)
 *
 * {1, 2, 3, 4, 5} 1 5 1
 * because the array contains all the numbers
 * between 1 and 5 inclusive in ascending
 * order and no other numbers.
 *
 * {1, 3, 4, 2, 5} 1 5 0 because the array is not in ascending order.
 * {-5, -5, -4, -4, -4, -3, -3, -2, -2, -
 * 2} -5 -2 1
 * because the array contains all the numbers
 * between -5 and -2 inclusive in ascending
 * order and no other numbers. Note that
 * duplicates are allowed.
 *
 * {0, 1, 2, 3, 4, 5} 1 5 0 because 0 is not in between 1 and 5
 * inclusive
 *
 * {1, 2, 3, 4} 1 5 0 because there is no 5
 * {1, 2, 5} 1 5 0 because there is no 3 or 4
 * {5, 4, 3, 2, 1} 1 5 0 because the array does not start with a 1.
 * Furthermore, it is not in ascending order
 */
public class Q47 {

    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[] {2,2,3,4,4,4,5}, 2,5)); // return 1
        System.out.println(isSequencedArray(new int[] {1,4,5}, 1,5)); // return 0
        System.out.println(isSequencedArray(new int[] {1, 2, 3, 4}, 1,5)); // return 0
        System.out.println(isSequencedArray(new int[] {5, 4, 3, 2, 1}, 1,5)); // return 0
    }

    static int isSequencedArray(int[] a,int m, int n){
        if(a[0]!=m || a[a.length -1]!=n)
            return 0;
        for(int i=0;i< a.length-1;i++){
            if(a[i] > a[i+1])
                return 0;
            if(a[i] < m || a[i] > n)
                return 0;
            if(a[i]!=a[i+1] && a[i]+1 !=a[i+1])
                return 0;
        }
        return 1;
    }
}
