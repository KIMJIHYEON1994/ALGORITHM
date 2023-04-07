class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = 0;

        for (int i = 1; i < a; i++) {
            totalDay += month[i - 1];
        }
        totalDay += b - 1;

        answer = day[(totalDay + 5) % 7];
        return answer;
    }
}