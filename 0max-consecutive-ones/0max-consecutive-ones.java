class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int len = 0;
        for(int i:nums){
            if(i == 1) {
                len++;
            }
            else {
                list.add(len);
                len = 0;
            }
        }
        list.add(len);
        return Collections.max(list);
    }
}