class Solution {
    public int removeDuplicates(int[] nums) {
        //[0]이랑[1]이랑 같으면 pass 다르면 [0]에 넣기
        int n=1;
        for(int i=0;i<nums.length-1;i++){
                if(nums[i] != nums[i+1] ){
                    nums[n]=nums[i+1];
                    n++;

                }
        }
        return n;
    }
}