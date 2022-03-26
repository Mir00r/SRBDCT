package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsFibonacciNumber {

    public static int isFibonacci(int n) {
        if (n < 0) return 0;
        if (n == 1 || n == 2) return 1;

        int fibonacci;
        int fibo1 = 1;
        int fibo2 = 1;
        for (int i = 3; i < n; i++) {
            fibonacci = fibo1 + fibo2;
            if (fibonacci == n) return 1;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(27));
    }
}
