package com.company;

public class Q26 {

    public static void main(String[] args) {
        int a[] = {3, 2, 10, 4, 1, 6, 9};
        int b[] = {2, 10, 4, 1, 6, 9};
        int c[] = {9, 15, 6};
        System.out.println(isCentered15(a)); // return 1
        System.out.println(isCentered15(b)); // return 0
        System.out.println(isCentered15(c)); // return 1
    }

    static int isCentered15(int[] a){
        int start = 1;
        while(true){
            int sum =0;
            for(int i =start;i<a.length-start;i++){
                sum += a[i];
            }
            if(sum == 15)
                return 1;
            start++;
            if(start*2 >=a.length)
                break;
        }
        return 0;
    }
}
