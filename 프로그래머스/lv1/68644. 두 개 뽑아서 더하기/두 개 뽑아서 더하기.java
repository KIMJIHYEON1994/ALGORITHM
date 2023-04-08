import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int a = numbers[i] + numbers[j];
                if (arrlist.indexOf(a) < 0) {
                    arrlist.add(a);
                }
            }
        }

        int[] answer = new int[arrlist.size()];

        for (int i = 0; i < arrlist.size(); i++) {
            answer[i] = arrlist.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}