class Solution {
    public int solution(int[] array, int height) {
        int cnt = 0;

        for (int i : array) {
            cnt += (i > height) ? 1 : 0;
        }
        return cnt;
    }
}

// return 안에 조건식 넣을 수 있는지