package com.company;

public class Q54 {

    public static void main(String[] args) {
        //System.out.println(isHolder(127)); // return 1
        //System.out.println(isHolder(31)); // return 1
        System.out.println(isHolder(37)); // return 0
    }


    static int isHolder(int n){
        if(isPrime(n)==1){
            int num = 2;
            while(true){
                num = 2 * num;
                if(num-1 == n){
                    return 1;
                } else if(num-1 > n){
                    return 0;
                }
            }
        }
        return 0;
    }

    static int isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }

}
