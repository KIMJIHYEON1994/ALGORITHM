class Solution {
    public int solution(int[] sides) {
        int maxSides = Math.max(Math.max(sides[0], sides[1]), sides[2]);
        return (sides[0] + sides[1] + sides[2] - maxSides <= maxSides) ? 2 : 1;
    }
}