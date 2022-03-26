package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsTriangularNumber {

    public static int isTriangular(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum == n) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isTriangular(1));
        System.out.println(isTriangular(3));
        System.out.println(isTriangular(6));
        System.out.println(isTriangular(10));
        System.out.println(isTriangular(7));
        System.out.println(isTriangular(8));
    }
}
