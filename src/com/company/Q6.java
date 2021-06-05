package com.company;
/*
 An array is said to be hollow if it contains 3 or more zeros in the middle that are preceded and
followed by the same number of non-zero elements. Write a function named isHollow that accepts an integer
array and returns 1 if it is a hollow array, otherwise it returns 0. The function signature is
int isHollow(int[ ] a).
Examples: isHollow({1,2,4,0,0,0,3,4,5}) returns true. isHollow ({1,2,0,0,0,3,4,5}) returns false. : isHollow
({1,2,4,9, 0,0,0,3,4, 5}) returns false. isHollow ({1,2, 0,0, 3,4}) returns false.
 */
public class Q6 {

    public static void main(String[] args) {
        int[] a = {1,2,4,0,0,0,3,4,5}; //return 1
        int[] b = {1,2,0,0,0,3,4,5}; // return 0
        int[] c = {1,2,4,9, 0,0,0,3,4, 5}; // return 0
        int[] d = {1,2, 0,0, 3,4}; // return 0
        System.out.println(isHollow(a));
        System.out.println(isHollow(b));
        System.out.println(isHollow(c));
        System.out.println(isHollow(d));

    }

    static int isHollow(int[] a){
        int preceded = 0;
        int followed = 0;
        int middle =0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0 && middle==0 && followed ==0)
                preceded++;
            else if(a[i]==0 && preceded!=0 && followed==0)
                middle++;
            else if(a[i]!=0 && preceded!=0 && middle!=0)
                followed++;
        }
        if(preceded==middle && middle==followed && followed==preceded && preceded>2)
            return 1;
        return 0;
    }
}
