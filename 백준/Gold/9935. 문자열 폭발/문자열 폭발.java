import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();

        String input = br.readLine();
        String bombWord = br.readLine();

        Stack<Character> stack = new Stack<>();
        int bombWordLength = bombWord.length();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));

            if (stack.size() >= bombWordLength) {
                boolean bomb = true;

                for (int j = 0; j < bombWordLength; j++) {
                    if (stack.get(stack.size() - bombWordLength + j) != bombWord.charAt(j)) {
                        bomb = false;
                        break;
                    }
                }

                if (bomb) {
                    for (int j = 0; j < bombWordLength; j++) {
                        stack.pop();
                    }
                }
            }
        }

        for (char c : stack) {
            st.append(c);
        }

        if (st.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(st.toString());
        }
    }
}