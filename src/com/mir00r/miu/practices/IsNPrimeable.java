package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsNPrimeable {

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

    public static int nPrimeAble(int[] arr, int n) {
        for (int j : arr) {
            if (!isPrime(j + n)) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(nPrimeAble(new int[]{5, 15, 27}, 2));
        System.out.println(nPrimeAble(new int[]{5, 15, 27}, 3));
        System.out.println(nPrimeAble(new int[]{5, 15, 26}, 2));
        System.out.println(nPrimeAble(new int[]{1, 1, 1, 1, 1, 1, 1}, 4));
        System.out.println(nPrimeAble(new int[]{}, 2));
    }
}
