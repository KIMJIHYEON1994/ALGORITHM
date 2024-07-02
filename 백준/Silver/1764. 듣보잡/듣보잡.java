import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> unheard = new HashSet<>();
        HashSet<String> unseen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            unheard.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            unseen.add(br.readLine());
        }

        List<String> unheardAndUnseen = new ArrayList<>();

        for (String person : unheard) {
            if (unseen.contains(person)) {
                unheardAndUnseen.add(person);
            }
        }

        Collections.sort(unheardAndUnseen);

        StringBuilder sb = new StringBuilder();
        sb.append(unheardAndUnseen.size()).append('\n');
        for (String person : unheardAndUnseen) {
            sb.append(person).append('\n');
        }

        System.out.print(sb.toString());

        br.close();
    }
}