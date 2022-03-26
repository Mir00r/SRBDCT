package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsFactorialPrime {

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

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else return (n * factorial(n - 1));
    }

    public static int isFactorialPrime(int n) {
        int sum = 0;
        if (isPrime(n)) {
            for (int i = 1; i < n; i++) {
                if (sum < n) {
                    sum = factorial(i) + 1;
                }
            }
            return sum == n ? 1 : 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));
    }
}
