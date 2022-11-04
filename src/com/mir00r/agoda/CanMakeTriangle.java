package com.mir00r.agoda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mir00r on 4/11/22
 * @project IntelliJ IDEA
 */
public class CanMakeTriangle {

    public static int[] solution(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int c = arr[i + 2];
            if (a + b > c && a + c > b && b + c > a) {
                ans.add(1);
            } else ans.add(0);
        }
        return ans.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{1, 2, 2, 4}));
    }
}
