package com.company;

/**
 * A Bean array is defined to be an array where for every value n in the array, there is
 * also an element n-1 or n+1 in the array.
 * For example, {2, 10, 9, 3} is a Bean array because
 * 2 = 3-1
 * 10 = 9+1
 * 3 = 2 + 19 = 10 -1
 * Other Bean arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
 * The array {3, 4, 5, 7} is not a Bean array because of the value 7 which requires that the
 * array contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the
 * array.
 * Write a function named isBean that returns 1 if its array argument is a Bean array.
 * Otherwise it returns a 0.
 * If you are programming in Java or C#, the function signature is
 * int isBean(int[ ] a
 */
public class Q3 {

    public static void main(String[] args) {
        int a[] = {2, 10, 9, 3};
        int b[] = {2, 2, 3, 3, 3};
        int c[] = {1, 1, 1, 2, 1, 1};
        int d[] = {0, -1, 1};
        int e[] = {3,4,5,7};
        System.out.println(isBean(a)); // return 1
        System.out.println(isBean(b)); // return 1
        System.out.println(isBean(c)); // return 1
        System.out.println(isBean(d)); // return 1
        System.out.println(isBean(e)); // return 0
    }

    static int isBean(int a[]){
        for(int i=0;i<a.length;i++){
            boolean elementExist = false;
            for(int j=0;j<a.length;j++){
                if(a[j]+1==a[i] || a[j]-1==a[i])
                    elementExist=true;
            }
            if(!elementExist)
                return 0;
        }
        return 1;
    }



}
