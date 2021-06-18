package com.company;

public class Q56 {

    public static void main(String[] args) {
        System.out.println(isTriangular(10)); // return 1
    }

    static int isTriangular(int n){
        int i =1;
        while(true){
            int num = i * (i+1) / 2;
            if(num == n){
                return 1;
            } else if(num > n){
                return 0;
            }
            i++;
        }
    }

}
