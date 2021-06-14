package com.company;

public class Q42 {

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{1})); // return 1
        System.out.println(isOddHeavy(new int[]{2})); // return 0
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1, 1, 1})); // return 1
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11})); // return 1
    }

    static int isOddHeavy(int[] a){
        boolean hasOddElement = false;

        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                hasOddElement = true;
                for(int j=0;j<a.length;j++){
                    if(a[j]%2>a[i])
                        return 0;
                }
            }
        }
        if(!hasOddElement)
            return 0;
        return 1;
    }

}
