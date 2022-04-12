package com.mir00r.miu.practices;

/**
 * @author mir00r on 12/4/22
 * @project IntelliJ IDEA
 */
public class RotateArrays {

    public static void leftRotate(int[] arr, int rotateTimes) {
        int len = arr.length;
        int mod = rotateTimes % len;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[(i + mod) % len] + " ");
        }
    }

    public static void rightRotate(int[] arr, int rotateTimes) {
        int len = arr.length;
        int mod = rotateTimes % len;
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(arr[(i + mod) % len] + " ");
        }
    }

    public static void main(String[] args) {
        leftRotate(new int[]{1, 2, 10, 3, 15, 1, 2, 2}, 2);
        System.out.println();
        rightRotate(new int[]{1, 2, 10, 3, 15, 1, 2, 2}, 2);
    }
}
