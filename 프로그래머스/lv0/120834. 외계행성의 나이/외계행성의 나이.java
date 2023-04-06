class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = Integer.toString(age);

        for (int i = 0; i < strAge.length(); i++) {
            answer += (char) (strAge.charAt(i) + 49);
        }
        return answer;
    }
}