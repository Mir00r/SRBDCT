package com.mir00r.bfs;

import com.mir00r.Queue;
import com.mir00r.Utils;

import java.util.Scanner;

/**
 * @author mir00r on 2019-10-03
 * @project IntelliJ IDEA
 */
public class BiColoring {
    int[][] graph = new int[Utils.ROW][Utils.COL];
    int[] color;
    int V;
    int kase = 1;

    private boolean isBipartiteUtil(int node) {
        color[node] = 1;
        Queue queue = new Queue(V);
        queue.push(node);

        while (!queue.isEmpty()) {
            int u = queue.front();
            queue.pop();

            // If there is a self-loop
            if (graph[u][u] == 1) return false;
            for (int v = 0; v < V; v++) {
                if (graph[u][v] == 1 && color[v] == -1) {
                    color[v] = 1 - color[u];
                    queue.push(v);
                } else if (graph[u][v] == 1 && color[u] == color[v]) return false;
            }
        }
//        for (int i = 0; i < color.length; i++) {
//            System.out.println(color[i]);
//        }
        return true;
    }

    private boolean isBipartite() {
        color = new int[V];
        for (int i = 0; i < V; i++) {
            color[i] = -1;
        }

        // This code is to handle disconnected graoh
        for (int i = 0; i < V; i++)
            if (color[i] == -1)
                if (!isBipartiteUtil(i))
                    return false;
        return true;
    }

    public void checkBipartiteGraph() {
        Scanner input = new Scanner(System.in);
        int testCase;

        testCase = input.nextInt();
        while (testCase != 0) {
            V = input.nextInt();

            Utils.init2DArray(V, graph, true);

            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    graph[i][j] = input.nextInt();
                }
            }
            if (isBipartite())
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
