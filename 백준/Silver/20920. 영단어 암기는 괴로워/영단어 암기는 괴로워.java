import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] nAndM = br.readLine().split(" ");
        int n = Integer.parseInt(nAndM[0]);
        int m = Integer.parseInt(nAndM[1]);

        HashMap<String, Integer> wordAndCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() >= m) {
                wordAndCount.put(word, wordAndCount.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordAndCount.keySet());

        words.sort((a, b) -> {
            int count1 = wordAndCount.get(a);
            int count2 = wordAndCount.get(b);

            if (count1 != count2) {
                return count2 - count1;
            }
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }

            return a.compareTo(b);
        });

        for (String word : words) {
            sb.append(word).append("\n");
        }
        System.out.println(sb.toString());
    }
}