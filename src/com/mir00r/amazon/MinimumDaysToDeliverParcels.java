package com.mir00r.amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author mir00r on 29/5/22
 * @project IntelliJ IDEA
 */
public class MinimumDaysToDeliverParcels {
    public static int getSum(List<Integer> parcels) {
        int sum = 0;
        for (Integer parcel : parcels) {
            sum += parcel;
        }
        return sum;
    }

    public static int getMinimumDays(List<Integer> parcels) {
//        int days = 0;
//        int sum = getSum(parcels);
//        int len = parcels.size();
//
//        int deliver = 1;
//        for (Integer ignored : parcels) {
//            sum -= (deliver * len);
//            days++;
//            if (sum <= 0) return days;
//            len--;
//            deliver++;
//        }
//        return days;

        Set<Integer> days = new HashSet<>(parcels);
        days.remove(0);
        return days.size();
    }


    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(3);
        data.add(3);
        System.out.println(getMinimumDays(data));
    }
}
