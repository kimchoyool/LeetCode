class Solution {
    public int thirdMax(int[] nums) {
        int answer = 0;
        if(nums.length == 1){
            answer = nums[nums.length-1];
        }
        
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int num = nums[j];
                    nums[j] = nums[i];
                    nums[i] = num;
                }
            }
        }
        
        int cnt = 1;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
                if(i+1<nums.length && nums[i]<nums[i+1]){
                    arr[cnt-1] = nums[i];
                    cnt++;
                }
        }
        if(cnt < 3){
            answer = nums[nums.length-1];
        } else if (cnt >= 3) {
            answer = arr[cnt-3];
        }

        return answer;
    }
}