package com.company;

public class Q40 {

    public static void main(String[] args) {
        System.out.println(isRailRoadTie(new int[]{1, 2}));
        System.out.println(isRailRoadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailRoadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailRoadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailRoadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    static int isRailRoadTie(int a[]){
        int count =0;
        for(int i=1;i<a.length - 1;i++){
            if(a[i]==0)
                count++;
            a[i] = a[i] < 0 ? a[i] * -1:a[i];
            if(a[i] > 0 && ((a[i-1]==0 && a[i+1]==0) || (a[i-1]!=0 && a[i+1]!=0)))
                return 0;
            else if(a[i]==0 && (a[i-1]==0 || a[i+1]==0) && i!=1)
                return 0;
            else if(i==1 && a[i-1]!=0 && a[i]==0)
                return 0;
            else if(i==a.length-2 && a[a.length-1]!=0 && a[i]==0)
                return 0;
        }
        if(count==a.length)
            return 0;
        return 1;
    }


}
