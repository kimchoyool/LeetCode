class Solution {
    public int findNumbers(int[] nums) {
        int[] arr=new int[nums.length];
        int count=0;
        int answer=0;

        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                nums[i]/=10;
                count++;
            }
            arr[i]=count;
            count=0;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                answer++;
            }
        }
        return answer;
    }
}