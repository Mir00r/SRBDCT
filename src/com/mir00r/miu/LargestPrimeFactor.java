package com.mir00r.miu;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class LargestPrimeFactor {

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

    public static int[] sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        int notPrimeCount = 0;
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p]) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                    notPrimeCount++;
                }
            }
        }

        int[] primeNumbers = new int[prime.length];
        int index = 0;
        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
//                System.out.print(i + " ");
                primeNumbers[index++] = i;
            }
        }
        return primeNumbers;
    }

    public static int largestPrimeFactor(int n) {
        if (n < 3) return 0;
        int[] primeNumbers = sieveOfEratosthenes(n);
        int maxPrimeFactor = Integer.MIN_VALUE;
        for (int primeNumber : primeNumbers) {
            if (primeNumber != 0 && n % primeNumber == 0 && maxPrimeFactor < primeNumber) maxPrimeFactor = primeNumber;
        }
        return maxPrimeFactor;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }
}
