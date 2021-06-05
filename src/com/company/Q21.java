package com.company;

/**
 * A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a
 * prime number whose last digit is 9 and the next prime number that follows it also ends with the
 * digit 9. For example 139 is a porcupine number because:
 * a. it is prime
 * b. it ends in a 9
 * c. The next prime number after it is 149 which also ends in 9. Note that 140, 141, 142, 143, 144,
 * 145, 146, 147 and 148 are not prime so 149 is the next prime number after 139.
 * Write a method named findPorcupineNumber which takes an integer argument n and returns the
 * first porcupine number that is greater than n. So findPorcupineNumber(0) would return 139
 * (because 139 happens to be the first porcupine number) and so would
 * findPorcupineNumber(138). But findPorcupineNumber(139) would return 409 which is the
 * second porcupine number.
 * The function signature is
 * int findPorcupineNumber(int n)
 * You may assume that a porcupine number greater than n exists.
 */
public class Q21 {

    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(0)); // return 139
        System.out.println(findPorcupineNumber(138)); // return 139
        System.out.println(findPorcupineNumber(139)); // return 409

    }

    static int findPorcupineNumber(int n){
        n++;
        int firstNum = 0;
        while(true){
            if(isPrime(n)==1 && firstNum==0){
                int rem = n%10;
                if(rem==9){
                    firstNum =n;
                }
            } else if(isPrime(n)==1 && firstNum!=0){
                int rem = n%10;
                if(rem==9){
                    break;
                }else {
                    firstNum=0;
                }
            }
            n++;
        }
        return firstNum;
    }

    static int isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }

}
