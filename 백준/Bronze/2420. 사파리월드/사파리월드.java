import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long x;

        if (n - m > 0) {
            System.out.println(n - m);
        } else {
            x = (n - m) * -1;
            System.out.println(x);
        }
    }
}