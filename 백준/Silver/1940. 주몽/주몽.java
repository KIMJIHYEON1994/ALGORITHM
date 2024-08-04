import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int m = Integer.parseInt(br.readLine().trim());

        int[] numbers = new int[n];

        String[] numStrings = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(numStrings[i]);
        }

        Arrays.sort(numbers);

        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == m) {
                count++;
                left++;
                right--;
            } else if (sum < m) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(count);
    }
}