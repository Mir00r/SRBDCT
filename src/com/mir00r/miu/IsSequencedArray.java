package com.mir00r.miu;

/**
 * @author mir00r on 24/3/22
 * @project IntelliJ IDEA
 */
public class IsSequencedArray {

    public static int isSequencedArray(int[] arr, int m, int n) {
        if (m != arr[0] || n != arr[arr.length - 1]) return 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) return 0;
            if ((arr[i - 1] + 1 == arr[i]) || (arr[i - 1] == arr[i])) continue;
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5));
    }
}
