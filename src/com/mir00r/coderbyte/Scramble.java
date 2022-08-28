package com.mir00r.coderbyte;

import java.util.Scanner;

/**
 * @author mir00r on 26/8/22
 * @project IntelliJ IDEA
 */
public class Scramble {

    public static String stringScramble(String str1, String str2) {
        // code goes here
        int str2len = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.contains(String.valueOf(str2.charAt(i)))) {
                str2len++;
            }
        }
        return str2len == str2.length() ? "true" : "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.print(stringScramble(s1.nextLine(), s2.nextLine()));
    }
}
