import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int max = 0;
        int total = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(arr[i], max);
            total += arr[i];
        }

        int min = max;
        max = total;
        int mid, money, cnt;
        int answer = min;

        while (min <= max) {
            mid = (min + max) / 2;
            cnt = 1;
            money = mid;

            for (int i : arr) {
                if (money < i) {
                    cnt++;
                    money = mid;
                }
                money -= i;
            }

            if (cnt <= M) {
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(answer);
    }
}