package com.mir00r.dfs;

import com.mir00r.Utils;

import java.util.List;
import java.util.Scanner;

/**
 * @author mir00r on 2019-09-16
 * @project IntelliJ IDEA
 */
public class CycleFinding {
    int nodes, edges, index;
    int[][] graph = new int[Utils.ROW][Utils.COL];
    int [] parent;
    int [] cycleNode;
    boolean[] visited;
    boolean[] recStack;

    private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
        // Mark the current node as visited and
        // part of recursion stack
        if (recStack[i]) {
            return true;
        }
        if (visited[i])
            return false;

        visited[i] = true;
        recStack[i] = true;

        for (int j = 1; j <= nodes; j++) {
            if (graph[i][j] == 1) {
                if (isCyclicUtil(j, visited, recStack)) return true;
            }
        }
        recStack[i] = false;
        return false;
    }

    void printCycle() {
        Utils.bubbleSort(cycleNode, index);
        for (int i = 1; i <= index; i++) {
            if (i != 1) System.out.print(" ");
            System.out.print(cycleNode[i]);
        }
        System.out.println();
        return;
    }

    void findCycleNode(int x) {
        cycleNode[++index] = x;
        if (parent[x] == -1) {
            printCycle();
            return;
        }
        findCycleNode(parent[x]);

        return;
    }


    private boolean isCyclicUtil(int x) {

        if (!visited[x]) {
            visited[x] = true;
            recStack[x] = true;

            for (int i = 1; i <= nodes; i++) {
                if (graph[x][i] == 1 && !visited[i]) {
                    parent[i] = x;
                    isCyclicUtil(i);
                }
                else if (graph[x][i] == 1 && recStack[i]) {
                    parent[i] = -1;
                    findCycleNode(x);
                    return true;
                }
            }
        }

        recStack[x] = false;
        return false;
    }

    private boolean isCyclic() {
        // Mark all the vertices as not visited and
        // not part of recursion stack
        visited = new boolean[nodes+1];
        recStack = new boolean[nodes+1];
        parent = new int[nodes+1];
        cycleNode = new int[nodes+1];
        index = 0;

        // Call the recursive helper function to
        // detect cycle in different DFS trees
        for (int i = 1; i <= nodes; i++)
            //if (isCyclicUtil(i, visited, recStack))
            if (isCyclicUtil(i))
                return true;
        return false;
    }

    public void findCycle() {
        Scanner input = new Scanner(System.in);
        int i, j, testCase;

        testCase = input.nextInt();
        while (testCase != 0) {
            nodes = input.nextInt();
            edges = input.nextInt();

            Utils.init2DArray(nodes, graph, true);

            int startPoint, endPoint;
            for (i = 1; i <= edges; i++) {
                startPoint = input.nextInt();
                endPoint = input.nextInt();
                graph[startPoint][endPoint] = 1;
            }
            if (isCyclic())
                System.out.println("1");
            else System.out.println("0");
            testCase--;
        }
    }
}
