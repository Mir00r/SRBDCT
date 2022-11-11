package com.mir00r.reviewsolicitors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mir00r on 9/11/22
 * @project IntelliJ IDEA
 */
public class MergeNames {
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(names1));
        result.addAll(Arrays.asList(names2));
        return result.toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
