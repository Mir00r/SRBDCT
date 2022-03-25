package com.mir00r.miu;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class ClosestFibonacciNumber {

    public static int closestFibonacci(int n) {
        if (n < 1) return 0;
        if (n == 1 || n == 2) return 1;

        int fibonacci;
        int fibo1 = 1;
        int fibo2 = 1;
        for (int i = 3; i <= n; i++) {
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            if (fibonacci > n) return fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }
}
