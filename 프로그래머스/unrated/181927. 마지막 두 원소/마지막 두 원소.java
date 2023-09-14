class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            for (int i = 0; i <= num_list.length + 1; i++) {
                if (i == answer.length - 1) {
                    answer[i] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
                    break;
                }
                answer[i] = num_list[i];
            }
        } else {
            for (int i = 0; i <= num_list.length + 1; i++) {
                if (i == answer.length - 1) {
                    answer[i] = num_list[num_list.length - 1] * 2;
                    break;
                }
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}