package com.company;

public class Q29 {

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[ ] {1, 0, 1, 1}, 2)); // return 11
        System.out.println(convertToBase10(new int[ ] {1, 1, 2}, 3)); // return 14
        System.out.println(convertToBase10(new int[ ] {3, 2, 5}, 8)); // return 213
    }

    static int isLegalNumber(int[] a, int num){
        for(int i=0;i<a.length;i++){
            if(a[i] >= num)
                return 0;
        }
        return 1;
    }

    static int convertToBase10(int[] a, int base){
        if(isLegalNumber(a,base)!=1)
            return -1;
        int convert=0;
        int power = a.length -1;
        for(int i=0;i<a.length;i++){
            convert+= a[i] * pow(base,power);
            power--;
        }
        return convert;
    }

    static int pow(int number, int power){
        int pow =1;
        for(int i=1;i<=power;i++)
            pow = number * pow;
        return pow;
    }

}
