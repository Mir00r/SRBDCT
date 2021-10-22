package com.mir00r.snaphunts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mir00r on 23/7/21
 * @project IntelliJ IDEA
 */


public class Question1 {

    static final int NO_OF_CHARS = 256;
    static char[] count = new char[NO_OF_CHARS];

    /* calculate count of characters
       in the passed string */
    static void getCharCountArray(String str) {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }

    public int firstUniqChar(String s) {
        getCharCountArray(s);
        int index = -1, i;

        for (i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {

            int ret = new Question1().firstUniqChar(line);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
