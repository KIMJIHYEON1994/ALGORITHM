import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(input[0]);
            points[i][1] = Integer.parseInt(input[1]);
        }

        if (N > 1) {
            mergeSort(points, 0, N - 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }
        System.out.print(sb);
    }

    private static void mergeSort(int[][] points, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(points, left, mid);
            mergeSort(points, mid + 1, right);

            int[][] temp = new int[right - left + 1][2];
            int i = left, j = mid + 1, k = 0;

            while (i <= mid && j <= right) {
                if (points[i][0] < points[j][0] || (points[i][0] == points[j][0] && points[i][1] <= points[j][1])) {
                    temp[k++] = points[i++];
                } else {
                    temp[k++] = points[j++];
                }
            }

            while (i <= mid) {
                temp[k++] = points[i++];
            }

            while (j <= right) {
                temp[k++] = points[j++];
            }

            for (int l = 0; l < k; l++) {
                points[left + l] = temp[l];
            }
        }
    }
}