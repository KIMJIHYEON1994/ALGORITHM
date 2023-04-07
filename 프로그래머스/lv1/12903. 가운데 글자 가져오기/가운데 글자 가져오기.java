class Solution {
    public String solution(String s) {
        String answer = "";
        int sLength = s.length();

        if (sLength % 2 == 0) {
            answer = s.substring((int) (sLength / 2) - 1, (int) (sLength / 2) + 1);
        } else {
            answer = s.substring((int) (sLength / 2), (int) (sLength / 2) + 1);
        }
        return answer;
    }
}