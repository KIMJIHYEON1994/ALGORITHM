class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char char1, char2;
        char1 = my_string.charAt(num1);
        char2 = my_string.charAt(num2);

        char[] chars = my_string.toCharArray();
        chars[num1] = char2;
        chars[num2] = char1;

        answer = String.valueOf(chars);
        return answer;
    }
}