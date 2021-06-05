package com.company;

/**
 *      Write a function to return an array containing all elements common to two given arrays containing distinct positive integers. You should not use any inbuilt methods. You are allowed to use any number of arrays.
 *     The signature of the function is:
 *     int[] f(int[] first, int[] second)
 *
 * Examples
 * if input parameters are	return
 * {1, 8, 3, 2}, {4, 2, 6, 1}        {1, 2}
 * {1, 8, 3, 2, 6}, {2, 6, 1}    {2, 6, 1}
 * {1, 3, 7, 9}, {7, 1, 9, 3}    {1, 3, 7, 9}
 * {1, 2}, {3, 4}    {}
 * {}, {1, 2, 3}    {}
 * {1, 2}, {}    {}
 * {1, 2}, null	null
 * null, {}	null
 * null, null	null
 *
 *
 */
public class Q1 {

    public static void main(String[] args) {
        int[] a = {1, 8, 3, 2};
        int[] b = {4, 2, 6, 1};
        int[] c = intersection(a,b);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
            System.out.println(",");
        }
        System.out.println();
    }


    static int[] intersection(int[] first,int[] second){
        if(first==null || second==null) return null;
        int index=0;
        int min = first.length< second.length ? first.length:second.length;
        int[] a,b;
        if(first.length> second.length){
            a = first;
            b= second;
        } else {
            a = second;
            b = first;
        }
        int[] c = new int[min];
        for(int i =0;i< a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    c[index]=a[i];
                    index++;
                    break;
                }
            }
        }
        int[] finalArray = new int[index];
        for(int i=0;i<finalArray.length;i++)
            finalArray[i]=c[i];
        return finalArray;
    }


}
