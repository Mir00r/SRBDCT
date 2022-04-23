package com.mir00r.zalando;

import java.util.Scanner;

/**
 * @author mir00r on 22/10/21
 * @project IntelliJ IDEA
 */
public class FindSignNumber {

    public static int inputAndSolve() {
        Scanner input = new Scanner(System.in);
        String[] tc = input.nextLine().split(" ");
        int n = Integer.parseInt(tc[0]);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int ans = solution(arr);
        System.out.println(ans);
        return ans;
    }

    public static int solution(int[] arr) {
        int multiply = 1;
        for (int j : arr) {
            multiply *= j;
        }
        return Integer.compare(multiply, 0);
    }
}
