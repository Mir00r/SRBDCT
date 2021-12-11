package com.mir00r;

import java.util.*;

/**
 * @author mir00r on 11/12/21
 * @project IntelliJ IDEA
 */
public class MostOccurNumber {

    public static int[] solution(int[] a) {
        Map<Integer, Integer> occurMap = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            occurMap.put(i, 0);
        }

        for (int k : a) {
            int num = k;
            if (num % 10 == num) {
                occurMap.put(num, occurMap.get(num) + 1);
            } else {
                while (num > 0) {
                    int maxNumber = num % 10;
                    int maxCount = 0;
                    for (int i = 0; i <= 9; i++) {
                        if (maxNumber == i) {
                            maxCount++;
                        }
                    }
                    occurMap.put(maxNumber, occurMap.get(maxNumber) + maxCount);
                    num /= 10;
                }
            }
        }
        System.out.println(occurMap);
        List<Integer> result = new ArrayList<>();
        int maxValueInMap = (Collections.max(occurMap.values()));  // This will return max value in the HashMap
//        System.out.println("Max value:" + maxValueInMap);
        for (Map.Entry<Integer, Integer> entry : occurMap.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() == maxValueInMap) {
//                System.out.println(entry.getKey());     // Print the key with max value
                result.add(entry.getKey());
            }
        }

//        Map<Integer, Integer> resultMap = occurMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//        System.out.println(resultMap);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {25, 2, 3, 57, 38, 41};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
