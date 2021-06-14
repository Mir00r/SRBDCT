package com.mir00r.kettis;

import java.io.*;
import java.util.*;

/**
 * @author mir00r on 21/5/21
 * @project IntelliJ IDEA
 */
public class ProblemB {

    // Prints sums of all subsets of array
    public static List<Integer> subsetSums(int[] arr, int n) {

        // There are totoal 2^n subsets
        int total = 1 << n;
        List<Integer> sumList = new ArrayList<>();

        // Consider all numbers from 0 to 2^n - 1
        for (int i = 0; i < total; i++) {
            int sum = 0;

            // Consider binary reprsentation of
            // current i to decide which elements
            // to pick.
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) != 0) {
                    sum += arr[j];
                    sumList.add(sum);
                }

            // Print sum of picked elements.
//            System.out.print(sum + " ");
        }
        return sumList;
    }

//    public static List<Integer> sumList = new ArrayList<>();
//    public static void getSum(int[] numbersArray, int starting, int sum) {
//
//        if (numbersArray.length == starting) {
//            // Now we print sum here
////            System.out.println(sum);
//            sumList.add(sum);
//            return;
//        }
//
//        int value = sum + numbersArray[starting];
//
//        getSum(numbersArray, starting + 1, value);
//        getSum(numbersArray, starting + 1, sum);
//    }

    public static Set getSum(int[] numbersArray, int starting) {
        if (numbersArray.length == starting) {
            return new HashSet();
        }

        Set recursiveSet = getSum(numbersArray, starting + 1);
        Set newSet = new HashSet();
        int value = numbersArray[starting];

        for (Object object : recursiveSet) {
            int element = (Integer) object;

            newSet.add(element);
            newSet.add(element + value);
        }

        newSet.add(value);

        return newSet;
    }

    public static List<Integer> getSumsComb(int sum, int offset, int[] array) {
        Set<Integer> sumSet = new HashSet<>();

        for (int i = offset; i < array.length; ++i) {
            int total = sum + array[i];
            sumSet.add(total);
            sumSet.addAll(getSumsComb(total, i + 1, array));
//            sums.add(total);
//            sums.addAll(getSumsComb(total, i + 1, array));
        }
        return new ArrayList<>(sumSet);
    }

    public static void getAllSums(int array[], int startingValue, int pos) {
        for (int i = pos; i < array.length; i++) {
            int currentValue = startingValue + array[i];
//            System.out.println(currentValue);
//            sumList.add(currentValue);
            getAllSums(array, currentValue, i + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] c = br.readLine().split(" ");
            int to = Integer.parseInt(c[0]);
            if (to == 0) {
                break;
            }
            int totalWeight = 0;
            int[] weight = new int[c.length - 1];
            int index = 0;
            for (int i = 1; i < c.length; i++) {
                int num = Integer.parseInt(c[i]);
                weight[index++] = num;
                totalWeight += num;
            }
            double divisor = 2.0;
            int kattisBagWeight;
            int properWeightBalance = (int) Math.ceil(totalWeight / divisor);
            List<Integer> allPossibleSums = getSumsComb(0, 0, weight);

            while (true) {
                // Checking if all possible sums of weights contains proper weight value
                boolean isPerfectWeightBalance = allPossibleSums.contains(properWeightBalance);
                if (isPerfectWeightBalance) {
                    kattisBagWeight = properWeightBalance;
                    break;
                }
                // if not then increasing proper weight value and moving to next iteration
                properWeightBalance++;
            }
            int kittensBagWeight = totalWeight - kattisBagWeight;

            System.out.println(kattisBagWeight + " " + kittensBagWeight);
        }
    }
}
