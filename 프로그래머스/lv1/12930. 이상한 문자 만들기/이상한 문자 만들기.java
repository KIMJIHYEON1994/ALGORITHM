class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        String[] strArr = s.split("");

        for (String str : strArr) {
            count = str.contains(" ") ? 0 : count + 1;
            answer += count % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }
}