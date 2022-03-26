package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class HollowArrays {

    public static String isHollow(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        if (arr.length < 3) return "no";

        int zeroInBetween = 0;
        while (i <= j) {
            if ( (arr[i] == 0 && arr[j] != 0) || (arr[i] != 0 && arr[j] == 0)) return "no";
            if (i == j && arr[i] == 0) zeroInBetween++;
            else {
                if (arr[i] == 0) zeroInBetween++;
                if (arr[j] == 0) zeroInBetween++;
            }
            i++;
            j--;
        }
        return zeroInBetween >= 3 ? "yes" : "no";
    }

    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));

        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
        System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{0, 0, 0}));
        System.out.println(isHollow(new int[]{2, 6, 3, 4}));
    }
}
