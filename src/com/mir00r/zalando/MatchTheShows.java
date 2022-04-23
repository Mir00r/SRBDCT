package com.mir00r.zalando;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author mir00r on 11/10/21
 * @project IntelliJ IDEA
 */
public class MatchTheShows {

    // count number of frequency of array element

    //    Time Complexity : O(n2)
//    Auxiliary Space : O(n)
    public static Map<Integer, Integer> countFrequency1(int[] arr) {
        int len = arr.length;
        Map<Integer, Integer> ans = new LinkedHashMap<>();
        boolean[] visited = new boolean[len];
        Arrays.fill(visited, false);

        for (int i = 0; i < len; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            ans.put(arr[i], count);
        }
        return ans;
    }

//    Time Complexity : O(n)
//    Auxiliary Space : O(n)

    public static Map<Integer, Integer> countFrequency2(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int j : arr) {
            if (mp.containsKey(j)) {
                mp.put(j, mp.get(j) + 1);
            } else {
                mp.put(j, 1);
            }
        }
        // Traverse through map and print frequencies
//        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        return mp;
    }

    public static int[] solve(int[] arr, int k) {
        int[] ans = new int[k];
        int index = 0;
        Map<Integer, Integer> frequencyMap = countFrequency2(arr);
        Map<Integer, Integer> sortedMap = frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if (k != index)
                ans[index++] = entry.getKey();
        }
        return ans;
    }
}
