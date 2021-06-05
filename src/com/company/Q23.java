package com.company;

/**
 * 1. The Stanton measure of an array is computed as follows. Count the number of 1s in the
 * array. Let this count be n. The Stanton measure is the number of times that n appears in the array.
 * For example, the Stanton measure of {1, 4, 3, 2, 1, 2, 3, 2} is 3 because 1 occurs 2 times in the
 * array and 2 occurs 3 times.Write a function named stantonMeasure that returns the Stanton measure of its array argument.
 * If you are programming in Java or C#, the function prototype is
 * int stantonMeasure(int[ ] a)
 */
public class Q23 {

    public static void main(String[] args) {
        int a[] = {1, 4, 3, 2, 1, 2, 3, 2};
        int b[] = {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
        System.out.println(stantonMeasure(a)); // return 3
        System.out.println(stantonMeasure(b)); // return 6

    }


    static int stantonMeasure(int[] a){
        int finalCount = 0;
        for(int i=0;i<a.length;i++){
            int count =0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j])
                    count++;
            }
            if (count > finalCount)
                finalCount = count;
        }
        return finalCount;
    }
}
