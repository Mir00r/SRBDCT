package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsSquareNumber {

    public static int isSquare(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        for (int i = 1; i <= n; i++) {
            if (i * i == n) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }
}
