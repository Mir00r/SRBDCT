package com.mir00r.bfs;

import com.mir00r.Utils;

import java.util.Scanner;

/**
 * @author mir00r on 2019-09-16
 * @project IntelliJ IDEA
 */
public class Probability {
    int nodes, edges, time;
    double[][] graph = new double[Utils.ROW][Utils.COL];

    void flushMemory() {
        for (int i = 0; i <= nodes; ++i) {
            for (int j = 0; j <= nodes; ++j) {
                graph[i][j] = 0;
            }
        }
    }

    private void runBFS() {
        int i, j, division = 0, kase = 0;
        double maxProbability = 0.0;
        double[] arr = new double[Utils.ROW];
        double[] brr = new double[Utils.ROW];

        time /= 10;
        arr[1] = 1.0;
        while (time != 0) {
            for (i = 1; i <= nodes; ++i) {
                brr[i] = 0;
            }

            for (i = 1; i <= nodes; ++i) {
                if (arr[i] > 0) {
                    for (j = 1; j <= nodes; ++j) {
                        if (graph[i][j] > 0) {
                            brr[j] = arr[i] * graph[i][j];
                        }
                    }
                }
            }
            for (i = 1; i <= nodes; ++i) {
                arr[i] = brr[i];
            }

            for (i = 1; i <= nodes; i++) {
                if (arr[i] > maxProbability) {
                    maxProbability = arr[i];
                    division = i;
                }
            }
            time--;
        }
        System.out.println("Case #" + ++kase + " " + division + " " + maxProbability);
    }

    public void calculateProbability() {
        Scanner input = new Scanner(System.in);
        int i, j, testCase;

        testCase = input.nextInt();
        while (testCase != 0) {
            nodes = input.nextInt();
            edges = input.nextInt();
            time = input.nextInt();

            flushMemory();

            int startPoint, endPoint;
            double probability;
            for (i = 1; i <= edges; i++) {
                startPoint = input.nextInt();
                endPoint = input.nextInt();
                probability = input.nextDouble();
                graph[startPoint][endPoint] = probability;
            }
            runBFS();
            testCase--;
        }
    }
}
