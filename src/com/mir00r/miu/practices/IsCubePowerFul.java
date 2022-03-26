package com.mir00r.miu.practices;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class IsCubePowerFul {
    public static int isCubePowerFul(int n) {
        if (n <= 0) return 0;
        int originalNumber = n;
        int cubeSum = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            cubeSum += Math.pow(digit, 3);
            originalNumber /= 10;
        }
        return cubeSum == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isCubePowerFul(153));
        System.out.println(isCubePowerFul(370));
        System.out.println(isCubePowerFul(371));
        System.out.println(isCubePowerFul(407));
        System.out.println(isCubePowerFul(87));
        System.out.println(isCubePowerFul(0));
        System.out.println(isCubePowerFul(-81));
    }
}
