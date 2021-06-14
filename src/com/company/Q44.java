package com.company;

public class Q44 {

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1})); // return 1
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1})); // return 1
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1})); // return 0
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));// return 0
    }

    static int is121Array(int[] a){
        int left=0;
        int right =0;
        int i=0;
        int j= a.length -1;

        while(i!=j){
            if(a[i] > 2 || a[j] > 2) {
                return 0;
            }
            if(a[i]==1){
                left++;
            }
            if(a[j]==1){
                right++;
            }
            if(a[j]==2 || a[i]==2){
                if(left!=right){
                    return 0;
                }
                for(int k=i;k<=j;k++){
                    if(a[k]!=2)
                        return 0;
                }
            }
            i++;
            j--;
        }
        return 1;
    }

}
