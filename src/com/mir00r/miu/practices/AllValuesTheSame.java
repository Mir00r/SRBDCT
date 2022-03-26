package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class AllValuesTheSame {

    public static int allValueSame(int[] arr) {
        if (arr.length == 0) return 0;
        boolean isDifferentValueExist = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                isDifferentValueExist = true;
                break;
            }
        }
        return isDifferentValueExist ? 0 : 1;
    }

    public static void main(String[] args) {
        System.out.println(allValueSame(new int[]{1, 1, 1, 1}));
        System.out.println(allValueSame(new int[]{83, 83, 83}));
        System.out.println(allValueSame(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(allValueSame(new int[]{1, -2343456, 1, -2343456}));
        System.out.println(allValueSame(new int[]{0, 0, 0, 0, -1}));
        System.out.println(allValueSame(new int[]{432123456}));
        System.out.println(allValueSame(new int[]{}));
        System.out.println(allValueSame(new int[]{-432123456}));
        System.out.println(allValueSame(new int[]{}));
    }
}
