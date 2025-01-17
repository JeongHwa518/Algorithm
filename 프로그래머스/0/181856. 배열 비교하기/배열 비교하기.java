class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Sum = 0;
        int arr2Sum = 0;
        
        for(int num : arr1){
            arr1Sum += num;
        }
        for(int num : arr2){
            arr2Sum += num;
        }
        
        if(arr1.length > arr2.length || (arr1.length == arr2.length && arr1Sum > arr2Sum)){
            return 1;
        } else if(arr2.length > arr1.length || arr1.length == arr2.length && arr2Sum > arr1Sum){
            return -1;
        } else {
            return 0;
        }
    }
}