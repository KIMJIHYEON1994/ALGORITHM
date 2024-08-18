import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;

    static int N, M, R;
    static List<ArrayList<Integer>> list;

    static int[] visitNum;
    static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        list = new ArrayList<>(N + 1);
        visited = new boolean[N + 1];
        visitNum = new int[N + 1];
        num = 1;

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list.get(n).add(m);
            list.get(m).add(n);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i));
        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            bw.write(visitNum[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    static void dfs(int start) {
        visited[start] = true;
        visitNum[start] = num++;

        for (int i : list.get(start)) {
            if (!visited[i]) dfs(i);
        }
    }
}