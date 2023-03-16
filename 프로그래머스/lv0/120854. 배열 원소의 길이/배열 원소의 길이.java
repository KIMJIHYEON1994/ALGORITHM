class Solution {
    public int[] solution(String[] strlist) {
        int[] strlength = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            strlength[i] = strlist[i].length();
        }
        return strlength;
    }
}