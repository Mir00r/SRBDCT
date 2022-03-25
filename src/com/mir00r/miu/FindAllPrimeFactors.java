package com.mir00r.miu;

import com.mir00r.Utils;

import java.util.Arrays;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class FindAllPrimeFactors {

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

    public static int[] findPrimeFactor(int n) {
        if (n < 2) return null;
        if (n == 2 || n == 3) return new int[]{n};

        int[] primeNumbers = sieveOfEratosthenes(n);
        int[] primeFactors = new int[primeNumbers.length];
        int index = 0;
        for (int primeNumber : primeNumbers) {
            if (primeNumber != 0 && n % primeNumber == 0) {
                int originalNumber = n;
                while (originalNumber % primeNumber == 0) {
                    originalNumber /= primeNumber;
                    primeFactors[index++] = primeNumber;
                    n = originalNumber;
                }
            }
        }
        return Arrays.stream(primeFactors).filter(num -> num != 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPrimeFactor(2)));
        System.out.println(Arrays.toString(findPrimeFactor(6)));
        System.out.println(Arrays.toString(findPrimeFactor(14)));
        System.out.println(Arrays.toString(findPrimeFactor(24)));
        System.out.println(Arrays.toString(findPrimeFactor(1200)));
        System.out.println(Arrays.toString(findPrimeFactor(1)));
        System.out.println(Arrays.toString(findPrimeFactor(-18)));
    }
}
