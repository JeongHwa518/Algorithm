class Solution {
    public String solution(String my_string) {
        String answer = "";
         char[] arr = my_string.toCharArray();
		
		// a ~ z 97 ~122
		// A ~ Z 65~90
        
        String temp ="";
        for(int i = 0; i < my_string.length(); i++) {
            if(97 <= arr[i] && arr[i] <= 122) {
                temp = arr[i] + "";
				answer += temp.toUpperCase();
            } else if(65 <= arr[i] && arr[i] <= 90) {
                temp = arr[i] + "";
				answer += temp.toLowerCase();
            }
        }       
        return answer;
    }
}