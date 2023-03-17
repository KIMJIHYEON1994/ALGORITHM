import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> al = new ArrayList<Integer>();
        for (int i : numbers) {
            al.add(i * 2);
        }
        int[] arr1 = al.stream().mapToInt(i -> i).toArray();
        return arr1;
    }
}