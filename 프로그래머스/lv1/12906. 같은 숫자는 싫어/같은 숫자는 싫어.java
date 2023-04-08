import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arrList.add(arr[i]);
                num = arr[i];
            }
        }
        
        int[] answer = new int[arrList.size()];
        for (int i = 0; i< answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}