class Solution {
    public int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length];

        for (int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = num_list[i];
        }
        return reverse;
    }
}