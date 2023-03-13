class Solution {
    public String solution(String my_string) {       
        StringBuffer reverse = new StringBuffer(my_string);
        String reverseStr = reverse.reverse().toString();
        return reverseStr;
    }
}