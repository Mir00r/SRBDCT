package com.mir00r.kettis;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author mir00r on 21/5/21
 * @project IntelliJ IDEA
 */
public class ProblemC {

    public static int MOD = 10000000;

    public static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return (n * fact(n - 1));
    }

    // Returns Factorial of N
    public static BigInteger factorial(int N) {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
//            f = f.multiply(BigInteger.valueOf(i));
            f = f.multiply(new BigInteger(Integer.toString(i, 10)));
        return f;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        String reverseFact = factorial(n).toString();
        StringBuilder fact = new StringBuilder();
        for (int i = reverseFact.length() - 1; i >= 0; i--) {
            if (reverseFact.charAt(i) != '0') {
                fact.append(reverseFact.charAt(i));
            }
            if (fact.toString().length() == 3) break;
        }

        System.out.println(fact.reverse().toString());
//        System.out.println(factorial(n));
    }
}
