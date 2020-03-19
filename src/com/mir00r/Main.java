package com.mir00r;

import com.mir00r.linked_list.PrintMiddle;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main {

    public static void helloWorldPrint(int n) {
        if (n == 0) return;
        else {
            helloWorldPrint(n - 1);
            System.out.println(n + " Hello World!");
            //helloWorldPrint(n-1);
        }
    }

    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        if (root == null) return nodeList;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.empty()) {
            root = st.pop();
            nodeList.add(root.val);
            if (root.left != null) st.push(root.left);
            if (root.right != null) st.push(root.right);
        }
        return nodeList;
    }

    public static void main(String[] args) {
        //RareElement rareElement = new RareElement();
        //rareElement.calculateRareElement();

//        Probability probability = new Probability();
//        probability.calculateProbability();

//        CycleFinding cycleFinding = new CycleFinding();
//        cycleFinding.findCycle();

//        EndoscopyLength endoscopyLength = new EndoscopyLength();
//        endoscopyLength.calculateWaterPipe();

        //BiColoring biColoring = new BiColoring();
        //biColoring.checkBipartiteGraph();
        //helloWorldPrint(10);

        //int a = 020;
        //System.out.println(a);

        //Check check1 = new Check();

        //TreeNode node = new TreeNode();

        Scanner input = new Scanner(System.in);
        int i = 0, j, tc, x, y, n;
        int[] arr = new int[100];
        int[] uniqueNumber = new int[100];

        /*tc = input.nextInt();
        int index = 0;
        while (tc != 0) {
            n = input.nextInt();
            for (int k = 0; k < n; k++) {
                arr[k] = input.nextInt();
            }

            uniqueNumber[0] = arr[0];
            for (int k = 1; k < n; k++) {
                if (arr[k] != arr[k-1]) uniqueNumber[index++] = arr[k];
            }
            tc--;
        }
        for (int k = 0; k < index; k++) {
            System.out.println(uniqueNumber[k]);
        }*/

        PrintMiddle printMiddle = new PrintMiddle();
        for (int k = 7; k >= 0; k--) {
            printMiddle.push(k);
        }
        printMiddle.printLinkedList();
        printMiddle.printMiddleNode();
    }

}
