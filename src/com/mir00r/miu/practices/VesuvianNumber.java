package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class VesuvianNumber {

    public static int isVesuvian(int n) {
        int sumCount = 0;
        for (int i = 1; i * i < n; i++) {
            int sum1 = i * i;
            for (int j = 1; j * j < n; j++) {
                int sum2 = j * j;

                if (sum1 + sum2 == n) {
                    sumCount++;
                    break;
                }
            }
            if (sumCount >= 2) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
        System.out.println(isVesuvian(78));
    }
}
