package com.company;

/**
 * 1. It is a fact that there exist two numbers x and y such that x! + y! = 10!. Write a method named
 * solve10 that returns the values x and y in an array.
 * The notation n! is called n factorial and is equal to n * n-1 * n-2 * … 2 * 1, e.g., 5! =
 * 5*4*3*2*1 = 120
 */
public class Q24 {

    public static void main(String[] args) {
        int a[] = solve10();
        System.out.println("x:"+a[0]+",y:"+a[1]);
    }

    static int[] solve10(){
        int[] a = new int[2];
        int factorial10 = factorial(10);
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                if(factorial(i) + factorial(j) == factorial10){
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }


    static int factorial(int n){
        int factorial = 1;
        for(int i=n;i>0;i--)
            factorial = factorial * i;
        return factorial;
    }

}
