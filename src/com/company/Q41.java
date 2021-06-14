package com.company;

/**
 * Define an array to be packed if all its values are positive, each value n appears n times and all
 * equal values are in consecutive locations. So for example, {2, 2, 3, 3, 3} is packed because 2
 * appears twice and 3 appears three times. But {2, 3, 2, 3, 3} is not packed because the 2s are not
 * in consecutive locations. And {2, 2, 2, 3, 3, 3} is not packed because 2 appears three times.
 * Write a method named isPacked that returns 1 if its array argument is packed, otherwise it
 * returns 0. You may assume that the array is not null
 * If you are programming in Java or C#, the function signature is
 * int isPacked(int[ ] a)
 */
public class Q41 {

    public static void main(String[] args) {
        System.out.println(isPacked(new int[]{2, 2, 1})); //return 1
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2})); // return 0
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3})); // return 1
    }

    static int isPacked(int[] a){
        int pre=a[0];
        int count=0;
        for(int i=0;i<a.length;i++){
            if(pre == a[i]){
                count++;
            } else {
                if(pre!=count){
                    return 0;
                } else if(pre == count){
                    int numberCount =0;
                    for(int j=0;j<a.length;j++){
                        if(a[j]==pre)
                            numberCount++;
                    }
                    if(pre!=numberCount)
                        return 0;
                    pre = a[i];
                    count =0;
                    count++;
                }
            }
        }
        return 1;
    }
}
