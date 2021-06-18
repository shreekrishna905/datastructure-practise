package com.company;

public class Q58 {

    public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    static int is235Array(int[] a){
        int divTwo=0;
        int divThree =0;
        int divFive =0;
        int divNoTwoThreeAndFive =0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                divTwo++;
            if(a[i]%3==0)
                divThree++;
            if(a[i]%5==0)
                divFive++;
            if(a[i]%2!=0 && a[i] %3!=0 && a[i]%5!=0)
                divNoTwoThreeAndFive++;
        }
        int count = divFive+ divThree+ divTwo+ divNoTwoThreeAndFive;

        for (int i=0;i<a.length;i++){
            if(a[i] == count){
                return 1;
            }
        }
        return 0;
    }
}
