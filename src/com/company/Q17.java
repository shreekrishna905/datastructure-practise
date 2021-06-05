package com.company;

public class Q17 {

    public static void main(String[] args) {
        int[] a =  {2, 2, 3, 3, 3};
        int[] b =  {1, 1, 1, 2, 1, 1};
        System.out.println(isNiceArray(a));
        System.out.println(isNiceArray(b));
    }

    static int isNiceArray(int[] a){
        for(int i=0;i<a.length;i++){
            boolean isElementExist = false;
            for(int j=0;j<a.length;j++){
                if(a[j]+1==a[i] || a[j] -1 ==a[i])
                    isElementExist = true;
            }
            if(!isElementExist)
                return 0;
        }
        return 1;
    }
}
