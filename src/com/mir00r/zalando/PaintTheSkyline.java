package com.mir00r.zalando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mir00r on 23/4/22
 * @project IntelliJ IDEA
 */
public class PaintTheSkyline {
    public static int solution(int[] A) {
//        int numberOfStrokes = 0;
//        for (int i = 0; i <= A.length - 1; i++) {
//            if ((i + 1) < (A.length)) {
//                if (A[i] > A[i + 1]) {
//                    numberOfStrokes += A[i] - A[i + 1];
//                }
//            } else {
//                numberOfStrokes += A[i];
//            }
//        }
//        return numberOfStrokes;

        int brushCount = 0;
        int prevHeight = 0;
        for (int j : A) {
            if (j > prevHeight)
                brushCount = brushCount + (j - prevHeight);
            prevHeight = j;
        }
        return brushCount;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2}));
    }
}
