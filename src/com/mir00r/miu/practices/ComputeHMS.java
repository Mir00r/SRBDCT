package com.mir00r.miu.practices;

import java.util.Arrays;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class ComputeHMS {

    public static int[] computeHMS(int n) {
        int[] hms = new int[3];
        if (n == 0) return hms;
        if (n < 60) {
            hms[2] = n;
        } else if (n < 3600) {
            int miniute = n / 60;
            int second = n - miniute * 60;
            hms[1] = miniute;
            hms[2] = second;
        } else {
            int hour = n / 3600;
            int miniute = (n - 3600) / 60;
            int second = (n - 3600) - miniute * 60;
            hms[0] = hour;
            hms[1] = miniute;
            hms[2] = second;
        }
        return hms;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }
}
