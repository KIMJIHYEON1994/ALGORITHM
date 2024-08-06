import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashMap<Integer, Integer> sortHashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
            hashMap.put(a, i);
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sortHashMap.put(arr[i], i);
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = Math.max(hashMap.get(arr[i]) - sortHashMap.get(arr[i]), answer);
        }

        System.out.println(++answer);
    }
}