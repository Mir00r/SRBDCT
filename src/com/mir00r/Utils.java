package com.mir00r;

/**
 * @author mir00r on 2019-09-16
 * @project IntelliJ IDEA
 */
public class Utils {
    public static int ROW = 100;
    public static int COL = 100;
    //    public static int[][] direction = {
//            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
//    };
    public static int[][] direction = {
            {-1, 0}, {0, -1}, {0, 1}, {1, 0}
    };

    public static int direction1[] = {-1, 0, 0, 1, 1, -1, -1, 1};
    public static int direction2[] = {0, -1, 1, 0, 1, -1, 1, -1};

    public static int getMin(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    public static double getMin(double a, double b) {
        if (a < b) return a;
        else return b;
    }

    public static int getMax(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static double getMax(double a, double b) {
        if (a > b) return a;
        else return b;
    }

    public static boolean isValidBoundary(int x, int y, int n) {
        if (x >= 1 && x <= n && y >= 1 && y <= n) return true;
        else return false;
    }

    public static int isValidBoundary(int x, int y, int n, int startLimit) {
        if (x >= startLimit && x <= n && y >= startLimit && y <= n) return 1;
        else return 0;
    }

    public static int isValidBoundary(int x, int y, int r, int c, int startLimit) {
        if (x >= startLimit && x <= r && y >= startLimit && y <= c) return 1;
        else return 0;
    }

    public static void init2DArray(int n, int[][] arr, boolean isIndexZero) {
        if (isIndexZero) {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    arr[i][j] = 0;
                }
            }
        } else {
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= n; ++j) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void init2DArray(int r, int c, int[][] arr, boolean isIndexZero) {
        if (isIndexZero) {
            for (int i = 0; i < r; ++i) {
                for (int j = 0; j < c; ++j) {
                    arr[i][j] = 0;
                }
            }
        } else {
            for (int i = 1; i <= r; ++i) {
                for (int j = 1; j <= c; ++j) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void init1DArray(int n, int[] arr, boolean isIndexZero) {
        if (isIndexZero) {
            for (int i = 0; i < n; ++i) {
                arr[i] = 0;
            }
        } else {
            for (int i = 1; i <= n; ++i) {
                arr[i] = 0;
            }
        }
    }

    public static void bubbleSort(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
