import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                result = Math.min(result, Math.min(startWhite(i, j), startBlack(i, j)));
            }
        }
        System.out.println(result);
    }

    static int startWhite(int x, int y) {
        int cnt = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') {
                        cnt++;
                    }
                } else {
                    if (board[i][j] != 'B') {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    static int startBlack(int x, int y) {
        int cnt = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'B') {
                        cnt++;
                    }
                } else {
                    if (board[i][j] != 'W') {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}