package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsCompleteArray {

    public static int isComplete(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        if (arr.length == 0 || arr.length == 1) return 0;

        boolean isEvenExist = false;
        boolean isSquareExist = false;
        boolean isEightExist = false;

        while (i < j) {
            if (arr[i] % 2 == 0 || arr[j] % 2 == 0) {
                isEvenExist = true;
            }
            int squareRootLeft = (int) Math.sqrt(arr[i]);
            int squareRootRight = (int) Math.sqrt(arr[j]);
            if ((arr[i] == squareRootLeft * squareRootLeft) || (arr[j] == squareRootRight * squareRootRight)) {
                isSquareExist = true;
            }
            if (arr[i] + arr[j] == 8) isEightExist = true;
            i++;
            j--;
            if (isEvenExist && isSquareExist && isEightExist) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{36, -28}));
        System.out.println(isComplete(new int[]{36, 28}));
        System.out.println(isComplete(new int[]{4}));
        System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));

        System.out.println();
        System.out.println(isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete(new int[]{5, 7, 9, 13}));
        System.out.println(isComplete(new int[]{2, 2}));
        System.out.println(isComplete(new int[]{2, 6, 3, 4}));
    }
}
