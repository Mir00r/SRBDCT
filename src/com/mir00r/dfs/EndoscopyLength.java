package com.mir00r.dfs;

import com.mir00r.Utils;

import java.util.Scanner;

/**
 * @author mir00r on 2019-10-01
 * @project IntelliJ IDEA
 */
public class EndoscopyLength {
    int[][] graph = new int[Utils.ROW][Utils.COL];
    int[][] visited = new int[Utils.ROW][Utils.COL];
    boolean[][] mark = new boolean[Utils.ROW][Utils.COL];
    int M, N, R, C, L;
    int kase = 1;

    private int solution(int r, int c, int l) {
        if (l == 0) return 0;
        if (r < 0 || r >= M || c < 0 || c >= N) return 0;
        if (graph[r][c] == 0) return 0;
        if (!mark[r][c]) return 0;
        int result = 1;

        mark[r][c] = false;
        // Up, Down, Left, Right
        if (graph[r][c] == 1) {
            for (int i = 0, a, b; i < 4; i++) {
                a = r + Utils.direction[i][0];
                b = c + Utils.direction[i][1];
                result += solution(a, b, l - 1);
            }
        }
        // Up, Down
        else if (graph[r][c] == 2) {
            for (int i = 0, a, b; i < 4; i++) {
                if (i == 1 || i == 2) continue;
                a = r + Utils.direction[i][0];
                b = c + Utils.direction[i][1];
                result += solution(a, b, l - 1);
            }
        }
        // Left, Right
        else if (graph[r][c] == 3) {
            for (int i = 0, a, b; i < 4; i++) {
                if (i == 0 || i == 3) continue;
                a = r + Utils.direction[i][0];
                b = c + Utils.direction[i][1];
                result += solution(a, b, l - 1);
            }
        }
        // Up, Right
        else if (graph[r][c] == 4) {
            for (int i = 0, a, b; i < 4; i++) {
                if (i == 1 || i == 3) continue;
                a = r + Utils.direction[i][0];
                b = c + Utils.direction[i][1];
                result += solution(a, b, l - 1);
            }
        }
        // Down, Right
        else if (graph[r][c] == 5) {
            for (int i = 0, a, b; i < 4; i++) {
                if (i == 0 || i == 1) continue;
                a = r + Utils.direction[i][0];
                b = c + Utils.direction[i][1];
                result += solution(a, b, l - 1);
            }
        }
        // Down, Left
        else if (graph[r][c] == 6) {
            for (int i = 0, a, b; i < 4; i++) {
                if (i == 2 || i == 0) continue;
                a = r + Utils.direction[i][0];
                b = c + Utils.direction[i][1];
                result += solution(a, b, l - 1);
            }
        }
        // Up, Left
        else if (graph[r][c] == 7) {
            for (int i = 0, a, b; i < 4; i++) {
                if (i == 2 || i == 3) continue;
                a = r + Utils.direction[i][0];
                b = c + Utils.direction[i][1];
                result += solution(a, b, l - 1);
            }
        }

        return result;
    }

    public void calculateWaterPipe() {
        Scanner input = new Scanner(System.in);
        int testCase;

        testCase = input.nextInt();
        while (testCase != 0) {
            M = input.nextInt();
            N = input.nextInt();
            R = input.nextInt();
            C = input.nextInt();
            L = input.nextInt();

            //Utils.init2DArray(M, graph, true);
            //Utils.init2DArray(M, visited, true);

            for(int i = 0; i < M; i++) {
                for(int j = 0; j < N; j++) {
                    graph[i][j] = 0;
                    mark[i][j] = true;
                }
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    graph[i][j] = input.nextInt();
                }
            }
            System.out.println("Case " + kase++ + " ## " + solution(R, C, L));
            testCase--;
        }
    }
}
