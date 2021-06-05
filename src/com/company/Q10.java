package com.company;

/**
 * An array is defined to be a Bean array if it meets the following conditions
 *    a. If it contains a 9 then it also contains a 13.
 *    b. If it contains a 7 then it does not contain a 16.
 * So {1, 2, 3, 9, 6, 13}  and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are Bean arrays. The following arrays are not Bean arrays:
 *    a. { 9, 6, 18} (contains a 9 but no 13)
 *    b. {4, 7, 16} (contains both a 7 and a 16)
 * Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it returns
 * 0.
 * If you are programming in Java or C#, the function signature is
 *    int isBean (int[ ] a)
 */
public class Q10 {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 9, 6, 13}; //return 1
        int b[] = {3, 4, 6, 7, 13, 15}; //return 1
        int c[] = {1, 2, 3, 4, 10, 11, 12}; // return 0
        int d[] = {3, 6, 9, 5, 7, 13, 6, 17}; // return 1
        int e[] = {9,6,18}; // return 0

        System.out.println(isBean(a));
        System.out.println(isBean(b));
        System.out.println(isBean(c));
        System.out.println(isBean(d));
        System.out.println(isBean(e));

    }

    static int isBean (int[] a){
        boolean contain9 = false;
        boolean contain7 = false;
        boolean contain13 = false;
        boolean contain16 = false;

        for(int i=0;i<a.length;i++){
            if(a[i]==9)
                contain9 = true;
            if(a[i]==13)
                contain13 = true;
            if(a[i]==7)
                contain7 = true;
            if(a[i]==16)
                contain16 = true;
        }

        if((contain9 && contain13)||(contain7 && !contain16))
            return 1;

        return 0;
    }

}
