package com.mir00r.miu.practices;

import java.util.Arrays;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class MileageCounter {

    public static int[] counter(int[] arr, int mileage) {
        for (int i = 0; i < arr.length; i++) {
            int add = arr[i] + mileage;
            if (add >= 10) {
                int remaining = add % 10;
                arr[i] = remaining;
                add /= 10;
                mileage = add;
                continue;
            }
            arr[i] += mileage;
            return arr;
        }
        return arr;
    }

    static void updateMileageCounter(int[] a, int miles) {
        for (int i = 0; i < a.length && miles > 0; i++) {
            miles = a[i] + miles;
            if (miles > 9) {
                int tempMiles = miles % 10;
                miles /= 10;
                a[i] = tempMiles;
            } else {
                a[i] = miles;
                miles = 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(counter(new int[]{8, 9, 9, 5, 0}, 1)));
        System.out.println(Arrays.toString(counter(new int[]{8, 9, 9, 5, 0}, 2)));
        System.out.println(Arrays.toString(counter(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1)));
        System.out.println(Arrays.toString(counter(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 13)));
    }
}
