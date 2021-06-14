package com.company;

/**
 * Write a function named clusterCompression with the following signature
 * If you are programming in Java or C#, the function signature is
 * int[ ] clusterCompression(int[ ] a)
 * If you are programming in C++ or C, the function signature is
 * int *clusterCompression(int a[ ], int len) where len is the length of the array.
 * The function returns the cluster compression of the array a. The length of the returned array must
 * be equal to the number of clusters in the original array! This means that someplace in your
 * answer you must dynamically allocate the returned array.
 * In Java or C# you can use
 * int[ ] result = new int[numClusters];
 * In C or C++ you can use
 * int *result = (int *)calloc(numClusters, sizeof(int));
 * Examples
 * a is then function returns
 * {0, 0, 0, 2, 0, 2, 0, 2, 0, 0} {0, 2, 0, 2, 0, 2, 0}
 * {18} {18}
 * {} {}
 * {-5, -5, -5, -5, -5} {-5}
 * {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1,
 * 1, 1} {1, 2, 1}
 * {8, 8, 6, 6, -2, -2, -2} {8, 6, -2}
 */
public class Q39 {

    public static void main(String[] args) {
        int[] a = clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1});
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }

    static int[] clusterCompression(int[] a){
        int[] arr = new int[a.length];
        int pre = a[0];
        arr[0] = pre;
        int index =0;
        for(int i=0;i<a.length;i++){
            if(pre!=a[i]){
                index++;
                pre = a[i];
                arr[index] = a[i];
            }
        }
        int[] result = new int[index + 1];
        for(int i=0;i<=index;i++)
            result[i] = arr[i];
        return result;
    }

}
