package com.mir00r.miu;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class PrimeHappy {
    public static int[] sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p]) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
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

    public static int primeHappy(int n) {
        if (n == 2) return 0;
        int[] primeNumbers = sieveOfEratosthenes(n);
        int primeSum = 0;
        for (int primeNumber : primeNumbers) {
            primeSum += primeNumber;
        }
        return primeSum % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(primeHappy(5));
        System.out.println(primeHappy(25));
        System.out.println(primeHappy(32));
        System.out.println(primeHappy(8));
        System.out.println(primeHappy(2));
    }
}
