import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;

        Arrays.sort(numbers);

        int result1 = numbers[0] * numbers[1];
        int result2 = numbers[len - 1] * numbers[len - 2];

        return Math.max(result1, result2);
    }
}