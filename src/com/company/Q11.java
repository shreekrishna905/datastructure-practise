package com.company;

/**
 * Write a function named minDistance that returns the smallest distance between two factors of a
 * number. For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013.
 * minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 ­
 * 11 = 2). As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8
 * and the smallest distance between any two factors is 1 (2 – 1 = 1).
 */
public class Q11 {

    public static void main(String[] args) {
        System.out.println(minDistance(13013)); //return 2
        System.out.println(minDistance(1)); //return 1
        System.out.println(minDistance(8)); //return 1
        System.out.println(minDistance(7)); //return 6
    }


    static int minDistance(int n){
        int min =n;
        int last=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(i - last < min && last!=0)
                    min = i - last;
                last = i;
            }
        }
        return min;
    }
}
