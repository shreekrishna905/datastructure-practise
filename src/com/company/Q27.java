package com.company;

/**
 * A perfect number is one that is the sum of its factors, excluding itself. The 1st perfect
 * number is 6 because 6 = 1 + 2 + 3. The 2nd perfect number is 28 which equals 1 + 2 + 4 + 7 +
 * 14. The third is 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248. In each case, the number is the
 * sum of all its factors excluding itself.Write a method named henry that takes two integer arguments, i and j and returns the sum of the
 * ith and jth perfect numbers. So for example, henry (1, 3) should return 502 because 6 is the 1st
 * perfect number and 496 is the 3rd perfect number and 6 + 496 = 502.
 * The function signature is
 * int henry (int i, int j)
 */
public class Q27 {

    public static void main(String[] args) {
        System.out.println(henry(1,3));
    }

    static int henry(int i, int j){
        int first = 0;
        int second = 0;
        int num = 2;
        int factorCount = 0;
        while(true){
            int sum =0;
            for(int k = 1;k<num;k++){
                if(num%k==0)
                    sum+=k;
            }
            if(sum == num){
                factorCount++;
            }
            if(factorCount==i && first==0)
                first = num;
            if(factorCount==j && second==0) {
                second = num;
                break;
            }
            num++;
        }
        return first + second;
    }

}
