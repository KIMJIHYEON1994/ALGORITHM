class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String answer1 = Integer.toString(a) + Integer.toString(b);
        String answer2 = Integer.toString(2 * a * b);

        if (Integer.parseInt(answer1) > Integer.parseInt(answer2)) {
            answer = Integer.parseInt(answer1);
        } else if (Integer.parseInt(answer2) > Integer.parseInt(answer1)) {
            answer = Integer.parseInt(answer2);
        } else {
            answer = Integer.parseInt(answer1);
        }
        return answer;
    }
}