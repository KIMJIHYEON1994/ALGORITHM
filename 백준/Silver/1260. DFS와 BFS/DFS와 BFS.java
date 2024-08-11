import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[][] treeArray;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        treeArray = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            treeArray[a][b] = 1;
            treeArray[b][a] = 1;
        }

        visited = new boolean[n + 1];
        dfs(v);

        System.out.println();

        visited = new boolean[n + 1];
        bfs(v);
    }

    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int j = 1; j < treeArray.length; j++) {
            if (treeArray[v][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(v);
        visited[v] = true;

        System.out.print(v + " ");

        while (!queue.isEmpty()) {
            int n = queue.poll();

            for (int i = 1; i < treeArray.length; i++) {
                if (treeArray[n][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    System.out.print(i + " ");
                    queue.offer(i);
                }
            }
        }
    }
}