package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class SameNumberOfFactors {

    public static int sameNoOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) return -1;
        int n1FactorCount = 0;
        int n2FactorCount = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) n1FactorCount++;
        }
        for (int i = 1; i <= n2; i++) {
            if (n2 % i == 0) n2FactorCount++;
        }
        return n1FactorCount == n2FactorCount ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(sameNoOfFactors(-6, 21));
        System.out.println(sameNoOfFactors(6, 21));
        System.out.println(sameNoOfFactors(8, 12));
        System.out.println(sameNoOfFactors(23, 97));
        System.out.println(sameNoOfFactors(0, 1));
        System.out.println(sameNoOfFactors(0, 0));
    }
}
