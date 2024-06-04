import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] W = new int[10];
        int[] K = new int[10];

        for(int i = 0; i < 10; i++) {
            W[i] = scanner.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            K[i] = scanner.nextInt();
        }

        Arrays.sort(W);
        Arrays.sort(K);

        int sumW = W[9] + W[8] + W[7];
        int sumK = K[9] + K[8] + K[7];

        System.out.println(sumW + " " + sumK);
        scanner.close();
    }
}