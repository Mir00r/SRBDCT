package com.mir00r.miu;

import com.mir00r.Utils;

/**
 * @author mir00r on 23/3/22
 * @project IntelliJ IDEA
 */
public class TestQuestions {

    public static int oddNumberInMiddleElement(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length % 2 == 0) return 0;
        else {
            int middleIndex = arr.length / 2;
            for (int i = 0; i < arr.length; i++) {
                if (i != middleIndex && arr[middleIndex] >= arr[i]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int oddEvenSum(int[] arr) {
        int oddSum = 0;
        int evenSum = 0;
        for (int j : arr) {
            if (j % 2 == 0) evenSum += j;
            else oddSum += j;
        }
        return oddSum - evenSum;
    }

    public static char[] lengthCharacters(char[] a, int start, int len) {
        char[] ans = new char[start + len];
        if (a.length <= (start + len) - 1 || len < 0 || start < 0) return null;
        else {
            System.arraycopy(a, 0, ans, 0, a.length);
        }
        return ans;
    }

    public static int reverseNumber(int num) {
        int originalNumber = num;
        int reverseNumber = 0;
        while (num != 0) {
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num /= 10;
        }
        return reverseNumber;
    }

    public static int[] findCommonNumbers(int[] first, int[] second) {
        if (first == null || second == null || first.length == 0 || second.length == 0) return null;
        int[] tempArr = new int[Utils.getMax(first.length, second.length)];
        int index = 0;
        for (int k : first) {
            for (int i : second) {
                if (k == i) {
                    tempArr[index++] = k;
                    break;
                }
            }
        }
        int[] ans = new int[index];
        System.arraycopy(tempArr, 0, ans, 0, index);
        return ans;
    }

    public static int findPOE(int[] arr) {
        int ans = 1;
        if (arr == null || arr.length < 3) return -1;
        int left = 0;
        int right = arr.length - 1;
        int leftSum = arr[left];
        int rightSum = arr[right];

        for (int i = 1; i < arr.length - 2; i++) {
            if (leftSum < rightSum) {
                left++;
                leftSum += arr[left];
                ans = left + 1;
            } else {
                right--;
                rightSum += arr[right];
                ans = right - 1;
            }
        }
        if (leftSum == rightSum) return ans;
        else return -1;
    }


    public static void main(String[] args) {
        // problem link -> https://compro.miu.edu/sample-test/

//        System.out.println(oddNumberInMiddleElement(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(oddNumberInMiddleElement(new int[]{3, 2, 1, 4, 5}));
//        System.out.println(oddNumberInMiddleElement(new int[]{3, 2, 1, 4, 1}));
//        System.out.println(oddNumberInMiddleElement(new int[]{1, 2, 3, 4}));
//        System.out.println(oddNumberInMiddleElement(new int[0]));
//        System.out.println(oddNumberInMiddleElement(new int[]{10}));

//        System.out.println(oddEvenSum(new int[]{1}));
//        System.out.println(oddEvenSum(new int[]{1, 2}));
//        System.out.println(oddEvenSum(new int[]{1, 2, 3}));
//        System.out.println(oddEvenSum(new int[]{1, 2, 3, 4}));
//        System.out.println(oddEvenSum(new int[]{3, 3, 4, 4}));
//        System.out.println(oddEvenSum(new int[]{3, 2, 3, 4}));
//        System.out.println(oddEvenSum(new int[]{4, 1, 2, 3}));
//        System.out.println(oddEvenSum(new int[]{1, 1}));
//        System.out.println(oddEvenSum(new int[0]));

//        char[] arr = { 'p', 'q', 'r', 's' };
//        System.out.println(Objects.requireNonNull(lengthCharacters(arr, 0, 4)));
//        System.out.println(Objects.requireNonNull(lengthCharacters(arr, 0, 3)));

//        System.out.println(reverseNumber(1234));
//        System.out.println(reverseNumber(12005));
//        System.out.println(reverseNumber(1));
//        System.out.println(reverseNumber(1000));
//        System.out.println(reverseNumber(0));
//        System.out.println(reverseNumber(-12345));

//        System.out.println(Arrays.toString(findCommonNumbers(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1})));
//        System.out.println(Arrays.toString(findCommonNumbers(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1})));
//        System.out.println(Arrays.toString(findCommonNumbers(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3})));
//        System.out.println(Arrays.toString(findCommonNumbers(new int[]{1, 2}, new int[]{3, 4})));
//        System.out.println(Arrays.toString(findCommonNumbers(new int[]{1, 2}, null)));

        System.out.println(findPOE(new int[]{1, 8, 3, 7, 10, 2}));
        System.out.println(findPOE(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        System.out.println(findPOE(new int[]{2, 1, 1, 1, 2, 1, 7}));
        System.out.println(findPOE(new int[]{1, 2, 3}));
        System.out.println(findPOE(new int[]{3, 4, 5, 10}));
        System.out.println(findPOE(new int[]{1, 2, 10, 3, 4}));
    }
}
