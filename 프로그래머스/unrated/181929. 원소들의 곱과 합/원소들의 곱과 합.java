class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int times = 1;
        for (int i = 0; i < num_list.length; i++) {
            times *= num_list[i];
        }

        int addtion = 0;
        for (int i = 0; i < num_list.length; i++) {
            addtion += num_list[i];
        }

        if (times > addtion * addtion) {
            answer = 0;
        } else {
            answer = 1;
        }
        return answer;
    }
}