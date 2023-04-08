class Solution {
    public int solution(int[][] sizes) {
        int answer;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            if (maxRow < sizes[i][0]) {
                maxRow = sizes[i][0];
            }

            if (maxCol < sizes[i][1]) {
                maxCol = sizes[i][1];
            }
        }
        answer = maxRow * maxCol;
        return answer;
    }
}