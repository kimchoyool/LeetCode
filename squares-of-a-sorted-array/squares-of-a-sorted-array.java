import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        //배열에 있는 수를 제곱해서 정렬
        for(int i=0;i<nums.length;i++){
            nums[i]= (int) Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}