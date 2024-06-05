import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        ArrayList<String>[] ageGroups = new ArrayList[201];
        
        for (int i = 0; i <= 200; i++) {
            ageGroups[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];

            ageGroups[age].add(name);
        }

        StringBuilder sb = new StringBuilder();
        
        for (int age = 1; age <= 200; age++) {
            for (String name : ageGroups[age]) {
                sb.append(age).append(" ").append(name).append("\n");
            }
        }

        System.out.println(sb);
    }
}