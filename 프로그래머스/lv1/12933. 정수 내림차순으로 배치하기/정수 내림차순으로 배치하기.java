import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for(String str : strArr) {
            sb.append(str);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}