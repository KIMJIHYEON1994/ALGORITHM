import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] board = new int[5][5];
    static boolean[][] visited = new boolean[5][5];
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int startRow = Integer.parseInt(st.nextToken());
        int startCol = Integer.parseInt(st.nextToken());

        int result = dfs(startRow, startCol, 0, 0);
        
        System.out.println(result >= 2 ? 1 : 0);
    }

    static int dfs(int r, int c, int moves, int apples) {
        if (board[r][c] == 1) {
            apples++;
        }

        if (moves >= 3) {
            return apples;
        }

        int temp = board[r][c];
        board[r][c] = -1;
        visited[r][c] = true;

        int maxApples = apples;

        for (int i = 0; i < 4; i++) {
            int newRow = r + dr[i];
            int newCol = c + dc[i];

            if (newRow >= 0 && newRow < 5 && newCol >= 0 && newCol < 5 && !visited[newRow][newCol] && board[newRow][newCol] != -1) {
                maxApples = Math.max(maxApples, dfs(newRow, newCol, moves + 1, apples));
            }
        }

        board[r][c] = temp;
        visited[r][c] = false;

        return maxApples;
    }
}