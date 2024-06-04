import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}