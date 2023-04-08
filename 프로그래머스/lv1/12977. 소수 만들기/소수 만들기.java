class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (isAnswer(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private boolean isAnswer(int num) {
        for (int l = 2; l <= Math.sqrt(num); l++) {
            if (num % l == 0) {
                return false;
            }
        }
        return true;
    }
}