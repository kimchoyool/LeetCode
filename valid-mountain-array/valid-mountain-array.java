class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
        return false;
        }
        boolean isAsc = true;   
        for (int i = 1; i < arr.length; i++) {
            if (isAsc) {
                if (arr[i - 1] > arr[i]) {
                    if (i == 1) { 
                        return false;
                    } else {
                        isAsc = false;
                    }
                } else if (arr[i - 1] == arr[i]) { 
                    return false;
                }
            } else { //하강
                if (arr[i - 1] <= arr[i]) { 
                    return false;
                }
            }
        }
        return isAsc? false: true; 
    }
}
