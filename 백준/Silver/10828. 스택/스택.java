import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (String inputLine : br.lines().limit(inputCount).toArray(String[]::new)) {
            String[] input = inputLine.split(" ");

            switch (input[0]) {
                case "push":
                    int value = Integer.parseInt(input[1]);
                    stack.push(value);
                    break;
                case "pop":
                    int stackPop = stack.isEmpty() ? -1 : stack.pop();
                    System.out.println(stackPop);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    int stackIsEmpty = stack.isEmpty() ? 1 : 0;
                    System.out.println(stackIsEmpty);
                    break;
                case "top":
                    int stackTop = stack.isEmpty() ? -1 : stack.peek();
                    System.out.println(stackTop);
                    break;
            }

        }

    }
}