import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");

            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            String[] p = br.readLine().split(" ");

            int[] pArr = new int[n];
            for (int j = 0; j < n; j++) {
                pArr[j] = Integer.parseInt(p[j]);
            }

            Queue<Integer> queue = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                queue.offer(j);
            }

            int printOrder = 0;

            while (!queue.isEmpty()) {
                int currentIndex = queue.poll();
                boolean higherP = false;

                for (int index : queue) {
                    if (pArr[index] > pArr[currentIndex]) {
                        higherP = true;
                        break;
                    }
                }

                if (higherP) {
                    queue.offer(currentIndex);
                } else {
                    printOrder++;
                    if (currentIndex == m) {
                        sb.append(printOrder).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}