package com.mir00r.zalando;

import java.util.*;

/**
 * @author mir00r on 22/10/21
 * @project IntelliJ IDEA
 */
public class FindSmallestNumber {

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
        int len = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (i > 0)
                set.add(i);
        }
        for (int i = 1; i <= len; i++) {
            if (!set.contains(i)) return i;
        }
        return len + 1;
    }
}
