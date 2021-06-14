package com.mir00r;

import com.mir00r.queue.MyCircularDeque;

import java.util.*;
import java.util.Queue;

/**
 * @author mir00r on 2/5/20
 * @project IntelliJ IDEA
 */
public class Practice {
    int StringAsIntegerCompare(String s1, String s2) {
        if (s1.length() > s2.length()) return 1;
        if (s1.length() < s2.length()) return -1;
        for (int i = 0; i < s1.length(); i++) {
            if ((int) s1.charAt(i) > (int) s2.charAt(i)) return 1;
            if ((int) s1.charAt(i) < (int) s2.charAt(i)) return -1;
        }
        return 0;
    }

    // Complete the isBalanced function below.
    String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                stack.push(')');
            else if (ch == '{')
                stack.push('}');
            else if (ch == '[')
                stack.push(']');
            else {
                if (stack.isEmpty() || ch != stack.peek()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) return "YES";
        return "NO";
    }

    // Function to right rotate an array by one position
    public static void rightRotateByOne(int[] A, int n) {
        int last = A[n - 1];
        System.arraycopy(A, 0, A, 1, n - 2 + 1);
        A[0] = last;
    }

    // Function to right rotate an array by k positions
    public static void rightRotate(int[] A, int k, int n) {
        for (int i = 0; i < k; i++)
            rightRotateByOne(A, n);
    }

    // Function to right rotate an array by k positions
    public static int[] rightNTimes(int[] A, int k, int n) {
        int dest = k % n;
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[dest++] = A[i];
            if (dest == n) dest = 0;
        }
        return B;
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
//        int[] myArr = new int[a.size()];
//        for (int i = 0; i < a.size(); i++) {
//            myArr[i] = a.get(i);
//        }
////        rightRotate(myArr, k, a.size());
//
//        int n = a.size();
//        int dest = k % n;
//        int[] B = new int[n];
//        for (int i = 0; i < n; i++) {
//            B[dest++] = myArr[i];
//            if (dest == n) dest = 0;
//        }

//        myArr = rightNTimes(myArr, k, a.size());

//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < queries.size(); i++) {
//            ans.add(B[i]);
//        }


        int[] arr = new int[a.size()];

        for (int i = 0; i < a.size(); i++)
            arr[(i + k) % a.size()] = a.get(i);

        List<Integer> ans = new ArrayList<>();
        for (Integer query : queries) ans.add(arr[query]);

        return ans;
    }


    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int value = nums[i];
            result[i] = value * (value + 1) / 2;
        }
        return result;
    }

    public void calculate() {
        Scanner input = new Scanner(System.in);
        int tc, n, m, k, sum = 0, index = 0, count = 0;
        n = input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] result = this.runningSum(arr);
        for (int j : result) {
//            System.out.printf(j);
        }
//        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        k = input.nextInt();
//
//        this.rightRotate(a, k, n);
//        for (int i : a) {
//            System.out.print(i);
//        }

//        Arrays.sort(unsorted, Comparator.comparingInt(String::length));
//        Arrays.sort(unsorted, this::StringAsIntegerCompare);
//        Arrays.sort(unsorted, (x, y) -> x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));

//        String[] result = new String[n];
//        if (unsorted.length >= 0) System.arraycopy(unsorted, 0, result, 0, unsorted.length);
//
//        System.out.println(Arrays.toString(unsorted));


//        k = input.nextInt();
//        int[] nums = new int[n];
//        int[] nums1 = new int[n];
//        int[] result = new int[n];
//        int[] row = new int[n];
        //int[] col = new int[m];
//        int[][] points = new int[n][n];
//        int[][] matrix = new int[n][m];
//        int[][] indices = new int[n][m];

//        this.inputArray(n, nums, input);
//        this.printArray(result.length, result);

//        this.inputMatrix(n, m, matrix, input);
//        int r = matrix.length;
//        int c = matrix[0].length;
//        System.out.println("R -> " + r + " " + "C -> " + c);

//        String str = input.nextLine();
//        String str2 = input.nextLine();
//        StringBuilder ans = new StringBuilder();

//        String[] str1 = {"bbb", "cc"};
//        String[] str2 = {"a", "aa", "aaa", "aaaa"};
//        System.out.println(this.callDequeue(n, m));
//        callDequeue(n, m);
    }

//    public void callDequeue(int k, int value) {
//        MyCircularDeque obj = new MyCircularDeque(k);
//        boolean param_1 = obj.insertFront(value);
//        boolean param_2 = obj.insertLast(value);
//        boolean param_3 = obj.deleteFront();
//        boolean param_4 = obj.deleteLast();
//        int param_5 = obj.getFront();
//        System.out.println("Front value -> " + param_5);
//        int param_6 = obj.getRear();
//        System.out.println("Rear value -> " + param_6);
//        boolean param_7 = obj.isEmpty();
//        boolean param_8 = obj.isFull();
//    }

}

