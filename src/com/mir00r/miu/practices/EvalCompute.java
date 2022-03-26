package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class EvalCompute {

    public static double eval(double x, int[] arr) {
        double total = 0.0;
        if (arr.length == 1) return arr[0];
        else if (arr.length == 2) {
            total += (arr[1] * x + arr[0]);
        } else if (arr.length == 3) {
            total += (arr[2] * (x * x) + arr[1] * x + arr[0]);
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                total += (i * Math.pow(x, i));
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(eval(1.0, new int[]{0, 1, 2, 3, 4}));
        System.out.println(eval(3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, -2, -1}));
        System.out.println(eval(-3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, 2}));
        System.out.println(eval(2.0, new int[]{4, 0, 9}));
        System.out.println(eval(2.0, new int[]{10}));
        System.out.println(eval(10.0, new int[]{0, 1}));
    }
}
