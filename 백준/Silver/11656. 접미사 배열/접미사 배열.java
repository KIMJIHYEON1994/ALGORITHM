import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] strArr = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            strArr[i] = input.substring(i);
        }

        Arrays.sort(strArr);

        for (String st : strArr) {
            System.out.println(st);
        }
    }
}