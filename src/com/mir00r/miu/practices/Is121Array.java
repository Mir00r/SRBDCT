package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class Is121Array {

    public static int is121Array(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        if (arr[i] > 1 || arr[j] > 1) return 0;

        int start1sCount = 0;
        int end1sCount = 0;
        boolean isTwoExistBetween1s = false;

        while (i < j) {
            if (arr[i] == 1) {
                start1sCount++;
            }
            if (arr[j] == 1) {
                end1sCount++;
            }
            i++;
            j--;
            if (start1sCount > 0 && arr[i] == 2) isTwoExistBetween1s = true;
        }
        return start1sCount == end1sCount && isTwoExistBetween1s ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1} ));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1} ));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3} ));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1} ));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1} ));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }
}
