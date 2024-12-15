class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");
        for(String a : array){
            answer += Integer.parseInt(a);
        }
        return answer;
    }
}