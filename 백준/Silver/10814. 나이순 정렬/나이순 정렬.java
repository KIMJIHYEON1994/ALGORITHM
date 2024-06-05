import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Person>[] ageGroups = new ArrayList[201];
        for (int i = 0; i <= 200; i++) {
            ageGroups[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];

            ageGroups[age].add(new Person(age, name));
        }

        StringBuilder sb = new StringBuilder();
        for (int age = 1; age <= 200; age++) {
            for (Person p : ageGroups[age]) {
                sb.append(p.age).append(" ").append(p.name).append("\n");
            }
        }

        System.out.println(sb);
    }
}