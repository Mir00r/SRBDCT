package com.mir00r.coderbyte;

import java.util.Scanner;

/**
 * @author mir00r on 26/8/22
 * @project IntelliJ IDEA
 */
public class Palindrome {

    public static String palindrome(String str) {
        // code goes here
        String reversed = new StringBuilder(str).reverse().toString().replaceAll("\\s", "");
        System.out.println(reversed);
        return str.replaceAll("\\s", "").equals(reversed) ? "true" : "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(palindrome(s.nextLine()));
    }
}
