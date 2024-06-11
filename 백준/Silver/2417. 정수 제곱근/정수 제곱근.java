import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());

        long left = 0;
        long right = num;
        long answer = 0;

        long n;

        while (left < right) {
            n = (left + right) / 2;

            if (right == 1) {
                answer = 1;
                break;
            }

            if (Math.pow(n, 2) >= num) {
                answer = n;
                right = n;
            } else {
                left = n + 1;
            }
        }
        System.out.println(answer);
    }
}