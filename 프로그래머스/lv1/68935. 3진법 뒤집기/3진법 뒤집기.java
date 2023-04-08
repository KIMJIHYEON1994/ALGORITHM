class Solution {
    public int solution(int n) {
        int answer = 0;
        String ternary = Integer.toString(n, 3);

        String reverse = "";
        for (int i = ternary.length() - 1; i >= 0; i--) {
            reverse = reverse + ternary.charAt(i);
        }
        answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}