package com.company;

public class Q53 {

    public static void main(String[] args) {
        //System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        //System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
    }


    static int isZeroPlentiful(int[] a){
        int count =0;
        int zeroCount = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                zeroCount++;
                if(i==a.length-1){
                    count++;
                }
            } else {
                if(zeroCount > 0 && zeroCount < 4){
                    return 0;
                } else if(zeroCount >=4){
                    count++;
                    zeroCount =0;
                }
            }
        }
        return count;
    }

}
