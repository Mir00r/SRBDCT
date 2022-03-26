package com.mir00r.miu.practices;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class HasNValues {

    public static int hasNValue(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        return set.size() == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(hasNValue(new int[]{1, 2, 2, 1}, 2));
        System.out.println(hasNValue(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(hasNValue(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(hasNValue(new int[]{1, 2, 2, 1}, 3));
        System.out.println(hasNValue(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(hasNValue(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20));
    }
}
