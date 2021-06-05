package com.company;

/*
     Consider an array A with n of positive integers. An integer idx is called a POE (point of equilibrium) of A, if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1]. Write a function to return POE of an array, if it exists and -1 otherwise.
    The signature of the function is:
    int f(int[] a)

Examples
if input arrays are	return
{1, 8, 3, 7, 10, 2}	3 Reason: a[0] + a[1] + a[2] is equal to a[4] + a[5]
{1, 5, 3, 1, 1, 1, 1, 1, 1}	2 Reason: a[0] + a[1] is equal to a[3] + a[4] + a[5] + a[6] + a[7] + a[8]
{2, 1, 1, 1, 2, 1, 7}	5 Reason: a[0] + a[1] + a[2] + a[3] + a[4] is equal to a[6]
{1, 2, 3}	-1 Reason: No POE.
{3, 4, 5, 10}	-1 Reason: No POE.
{1, 2, 10, 3, 4}	-1 Reason: No POE.
 */
public class Q2 {

    public static void main(String[] args) {
        int[] a = {2, 1, 1, 1, 2, 1, 7};
        System.out.println(poe(a));
    }

    static int poe(int[] a){

        for(int i=0;i<a.length;i++){
            int left =0;
            int right =0;
            int initialRightIndex =0;
            for(int k = 0;k<=i;k++) {
                left+=a[k];
            }
            initialRightIndex = i+2;
            for(int j=initialRightIndex;j<a.length;j++) {
                right+=a[j];
            }
            if(left==right)
                return initialRightIndex - 1;
         }
        return -1;
    }



}
