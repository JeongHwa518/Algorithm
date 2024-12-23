import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] c = my_string.toCharArray();
        
        for(int i = 0; i < n; i++){
            answer += c[c.length - n + i];
        }
        return answer;
    }
}