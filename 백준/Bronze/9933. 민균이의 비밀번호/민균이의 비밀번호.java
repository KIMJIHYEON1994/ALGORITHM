import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        String result = null;

        for (int i = 0; i < n; i++) {
            String pw = br.readLine();
            String pwReversed = new StringBuilder(pw).reverse().toString();

            if (set.contains(pwReversed) || pw.equals(pwReversed)) {
                result = pw;
                break;
            } else {
                set.add(pw);
            }
        }

        if (result != null) {
            System.out.println(result.length() + " " + result.charAt(result.length() / 2));
        }
    }
}