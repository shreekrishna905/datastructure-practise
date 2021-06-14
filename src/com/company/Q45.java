package com.company;

public class Q45 {

    public static void main(String[] args) {
        //int[] a = filterArray(new int[]{8, 4, 9, 0, 3, 1, 2},88);
        int[] b = filterArray(new int[]{18},3);
      //  for(int i=0;i<a.length;i++){
         //   System.out.print(a[i]+",");
       // }
        System.out.println(b); // null
    }


    static int[] filterArray(int[]a, int n){
        int index =0;
        int j=0;
        int arr[] = new int[a.length];
        while(n>0){
            int rem = n%2;
            n = n/2;
            if(j==a.length){
                return null;
            }
            if(rem ==1){
                arr[j] = a[index];
                j++;
            }
            index++;
        }
        int newArr[] = new int[j];
        for (int i=0;i<j;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
