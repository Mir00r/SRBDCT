package com.mir00r.coderbyte;

import java.util.Scanner;

/**
 * @author mir00r on 26/8/22
 * @project IntelliJ IDEA
 */
public class LongestWord {

    public static String ALPHA_NUMERIC_REGEX = "^[a-zA-Z0-9]*$";

    public static boolean isAlphaNumeric(String s) {
        return s != null && s.matches(ALPHA_NUMERIC_REGEX);
    }

    public static String longestWord(String sen) {
        String data = sen;
        int maxLen = 0;
        for (String s : data.split(" ")) {
            if (isAlphaNumeric(s) && s.length() > maxLen) {
                maxLen = s.length();
                sen = s;
            }
        }
        return sen;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(longestWord(s.nextLine()));
    }
}
