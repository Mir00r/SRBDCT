package com.mir00r.zalando;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author mir00r on 23/4/22
 * @project IntelliJ IDEA
 */
public class MaximumEmployeeAttendTheMeeting {
    public static int solution(String[] E) {
        LinkedHashMap<Integer, Integer> dayMap = new LinkedHashMap<>();
        for (String d : E) {
            for (int i = 0; i < d.length(); i++) {
                if (dayMap.containsKey(d.charAt(i) - 48))
                    dayMap.put(d.charAt(i) - 48, dayMap.get(d.charAt(i) - 48) + 1);
                else dayMap.put(d.charAt(i) - 48, 1);
            }
        }
        Map<Integer, Integer> sortedMap = dayMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int count = 0;
        int dayOne = 0;
        int dayTwo = 0;
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if (count == 0) dayOne = entry.getKey();
            if (count == 1) dayTwo = entry.getKey();
            if (count == 2) break;
            count++;
        }

        int ans = 0;
        for (String d : E) {
            for (int i = 0; i < d.length(); i++) {
                if (d.charAt(i) - 48 == dayOne || d.charAt(i) - 48 == dayTwo) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"039", "4", "14", "32", "34", "7"}));
    }
}
