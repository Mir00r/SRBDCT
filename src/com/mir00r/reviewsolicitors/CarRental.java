package com.mir00r.reviewsolicitors;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author mir00r on 11/11/22
 * @project IntelliJ IDEA
 */
public class CarRental {
    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
        int overLapCount = 0;
        for (RentalTime rentalTime : rentalTimes) {
            boolean isOverLap = compareDates(rentalTime.getStart(), rentalTime.getEnd());
            if (!isOverLap) overLapCount++;
        }
        System.out.println(overLapCount);
        return overLapCount < 2;
    }

    public static boolean compareDates(Date from, Date to) {
        int result = from.compareTo(to);
        // result == 0 means fromDate is equal to toDate
        // result > 0 means fromDate is after toDate or fromDate is greater than toDate
        // result < 0 means fromDate is before toDate or fromDate is less than toDate
        return result < 0;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<RentalTime> rentalTimes = new ArrayList<>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

        System.out.println(CarRental.canScheduleAll(rentalTimes));
    }
}

class RentalTime {
    private Date start, end;

    public RentalTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}
