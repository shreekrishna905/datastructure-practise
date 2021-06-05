package com.company;

/**
 * Write a function fill with signature
 * int[] fill(int[] arr, int k, int n)
 * which does the following: It returns an integer array arr2 of length n whose first k elements are the same as the
 * first k elements of arr, and whose remaining elements consist of repeating blocks of the first k elements. You
 * can assume array arr has at least k elements. The function should return null if either k or n is not positive.
 * Examples: fill({1,2,3,5, 9, 12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}. Fill({4, 2, -3, 12}, 1, 5) returns {4, 4,
 * 4, 4, 4}. fill({2, 6, 9, 0, -3}, 0, 4) returns null.
 */
public class Q8 {

    public static void main(String[] args) {
        int[] a = {1,2,3,5, 9, 12,-2,-1};
        print(fill(a,3,10));
    }



    static int[] fill(int[] arr, int k,int n){
        int[] a = new int[n];
        int index =0;
        while (index<n){
            for(int i=0;i< k;i++){
                if (index==n)
                    break;
                a[index]=arr[i];
                index++;
            }
        }
        return a;
    }

    static void print(int[] arr){
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+",");
    }


}
