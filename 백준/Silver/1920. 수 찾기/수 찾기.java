import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nArr = new int[n];

        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];

        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }

        Arrays.sort(nArr);

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            int target = mArr[i];
            int left = 0;
            int right = n - 1;
            boolean found = false;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (nArr[mid] == target) {
                    found = true;
                    break;
                } else if (nArr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            sb.append(found ? 1 : 0).append("\n");
        }
        System.out.print(sb.toString());
    }
}