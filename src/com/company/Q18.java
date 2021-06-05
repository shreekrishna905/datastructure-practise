package com.company;

/**
 * A Madhav array has the following property.
 * a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = …
 * The length of a Madhav array must be n*(n+1)/2 for some n.
 * Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
 * otherwise it returns 0. If you are programming in Java or C# the function signature is
 * int isMadhavArray(int[ ] a)
 */
public class Q18 {

    public static void main(String[] args) {
        int a[] = {2, 1, 1};
        int b[] = {2, 1, 1, 4, -1, -1};
        int c[] = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int d[] = {18, 9, 10, 6, 6, 6};
        int e[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
        int f[] = {3, 1, 2, 3, 0};
        System.out.println(isMadavArray(a)); // return 1
        System.out.println(isMadavArray(b)); // return 1
        System.out.println(isMadavArray(c)); // return 1
        System.out.println(isMadavArray(d)); // return 0
        System.out.println(isMadavArray(e)); // return 1
        System.out.println(isMadavArray(f)); // return 0
    }

    static int isMadavArray(int[] a){
        boolean lengthEqual = false;
        for(int i=1;i<a.length;i++){
            int n = i* (i+1)/2;
            if(n == a.length)
                lengthEqual = true;
            else if ( ! lengthEqual && n > a.length)
                return 0;
        }

        if(lengthEqual){
            int num = a[0];
            int diff = 2;
            int i =1;
            while(i<a.length){
                int sum =0;
                for(int j=i;j< i+ diff;j++){
                    sum+= a[j];
                }
                if(sum!=num){
                    return 0;
                }
                i = i+diff;
                diff++;
            }
            return 1;
        }
        return 0;
    }

}
