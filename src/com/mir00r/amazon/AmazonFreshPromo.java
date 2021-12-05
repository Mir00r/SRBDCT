package com.mir00r.amazon;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author mir00r on 29/10/21
 * @project IntelliJ IDEA
 */
public class AmazonFreshPromo {

    public static String ANYTHING = "anything";

    public static int foo(List<List<String>> codes, List<String> shoppingCart) {
        int listIndex = 0;
        int listItemIndex = 0;
        boolean currListMatches = false;
        List<String> currList = codes.get(listIndex++);
        for (String item : shoppingCart) {
            String code = currList.get(listItemIndex);
            if (currListMatches && !itemsMatch(code, item)) {
                listItemIndex = 0; //reset to current code list starting position
            } else if (itemsMatch(code, item)) {
                currListMatches = true;
                listItemIndex++;
                if (listItemIndex == currList.size()) {
                    if (listIndex == codes.size()) {
                        return 1; //all the codes matched
                    }
                    currList = codes.get(listIndex++); //move on to next code list
                    currListMatches = false;
                    listItemIndex = 0;
                }
            }
        }
        return 0;
    }

    public static boolean itemsMatch(String code, String item) {
        if (ANYTHING.equals(code)) return true;
        else return item.equals(code);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int codeListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> codeList = IntStream.range(0, codeListCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

        int shoppingCartCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> shoppingCart = IntStream.range(0, shoppingCartCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

//        int result = foo(codeList, shoppingCart);

//        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
