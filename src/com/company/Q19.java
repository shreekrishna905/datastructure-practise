package com.company;

/**
 * An array is defined to be inertial if the following conditions hold:
 * a. it contains at least one odd value
 * b. the maximum value in the array is even
 * c. every odd value is greater than every even value that is not the maximum value.
 * So {11, 4, 20, 9, 2, 8} is inertial because
 * a. it contains at least one odd value
 * b. the maximum value in the array is 20 which is even
 * c. the two odd values (11 and 9) are greater than all the
 * even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.
 * However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition (c), i.e., 10 (which is
 * even) is greater 9 (which is odd) but 10 is not the maximum value in the array.
 * Write a function called isIntertial that accepts an integer array and returns 1 if the array is
 * inertial; otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isInertial(int[ ] a
 */
public class Q19 {


    public static void main(String[] args) {
        int a[] =  {11, 4, 20, 9, 2, 8};
        int b[] = {12, 11, 4, 9, 2, 3, 10};
        System.out.println(isInertial(a)); // return 1
        System.out.println(isInertial(b)); // return 0;
    }

    static int isInertial(int[] a){
        int maxNum = 0;
        boolean containOddValue = false;

        for(int i=0;i<a.length;i++){
            if(a[i] > maxNum){
                maxNum = a[i];
                if(a[i] %2 !=0){
                    containOddValue = true;
                }
            }
        }
        if (!containOddValue && maxNum%2!=0){
            return 0;
        }
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]%2!=0 && a[j]%2==0 && a[j]!=maxNum && a[i]<a[j]){
                    return 0;
                }
            }
        }
        return 1;
    }

}
