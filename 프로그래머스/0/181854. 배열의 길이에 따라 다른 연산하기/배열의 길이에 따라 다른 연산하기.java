class Solution {
    public int[] solution(int[] arr, int n) {
        int leng = arr.length;
        int[] answer = new int[leng];
        
        if(leng % 2 == 0){
            for(int i = 0; i < leng; i++){
                if(i % 2 != 0){
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        } else {
            for(int i = 0; i < leng; i++){
                if(i % 2 == 0){
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
}