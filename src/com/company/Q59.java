package com.company;

public class Q59 {

    public static void main(String[] args) {
        int a[] = computeHMS(3650);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }

    static int[] computeHMS(int seconds){
        int hrs = getTime(seconds, 3600);
        int min = getTime(seconds-hrs*3600,60);
        int sec = seconds - hrs* 3600 - min *60;
        return new int[]{hrs, min,sec};
    }

    static int getTime(int seconds, int time){
        int count =0;
        while(seconds >= time){
            seconds = seconds - time;
            count++;
        }
        return count;
    }


}
