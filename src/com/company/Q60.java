package com.company;

public class Q60 {

    public static void main(String[] args) {
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1})); // return 1
        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2})); // return 0
    }

    static int isMartian(int[] a){
        int countOne =0;
        int countTwo =0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                return 0;
            }
            if(a[i]==1)
                countOne++;
            else if(a[i]==2)
                countTwo++;
        }
        if(a[a.length-1]==1) countOne++;
        if(a[a.length-1]==2) countTwo++;
        if(countOne > countTwo)
            return 1;
        return 0;
    }
}
