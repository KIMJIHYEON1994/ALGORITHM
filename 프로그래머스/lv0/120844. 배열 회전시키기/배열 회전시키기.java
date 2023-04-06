class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;

        if (direction.equals("right")) {
            int tmp = numbers[len - 1];
            for (int i = len - 2; i >= 0; i--) {
                numbers[i + 1] = numbers[i];
            }
            numbers[0] = tmp;
        } else if (direction.equals("left")) {
            int tmp = numbers[0];
            for (int i = 0; i < len - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = tmp;
        }
        return numbers;
    }
}