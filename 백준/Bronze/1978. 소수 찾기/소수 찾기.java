import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCasesNum = sc.nextInt();

        int primeCount = 0;

        for (int i = 0; i < testCasesNum; i++) {
            int num = sc.nextInt();
            boolean isPrime = false;

            if (num == 2) {
                isPrime = true;
            } else if (num > 2) {
                isPrime = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primeCount++;
            }
        }
        System.out.println(primeCount);
    }
}