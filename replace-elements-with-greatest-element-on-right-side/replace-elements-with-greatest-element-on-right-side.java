class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        for(int i=arr.length-1; i>=0; i--){
            if(i==arr.length-1){
                arr[arr.length-1] = -1;
            }
            else {
                if(arr[i] <= max){
                    arr[i] = max;
                }else{
                    int temp = max;
                    max = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}