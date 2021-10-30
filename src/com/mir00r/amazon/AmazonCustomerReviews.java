package com.mir00r.amazon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author mir00r on 29/10/21
 * @project IntelliJ IDEA
 */
public class AmazonCustomerReviews {

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {

//        if (customerQuery.length() == 1) return result;
//        customerQuery = customerQuery.toLowerCase();
//        StringBuilder strb = new StringBuilder().append(customerQuery.charAt(0)).append(customerQuery.charAt(1));
//
//        repository = repository.stream().sorted().collect(Collectors.toList());
//        result.add(getSuggestedProductSortedList(repository, strb));
//
//        for (int i = 2; i < customerQuery.length(); i++) {
//            strb.append(customerQuery.charAt(i));
//            result.add(getSuggestedProductSortedList(repository, strb));
//        }

        List<List<String>> suggestions = new ArrayList<>();
        repository = repository.stream().sorted().collect(Collectors.toList());

//        for (int i = 2; i <= customerQuery.length(); i++) {
//            String subStr = customerQuery.substring(0, i).toLowerCase();
//            List<String> matches = repository.stream().filter(review -> review.startsWith(subStr)).sorted().limit(3).collect(Collectors.toList());
//            suggestions.add(matches);
//        }

        for (int i = 1; i < customerQuery.length(); i++) {
            String s = customerQuery.substring(0, i + 1).toLowerCase();
            List<String> keywordsList = repository.stream()
                    .map(String::toLowerCase)
                    .filter(word -> word.startsWith(s))
                    .sorted()
                    .limit(3)
                    .collect(Collectors.toList());
            suggestions.add(keywordsList);
        }
        return suggestions;
    }

    public static List<String> getSuggestedProductSortedList(List<String> repository, StringBuilder strb) {

        List<String> singleResult = new ArrayList<>();
        String searchProduct = strb.toString();
        for (String p : repository) {
            if (p.startsWith(searchProduct)) {
                singleResult.add(p.toLowerCase());
                if (singleResult.size() == 3) break;
            }
        }
        singleResult = singleResult.stream().sorted().collect(Collectors.toList());
        return singleResult;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int repositoryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> repository = IntStream.range(0, repositoryCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

        String customerQuery = bufferedReader.readLine();

        List<List<String>> result = searchSuggestions(repository, customerQuery);

        result.stream()
                .map(
                        r -> String.join(" ", r)
                )
                .map(r -> r + "\n")
                .collect(Collectors.toList())
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
