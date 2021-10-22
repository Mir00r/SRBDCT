package com.mir00r.hackerrank.zalando;

import java.util.*;

/**
 * @author mir00r on 15/10/21
 * @project IntelliJ IDEA
 */
public class TheInquiringManager {

    public static void takeInputAndSolve() {
        Scanner input = new Scanner(System.in);
        int n;

        String[] tc = input.nextLine().split(" ");
        n = Integer.parseInt(tc[0]);
        Map<Integer, Integer> pMap = new LinkedHashMap<>();
        List<Integer> prices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int opt, pp, pt;
            String[] nk = input.nextLine().split(" ");

            opt = Integer.parseInt(nk[0]);
            if (opt == 1) {
                pp = Integer.parseInt(nk[1]);
                pt = Integer.parseInt(nk[2]);

//                pMap.put(pt, pp);
                pMap.put(pt, Math.max(pp, pMap.getOrDefault(pt, 0)));
            } else {
                pt = Integer.parseInt(nk[1]);
//                int src = 0, des;
//                if (pt > 59) {
//                    src = Math.abs(pt - 59);
//                }
//                des = pt;
                int maxValue = -1;
                for (Integer key : pMap.keySet()) {
                    if (pt - key < 60) maxValue = Math.max(pMap.get(key), maxValue);
//                    if (key >= src && key <= des) {
//                        if (pMap.get(key) > maxValue) {
//                            maxValue = pMap.get(key);
//                        }
//                    }
                }
                prices.add(maxValue);
//                System.out.println(maxValue);
            }
        }
        for (int price : prices)
            System.out.println(price);
        input.close();
    }
}
