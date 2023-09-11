class Solution {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            if (control.substring(i, i + 1).equals("w")) {
                n += 1;
            } else if (control.substring(i, i + 1).equals("s")) {
                n -= 1;
            } else if (control.substring(i, i + 1).equals("d")) {
                n += 10;
            } else {
                n -= 10;
            }
        }
        return n;
    }
}