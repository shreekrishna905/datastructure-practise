package com.company;

public class Q52 {

    public static void main(String[] args) {
        //doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},2);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},5);
    }

    static void doIntegerBasedRounding(int[] a, int n){
        int roundArray[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i] > 0){
                int num = a[i] / n;
                int first = num * n;
                int second = (num + 1) *n;
                if((a[i] - first) == (second-a[i])){
                    roundArray[i] = second;
                } else if((a[i]-first) < ( second - a[i])){
                    roundArray[i] = first;
                } else if((a[i]-first) > ( second - a[i])){
                    roundArray[i] = second;
                }
            } else {
                roundArray[i] = a[i];
            }
        }
        for(int i=0;i<roundArray.length;i++){
            System.out.print(roundArray[i]+",");
        }
    }

}
