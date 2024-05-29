import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum += arr[i];
        }

        Arrays.sort(arr);

        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a && arr[i] != b) {
                bw.write(arr[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}