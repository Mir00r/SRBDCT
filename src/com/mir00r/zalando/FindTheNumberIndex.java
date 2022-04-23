package com.mir00r.zalando;

/**
 * @author mir00r on 23/4/22
 * @project IntelliJ IDEA
 */
public class FindTheNumberIndex {
    public static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] == X) {
                return m;
            }
            else if (A[m] > X) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 5, 9, 9}, 9));
    }

}
