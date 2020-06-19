package com.mir00r;

import com.mir00r.linked_list.PrintMiddle;
import com.mir00r.poker.Poker;

import java.util.*;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}

interface BaseI { void method();}
class BaseC {
    public void method() {
        System.out.println("do something");
    }
}

class SampleDemo implements Runnable {

    private Thread t;
    private String threadName;

    SampleDemo (String threadName){
        this.threadName = threadName;
    }

    public void run()
    {
        while (true)
            System.out.print(threadName);
    }

    public void start ()
    {
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}



public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, j, tc, x, y, n;
        int[] arr = new int[100];
        int[] uniqueNumber = new int[100];
//        String str1 = "hello world";
//        String str2 = "hello world";
//
//        if (str1.equals(str1)) System.out.println("same");
//        else System.out.println("Not same");


//        SampleDemo A = new SampleDemo( "A");
//        SampleDemo B = new SampleDemo( "B");
//
//        B.start();
//        A.start();


//        acceptValidInput(input);
//        System.out.println("Your input is valid");
//        input.close();

        Practice practice = new Practice();
        practice.calculate();

//        Poker poker = new Poker();
//        poker.run();

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

        //TreeNode node = new TreeNode();

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

//        PrintMiddle printMiddle = new PrintMiddle();
//        for (int k = 7; k >= 0; k--) {
//            printMiddle.push(k);
//        }
//        printMiddle.printLinkedList();
//        printMiddle.printMiddleNode();
    }


}
