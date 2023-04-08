class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int sameCount = 0;
        int zereCount = 0;

        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (win_nums[i] == lottos[j]) {
                    sameCount++;
                }
            }
        }

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zereCount++;
            }
        }

        switch (sameCount) {
            case 0:
                answer[0] = 6 - zereCount + 1;
                if (answer[0] == 7) {
                    answer[0]--;
                }
                answer[1] = 6;
                break;
            case 1:
                answer[0] = 5 - zereCount + 1;
                answer[1] = 6;
                break;
            case 2:
                answer[0] = 4 - zereCount + 1;
                answer[1] = 5;
                break;
            case 3:
                answer[0] = 3 - zereCount + 1;
                answer[1] = 4;
                break;
            case 4:
                answer[0] = 2 - zereCount + 1;
                answer[1] = 3;
                break;
            case 5:
                answer[0] = 1 - zereCount + 1;
                answer[1] = 2;
                break;
            default:
                answer[0] = 1;
                answer[1] = 1;
                break;
        }
        return answer;
    }
}