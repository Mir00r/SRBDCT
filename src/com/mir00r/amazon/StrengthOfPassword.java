package com.mir00r.amazon;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mir00r on 29/5/22
 * @project IntelliJ IDEA
 */
public class StrengthOfPassword {

    public static void possibleSubString(String password) {
        for (int i = 0; i < password.length(); i++) {
            for (int j = i + 2; j <= password.length(); j++) {
                String str = password.substring(i, j);
                System.out.println(str);
            }
        }
    }

    public static long findPasswordStrength(String password) {
        return 0;
    }

    public static void main(String[] args) {
        possibleSubString("good");
    }
}
