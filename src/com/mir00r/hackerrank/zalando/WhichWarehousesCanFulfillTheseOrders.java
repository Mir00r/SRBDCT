package com.mir00r.hackerrank.zalando;

import java.util.*;

/**
 * @author mir00r on 15/10/21
 * @project IntelliJ IDEA
 */
public class WhichWarehousesCanFulfillTheseOrders {

    public static void takeInputAndSolve() {
        Scanner input = new Scanner(System.in);

        String[] data = input.nextLine().split(" ");
        int w = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int p = Integer.parseInt(data[2]);

        List<Integer> minWearHouseNeeded = new ArrayList<>();
        Map<Integer, Integer> itemsTypesMap = new LinkedHashMap<>();
        for (int i = 0; i < w; i++) {
            String[] pData = input.nextLine().split(" ");
            itemsTypesMap.put(Integer.parseInt(pData[0]), Integer.parseInt(pData[1]));
        }
        for (int i = 0; i < b; i++) {
            String[] bData = input.nextLine().split(" ");
            int order = Integer.parseInt(bData[0]);
            int type = Integer.parseInt(bData[1]);

            int[] items = getArray(order);
            int[] types = getArray(type);
            if (items.length > p) {
                minWearHouseNeeded.add(-1);
            } else {
                int wh = 0;
                for (int i1 = 0; i1 < items.length; i1++) {
                    int mapValue = itemsTypesMap.get(i1);
                    for (int k : types) {
                        if (mapValue == k) wh++;
                    }
                }
                minWearHouseNeeded.add(wh);
            }
        }
        for (Integer wh : minWearHouseNeeded) {
            System.out.println(wh);
        }
        input.close();
    }

    public static int[] getArray(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            res[i] = i;
        }
        return res;
    }
}
