package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsHodderNumber {

    //function to check if a given number is prime
    static boolean isPrime(int n) {
        //since 0 and 1 is not prime return false.
        if (n == 1 || n == 0) return false;

        //Run a loop from 2 to n-1
        for (int i = 2; i < n; i++) {
            // if the number is divisible by i, then n is not a prime number.
            if (n % i == 0) return false;
        }
        //otherwise, n is prime number.
        return true;
    }

    public static int isHodder(int n) {
        if (isPrime(n)) {
            int hodder = 0;
            for (int i = 1; i < n; i++) {
                if (hodder < n) {
                    hodder = (int) (Math.pow(2, i) - 1);
                }
                if (hodder == n) return 1;
            }
            return hodder == n ? 1 : 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isHodder(3));
        System.out.println(isHodder(7));
        System.out.println(isHodder(31));
        System.out.println(isHodder(127));
        System.out.println(isHodder(5));
    }
}
