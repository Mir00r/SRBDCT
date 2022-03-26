package com.mir00r.miu.practices;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class DecodeArray {

    public static int decode(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr[0] < 0) return arr[0];

        int zeroCount = 0;
        int digitMultiply = 0;
        for (int j : arr) {
            if (j == 0) zeroCount++;
            else {
                digitMultiply = digitMultiply * 10 + zeroCount;
                zeroCount = 0;
            }
        }
        return digitMultiply;
     }

    public static void main(String[] args) {
        System.out.println(decode(new int[]{1}));
        System.out.println(decode(new int[]{0, 1}));
        System.out.println(decode(new int[]{-1, 0, 1}));
        System.out.println(decode(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decode(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
    }
}
