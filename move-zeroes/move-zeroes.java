class Solution {
    public void moveZeroes(int[] nums) {
        //two-point
        int writepoint = 0;
        if(nums.length != 1){
        
            for(int i=0; i<nums.length; i++){
                if(nums[i] != 0){
                    nums[writepoint] = nums[i];
                    //nums[i]=0;
                    writepoint++;
                }
            }
            for(int i=writepoint; i<nums.length; i++){
                nums[i]=0;
            } 
        }
        
        
    }
}