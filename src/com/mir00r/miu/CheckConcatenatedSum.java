package com.mir00r.miu;

/**
 * @author mir00r on 24/3/22
 * @project IntelliJ IDEA
 */
public class CheckConcatenatedSum {

    public static int checkConcatenatedSum(int num, int catLen) {
        int originalNumber = num;
        int concatSum = 0;
        while (num != 0) {
            int digit = num % 10;
            int digitMultiply = 0;
            for (int i = 0; i < catLen; i++) {
                digitMultiply = digitMultiply * 10 + digit;
            }
            concatSum += digitMultiply;
            num /= 10;
        }
        if (originalNumber == concatSum) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }
}
