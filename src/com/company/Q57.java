package com.company;

public class Q57 {

    public static void main(String[] args) {
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2})); // return 0
        System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2})); // return 1
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2})); // return 1
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3})); // return 0
    }

    static int isMercurial(int[] a){
        boolean threeExist = false;
        boolean lastOneExist = false;
        boolean firstOneExist = false;

        for(int i=0;i<a.length;i++){
            if(a[i]==1 && !firstOneExist)
                firstOneExist = true;
            if(a[i]==3 && firstOneExist)
                threeExist = true;
            if(a[i]==1 && firstOneExist && threeExist)
                lastOneExist = true;
        }
        if(threeExist && firstOneExist && lastOneExist)
            return 0;
        return 1;
    }

}
