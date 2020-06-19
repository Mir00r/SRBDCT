package com.mir00r;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author mir00r on 2/5/20
 * @project IntelliJ IDEA
 */
public class Practice {
    public void calculate() {
        Scanner input = new Scanner(System.in);
        int tc, x, y, n, m, k, sum = 0, index = 0, count = 0;
        n = input.nextInt();
//        m = input.nextInt();
//        k = input.nextInt();
//        int[] nums = new int[n];
//        int[] nums1 = new int[n];
//        int[] result = new int[n];
//        int[] row = new int[n];
        //int[] col = new int[m];
//        int[][] points = new int[n][n];
//        int[][] matrix = new int[n][m];
//        int[][] indices = new int[n][m];

//        this.inputArray(n, nums, input);
//        this.printArray(result.length, result);

//        this.inputMatrix(n, m, matrix, input);
//        int r = matrix.length;
//        int c = matrix[0].length;
//        System.out.println("R -> " + r + " " + "C -> " + c);

//        String str = input.nextLine();
//        String str2 = input.nextLine();
//        StringBuilder ans = new StringBuilder();

//        String[] str1 = {"bbb", "cc"};
//        String[] str2 = {"a", "aa", "aaa", "aaaa"};
        System.out.println(this.rotatedDigits(n));
    }

    public int rotatedDigits(int N) {
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += this.digitCount(i);
        }
        return ans;
    }

    private int digitCount(int n) {
        boolean have2569 = false;
        boolean have347 = false;

        while (n != 0) {
            int mod = n % 10;
            n /= 10;
            if (mod == 2 || mod == 5 || mod == 6 || mod == 9) {
                have2569 = true;
            }
            if (mod == 3 || mod == 4 || mod == 7) {
                have347 = true;
            }
        }
        if (!have347 && have2569) return 1;
        return 0;
    }

}

