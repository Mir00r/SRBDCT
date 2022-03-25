package com.mir00r.miu;

import java.util.Arrays;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class EncodeArray {

    public static int countDigitFromNumber(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int getDigitSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static int getDivider(int n) {
        int multiply = 1;
        for (int i = 1; i < n; i++) {
            multiply = multiply * 10;
        }
        return multiply;
    }

    public static int[] encode(int n) {
        if (n == 0) return new int[]{1};
        if (n < 0) {
            int absN = Math.abs(n);
            int[] result = new int[absN * 2 + 1];
            int ind = 0;
            result[ind++] = -1;
            for (int i = 0; i < absN; i++) {
                result[ind++] = 0;
            }
            result[ind] = 1;
            return result;
        }
        if (n < 9) {
            int[] result = new int[n * 2];
            int ind = 0;
            for (int i = 0; i < n; i++) {
                result[ind++] = 0;
            }
            result[ind] = 1;
            return result;
        }

        int totalDigit = countDigitFromNumber(n);
        int digitSum = getDigitSum(n);
        int[] ans = new int[totalDigit + digitSum];
        int index = 0;
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) - 48 == 0) ans[index++] = 1;
            else {
                for (int j = 0; j < num.charAt(i) - 48; j++) {
                    ans[index++] = 0;
                }
                ans[index++] = 1;
            }
        }
//        while (n != 0) {
//            int digitCount = countDigitFromNumber(n);
//            int divider = getDivider(digitCount);
//            int digit = n / divider;
//            n %= divider;
//            if (digit == 0) ans[index++] = digit;
//            else {
//                for (int i = 0; i < digit; i++) {
//                    ans[index++] = 1;
//                }
//            }
//        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encode(0)));
        System.out.println(Arrays.toString(encode(1)));
        System.out.println(Arrays.toString(encode(-1)));
        System.out.println(Arrays.toString(encode(100001)));
        System.out.println(Arrays.toString(encode(999)));
    }
}
