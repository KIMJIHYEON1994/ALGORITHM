class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(int) Math.ceil((double) n / 2)];
        int num = 1;
        
        for (int i = 0; i < answer.length; i++) {
            if (num % 2 == 1) {
                answer[i] = num;
            }
            num += 2;
        }
        return answer;
    }
}