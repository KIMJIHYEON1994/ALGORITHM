class Solution {
    public int solution(int[] num_list) {
        String addEven = "";
        String addOdd = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                addEven += String.valueOf(num_list[i]);
            } else {
                addOdd += String.valueOf(num_list[i]);
            }
        }
        return Integer.parseInt(addEven) + Integer.parseInt(addOdd);
    }
}