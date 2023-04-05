import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : numlist) {
            if (i % n == 0) {
                list.add(i);
            }
        }
        
        int[] result = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return result;
    }
}