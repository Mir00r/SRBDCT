package com.mir00r;

import java.util.Arrays;
import java.util.Scanner;

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

    public void copyArray(int[] copy, int[] arr, int len) {
        if (len >= 0) System.arraycopy(arr, 0, copy, 0, len);
    }

    public void mergeSort(int[] arr, int start, int end) {
        this.divide(arr, start, end);
    }

    public void divide(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        } else {
            int mid = (start + end) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            this.sortRun(arr, start, mid, end);
        }
    }

    public void sortRun(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int index = 0;
        int[] tempArr = new int[arr.length + 1];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                tempArr[index] = arr[i];
                i++;
            } else {
                tempArr[index] = arr[j];
                j++;
            }
            index++;
        }

        while (i <= mid) {
            tempArr[index] = arr[i];
            i++;
            index++;
        }

        while (j <= end) {
            tempArr[index] = arr[j];
            j++;
            index++;
        }

        for (int i1 = start, k = 0; i1 <= end; i1++) {
            arr[i1] = tempArr[k];
            k++;
        }
    }

    public static void sortArray(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sortArray(int[][] arr, int n, int index) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[index][j + 1] < arr[index][j]) {
                    int temp = arr[index][j];
                    arr[index][j] = arr[index][j + 1];
                    arr[index][j + 1] = temp;
                }
            }
        }
    }

    public static void reverseRow(int row, int col, int[][] matrix) {
        int star = 0;
        int end = col - 1;
        while (star < end) {
            int temp = matrix[row][star];
            matrix[row][star] = matrix[row][end];
            matrix[row][end] = temp;
            star++;
            end--;
        }
    }

    public static void invertRow(int row, int col, int[][] matrix) {
        for (int i = 0; i < col; i++) {
            if (matrix[row][i] == 1) matrix[row][i] = 0;
            else matrix[row][i] = 1;
        }
    }

    public static void inputArray(int n, int[] arr, Scanner input) {
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void inputMatrix(int n, int m, int[][] matrix, Scanner input) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public static void initMatrix(int n, int m, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public static void printMatrix(int n, int m, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printArray(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int getMax(int x1, int y1, int x2, int y2) {
        int x = Math.abs(x1 - x2);
        int y = Math.abs(y1 - y2);
        return Math.max(x, y);
    }

    public static int getDigitCount(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int getDigitSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static int getMax(int[] arr, int maxn) {
        for (int value : arr) {
            if (maxn < value) maxn = value;
        }
        return maxn;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) sum += arr[i];
        }
        return sum;
    }

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] splitStr = s.split(" ");
        for (String word : splitStr) {
            StringBuilder reverseStr = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseStr.append(word.charAt(j));
            }
            if (ans.length() > 0) ans.append(" ");
            ans.append(reverseStr);
        }
        return ans.toString();
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static String getReverseString(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }

    public static int[] removeZeros(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }
        return a;
    }

    public static String sortString2(String str) {
        char[] strArr = str.toCharArray();
        char temp;

        int i = 0;
        while (i <= strArr.length) {
            int j = i + 1;
            while (j <= strArr.length) {
                if (strArr[i] < strArr[j]) {
                    temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
                j++;
            }
            i++;
        }
        return Arrays.toString(strArr);
    }

    public static String sortString1(String inputString) {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

    public static boolean alphaNumeric(char char1) {
        return (char1 >= 'a' && char1 <= 'z')
                || (char1 >= 'A' && char1 <= 'Z')
                || (char1 >= '0' && char1 <= '9')
                || (char1 == '!' || char1 == '@' || char1 == '#' || char1 == '$'
                || char1 == '%' || char1 == '^' || char1 == '&' || char1 == '*'
                || char1 == '(' || char1 == ')' || char1 == '-' || char1 == '+');
    }

    public static boolean lower(char char1) {
        return (char1 >= 'a' && char1 <= 'z');
    }

    public static boolean upper(char char1) {
        return (char1 >= 'A' && char1 <= 'Z');
    }

    public static boolean numeric(char char1) {
        return (char1 >= '0' && char1 <= '9');
    }

    public static boolean special(char char1) {
        return (char1 == '!' || char1 == '@' || char1 == '#' || char1 == '$'
                || char1 == '%' || char1 == '^' || char1 == '&' || char1 == '*'
                || char1 == '(' || char1 == ')' || char1 == '-' || char1 == '+');
    }
}
