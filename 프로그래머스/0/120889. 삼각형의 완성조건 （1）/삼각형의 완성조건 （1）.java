import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        if((a + b) > c) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}