package com.mir00r.miu;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class IsDigitIncreasing {

    public static int isDigitIncreasing(int n) {

        for (int i = 1; i < 10; i++) {
            int digitSum = 0;
            int digitMultiply = 0;
            while (digitSum < n) {
                digitMultiply = digitMultiply * 10 + i;
                digitSum += digitMultiply;
            }
            if (digitSum == n) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }
}
