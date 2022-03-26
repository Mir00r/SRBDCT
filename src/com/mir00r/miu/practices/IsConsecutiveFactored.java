package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsConsecutiveFactored {

    public static int isConsecutiveFactored(int n) {
        if (n <= 0) return 0;
        int factor1 = 0;
        int factor2 = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (factor1 == 0) {
                    factor1 = i;
                    continue;
                }
                if (factor1 > 0 && factor2 == 0) factor2 = i;
            }
            if (factor2 > 1) break;
        }
        if (factor2 == factor1 + 1) return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isConsecutiveFactored(24));
        System.out.println(isConsecutiveFactored(105));
        System.out.println(isConsecutiveFactored(90));
        System.out.println(isConsecutiveFactored(23));
        System.out.println(isConsecutiveFactored(15));
        System.out.println(isConsecutiveFactored(2));
        System.out.println(isConsecutiveFactored(0));
        System.out.println(isConsecutiveFactored(-12));
    }
}
