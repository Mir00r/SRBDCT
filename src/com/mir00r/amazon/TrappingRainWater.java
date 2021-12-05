package com.mir00r.amazon;

import com.mir00r.Utils;

import java.util.*;

/**
 * @author mir00r on 5/11/21
 * @project IntelliJ IDEA
 */
public class TrappingRainWater {

    public static void inputAndSolve() {
        int[] data = takeInput();
        int len = data.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int water = 0;

        left[0] = data[0];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(left[i - 1], data[i]);
        }
        System.out.println("Left Array: ");
        Utils.printArray(left);

        right[len - 1] = data[len - 1];
        for (int j = len - 2; j >= 0; j--) {
            right[j] = Math.max(right[j + 1], data[j]);
        }
        System.out.println("Right Array: ");
        Utils.printArray(right);

        for (int k = 0; k < len; k++) {
            water += Math.min(left[k], right[k]) - data[k];
        }
        System.out.println(water);
    }

    public static int[] takeInput() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }
        return data;
    }
}
