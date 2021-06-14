package com.company;

public class Q31 {

    public static void main(String[] args) {
        System.out.println(isEvenSubSet(18,12)); // return 1
        System.out.println(isEvenSubSet(18,32)); // return 0
    }


    static int isEvenSubSet(int m, int n){

        for(int i=2;i<=m/2;i++){
            if(m%i==0 && i%2==0){
                boolean isEvenExist = false;
                for(int j=2;j<=n/2;j++){
                    if(n%j==0 && j%2==0 && i==j){
                        isEvenExist =true;
                        break;
                    }
                }
                if(!isEvenExist)
                    return 0;
            }
        }

        return 1;
    }
}
