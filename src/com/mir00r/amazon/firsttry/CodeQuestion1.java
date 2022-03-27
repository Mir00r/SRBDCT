package com.mir00r.amazon.firsttry;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author mir00r on 29/10/21
 * @project IntelliJ IDEA
 */
public class CodeQuestion1 {

    public static int minMoves(List<Integer> arr) {
        int swaps = 0;
        int numberNeedToPlacedZeros = 0;

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == 0) numberNeedToPlacedZeros += 1;
            else swaps += numberNeedToPlacedZeros;
        }
        return swaps;
    }

    public static int countSwaps(List<Integer> arr) {
        int swaps = 0, numberNeedToPlacedOne = 0;
        for (int i = 0; i < arr.size(); ++i)
            if (arr.get(i) == 1) {
                swaps += i - numberNeedToPlacedOne;
                ++numberNeedToPlacedOne;
            }
        return swaps;
    }

    public static int minMoves1(List<Integer> arr) {
        // int swaps = 0;
        // int numberNeedToPlacedZeros = 0;

        // for(int i = arr.size() - 1; i >= 0; i--) {
        //     if(arr.get(i) == 0) numberNeedToPlacedZeros += 1;
        //     else swaps += numberNeedToPlacedZeros;
        // }

        // int swaps = 0, numberNeedToPlacedOne = 0;
        // for (int i = 0; i < arr.size(); ++i)
        //     if (arr.get(i) == 1) {
        //         swaps += i - numberNeedToPlacedOne;
        //         ++numberNeedToPlacedOne;
        //     }

        int swaps = 0;
        int moveToZeros = 0;
        int indexZero = 0;
        int indexOne = 0;
        int moveToOnes = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) moveToZeros += i - indexZero++;
            else moveToOnes += i - indexOne++;
        }

        return Math.min(moveToZeros, moveToOnes);
    }


    public static List<String> recentItems(List<String> logs) {

        List<String> recentViews = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (String it : logs) {
            if (recentViews.contains(it)) {
                recentViews.remove(it);
            }
            recentViews.add(it);
        }

        for (int i = 0; i < logs.size(); i++) {
            if (recentViews.contains(logs.get(i))) {
                int newIndex = (i + (logs.size() - logs.indexOf(logs.get(i)))) % logs.size();
                recentViews.add(newIndex, logs.get(i));
            } else
                recentViews.add(logs.get(i));
        }

        for (int i = recentViews.size() - 1; i > 0; i--) {
            result.add(recentViews.get(i));
        }
        return recentViews;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> logs = IntStream.range(0, logsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

        List<String> result = recentItems(logs);

        bufferedWriter.write(
                String.join("\n", result)
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
