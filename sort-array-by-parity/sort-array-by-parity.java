class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        int odd = -1;
        if(nums.length > 0){
           for(int i=0; i<nums.length-1; i++){
               if(nums[i]%2 != 0){ //홀수
                    for(int j=i+1; j<nums.length; j++){
                        if(nums[j]%2==0){ //짝수
                            int temp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = temp;
                            break;
                        }
                    }      
                }
                
            } 
        }
        
        return nums;
    }
}