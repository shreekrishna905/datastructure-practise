package com.company;

/**
 * A wave array is defined to an array which does not contain two even numbers or two odd
 * numbers in adjacent locations. So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave
 * arrays. But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each
 * other.
 * Write a function named isWave that returns 1 if its array argument is a Wave array, otherwise it
 * returns 0.
 * If you are programming in Java or C#, the function signature is
 *    int isWave (int [ ] a)
 */
public class Q9 {

    public static void main(String[] args) {
        int[] a = {7, 1, 9, 10, 5};
        int[] b = {4, 11, 12, 1, 6};
        int[] c = {1, 0, 5};
        int[] d = {2};
        int[] e = {2, 6, 3, 4};
        int[] f = {7, 2, 9, 10, 5};
        System.out.println(isWave(a)); // return 0
        System.out.println(isWave(b)); // return 1
        System.out.println(isWave(c)); // return 1
        System.out.println(isWave(d)); // return 1
        System.out.println(isWave(e)); // return 0
        System.out.println(isWave(f)); // return 1
    }

    static int isWave(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2 == arr[i+1]%2)
                return 0;
        }
        return 1;
    }


}
