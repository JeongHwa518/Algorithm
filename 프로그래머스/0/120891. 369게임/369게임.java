class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = "" + order;
        for(int i = 0; i < str.length(); i++){
            char tempChar = str.charAt(i);
            
            if(tempChar == '3' || tempChar == '6' || tempChar == '9'){
                answer ++;
            }
        }
        return answer;
    }
}