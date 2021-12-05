package com.mir00r;

import java.util.ArrayList;

/**
 * @author mir00r on 5/12/21
 * @project IntelliJ IDEA
 */
public class BaseNegative2 {

    public static int[] convertToNegativeBase2(int dec) {
        double n = dec;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n != 0) {
            arr.add((int) Math.abs(n % -2));
            n = Math.ceil(n / -2);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

//    public static int[] convertToNegativeBase2(int dec) {
//        double n = dec;
//        int[] arr = new int[len + 1];
//        int index = 0;
//        while (n != 0) {
//            arr[index++] = (int) Math.abs(n % -2);
//            n = Math.ceil(n / -2);
//        }
//        return arr;
//    }

    public static int convertToDecimal(String negBase2) {
        int dec = 0;
        for (int i = 0; i < negBase2.length(); i++) {
            dec += Integer.parseInt(String.valueOf(negBase2.charAt(i))) * Math.pow(-2, i);
        }
        return dec;
    }

    public static int convertToDecimal(int[] negBase2) {
        int dec = 0;
        for (int i = 0; i < negBase2.length; i++) {
            dec += negBase2[i] * Math.pow(-2, i);
        }
        System.out.println(dec);
        return dec;
    }

    public static void main(String[] args) {

    }
}
