class Solution {
    public int solution(int age) {
        int answer = 0;

        for (int i = 0; i <= 120; i++) {
            answer = 2022 - age + 1;
        }

        return answer;
    }
}