package com.mir00r.dfs;

import com.mir00r.Utils;

import java.util.Scanner;

/**
 * @author mir00r on 2019-09-16
 * @project IntelliJ IDEA
 */
public class RareElement {
    int node, rare, maxDistance, maximum;
    int[][] graph = new int[Utils.ROW][Utils.COL];
    int[][] mark = new int[Utils.ROW][Utils.COL];
    int[][] rareElement = new int[Utils.ROW][Utils.COL];
    int[][] result = new int[Utils.ROW][Utils.COL];

    private void runDFS(int x, int y, int node) {
        for (int i = 0; i < 4; ++i) {
            int a = Utils.direction[i][0] + x;
            int b = Utils.direction[i][1] + y;

            if (Utils.isValidBoundary(a, b, node) && graph[a][b] == 1 && rareElement[a][b] == 0) {
                result[a][b] = result[x][y] + 1;
                if (rareElement[a][b] == 1) maxDistance = Utils.getMax(maxDistance, result[a][b]);
                runDFS(a, b, node);
            }
        }
    }

    public void calculateRareElement() {
        Scanner input = new Scanner(System.in);
        int i, j, testCase, x, y;

        testCase = input.nextInt();
        while (testCase != 0) {
            rare = input.nextInt();
            node = input.nextInt();
            Utils.init2DArray(node, graph, true);

            for (i = 0; i < rare; i++) {
                x = input.nextInt();
                y = input.nextInt();
                rareElement[x][y] = 1;
            }

            for (i = 1; i <= node; ++i) {
                for (j = 1; j <= node; ++j) {
                    graph[i][j] = input.nextInt();
                }
            }

            for (i = 1; i <= node; ++i) {
                for (j = 1; j <= node; ++j) {
                    if (graph[i][j] == 1 && rareElement[i][j] == 0) {
                        maximum = -1;
                        Utils.init2DArray(node, mark, true);
                        Utils.init2DArray(node, result, true);
                        runDFS(i, j, node);
                        result[i][j] = 0;
                        maximum = Utils.getMin(maximum, maxDistance);
                    }
                }
            }
            System.out.println(maximum);
            testCase--;
        }
    }
}
