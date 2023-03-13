class Solution {
    public int solution(int n) {
        int result = 0;

        for (int i = 0; i <= n; i++) {
            if (n == i * i) {
                result = 1;
                break;
            } else {
                result = 2;
            }
        }
        return result;
    }
}