import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] h1 = {1, 2, 3, 4, 5};
        int[] h2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] h3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == h1[i % h1.length]) {
                count[0]++;
            }
            if (answers[i] == h2[i % h2.length]) {
                count[1]++;
            }
            if (answers[i] == h3[i % h3.length]) {
                count[2]++;
            }
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        if (max == count[0]) {
            arrlist.add(1);
        }
        if (max == count[1]) {
            arrlist.add(2);
        }
        if (max == count[2]) {
            arrlist.add(3);
        }

        int[] answer = new int[arrlist.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrlist.get(i);
        }
        return answer;
    }
}