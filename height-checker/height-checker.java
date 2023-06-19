class Solution {
    public int heightChecker(int[] heights) {
        int [] arr = heights.clone();
        
        for(int i=0;i<arr.length;i++){
            for(int j=(i+1);j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        int indices=0;
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]){
                indices++;
            }
        }
        return indices;
    }
}