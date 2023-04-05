class Solution {
    public int solution(int[] box, int n) {
        int answer;
        int width, depth, height;

        width = box[0] / n;
        depth = box[1] / n;
        height = box[2] / n;
        
        answer = width * depth * height;
        return answer;
    }
}