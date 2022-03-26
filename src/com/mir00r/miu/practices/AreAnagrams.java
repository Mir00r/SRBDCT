package com.mir00r.miu.practices;

import java.util.LinkedHashMap;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class AreAnagrams {

    public static int areAnagram(char[] a1, char[] a2) {
        if (a1.length != a2.length) return 0;
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();
        for (char c : a1) {
            if (!charMap.containsKey(c)) charMap.put(c, 1);
            else charMap.put(c, charMap.get(c) + 1);
        }
        for (char c : a2) {
            if (!charMap.containsKey(c)) charMap.put(c, 1);
            else charMap.put(c, charMap.get(c) + 1);
        }
        for (Character ch : charMap.keySet()) {
            if (charMap.get(ch) != 2) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(areAnagram(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagram(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagram(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagram(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagram(new char[]{}, new char[]{}));
        System.out.println(areAnagram(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
        System.out.println(areAnagram(new char[]{'p', 'o', 'o', 'l'}, new char[]{'p', 'o', 'o', 'l'}));
    }
}
