package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class MercurialNumber {

    public static int isMercurial(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 1;
        boolean oneStart = false;
        boolean oneEnd = false;
        int oneStartIndex = 0;
        int oneEndIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (!oneStart) {
                    oneStartIndex = i;
                    oneStart = true;
                    continue;
                }
                oneEndIndex = i;
                oneEnd = true;
            }
        }
        if (oneEnd) {
            for (int i = oneStartIndex; i <= oneEndIndex; i++) {
                if (arr[i] == 3) return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isMercurial(new int[]{1}));
        System.out.println(isMercurial(new int[]{}));
    }
}
