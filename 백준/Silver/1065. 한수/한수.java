import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).length() <= 2) {
                cnt++;
            } else {
                String[] split = String.valueOf(i).split("");

                int a = 0;
                boolean b = true;

                for (int j = 0; j < split.length - 1; j++) {
                    if (j == 0) {
                        a = Integer.parseInt(split[j + 1]) - Integer.parseInt(split[j]);
                    } else {
                        if (Integer.parseInt(split[j + 1]) - Integer.parseInt(split[j]) != a) {
                            b = false;
                            break;
                        }
                    }
                }

                if (b) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}