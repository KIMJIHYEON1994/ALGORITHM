class Solution {
    public int solution(String str1, String str2) {
        int result = 0;
        if (str1.contains(str2)) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}