package com.mir00r.miu;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class IsZeroPlantFul {

    public static int isZeroPlantiFul(int[] arr) {
        if (arr.length == 0) return 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
                int k;
                for (k = i + 1; k < arr.length; k++) {
                    if (arr[k] != 0) {
                        if (zeroCount < 4) return 0;
                    } else zeroCount++;
                }
                i = k;
            }
        }
        return zeroCount == 0 ? 0 : zeroCount / 4;
    }

    public static void main(String[] args) {
        System.out.println(isZeroPlantiFul(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroPlantiFul(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isZeroPlantiFul(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroPlantiFul(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlantiFul(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isZeroPlantiFul(new int[]{0}));
        System.out.println(isZeroPlantiFul(new int[]{}));
    }
}
